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
            //assertTrue(evento.getNombre().equals("Evento 2"));
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
        try {
           Evento p =(Evento) HibernateUtil.getSession().createQuery("from Evento where nombre = :name")
           .setParameter("name", evento.getNombre())
           .uniqueResult();
           p.setFecha(evento.getFecha());

           HibernateUtil.getSession().update(p);   
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
        try {
           Evento p =(Evento) HibernateUtil.getSession().createQuery("from Evento where nombre = :name")
           .setParameter("name", evento.getNombre())
           .uniqueResult();
           p.setFecha(evento.getFecha());

           HibernateUtil.getSession().update(p);   
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
        try {
            Evento ev =(Evento) HibernateUtil.getSession().createQuery("from Evento where nombre = Evento 3")

            HibernateUtil.getSession().delete(ev); 
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
        try {
           Evento ev =(Evento) HibernateUtil.getSession().createQuery("from Evento where nombre = Evento 10")

            HibernateUtil.getSession().delete(ev); 
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
           
    }

}
