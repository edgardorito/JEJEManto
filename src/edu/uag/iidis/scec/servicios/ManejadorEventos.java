package edu.uag.iidis.scec.servicios;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.uag.iidis.scec.modelo.Evento;
import edu.uag.iidis.scec.excepciones.*;
import edu.uag.iidis.scec.persistencia.EventoDAO;
import edu.uag.iidis.scec.persistencia.hibernate.*;
/**
* <h1>ManejadorEventos</h1>
* Esta clase se encarga de acceder a los datos de la BD  
* @author  Edgardo Rito Deheza
* @version 0.3
*/
public class ManejadorEventos {
    private Log log = LogFactory.getLog(ManejadorEstados.class);
    private EventoDAO dao;

    public ManejadorEventos() {
        dao = new EventoDAO();
    }
 /**
   * Metodo que crea un evento mediante un objeto Evento.
   * @param evento Recibe un objeto de la clase Evento
   * @return resultado Regresa el resultado del evento que si ha sido creado
  */
    public int crearEvento(Evento evento) {

        int resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarEvento(evento)");
        }

        try {
            HibernateUtil.beginTransaction();

            if (dao.existeEvento(evento.getNombre())) {
               resultado = 1; // Excepción. El nombre de ciudad ya existe
            } else {

               dao.hazPersistente(evento);

               resultado = 0; // Exito. El ciudad se creo satisfactoriamente.
            }

            HibernateUtil.commitTransaction();

        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();

            if (log.isWarnEnabled()) {
                log.warn("<ExcepcionInfraestructura: "+e);
            }
            resultado = 2;    // Excepción. Falla en la infraestructura
        } finally {
            HibernateUtil.closeSession();
        }
        return resultado;
    }
/**
   * Metodo que actualiza un evento mediante un objeto Evento.
   * @param evento Recibe un objeto de la clase Evento
   * @return resultado Regresa el resultado del evento que si ha sido actulizado
*/

        public int actualizarEvento(Evento evento) {

        int resultado;

        if (log.isDebugEnabled()) {
            log.debug(">actualizarVehiculo(evento)");
        }

        try {
            HibernateUtil.beginTransaction();           
            
           

               dao.actualizarE(evento);

               resultado = 0; // Exito. El ciudad se creo satisfactoriamente.
           

            HibernateUtil.commitTransaction();

        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();

            if (log.isWarnEnabled()) {
                log.warn("<ExcepcionInfraestructura");
            }
            resultado = 2;    // Excepción. Falla en la infraestructura
        } finally {
            HibernateUtil.closeSession();
        }
        return resultado;
    }
/**
   * Metodo que elimina un evento mediante el nombre del evento.
   * @param nombre Recibe un string con el nombre del evento
   * @return resultado Regresa el resultado del evento que ha sido eliminado
*/
        public int eliminarEvento(String nombre) {

        int resultado;

        if (log.isDebugEnabled()) {
            log.debug(">EliminarVehiculo(vehiculo)");
        }

        try {
            HibernateUtil.beginTransaction();           
            
           

               dao.hazTransitorio(nombre);
               resultado = 0;
                

            HibernateUtil.commitTransaction();

        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();

            if (log.isWarnEnabled()) {
                log.warn("<ExcepcionInfraestructura");
            }
            resultado = 2;    // Excepción. Falla en la infraestructura
        } finally {
            HibernateUtil.closeSession();
        }
        return resultado;
    }     

    public Collection listarEventos() {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">listarEventos");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscarTodos();
            HibernateUtil.commitTransaction();
            return resultado;
        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }
/**
   * Metodo que lista todos los eventos por la fehca.
   * @param fecha Recibe un string con la fecha.
   * @return resultado Regresa toda la lista de eventos.
*/
    public Collection listarEventosPorFecha(String fecha) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarUsuario(usuario)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscarEventos(fecha);
            log.debug("Consulta BV "+resultado);
            HibernateUtil.commitTransaction();
            return resultado;         
        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }
/**
   * Metodo que lista todos los eventos por la fehca.
   * @param fecha Recibe un string con la fecha.
   * @return resultado Regresa un objeto evento.
*/
    public Evento listarEventosPorF(String fecha) {
        Evento resultado;

        if (log.isDebugEnabled()) {
            log.debug(">listarPorFecha(usuario)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscarEventoFecha(fecha);
            log.debug("Consulta BFecha "+resultado);
            HibernateUtil.commitTransaction();
            return resultado;         
        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }
/**
   * Metodo que lista todos los eventos por la fehca.
   * @param atributo  string con el atributo a ordernar.
   * @return resultado Regresa una lista con los eventos ordenados por el parametro
*/
    public Collection listarEventosPor(String atributo) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">listarEventosPor(atributo)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.ordenarEventosPor(atributo);
            log.debug("listar Vehiculos por "+atributo+": "+resultado);
            HibernateUtil.commitTransaction();
            return resultado;         
        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

}
