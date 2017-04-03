package edu.uag.iidis.scec.pruebas;


import org.junit.*;
import static org.junit.Assert.*;
import org.hibernate.cfg.Environment;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import edu.uag.iidis.scec.modelo.*;
import edu.uag.iidis.scec.persistencia.*;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;

import java.util.*;


public class EventoDAOTest{

     

    //Exitoso
    @Test
    public void testCrearEvento() throws Exception {
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 4","2017-04-21");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(evento);
            HibernateUtil.commitTransaction();

            assertTrue(evento.getIdEvento() != null);
            assertTrue(evento.getNombre().equals("Evento 4"));
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    //Error
    @Test
    public void testCrearEventoF() throws Exception {
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 1","2017-04-21");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(evento);
            HibernateUtil.commitTransaction();
            assertTrue(evento.getIdEvento() != null);
            assertTrue(evento.getNombre().equals("Evento 1"));
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testActualizarEvento() throws Exception {
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 1","2017-04-22");
        HibernateUtil.beginTransaction();

        try {
           Evento p =(Evento) HibernateUtil.getSession().createQuery("from Evento where nombre = :name")
           .setParameter("name", evento.getNombre())
           .uniqueResult();
           p.setFecha(evento.getFecha());

           HibernateUtil.getSession().update(p);
            HibernateUtil.commitTransaction();
            assertTrue(evento.getIdEvento() != null);
            assertTrue(evento.getFecha().equals("2017-04-22"));   
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
           
    }

    @Test
    public void testActualizarEventoF() throws Exception {
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 5","2017-04-22");
        HibernateUtil.beginTransaction();

        try {
           Evento p =(Evento) HibernateUtil.getSession().createQuery("from Evento where nombre = :name")
           .setParameter("name", evento.getNombre())
           .uniqueResult();
           p.setFecha(evento.getFecha());

           HibernateUtil.getSession().update(p);
            HibernateUtil.commitTransaction();   
            assertTrue(evento.getIdEvento() != null);
            assertTrue(evento.getFecha().equals("2017-04-22"));   

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
           
    }

    @Test
    public void testEliminarEvento() throws Exception {
        EventoDAO dao = new EventoDAO();
        HibernateUtil.beginTransaction();

        try {
            Evento ev =(Evento) HibernateUtil.getSession().createQuery("from Evento where nombre = Evento 3");

            HibernateUtil.getSession().delete(ev); 
            Evento evento = dao.buscarEventoFecha("2017-04-21");
            HibernateUtil.commitTransaction();

            assertTrue(evento == null);
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
           
    }

    @Test
    public void testEliminarEventoF() throws Exception {
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 5","2017-04-22");
        HibernateUtil.beginTransaction();

        try {
           Evento ev =(Evento) HibernateUtil.getSession().createQuery("from Evento where nombre = Evento 10");

            HibernateUtil.getSession().delete(ev); 
            Evento evento = dao.buscarEventoFecha("2017-04-22");
            HibernateUtil.commitTransaction();

            assertTrue(evento == null);
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
           
    }

    @Test
    public void testBuscarTodos() throws Exception {
        
        EventoDAO dao = new EventoDAO();
        
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
    public void testExisteEvento() throws Exception {
        
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 6","2017-04-25");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(evento);
            Boolean existe =  dao.existeEvento("Evento 6");
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
    public void testExisteEventoF() throws Exception {
        
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 10","2017-04-25");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(evento);
            Boolean existe =  dao.existeEvento("Evento 10");
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
    public void ordenarEventosPor() throws Exception {
        
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 7","2017-07-10");
        HibernateUtil.beginTransaction();
        try {
             dao.hazPersistente(evento);
            Collection resultado = dao.ordenarEventosPor("nombre");
            HibernateUtil.commitTransaction();
            Evento aux = (Evento)resultado.iterator().next();
            assertTrue(aux.getNombre().equals("Evento 7"));
           
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

}
