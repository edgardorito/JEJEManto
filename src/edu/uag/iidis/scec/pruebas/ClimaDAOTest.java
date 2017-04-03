package edu.uag.iidis.scec.pruebas;


import org.junit.*;
import static org.junit.Assert.*;
import org.hibernate.cfg.Environment;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import edu.uag.iidis.scec.modelo.*;
import edu.uag.iidis.scec.persistencia.*;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;

import java.util.*;


public class ClimaDAOTest{


    @Test
    public void testCrearClima() throws Exception {
        ClimaDAO dao = new ClimaDAO();
        Clima clima = new Clima("San cristobal","0312312213","123213125344");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(clima);
            Collection resultado = dao.buscarClima("San cristobal");
            Clima aux = (Clima)resultado.iterator().next();
            assertTrue(aux.getLatitud().equals("0312312213"));

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    //Error
    @Test
    public void testCrearClimaF() throws Exception {
        ClimaDAO dao = new ClimaDAO();
        Clima clima = new Clima("Matias Romero","0165165165","016516215165");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(clima);
            Collection resultado = dao.buscarClima("Matias Romero");
            Clima aux = (Clima)resultado.iterator().next();
            assertTrue(aux.getLatitud().equals("0165165165"));
            assertTrue(aux.getLongitud().equals("016516215165"));

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testActualizarClima() throws Exception {
        ClimaDAO dao = new ClimaDAO();
        Clima clima = new Clima("Tuxtla","01643434321","21212123123121212");
        HibernateUtil.beginTransaction();

        try {
           dao.hazCambios(clima);
            Collection resultado = dao.buscarClima("Tuxtla");
            Clima aux = (Clima)resultado.iterator().next();

            assertTrue(aux.getLatitud().equals("01643434321"));
            assertTrue(aux.getLongitud().equals("21212123123121212"));

            HibernateUtil.commitTransaction();

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
           
    }

    @Test
    public void testActualizarClimaF() throws Exception {
        ClimaDAO dao = new ClimaDAO();
        Clima clima = new Clima("Cintalapa","0165165212165","131232321");
        HibernateUtil.beginTransaction();

        try {

           dao.hazCambios(clima);
            Collection resultado = dao.buscarClima("Tuxtla");
            Clima aux = (Clima)resultado.iterator().next();

            assertTrue(aux.getLatitud().equals("01643434321"));
            assertTrue(aux.getLongitud().equals("21212123123121212"));

            HibernateUtil.commitTransaction();

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
           
    }

    @Test
    public void testEliminarClima() throws Exception {
        ClimaDAO dao = new ClimaDAO();
        HibernateUtil.beginTransaction();

        try {

            dao.eliminarClima("Tuxtla");
            Collection resultado = dao.buscarClima("Tuxtla");
            HibernateUtil.commitTransaction();
            Clima aux = (Clima)resultado.iterator().next();
            assertTrue(aux == null);

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
           
    }

    @Test
    public void testEliminarClimaF() throws Exception {
        ClimaDAO dao = new ClimaDAO();
        HibernateUtil.beginTransaction();

        try {
            
            Collection resultado = dao.eliminarClima("Tuxtla");
            HibernateUtil.commitTransaction();
            Clima aux = (Clima)resultado.iterator().next();
            assertTrue(aux == null);

            //assertTrue(aux.getCiudad().equals("Tuxtla") == null);
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
           
    }

    @Test
    public void testBuscarTodos() throws Exception {
        
        ClimaDAO dao = new ClimaDAO();
        
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
    public void testordenarClimasPor() throws Exception {
        
        ClimaDAO dao = new ClimaDAO();
        HibernateUtil.beginTransaction();
        try {
            Collection resultado = dao.ordenarClimasPor("ciudad");
            HibernateUtil.commitTransaction();
            Clima aux = (Clima)resultado.iterator().next();
            assertTrue(aux.getCiudad().equals("Tuxtla"));
           
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

}
