package edu.uag.iidis.scec.persistencia;

import org.hibernate.*;
import org.hibernate.type.*;
import org.hibernate.criterion.Example;
import edu.uag.iidis.scec.excepciones.ExcepcionInfraestructura;
import edu.uag.iidis.scec.modelo.Perfil;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Collection;
import java.util.List;

/**
 * Clase para realizar acciones en la BD
 */
public class PerfilDAO {

    private Log log = LogFactory.getLog(PerfilDAO.class);

/**
 * Constructor de la clase
 */
    public PerfilDAO() {
    }

/**
 * Método que nos sirve para obtener todos los perfiles de la BD
 * @return perfiles [lista con los perfiles almacenados]
 * @throws ExcepcionInfraestructura [excepción de infraestructura]
 */
    public Collection buscarTodos()
            throws ExcepcionInfraestructura {

        Collection perfiles;

        if (log.isDebugEnabled()) {
            log.debug(">buscarTodos()");
        }

        try {
            perfiles = HibernateUtil.getSession()
                                    .createCriteria(Perfil.class)
                                    .list();
                                    
              log.debug(">buscarTodos() ---- list " + perfiles);                                 
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
        return perfiles;
    }

/**
 * Método que sirve para ordenar los datos de la BD según el atributo
 * (encabezado) que se le indica y la busqueda iniciada
 * @param  atributo                 [Nombre del encabezado por el cual se quiere ordenar]
 * @param  usuario                  [Nombre del usuario que se busco]
 * @return results                  [lista con los datos ordenados]
 * @throws ExcepcionInfraestructura [Excepción de infraestructura]
 */
     public Collection ordenarPerfilesPor(String atributo, String usuario)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">existePerfil(nombrePerfil)");
        }

        try {
            String hql = "";
            if(usuario.equals("")){
                hql = "from Perfil ORDER BY "+atributo+"";
            }else{
                hql = "from Perfil where usuario like '"+usuario+"%' ORDER BY "+atributo+"";
            }
            
            
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
 * Método que sirve para guardar los datos en la base de datos
 * @param  perfil                   [datos a guardar]
 * @throws ExcepcionInfraestructura [Exepción de infraestructura]
 */
    public void hazPersistente(Perfil perfil)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazPersistente(perfil)");
        }

        try {
            HibernateUtil.getSession().saveOrUpdate(perfil);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }

/**
 * Método para eliminar un perfil
 * @param  perfil                   [perfil a eliminar]
 * @throws ExcepcionInfraestructura [Excepción de infraestructura]
 */
    public void hazTransitorio(Perfil perfil)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">hazTransitorio(perfil)");
        }

        try {
            HibernateUtil.getSession().delete(perfil);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }

/**
 * Método que nos ayuda a saber si algun perfil ya existe, segun el usuario ingresado
 * @param  usuario                  [atributo usuario]
 * @return false si no existe, true si existe
 * @throws ExcepcionInfraestructura [Excepción de infraestructura]
 */
    public boolean existePerfil(String usuario)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">existeUsuario(nombreUsuario)");
        }

        try {
            
            String hql = "select usuario from Perfil where usuario = :usuario";
           
             if (log.isDebugEnabled()) {
                 log.debug(hql + usuario);
            }
        
            Query query = HibernateUtil.getSession()
                                        .createQuery(hql);
            if (log.isDebugEnabled()) {
                 log.debug("<<<<<<<<< create query ok " );
            }
			query.setParameter("usuario", usuario);
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
                log.warn("<HibernateException *******************  "+ex);
            }
            throw new ExcepcionInfraestructura(ex);
        }
    }

/**
 * Método que nos sirve para buscar el perfil de un usuario especifico
 * @param  usuario                  [nombre del usuario]
 * @return results
 * @throws ExcepcionInfraestructura [Excepción de infraestructura]
 */
	public Collection buscaPerfil(String usuario)
            throws ExcepcionInfraestructura {
				
		if (log.isDebugEnabled()) {
            log.debug("> buscaPerfil(nombreUsuario)");
        }

        try {
            String hql = "from Perfil where usuario like '"+usuario+"%'";
            
             if (log.isDebugEnabled()) {
                 log.debug(hql + usuario);
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
               return null;
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
 * Método que sirve para actualizar los datos de un perfil al momento de editarlo
 * @param  perfil                   [perfil del usuario]
 * @throws ExcepcionInfraestructura [Excepción de infraestructura]
 */
    public void actualizaPerfil(Perfil perfil)
            throws ExcepcionInfraestructura {
                
         if (log.isDebugEnabled()) {
            log.debug(">hazPersistente(perfil)");
        }

        try {
            Perfil p =(Perfil) HibernateUtil.getSession().createQuery("from Perfil where usuario = :typeName")
                   .setParameter("typeName", perfil.getUsuario())
                   .uniqueResult();
            p.setContra(perfil.getContra());
            p.setNombre(perfil.getNombre());
            p.setApellido(perfil.getApellido());
            p.setTelefono(perfil.getTelefono());
            p.setEmail(perfil.getEmail());
            p.setCp(perfil.getCp());
            p.setPais(perfil.getPais());
            p.setCiudad(perfil.getCiudad());
            p.setEstado(perfil.getEstado());
            HibernateUtil.getSession().saveOrUpdate(p);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }

/**
 * Método que sirve para eliminar el perfil de la BD
 * @param  perfil                   [nombre del usuario]
 * @throws ExcepcionInfraestructura [Excepción de infraestructura]
 */
    public void eliminarPerfil(String perfil)
            throws ExcepcionInfraestructura {
                
          if (log.isDebugEnabled()) {
            log.debug(">hazTransitorio(Perfil)");
        }

        try {
            Perfil v =(Perfil) HibernateUtil.getSession().createQuery("from Perfil where usuario = :typeName")
                   .setParameter("typeName", perfil)
                   .uniqueResult();
            HibernateUtil.getSession().delete(v);
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.debug("EXCEPTION ---> ----> "+e);
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
    }
}
