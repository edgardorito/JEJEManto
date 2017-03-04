package edu.uag.iidis.scec.servicios;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.uag.iidis.scec.modelo.Perfil;
import edu.uag.iidis.scec.excepciones.*;
import edu.uag.iidis.scec.persistencia.PerfilDAO;
import edu.uag.iidis.scec.persistencia.hibernate.*;

public class ManejadorPerfil {
    private Log log = LogFactory.getLog(ManejadorPerfil.class);
    private PerfilDAO dao;

  public ManejadorPerfil() {
        dao = new PerfilDAO();
    }
 /* 

    public Collection listarEstados() {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarUsuario(usuario)");
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

    }
*/
    public int crearPerfil(Perfil usuario) {

        int resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarPerfil(usuario)");
        }

        try {

        if (log.isDebugEnabled()) {
            log.debug(">el usuario a insertar es: "+usuario.getUsuario());
        }
            HibernateUtil.beginTransaction();           
       
            if (dao.existePerfil(usuario.getUsuario())) {
               resultado = 1; // Excepción. El nombre de ciudad ya existe
            } else {
if (log.isDebugEnabled()) {
            log.debug(">test3");
        }
               dao.hazPersistente(usuario);

               resultado = 0; // Exito. El ciudad se creo satisfactoriamente.
            }
 if (log.isDebugEnabled()) {
            log.debug(">test2");
        }
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
}
