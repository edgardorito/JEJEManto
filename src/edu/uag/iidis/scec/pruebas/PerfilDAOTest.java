package edu.uag.iidis.scec.pruebas;


import org.junit.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;
import org.hibernate.cfg.Environment;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import edu.uag.iidis.scec.modelo.*;
import edu.uag.iidis.scec.persistencia.*;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;

import java.util.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PerfilDAOTest{
       
    @Test
    public void testCrearPerfilE() throws Exception {
        PerfilDAO dao = new PerfilDAO();
        Perfil perfil = new Perfil("joss","1234","Josseline","Arreola","9613040524","joss@gmail.com","29000","México","Tuxtla Gutierrez","Chiapas");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(perfil);
             Boolean existe =  dao.existePerfil("joss");
            HibernateUtil.commitTransaction();
           
            assertTrue("No se inserto el perfil",existe);
            
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
          
        } finally{
            HibernateUtil.closeSession();
        }
    }
    
    @Test
    public void testCrearPerfilF() throws Exception {
        //Falla porque el usuario ya esta en BD
        PerfilDAO dao = new PerfilDAO();
        Perfil perfil = new Perfil("juliane","1234","Josseline","Arreola","9613040524","joss@gmail.com","29000","México","Tuxtla Gutierrez","Chiapas");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(perfil);
            HibernateUtil.commitTransaction();
            
            assertTrue(perfil.getId() != null);
            assertTrue(perfil.getUsuario().equals("juliane"));
           
        } catch (Exception e) {
             fail("Usuario ya existe");
            HibernateUtil.rollbackTransaction();
           
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testUpdatePerfilE() throws Exception {
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
           
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testUpdatePerfilF() throws Exception {
        PerfilDAO dao = new PerfilDAO();
        Perfil perfil = new Perfil("joss1","hola12345","Josseline","Arreola","9613040524","joss21@gmail.com","29000","México","Tuxtla Gutierrez","Chiapas");
        HibernateUtil.beginTransaction();
        try {
             dao.actualizaPerfil(perfil);
             Collection resultado = dao.buscaPerfil("joss1");
             HibernateUtil.commitTransaction();
             Perfil perfilB = (Perfil)resultado.iterator().next();
            assertTrue(perfilB.getId() != null);
            assertTrue(perfilB.getContra().equals("hola12345"));

        } catch (Exception e) {
            fail("No se pudieron actualizar los datos");
            HibernateUtil.rollbackTransaction();
            
        } finally{
            HibernateUtil.closeSession();
        }
    }
    
   
    @Test
    public void testBuscarTodosE() throws Exception {
        
        PerfilDAO dao = new PerfilDAO();
        
        HibernateUtil.beginTransaction();
        try {
            Collection resultado = dao.buscarTodos();
            HibernateUtil.commitTransaction();

            assertTrue(resultado != null);
            assertTrue(!resultado.isEmpty());
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
           
        } finally{
            HibernateUtil.closeSession();
        }
    }
    @Test
    public void testBuscarTodosF() throws Exception {
        
        PerfilDAO dao = new PerfilDAO();
        
        HibernateUtil.beginTransaction();
        try {
            Collection resultado = dao.buscarTodos();
            HibernateUtil.commitTransaction();

            assertTrue(resultado != null);
            assertTrue("Existen datos",resultado.isEmpty());
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
        
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
            
            assertTrue("El perfil no existe",existe);
            
        } catch (Exception e) {
            fail("El perfil no existe");
            HibernateUtil.rollbackTransaction();
            
        } finally{
            HibernateUtil.closeSession();
        }
    }
    @Test
    public void testEliminarPerfilE() throws Exception {
        
        PerfilDAO dao = new PerfilDAO();
        //Perfil perfil = new Perfil("joss","hola1234","Josseline","Arreola","9613040524","joss21@gmail.com","29000","México","Tuxtla Gutierrez","Chiapas");
        
        HibernateUtil.beginTransaction();
        try {
             dao.eliminarPerfil("jul");
                Boolean existe =  dao.existePerfil("jul");
            
            HibernateUtil.commitTransaction();
            
           
            assertTrue(!existe);
        } catch (Exception e) {
            fail("test");
            HibernateUtil.rollbackTransaction();
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testEliminarPerfilF() throws Exception {
        
        PerfilDAO dao = new PerfilDAO();
        //Perfil perfil = new Perfil("joss","hola1234","Josseline","Arreola","9613040524","joss21@gmail.com","29000","México","Tuxtla Gutierrez","Chiapas");
        
        HibernateUtil.beginTransaction();
        try {
             dao.eliminarPerfil("juli");
            Collection resultado = dao.buscaPerfil("juli");
            HibernateUtil.commitTransaction();
            
            assertTrue(resultado  ==null );
           
        } catch (Exception e) {
            fail("No se encontro el dato a eliminar");
            HibernateUtil.rollbackTransaction();
        } finally{
            HibernateUtil.closeSession();
        }
    }
    @Test
    public void testOrdenarPerfilesPorE() throws Exception {
        
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
           
        } finally{
            HibernateUtil.closeSession();
        }
    }

     @Test
    public void testOrdenarPerfilesPorF() throws Exception {
        
        PerfilDAO dao = new PerfilDAO();
        //Perfil perfil = new Perfil("armando","123","armando","Arreola","9615048594","ar2@gmail.com","29004","México","Tuxtla Gutierrez","Chiapas");
       
        HibernateUtil.beginTransaction();
        try {
           //  dao.hazPersistente(perfil);
            Collection resultado = dao.ordenarPerfilesPor("edad","");
            HibernateUtil.commitTransaction();
            Perfil aux = (Perfil)resultado.iterator().next();
           // assertTrue("Existen perfiles",resultado.isEmpty());
           assertTrue(aux.getUsuario().equals("armando"));
        } catch (Exception e) {
            fail("Los datos no se pudieron ordenar");
            HibernateUtil.rollbackTransaction();
            
        } finally{
            HibernateUtil.closeSession();
        }
    }
    



}
