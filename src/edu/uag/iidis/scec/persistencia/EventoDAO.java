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

/**
* <h1>EventoDAO</h1>
* Esta clase se encarga de acceder a los datos de la BD  
* @author  Edgardo Rito Deheza
* @version 0.3
*/
public class EventoDAO {

    private Log log = LogFactory.getLog(EventoDAO.class);

    public EventoDAO() {
    }

 /**
   * Metodo que guarda un objeto Evento en la BD.
   * @param evento Recibe un objeto de la clase Evento
   * @return void 
  */
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
 /**
   * Metodo que actualiza un objeto Evento en la BD.
   * @param evento Recibe un objeto de la clase Evento
   * @return void 
  */
    public void actualizarE(Evento evento)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazPersistente(evento)");
        }

        try {
             Evento p =(Evento) HibernateUtil.getSession().createQuery("from Evento where nombre = :name")
                   .setParameter("name", evento.getNombre())
                   .uniqueResult();
            p.setFecha(evento.getFecha());

            HibernateUtil.getSession().update(p);      
        }catch (HibernateException e) {
            if (log.isWarnEnabled()) {
              log.warn("<EXCEPTION:  "+e);
                log.warn("<HibernateException" + evento.getNombre());
            }
            throw new ExcepcionInfraestructura(e);
        }
    }
 /**
   * Metodo que elimina un registro Evento en la BD.
   * @param nombre Recibe un string con el del evento
   * @return void 
  */
    public void hazTransitorio(String nombre)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazTransitorio(nombre)");
        }

        try {
            Evento ev =(Evento) HibernateUtil.getSession().createQuery("from Evento where nombre = :name")
                   .setParameter("name", nombre)
                   .uniqueResult();
            HibernateUtil.getSession().delete(ev);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.debug("EXCEPTION ---> ----> "+e);
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }
 /**
   * Metodo que ordena los registro por medio del parametro.
   * @param atributo Recibe un string con el nombre de la columna a ordernar
   * @return Collection Lista ordenada
  */
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
 /**
   * Metodo que verifica si existe el evento mediante el nombre.
   * @param nombreEvento Recibe un string con el nombre del evento.
   * @return boolean Si es true, existe el evento.
  */
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
 /**
   * Metodo que busca todos los eventos registrado.
   * @return Collection Regresa una lista de eventos
  */
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

        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
        return Eventos;
    }

     /**
   * Metodo que busca un evento por una fecha especifica.
   * @param fecha Recibe un string con la fecha del evento.
   * @return Evento Regresa un objeto de la calse Evento.
  */
    public Evento buscarEventoFecha(String fecha)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">buscarVehiculos(placa)");
        }

        try {
 
            String hql = "from Evento where nombre like '"+fecha+"%'";
            
             if (log.isDebugEnabled()) {
                 log.debug(hql + fecha);
            }
        
            Evento results = (Evento)  HibernateUtil.getSession()
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
   * Metodo que busca eventos mediante la fecha.
   * @param fecha Recibe un string con la fecha del evento.
   * @return Collection Regresa una lista con todos los eventos con la fecha indicada.
  */
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
