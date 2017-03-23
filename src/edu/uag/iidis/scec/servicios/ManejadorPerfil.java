package edu.uag.iidis.scec.servicios;

import java.util.Collection;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import edu.uag.iidis.scec.vista.*;
import edu.uag.iidis.scec.modelo.Perfil;
import edu.uag.iidis.scec.excepciones.*;
import edu.uag.iidis.scec.persistencia.PerfilDAO;
import edu.uag.iidis.scec.persistencia.hibernate.*;
import net.webservicex.webserviceZIP.*;

/**
 * Clase que sirve para realizar las acciones listar, editar, eliminar,
 * insertar y ordenar del modulo perfil
 */
public class ManejadorPerfil {
    private Log log = LogFactory.getLog(ManejadorPerfil.class);
    private PerfilDAO dao;

/**
 * Constructor de la clase Manejador Perfil
 * en el cual se instancia PerfilDAO
 */
  public ManejadorPerfil() {
        dao = new PerfilDAO();
    }
 
/**
 * Método que sirve para listar todos los perfiles almacenados en la BD
 * @return resultado si es exitoso, null si es fallido
 */
    public Collection listarPerfil() {
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

/**
 * Método que nos sirve para actualizar los datos del usuario al momento
 * de editar perfil
 * @param  usuario nombre del usuario del que se actualizara la información
 * @return resultado si es exitoso
 */
     public Collection editarPerfil( String usuario) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug("> - editarPerfil(usuario)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscaPerfil(usuario);
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
 * Método que nos sirve para actualizar los datos del usuario al momento
 * de editar perfil
 * @param  usuario nombre del usuario del que se actualizara la información
 * @return 0 si es exitoso, 2 si es fallido
 */
public int actualizarPerfil(Perfil usuario) {

        int resultado=0;

        if (log.isDebugEnabled()) {
            log.debug(">guardarPerfil(usuario)");
        }

        try {

        if (log.isDebugEnabled()) {
            log.debug(">el usuario a insertar es: "+usuario.getUsuario());
        }
            HibernateUtil.beginTransaction();           
       
                dao.actualizaPerfil(usuario);

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

/**
 * Método que obtiene los datos según el Codigo postal ingresado del web service
 * @param  cp codigo postal (de Estados Unidos) ingresado
 * @return a [FormaListadoCP]
 */
    public FormaListadoCP getCPInfo(String cp){
        FormaListadoCP a = new FormaListadoCP();
        WSDemo aux = new WSDemo();
        //YOFXSHGYGYMBJAVN9466
        a.setCiudad(aux.geocodePro("YOFXSHGYGYMBJAVN9466", "", "", "", cp).getGeoCity());
        a.setEstado(aux.geocodePro("YOFXSHGYGYMBJAVN9466", "", "", "", cp).getGeoState());
        System.out.println("test");
          System.out.println("country: "+aux.geocodePro("YOFXSHGYGYMBJAVN9466", "", "", "", cp).getGeoCity());
        System.out.println("country: "+aux.geocodePro("YOFXSHGYGYMBJAVN9466", "", "", "", cp).getGeoState());
        System.out.println("country: "+aux.geocodePro("YOFXSHGYGYMBJAVN9466", "", "", "", cp).getCounty().getCountyName());
        return a;
    }

/**
 * Método utilizado para listar los perfiles según la busqueda de un usuario
 * @param  usuario nombre del usuario por el cual se quiere buscar
 * @return resultado si es exitoso
 */
	public Collection listarPerfilPorUsuario(String usuario) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">BuscarUsuario(usuario)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.buscaPerfil(usuario);
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
	
/**
 * Método usado para crear un nuevo perfil y guardar en la BD
 * llamando la clase DAO
 * @param  usuario nombre del usuario a crear
 * @return 0 si es exitoso, 1 si el usuario ya existe, 2 si es fallido
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

/**
 * Método que sirve para poder ordenar las columnas al listar 
 * o buscar un usuario en específico
 * @param  atributo nombre del atributo (encabezado) por el cual se ordenaran
 * @param  usuario  nombre del usuario buscado
 * @return resultado perfiles ordenados
 */
    public Collection ordenarPerfilesPor(String atributo, String usuario) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">listarPerfilesPor(atributo)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.ordenarPerfilesPor(atributo,usuario);
            log.debug("listar Perfiles por "+atributo+": "+resultado);
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
 * Método para eliminar un perfil
 * @param  usuario Nombre del usuario que se quiere eliminar
 * @return  0 si la acción es exitosa, 2 si es fallida
 */
    public int eliminarPerfil(String usuario) {
       int resultado=0;

        if (log.isDebugEnabled()) {
            log.debug(">guardarPerfil(usuario)");
        }

        try {

        if (log.isDebugEnabled()) {
            log.debug(">el usuario a insertar es: "+usuario);
        }
            HibernateUtil.beginTransaction();           
       
                dao.eliminarPerfil(usuario);

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
