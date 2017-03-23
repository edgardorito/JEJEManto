package edu.uag.iidis.scec.servicios;

import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.uag.iidis.scec.modelo.Clima;
import edu.uag.iidis.scec.excepciones.*;
import edu.uag.iidis.scec.persistencia.ClimaDAO;
import edu.uag.iidis.scec.persistencia.hibernate.*;

/**
* Esta clase se utiliza para listar, eliminar y buscar climas
* 
*
* @author  Ernesto Sandoval Becerra
* @version 0.3
* @since   2016-03-21 
*/

public class ManejadorClima {
    private Log log = LogFactory.getLog(ManejadorClima.class);
    private ClimaDAO dao;

    public ManejadorClima() {
        dao = new ClimaDAO();
    }


    public Collection listarClima() {
         /**
     * Utilizamos este método para listar a todos los climas de la BD
   * @return Collection la collection de objetos de tipo Clima
   */

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


    public int crearClima(Clima clima) {
         /**
     * Utilizamos este método para registrar un nuevo Clima en la BD
     * @param clima objeto de tipo Clima
   * @return resultado valor numérico que determina si la transacción tuvo éxito o no
   */

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

    public int editarClima(Clima clima) {
          /**
     * Utilizamos este método para editar un Clima en la BD
     * @param clima objeto de tipo Clima
   * @return resultado valor numérico que determina si la transacción tuvo éxito o no
   */

        int resultado;

        if (log.isDebugEnabled()) {
            log.debug(">guardarClima(clima)");
        }

        try {
            HibernateUtil.beginTransaction();           

               dao.hazCambios(clima);

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
          /**
     * Utilizamos este método para listar los climas por un atributo específico
     * @param atributo el atributo por el cual se realizará la búsqueda
   * @return Collection la collectioon de objetos Clima en el orden del atributo especificado
   */
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
          /**
     * Utilizamos este método para buscar un Clima dado el nombre de la ciudad
     * @param ciudad ciudad por la cual se desea emprender una búsqueda
   * @return Collection collection de Climas que coincidan con el parametro de ciudad
   */
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

    public int eliminarClimaPorCiudad(String ciudad) {
         /**
     * Utilizamos este método para eliminar un Clima dado el nombre de la ciudad
     * @param ciudad ciudad por la cual se desea eliminar
   * @return resultado valor numérico que determina el resultado de la transacción
   */
       int resultado=0;

        if (log.isDebugEnabled()) {
            log.debug(">Intenta hacerlooooo");
        }

        try {

        if (log.isDebugEnabled()) {
            log.debug(">Se eliminara: "+ciudad);
        }
            HibernateUtil.beginTransaction();           
       
                dao.eliminarClima(ciudad);

               resultado = 0; // Exito. El ciudad se creo satisfactoriamente.
            
 if (log.isDebugEnabled()) {
            log.debug(">test2");
        }
            HibernateUtil.commitTransaction();

        } catch (ExcepcionInfraestructura e) {
            HibernateUtil.rollbackTransaction();

            if (log.isWarnEnabled()) {
                log.debug("EXCEPCION ----> "+e);
                log.warn("<ExcepcionInfraestructura");
            }
            resultado = 2;    // Excepción. Falla en la infraestructura
        } finally {
            HibernateUtil.closeSession();
        }
        return resultado;

    }
}
