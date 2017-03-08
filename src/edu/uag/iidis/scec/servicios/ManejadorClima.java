package edu.uag.iidis.scec.servicios;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.uag.iidis.scec.modelo.Clima;
import edu.uag.iidis.scec.excepciones.*;
import edu.uag.iidis.scec.persistencia.ClimaDAO;
import edu.uag.iidis.scec.persistencia.hibernate.*;

public class ManejadorClima {
    private Log log = LogFactory.getLog(ManejadorClima.class);
    private ClimaDAO dao;

    public ManejadorClima() {
        dao = new ClimaDAO();
    }


    public Collection listarClima() {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">listarClima()");
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
	/*
	public Collection listarEstadoPorNombre(String nombre) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarUsuario(usuario)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscaEstado(nombre);
            log.debug("Consulta "+resultado);
			HibernateUtil.commitTransaction();
            return resultado;         
        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }
	
	
    public void eliminarEstado(Long id) {
        if (log.isDebugEnabled()) {
            log.debug(">eliminarEstado(estado)");
        }
        try {
            HibernateUtil.beginTransaction();           
            Estado estado = dao.buscarPorId(id, true);
            if (estado != null) {
              dao.hazTransitorio(estado);
            }
            HibernateUtil.commitTransaction();
        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();
            if (log.isWarnEnabled()) {
                log.warn("<ExcepcionInfraestructura");
            }
        } finally {
            HibernateUtil.closeSession();
        }

    }*/

    public int crearClima(Clima clima) {

        int resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarClima(clima)");
        }

        try {
            HibernateUtil.beginTransaction();           

               dao.hazPersistente(clima);

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

    public Collection listarClimaPor(String atributo) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">listarClimasPor(atributo)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.ordenarClimasPor(atributo);
            log.debug("listar Climas por "+atributo+": "+resultado);
            HibernateUtil.commitTransaction();
            return resultado;         
        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();
            return null;
        } finally {
            HibernateUtil.closeSession();
        }
    }

    public Collection buscarClimaPorCiudad(String ciudad) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarUsuario(usuario)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscarClima(ciudad);
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
}
