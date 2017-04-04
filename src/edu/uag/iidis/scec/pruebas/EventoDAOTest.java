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
public class EventoDAOTest{

    @Test
    public void testCrearEvento() throws Exception {
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 5","2017-02-21");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(evento);
            Boolean existe =  dao.existeEvento("Evento 5");
            HibernateUtil.commitTransaction();
            assertTrue("No se inserto el evento",existe);

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testCrearEventoF() throws Exception {
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 1","2017-04-22");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(evento);
            HibernateUtil.commitTransaction();
            assertTrue(evento.getIdEvento() != null);        
            assertTrue(evento.getNombre().equals("Evento 1"));

        } catch (Exception e) {
            fail("El evento ya existe");
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testActualizarEvento() throws Exception {
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 2","2017-07-25");
        HibernateUtil.beginTransaction();

        try {
            dao.actualizarE(evento);
            Collection resultado = dao.buscarEventos("2017-07-25");
            Evento aux = (Evento)resultado.iterator().next();
            assertTrue(aux.getNombre().equals("Evento 2"));
            HibernateUtil.commitTransaction();             
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
        Evento evento = new Evento("Evento 10","2020-07-25");
        HibernateUtil.beginTransaction();

        try {
            dao.actualizarE(evento);
            Collection resultado = dao.buscarEventos("2020-07-25");
            Evento aux = (Evento)resultado.iterator().next();
            assertTrue(aux.getIdEvento() != null);
            assertTrue(aux.getNombre().equals("Evento 10"));
            HibernateUtil.commitTransaction(); 
        } catch (Exception e) {
            fail("No se pudieron actualizar la fecha");
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
            dao.hazTransitorio("Evento 3");
            Boolean existe =  dao.existeEvento("Evento 3");
            HibernateUtil.commitTransaction();
            assertTrue(!existe);

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
        HibernateUtil.beginTransaction();

        try {
            dao.hazTransitorio("Evento 11");
            Collection resultado = dao.buscarEventos("Evento 11");
            HibernateUtil.commitTransaction();
            assertTrue(resultado  == null );
        } catch (Exception e) {
            fail("No se encontro el dato a eliminar");
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
    public void testBuscarTodosF() throws Exception {
        
        EventoDAO dao = new EventoDAO();
        
        HibernateUtil.beginTransaction();
        try {
            Collection resultado = dao.buscarTodos();
            HibernateUtil.commitTransaction();

            assertTrue(resultado != null);
            assertTrue("La busqueda fallo",resultado.isEmpty());
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

        HibernateUtil.beginTransaction();
        try {
            Boolean existe =  dao.existeEvento("Evento 1");
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

        HibernateUtil.beginTransaction();
        try {
            Boolean existe =  dao.existeEvento("Evento 15");
            HibernateUtil.commitTransaction();
            
            assertTrue("El evento no existe",existe);
            
        } catch (Exception e) {
            fail("El evento no existe");

            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testordenarEventosPorFecha() throws Exception {
        
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 20","2017-07-25");
       
        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(evento);
            Collection resultado = dao.ordenarEventosPor("fecha");
            HibernateUtil.commitTransaction();
            Evento aux = (Evento)resultado.iterator().next();
            assertTrue(aux.getFecha().equals("2017-02-21"));
           
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testordenarEventosPorFechaF() throws Exception {
        
        EventoDAO dao = new EventoDAO();
        Evento evento = new Evento("Evento 25","2017-07-25");
       
        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(evento);
            Collection resultado = dao.ordenarEventosPor("ciudad");
            HibernateUtil.commitTransaction();
            Evento aux = (Evento)resultado.iterator().next();
            assertTrue(aux.getFecha().equals("2017-04-22"));
           
        } catch (Exception e) {
            fail("Los datos no se pudieron ordenar");
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }


}
