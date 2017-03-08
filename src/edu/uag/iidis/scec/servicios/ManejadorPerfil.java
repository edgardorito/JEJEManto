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
public class ManejadorPerfil {
    private Log log = LogFactory.getLog(ManejadorPerfil.class);
    private PerfilDAO dao;

  public ManejadorPerfil() {
        dao = new PerfilDAO();
    }
 

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

    public FormaListadoCP getCPInfo(String cp){
        FormaListadoCP a = new FormaListadoCP();
        WSDemo aux = new WSDemo();
        //YOFXSHGYGYMBJAVN9466
        a.setCiudad(aux.geocodePro("XTQSTISOGEUDTOGN9120", "", "", "", cp).getGeoCity());
        a.setEstado(aux.geocodePro("XTQSTISOGEUDTOGN9120", "", "", "", cp).getGeoState());
        System.out.println("test");
          System.out.println("country: "+aux.geocodePro("XTQSTISOGEUDTOGN9120", "", "", "", "33134").getGeoCity());
        System.out.println("country: "+aux.geocodePro("XTQSTISOGEUDTOGN9120", "", "", "", cp).getGeoState());
        System.out.println("country: "+aux.geocodePro("XTQSTISOGEUDTOGN9120", "", "", "", cp).getCounty().getCountyName());
        return a;
    }
	
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

    public Collection ordenarPerfilesPor(String atributo) {
        Collection resultado;

        if (log.isDebugEnabled()) {
            log.debug(">listarPerfilesPor(atributo)");
        }

        try {
            HibernateUtil.beginTransaction();
            resultado = dao.ordenarPerfilesPor(atributo);
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

    public int eliminarPerfil(Perfil usuario) {
       int resultado=0;

        if (log.isDebugEnabled()) {
            log.debug(">guardarPerfil(usuario)");
        }

        try {

        if (log.isDebugEnabled()) {
            log.debug(">el usuario a insertar es: "+usuario.getUsuario());
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
