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
public class ClimaDAOTest{


    @Test
    public void testCrearClima() throws Exception {
        ClimaDAO dao = new ClimaDAO();
        Clima clima = new Clima("San cristobal","0312312213","123213125344");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(clima);
            Boolean existe =  dao.existeClima("San cristobal");
            HibernateUtil.commitTransaction();
           
            assertTrue("No se inserto el clima",existe);

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testCrearClimaF() throws Exception {
        ClimaDAO dao = new ClimaDAO();
        Clima clima = new Clima("Matias Romero","0165165165","016516215165");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(clima);
            HibernateUtil.commitTransaction();
            assertTrue(clima.getIdClima() != null);
            assertTrue(clima.getLatitud().equals("0165165165"));
        } catch (Exception e) {
             fail("Clima ya existe");
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
        Clima clima = new Clima("Cintalapa","01652132132","695050302");
        HibernateUtil.beginTransaction();

        try {

           dao.hazCambios(clima);
            Collection resultado = dao.buscarClima("Cintalapa");
            Clima aux = (Clima)resultado.iterator().next();
            assertTrue(aux.getIdClima() != null);
            assertTrue(aux.getLatitud().equals("01652132132"));
            assertTrue(aux.getLongitud().equals("695050302"));

            HibernateUtil.commitTransaction();

        } catch (Exception e) {
            fail("No se pudieron actualizar la latitud y longitud");
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

            dao.eliminarClima("Cancun");
            Boolean existe =  dao.existeClima("Cancun");
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
    public void testEliminarClimaF() throws Exception {
        ClimaDAO dao = new ClimaDAO();
        HibernateUtil.beginTransaction();

        try {
            
            dao.eliminarClima("Monterrey");
            Collection resultado = dao.buscarClima("Monterrey");
            HibernateUtil.commitTransaction();
            assertTrue(resultado  ==null );

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
    public void testBuscarTodosF() throws Exception {
        
        ClimaDAO dao = new ClimaDAO();
        
        HibernateUtil.beginTransaction();
        try {
            Collection resultado = dao.buscarTodos();
            HibernateUtil.commitTransaction();

            assertTrue(resultado != null);
            assertTrue("Existen datos",resultado.isEmpty());
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testExisteClima() throws Exception {
        
        ClimaDAO dao = new ClimaDAO();
        
        HibernateUtil.beginTransaction();
        try {
         
            Boolean existe =  dao.existeClima("Matias Romero");
            HibernateUtil.commitTransaction();
            
            assertTrue(existe);
            
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
           
        } finally{
            HibernateUtil.closeSession();
        }
    }

        @Test
    public void testExisteClimaF() throws Exception {
        
        ClimaDAO dao = new ClimaDAO();
        
        HibernateUtil.beginTransaction();
        try {
         
            Boolean existe =  dao.existeClima("Guadalajara");
            HibernateUtil.commitTransaction();
            
            assertTrue("El clima no existe",existe);
            
        } catch (Exception e) {
            fail("El clima no existe");

            HibernateUtil.rollbackTransaction();
           
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testordenarClimasPorCiudad() throws Exception {
        
        ClimaDAO dao = new ClimaDAO();
        Clima clima = new Clima("Aguascalientes","231242422","423464654654");
       
        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(clima);
            Collection resultado = dao.ordenarClimasPor("ciudad");
            HibernateUtil.commitTransaction();
            Clima aux = (Clima)resultado.iterator().next();
            assertTrue(aux.getCiudad().equals("Aguascalientes"));
           
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testordenarClimasPorCiudadF() throws Exception {
        
        ClimaDAO dao = new ClimaDAO();
        Clima clima = new Clima("Tlaxcala","231242422","423464654654");
       
        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(clima);
            Collection resultado = dao.ordenarClimasPor("estado");
            HibernateUtil.commitTransaction();
            Clima aux = (Clima)resultado.iterator().next();
            assertTrue(aux.getCiudad().equals("Tlaxcala"));
           
        } catch (Exception e) {
            fail("Los datos no se pudieron ordenar");
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

}
