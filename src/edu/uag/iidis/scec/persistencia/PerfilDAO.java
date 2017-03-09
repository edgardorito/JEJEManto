package edu.uag.iidis.scec.persistencia;

import org.hibernate.*;
import org.hibernate.type.*;
import org.hibernate.criterion.Example;
//import org.hibernate.classic.*;


import edu.uag.iidis.scec.excepciones.ExcepcionInfraestructura;
import edu.uag.iidis.scec.modelo.Perfil;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Collection;
import java.util.List;


public class PerfilDAO {

    private Log log = LogFactory.getLog(PerfilDAO.class);

    public PerfilDAO() {
    }

/*
    public Perfil buscarPorId(Long id, boolean bloquear)
            throws ExcepcionInfraestructura {

        Perfil perfil = null;

        if (log.isDebugEnabled()) {
            log.debug(">buscarPorID(" + id + ", " + bloquear + ")");
        }

        try {
            if (bloquear) {
                perfil = (Perfil)HibernateUtil.getSession()
                                                .load(Perfil.class, 
                                                      id, 
                                                      LockMode.UPGRADE);
            } else {
                perfil = (Perfil)HibernateUtil.getSession()
                                                .load(Perfil.class,
                                                      id);
            }
        } catch (HibernateException ex) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }

            throw new ExcepcionInfraestructura(ex);
        }
        return estado;
    }

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

/*
    public Collection buscarPorEjemplo(Estado estado)
            throws ExcepcionInfraestructura {


        Collection estados;
 
        if (log.isDebugEnabled()) {
            log.debug(">buscarPorEjemplo()");
        }

        try {
            Criteria criteria = HibernateUtil.getSession()
                                             .createCriteria(Estado.class);
            estados = criteria.add(Example.create(estado)).list();
        } catch (HibernateException e) {
            if (log.isWarnEnabled()) {
                log.warn("<HibernateException");
            }
            throw new ExcepcionInfraestructura(e);
        }
        return estados;
    }

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
    }/*
*/
    public boolean existePerfil(String usuario)
            throws ExcepcionInfraestructura {

        if (log.isDebugEnabled()) {
            log.debug(">existeUsuario(nombreUsuario)");
        }

        try {
            
            
//            String consultaCuentaRoles =
//            "select count(*) from Ciudad r where r.nombre=?";
//
 //           int resultado =
 //           ((Integer) HibernateUtil.getSession()
 //                          .find(consultaCuentaRoles, 
 //                                nombreRol,
 //                                StringType.INSTANCE)
 //                          .iterator()
 //                          .next()).intValue();
// de acuerdo al nuevo formato
 
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
