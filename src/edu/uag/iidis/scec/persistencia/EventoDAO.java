package edu.uag.iidis.scec.persistencia;

import org.hibernate.*;
import org.hibernate.type.*;
import org.hibernate.criterion.Example;
//import org.hibernate.classic.*;


import edu.uag.iidis.scec.excepciones.ExcepcionInfraestructura;
import edu.uag.iidis.scec.modelo.Evento;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collection;
import java.util.List;


public class EventoDAO {

    private Log log = LogFactory.getLog(EventoDAO.class);

    public EventoDAO() {
    }



    public void hazPersistente(Evento evento)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazPersistente(evento)");
        }

        try {
            HibernateUtil.getSession().save(evento);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
              log.warn("<EXCEPTION:  "+e);
                log.warn("<HibernateException" + evento.getFecha());
            }
            throw new ExcepcionInfraestructura(e);
        }
    }


    public Collection ordenarEventosPor(String atributo)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">existeRol(nombreRol)");
        }

        try {
 
            String hql = "from Evento ORDER BY "+atributo+"";
            
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

    public boolean existeEvento(String nombreEvento)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">existeEvento(nombreEvento)");
        }

        try {


            String hql = "select nombre from Evento where nombre = :nombre";

             if (log.isDebugEnabled()) {
                 log.debug(hql + nombreEvento);
            }

            Query query = HibernateUtil.getSession()
                                        .createQuery(hql);
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< create query ok " );
            }
      query.setParameter("nombre", nombreEvento);
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

    public Collection buscarTodos()
            throws ExcepcionInfraestructura {

        Collection Eventos;

        if (log.isDebugEnabled()) {
            log.debug(">buscarTodos()");
        }

        try {
            Eventos = HibernateUtil.getSession()
                                    .createCriteria(Evento.class)
                                    .list();

              log.debug(">buscarTodos() ---- list   " + Eventos.size());
			log.debug(">buscarTodos() ---- contenido   " + Eventos);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
        return Eventos;
    }


    public Collection buscarEventos(String fecha)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">buscarEventos(fecha)");
        }

        try {
 
            String hql = "from Evento where fecha like '"+fecha+"%'";
            
             if (log.isDebugEnabled()) {
                 log.debug(hql + fecha);
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
