package edu.uag.iidis.scec.servicios;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.uag.iidis.scec.modelo.Evento;
import edu.uag.iidis.scec.excepciones.*;
import edu.uag.iidis.scec.persistencia.EventoDAO;
import edu.uag.iidis.scec.persistencia.hibernate.*;

public class ManejadorEventos {
    private Log log = LogFactory.getLog(ManejadorEstados.class);
    private EventoDAO dao;

    public ManejadorEventos() {
        dao = new EventoDAO();
    }

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
}
