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


public class ClimaDAO {

    private Log log = LogFactory.getLog(ClimaDAO.class);

    public ClimaDAO() {
    }

    public void hazPersistente(Clima clima)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazPersistente(clima)");
        }

        try {
            HibernateUtil.getSession().saveOrUpdate(clima);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
                 log.warn("<EXCEPTION:  "+e);
            }

            throw new ExcepcionInfraestructura(e);
        }
    }

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

/*
    public Estado buscarPorId(Long idEstado, boolean bloquear)
            throws ExcepcionInfraestructura {

        Estado estado = null;

        if (log.isDebugEnabled()) {
            log.debug(">buscarPorID(" + idEstado + ", " + bloquear + ")");
        }

        try {
            if (bloquear) {
                estado = (Estado)HibernateUtil.getSession()
                                                .load(Estado.class, 
                                                      idEstado, 
                                                      LockMode.UPGRADE);
            } else {
                estado = (Estado)HibernateUtil.getSession()
                                                .load(Estado.class,
                                                      idEstado);
            }
        } catch (HibernateException ex) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }

            throw new ExcepcionInfraestructura(ex);
        }
        return estado;
    }


    

    public Collection buscarPorEjemplo(Estado estado)
            throws ExcepcionInfraestructura {


        Collection estados;
 
        if (log.isDebugEnabled()) {
            log.debug(">buscarPorEjemplo()");
        }

        try {
            Criteria criteria = HibernateUtil.getSession()
                                             .createCriteria(Estado.class);
            estados = criteria.add(Example.create(estado)).list();
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
        return estados;
    }


    public void hazPersistente(Estado estado)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazPersistente(estado)");
        }

        try {
            HibernateUtil.getSession().saveOrUpdate(estado);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }


    public void hazTransitorio(Estado estado)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazTransitorio(estado)");
        }

        try {
            HibernateUtil.getSession().delete(estado);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }

    public boolean existeClima(String nombreEstado)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">existeRol(nombreRol)");
        }

        try {
            
            
//            String consultaCuentaRoles =
//            "select count(*) from Ciudad r where r.nombre=?";
//
 //           int resultado =
 //           ((Integer) HibernateUtil.getSession()
 //                          .find(consultaCuentaRoles, 
 //                                nombreRol,
 //                                StringType.INSTANCE)
 //                          .iterator()
 //                          .next()).intValue();
// de acuerdo al nuevo formato
 
            String hql = "select nombre from Estado where nombre = :nombre";
            
             if (log.isDebugEnabled()) {
                 log.debug(hql + nombreEstado);
            }
        
            Query query = HibernateUtil.getSession()
                                        .createQuery(hql);
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< create query ok " );
            }
			query.setParameter("Nombre", nombreEstado);
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
	
	public Collection buscaEstado(String nombreEstado)
            throws ExcepcionInfraestructura {
				
		if (log.isDebugEnabled()) {
            log.debug(">existeRol(nombreRol)");
        }

        try {
            String hql = "from Estado where nombre like '"+nombreEstado+"%'";
            
             if (log.isDebugEnabled()) {
                 log.debug(hql + nombreEstado);
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
*/