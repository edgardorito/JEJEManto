package edu.uag.iidis.scec.persistencia;

import org.hibernate.*;
import org.hibernate.type.*;
import org.hibernate.criterion.Example;
//import org.hibernate.classic.*;


import edu.uag.iidis.scec.excepciones.ExcepcionInfraestructura;
import edu.uag.iidis.scec.modelo.Clima;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collection;
import java.util.List;

/**
* Esta clase se utiliza para el acceso y manipulación
* de los datos de la BD Clima
*
* @author  Ernesto Sandoval Becerra
* @version 0.3
* @since   2016-03-21 
*/

public class ClimaDAO {

    private Log log = LogFactory.getLog(ClimaDAO.class);

    public ClimaDAO() {
    }
    /**
     * Utilizamos este método para hacer persistente un nuevo objeto tipo Clima
     * que llega como parámetro
     * @param clima El objeto tipo clima que se desea almacenar en la BD
   */
    public void hazPersistente(Clima clima)
            throws ExcepcionInfraestructura {
        if (log.isDebugEnabled()) {
            log.debug(">hazPersistente(clima)");
        }

        try {
            HibernateUtil.getSession().save(clima);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
                 log.warn("<EXCEPTION:  "+e);
            }

            throw new ExcepcionInfraestructura(e);
        }
    }
    /**
     * Utilizamos este método para hacer los update a la BD
     * dado el objeto Clima que llega como parámetro
     * @param clima El objeto tipo clima que se desea editar en la BD
   */
    public void hazCambios(Clima clima)
            throws ExcepcionInfraestructura {


        if (log.isDebugEnabled()) {
            log.debug(">hazCambios(clima)");
        }

        try {
            //System.out.println();

            String hql = "UPDATE Clima set latitud = '"+clima.getLatitud()+"', longitud = '"+clima.getLongitud()+"' WHERE ciudad = '"+clima.getCiudad()+"'";
            //Query query = session.createQuery(hql);
            Query query = HibernateUtil.getSession().createQuery(hql);
            int result = query.executeUpdate();
            //HibernateUtil.getSession().update(clima);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
                 log.warn("<EXCEPTION:  "+e);
            }

            throw new ExcepcionInfraestructura(e);
        }
    }
    /**
     * Utilizamos este método para hacer solicitar todos los climas registrados en la BD
     * @return una Collection con todos los objetos Clima localizados en la BD
   */
    public Collection buscarTodos()
            throws ExcepcionInfraestructura {

        Collection climas;

        if (log.isDebugEnabled()) {
            log.debug(">buscarTodos()");
        }

        try {
            climas = HibernateUtil.getSession()
                                    .createCriteria(Clima.class)
                                    .list();
                                    
              log.debug(">buscarTodos() ---- list " + climas);                                 
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
        return climas;
    }

    /**
     * Utilizamos este método para obtener todos los climas registrados en le BD
     * pero ordenados por algun atributo
     * 
     * @param atributo El atributo por el cual se desea realizar el ordenamiento
     * @return Un Collection de objetos de tipo Clima ordenados por atributo
   */
    public Collection ordenarClimasPor(String atributo)
            throws ExcepcionInfraestructura {


        if (log.isDebugEnabled()) {
            log.debug(">existeRol(nombreRol)");
        }

        try {
 
            String hql = "from Clima ORDER BY "+atributo+"";
            
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

    /**
     * Método que nos ayuda a saber si algun clima ya existe, segun el clima ingresado
     * @param  nombre Nombre del clima    
     * @return false si no existe, true si existe
     */
    public boolean existeClima(String nombre)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">existeUsuario(nombreUsuario)");
        }

        try {
            
            String hql = "select ciudad from Clima where ciudad = :nombre";
           
             if (log.isDebugEnabled()) {
                 log.debug(hql + nombre);
            }
        
            Query query = HibernateUtil.getSession()
                                        .createQuery(hql);
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< create query ok " );
            }
            query.setParameter("nombre", nombre);
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
                log.warn("<HibernateException *******************  "+ex);
            }
            throw new ExcepcionInfraestructura(ex);
        }
    }
    /**
     * Utilizamos este método para realizar la busqueda de una ciudad específica
     * 
     * @param ciudad El atributo por el cual se desea realizar la búsqueda
     * @return Un Collection de objetos de tipo Clima que cumplen el resultado de la consulta
   */
    public Collection buscarClima(String ciudad)
            throws ExcepcionInfraestructura {


        if (log.isDebugEnabled()) {
            log.debug(">buscarClimas(ciudad)");
        }

        try {
 
            String hql = "from Clima where ciudad like '"+ciudad+"%'";
            
             if (log.isDebugEnabled()) {
                 log.debug(hql + ciudad);
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
     * Utilizamos este método para eliminar a alguna de las ciudades de la BD
     * 
     * @param ciudad El atributo por el cual se desea realizar eliminar
     * @return Un Collection de objetos de tipo Clima actualizados (sin el objeto eliminado)
   */
    public Collection eliminarClima(String ciudad)
            throws ExcepcionInfraestructura {



                List r = null;
          if (log.isDebugEnabled()) {
            log.debug(">hazTransitorio(ciudad)");
        }

        try {
            Clima v =(Clima) HibernateUtil.getSession().createQuery("from Clima where ciudad = '"+ciudad+"'")
                   .uniqueResult();
            HibernateUtil.getSession().delete(v);
            
            return r;
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.debug("EXCEPTION ---> ----> "+e);
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
          
        }
    }

}

