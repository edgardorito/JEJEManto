package edu.uag.iidis.scec.servicios;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.uag.iidis.scec.modelo.Vehiculo;
import edu.uag.iidis.scec.excepciones.*;
import edu.uag.iidis.scec.persistencia.VehiculoDAO;
import edu.uag.iidis.scec.persistencia.hibernate.*;

/**
 * Esta clase se utiliza para registrar y actualizar un vehiculo
 *
 * @author Javier de Jesús Flores Herrera
 * @version  0.3
 * 
 */
public class ManejadorRegistroV {
    private Log log = LogFactory.getLog(ManejadorEstados.class);
    private VehiculoDAO dao;
    /**
     *  Constructor ManejadorRegistroV
     * 
     */
    public ManejadorRegistroV() {
        dao = new VehiculoDAO();
    }
    /**
     *  Consigue la lista de vehiculos registrados en la base de datos.
     * @return Collection con tipos de objetos Vehiculo
     */
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

    
	/**
     * Consigue la lista de vehiculos registrados en la base de datos ordenados por la curp
     * @param curp del usuario
     * @return  Collection con tipos de objetos Vehiculo ordenados por el atributo 
     */
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
    /**
     * Consigue la lista de vehiculos registrados en la base de datos ordenados por las placas
     * @param placa  del vehiculo 
     * @return  Collection con tipos de objetos Vehiculo ordenados por la placa
     */
    public Vehiculo listarVehiculosPorPlacas(String placa) {
        Vehiculo resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarUsuario(usuario)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscarVehiculosPlaca(placa);
          
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
     * Consigue la lista de vehiculos registrados en la base de datos ordenados por el atributo especificado
     * @param atributo  del vehiculo 
     * @param  curp del usuario
     * @return  Collection con tipos de objetos Vehiculo ordenados por el atributo especificado
     */
    public Collection listarVehiculosPor(String atributo, String curp) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">listarVehiculosPor(atributo)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.ordenarVehiculosPor(atributo,curp);
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
	/**
     * Registra un vehiculo en la base de datos
     * @param  vehiculo con los datos del vehiculo
     * @return  resultado resultado de la operacion
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
    /**
     * Actualiza los datos de un vehiculo en la base de datos
     * @param  vehiculo con los datos del vehiculo
     * @return resultado  resultado de la operacion
     */
    public int actualizarVehiculo(Vehiculo vehiculo) {

        int resultado;

        if (log.isDebugEnabled()) {
            log.debug(">actualizarVehiculo(vehiculo)");
        }

        try {
            HibernateUtil.beginTransaction();           
            
           

               dao.hazPersistenteP(vehiculo);

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
     * Elimina un vehiculo de la base de datos
     * @param vehiculo con los datos del vehiculo
     * @return  resultado  resultado de la operacion
     */
    public int eliminarVehiculo(String vehiculo) {

        int resultado;

        if (log.isDebugEnabled()) {
            log.debug(">EliminarVehiculo(vehiculo)");
        }

        try {
            HibernateUtil.beginTransaction();           
            
           

               dao.hazTransitorio(vehiculo);
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
}
