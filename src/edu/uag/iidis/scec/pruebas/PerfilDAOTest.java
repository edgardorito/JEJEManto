package edu.uag.iidis.scec.pruebas;


import org.junit.*;
import static org.junit.Assert.*;
import org.hibernate.cfg.Environment;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import edu.uag.iidis.scec.modelo.*;
import edu.uag.iidis.scec.persistencia.*;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;

import java.util.*;


public class PerfilDAOTest{
       
    @Test
    public void testCrearPerfilE() throws Exception {
        PerfilDAO dao = new PerfilDAO();
        Perfil perfil = new Perfil("joss","1234","Josseline","Arreola","9613040524","joss@gmail.com","29000","México","Tuxtla Gutierrez","Chiapas");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(perfil);
            HibernateUtil.commitTransaction();

            assertTrue(perfil.getId() != null);
            assertTrue(perfil.getUsuario().equals("joss"));
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
    
    @Test
    public void testCrearPerfilF() throws Exception {
        //Falla porque el usuario ya esta en BD
        PerfilDAO dao = new PerfilDAO();
        Perfil perfil = new Perfil("joss","1234","Josseline","Arreola","9613040524","joss@gmail.com","29000","México","Tuxtla Gutierrez","Chiapas");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(perfil);
            HibernateUtil.commitTransaction();
            
            assertTrue(perfil.getId() != null);
            assertTrue(perfil.getUsuario().equals("joss"));
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testUpdatePerfil() throws Exception {
        PerfilDAO dao = new PerfilDAO();
        Perfil perfil = new Perfil("joss","hola1234","Josseline","Arreola","9613040524","joss21@gmail.com","29000","México","Tuxtla Gutierrez","Chiapas");
        HibernateUtil.beginTransaction();
        try {
             dao.actualizaPerfil(perfil);
             Collection resultado = dao.buscaPerfil("joss");
             HibernateUtil.commitTransaction();
             Perfil perfilB = (Perfil)resultado.iterator().next();
            assertTrue(perfilB.getId() != null);
            assertTrue(perfilB.getContra().equals("hola1234"));

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
    
   
    @Test
    public void testBuscarTodos() throws Exception {
        
        PerfilDAO dao = new PerfilDAO();
        
        HibernateUtil.beginTransaction();
        try {
            Collection resultado = dao.buscarTodos();
            HibernateUtil.commitTransaction();

            assertTrue(resultado != null);
            assertTrue(!resultado.isEmpty());
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
    @Test
    public void testExistePerfilE() throws Exception {
        
        PerfilDAO dao = new PerfilDAO();
        
        HibernateUtil.beginTransaction();
        try {
         
            Boolean existe =  dao.existePerfil("joss");
            HibernateUtil.commitTransaction();
            
            assertTrue(existe);
            
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
    @Test
    public void testExistePerflF() throws Exception {
        
        PerfilDAO dao = new PerfilDAO();
        
        HibernateUtil.beginTransaction();
        try {
   
            Boolean existe =  dao.existePerfil("joss1");
            HibernateUtil.commitTransaction();
            
            assertTrue(existe);
            
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
    @Test
    public void testEliminarPerfil() throws Exception {
        
        PerfilDAO dao = new PerfilDAO();
        //Perfil perfil = new Perfil("joss","hola1234","Josseline","Arreola","9613040524","joss21@gmail.com","29000","México","Tuxtla Gutierrez","Chiapas");
        
        HibernateUtil.beginTransaction();
        try {
             dao.eliminarPerfil("jul");
            Collection resultado = dao.buscaPerfil("jul");
            HibernateUtil.commitTransaction();
            
            assertTrue(resultado  ==null );
           
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
    @Test
    public void testOrdenarPerfilesPor() throws Exception {
        
        PerfilDAO dao = new PerfilDAO();
        Perfil perfil = new Perfil("armando","123","armando","Arreola","9615048594","ar2@gmail.com","29004","México","Tuxtla Gutierrez","Chiapas");
       
        HibernateUtil.beginTransaction();
        try {
             dao.hazPersistente(perfil);
            Collection resultado = dao.ordenarPerfilesPor("usuario","");
            HibernateUtil.commitTransaction();
            Perfil aux = (Perfil)resultado.iterator().next();
            assertTrue(aux.getUsuario().equals("armando"));
           
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }


    



}
