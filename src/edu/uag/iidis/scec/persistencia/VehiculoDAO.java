package edu.uag.iidis.scec.persistencia;

import org.hibernate.*;
import org.hibernate.type.*;
import org.hibernate.criterion.Example;
//import org.hibernate.classic.*;


import edu.uag.iidis.scec.excepciones.ExcepcionInfraestructura;
import edu.uag.iidis.scec.modelo.Vehiculo;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collection;
import java.util.List;


public class VehiculoDAO {

    private Log log = LogFactory.getLog(VehiculoDAO.class);
    /**
     *  Constructor de la clase VehiculoDao
     * 
     */
    public VehiculoDAO() {
    }

/*
    public Vehiculo buscarPorId(Long idVehiculo, boolean bloquear)
            throws ExcepcionInfraestructura {

        Vehiculo Vehiculo = null;

        if (log.isDebugEnabled()) {
            log.debug(">buscarPorID(" + idVehiculo + ", " + bloquear + ")");
        }

        try {
            if (bloquear) {
                Vehiculo = (Vehiculo)HibernateUtil.getSession()
                                                .load(Vehiculo.class, 
                                                      idVehiculo, 
                                                      LockMode.UPGRADE);
            } else {
                Vehiculo = (Vehiculo)HibernateUtil.getSession()
                                                .load(Vehiculo.class,
                                                      idVehiculo);
            }
        } catch (HibernateException ex) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }

            throw new ExcepcionInfraestructura(ex);
        }
        return Vehiculo;
    }

*/
    /**
     * busca todos los registros de vehiculos en la base de datos
     * @return Vehiculos regresa un Collection de Vehiculos
     * 
     * @throws ExcepcionInfraestructura [excepción]
     */
    public Collection buscarTodos()
            throws ExcepcionInfraestructura {

        Collection Vehiculos;

        if (log.isDebugEnabled()) {
            log.debug(">buscarTodos()");
        }

        try {
            Vehiculos = HibernateUtil.getSession()
                                    .createCriteria(Vehiculo.class)
                                    .list();
                                    
              log.debug(">buscarTodos() ---- list   " + Vehiculos.size());
			log.debug(">buscarTodos() ---- contenido   " + Vehiculos);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
        return Vehiculos;
    }



    /**
     * Guarda un objeto vehiculo 
     * @param  Vehiculo objeto con los datos del vehiculo
     * @throws ExcepcionInfraestructura excepción
     */
    public void hazPersistente(Vehiculo Vehiculo)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazPersistente(Vehiculo)");
        }

        try {
            HibernateUtil.getSession().saveOrUpdate(Vehiculo);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }
    /**
     * Actualiza los datos de un vehiculo registrado
     * @param  vehiculo objeto con los datos del vehiculo
     * @throws ExcepcionInfraestructura  excepción
     */
    public void hazPersistenteP(Vehiculo vehiculo)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazPersistente(Vehiculo)");
        }

        try {
             Vehiculo p =(Vehiculo) HibernateUtil.getSession().createQuery("from Vehiculo where placa = :typeName")
                   .setParameter("typeName", vehiculo.getPlaca())
                   .uniqueResult();
            p.setCurp(vehiculo.getCurp());

            p.setTipo(vehiculo.getTipo());
            p.setModelo(vehiculo.getModelo());
            p.setMarca(vehiculo.getMarca());
           
            p.setColor(vehiculo.getColor());
            HibernateUtil.getSession().saveOrUpdate(p);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }

    /**
     * Elimina un registro de un vehiculo basado en la placa
     * @param  vehiculo placa del vehiculo
     * @throws ExcepcionInfraestructura excepción
     */
    public void hazTransitorio(String vehiculo)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazTransitorio(Vehiculo)");
        }

        try {
            Vehiculo v =(Vehiculo) HibernateUtil.getSession().createQuery("from Vehiculo where placa = :typeName")
                   .setParameter("typeName", vehiculo)
                   .uniqueResult();
            HibernateUtil.getSession().delete(v);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.debug("EXCEPTION ---> ----> "+e);
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }
    /**
     * Verifica si un vehiculo esta registrado
     * @param  placaVehiculo del vehiculo         
     * @return true cuando el vehiculo existe 
     * @throws ExcepcionInfraestructura  excepción
     */
    public boolean existeVehiculo(String placaVehiculo)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">existeRol(nombreRol)");
        }

        try {
            
            
 
            String hql = "select placa from Vehiculo where placa = :nombre";
            
             if (log.isDebugEnabled()) {
                 log.debug(hql + placaVehiculo);
            }
        
            Query query = HibernateUtil.getSession()
                                        .createQuery(hql);
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< create query ok " );
            }

            query.setParameter("nombre", placaVehiculo);
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< set Parameter ok antes del query list >>>>>");
            }
            List results = query.list();
            int resultado = results.size();
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< Result size " + resultado);
            }
            if (resultado == 0) {
               return false;
            }
            
            return true;

        } catch (HibernateException ex) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException *******************");
            }
            throw new ExcepcionInfraestructura(ex);
        }
    }

    /**
     * busca todos los registros de vehiculos en la base de datos
     * @return results regresa un Collection de Vehiculos
     * @param  curp del usuario
     * @throws ExcepcionInfraestructura [excepción]
     */
	public Collection buscarVehiculos(String curp)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">buscarVehiculos(curp)");
        }

        try {
 
            String hql = "from Vehiculo where curp like '"+curp+"%'";
            
             if (log.isDebugEnabled()) {
                 log.debug(hql + curp);
            }
        
            Query query = HibernateUtil.getSession()
                                        .createQuery(hql);
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< create query ok " );
            }
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< set Parameter ok antes del query list >>>>>");
            }
            List results = query.list();
            int resultado = results.size();
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< Result size " + resultado);
            }
           if (resultado == 0) {
               return results;
            }
            
            return results;

        } catch (HibernateException ex) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException *******************");
            }
            throw new ExcepcionInfraestructura(ex);
        }
    }
    /**
     * busca en todos los registros de vehiculos un vehiculo por la placa
     * @return results regresa el vehiculo buscado
     * @param  placa  del vehiculo
     * @throws ExcepcionInfraestructura [excepción]
     */

    public Vehiculo buscarVehiculosPlaca(String placa)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">buscarVehiculos(placa)");
        }

        try {
 
            String hql = "from Vehiculo where placa like '"+placa+"%'";
            
             if (log.isDebugEnabled()) {
                 log.debug(hql + placa);
            }
        
            Vehiculo results = (Vehiculo)  HibernateUtil.getSession()
                                        .createQuery(hql).uniqueResult();
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< create query ok " );
            }
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< set Parameter ok antes del query list >>>>>");
            }
            
          
            
            
            return results;

        } catch (HibernateException ex) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException *******************");
            }
            throw new ExcepcionInfraestructura(ex);
        }
    }

    /**
     * busca todos los registros de vehiculos en la base de datos por el atributo 
     * @param atributo a buscar del vehiculo
     * @param curp del usuario
     * @return results regresa un Collection de Vehiculos ordenatos por el atributo
     * @throws ExcepcionInfraestructura excepción
     */
    public Collection ordenarVehiculosPor(String atributo, String curp)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">existeRol(nombreRol)");
        }

        try {
            String hql = "";
            if(curp.equals("")){
                hql = "from Vehiculo ORDER BY "+atributo+"";
            }else{
                hql = "from Vehiculo where curp like '"+curp+"%' ORDER BY "+atributo+"";
            }
            
            
             if (log.isDebugEnabled()) {
                 log.debug(hql + atributo);
            }
        
            Query query = HibernateUtil.getSession()
                                        .createQuery(hql);
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< create query ok " );
            }
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< set Parameter ok antes del query list >>>>>");
            }
            List results = query.list();
            int resultado = results.size();
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< Result size " + resultado);
            }
            if (resultado == 0) {
               return results;
            }
            
            return results;

        } catch (HibernateException ex) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException *******************");
            }
            throw new ExcepcionInfraestructura(ex);
        }
    }
    
    
}
