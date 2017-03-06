package edu.uag.iidis.scec.servicios;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.uag.iidis.scec.modelo.Vehiculo;
import edu.uag.iidis.scec.excepciones.*;
import edu.uag.iidis.scec.persistencia.VehiculoDAO;
import edu.uag.iidis.scec.persistencia.hibernate.*;

public class ManejadorRegistroV {
    private Log log = LogFactory.getLog(ManejadorEstados.class);
    private VehiculoDAO dao;

    public ManejadorRegistroV() {
        dao = new VehiculoDAO();
    }
    public Collection listarVehiculos() {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">listarVehiculos");
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

    
	
	public Collection listarVehiculosPorCurp(String curp) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarUsuario(usuario)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscarVehiculos(curp);
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
	/*
	
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
    public int crearVehiculo(Vehiculo vehiculo) {

        int resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarEstado(estado)");
        }

        try {
            HibernateUtil.beginTransaction();           
            
            if (dao.existeVehiculo(vehiculo.getPlaca())) {
               resultado = 1; // Excepción. El nombre de ciudad ya existe
            } else {

               dao.hazPersistente(vehiculo);

               resultado = 0; // Exito. El ciudad se creo satisfactoriamente.
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
