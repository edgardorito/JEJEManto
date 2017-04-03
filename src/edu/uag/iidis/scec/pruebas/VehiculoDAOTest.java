package edu.uag.iidis.scec.pruebas;


import org.junit.*;
import static org.junit.Assert.*;
import org.hibernate.cfg.Environment;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import edu.uag.iidis.scec.modelo.*;
import edu.uag.iidis.scec.persistencia.*;
import edu.uag.iidis.scec.persistencia.hibernate.HibernateUtil;

import java.util.*;


public class VehiculoDAOTest{

    @Test
    public void testCrearVehiculoE() throws Exception {
        VehiculoDAO dao = new VehiculoDAO();
        Vehiculo vehiculo = new Vehiculo("FOHJ960414HMCLRV09","automovil","2002","FORD","AHI98G","ROJO");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(vehiculo);
            HibernateUtil.commitTransaction();

            assertTrue(vehiculo.getId() != null);
            assertTrue(vehiculo.getCurp().equals("FOHJ960414HMCLRV09"));
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
    
    @Test
    public void testCrearVehiculoF() throws Exception {
        //Falla porque la placa esta en BD
        VehiculoDAO dao = new VehiculoDAO();
        Vehiculo vehiculo = new Vehiculo("FOHJ960414HMCLRV09","automovil","2002","FORD","AHI98G","ROJO");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(vehiculo);
            HibernateUtil.commitTransaction();
            
            assertTrue(vehiculo.getId() != null);
            assertTrue(vehiculo.getCurp().equals("FOHJ960414HMCLRV09"));
        } catch (Exception e) {
            fail("El vehiculo ya se encuentra registrado");
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }

    @Test
    public void testActualizarVehiculo() throws Exception {
        VehiculoDAO dao = new VehiculoDAO();
        Vehiculo vehiculo = new Vehiculo("SHJO960414HTCLRV08","automovil","2015","FORD","HOI89H","Azul");
        HibernateUtil.beginTransaction();
        try {
             dao.hazPersistenteP(vehiculo);
             Vehiculo vehiculoB = dao.buscarVehiculosPlaca("HOI89H");
            HibernateUtil.commitTransaction();

            assertTrue(vehiculoB.getId() != null);
            assertTrue(vehiculoB.getColor().equals("Azul"));

        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
    @Test
    public void test4ActualizarVehiculoF() throws Exception {
        //Falla porque la placa no se puede actualizar
        VehiculoDAO dao = new VehiculoDAO();
        Vehiculo vehiculo = new Vehiculo("FOHJ960414HMCLRV09","automovil","2015","DODGE","AEH82J","Azul");
        HibernateUtil.beginTransaction();
        try {
             dao.hazPersistenteP(vehiculo);
             Vehiculo vehiculoB = dao.buscarVehiculosPlaca("AEH82J");
            HibernateUtil.commitTransaction();

            assertTrue(vehiculoB.getId() != null);
            assertTrue(vehiculoB.getColor().equals("Azul"));

        } catch (Exception e) {
            fail("La placa ya esta registrada")
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
   
    @Test
    public void testBuscarTodos() throws Exception {
        
        VehiculoDAO dao = new VehiculoDAO();
        
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
    public void testExisteVehiculoE() throws Exception {
        
        VehiculoDAO dao = new VehiculoDAO();
        Vehiculo vehiculo = new Vehiculo("ABHY991214JOYHRV09","automovil","1999","FORD","QWER82","Rojo");

        HibernateUtil.beginTransaction();
        try {
            dao.hazPersistente(vehiculo);
            Boolean existe =  dao.existeVehiculo("QWER82");
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
    public void testExisteVehiculoF() throws Exception {
        
        VehiculoDAO dao = new VehiculoDAO();
        //Vehiculo vehiculo = new Vehiculo("ABHY991214JOYHRV09","automovil","1999","FORD","QWER82","Rojo");

        HibernateUtil.beginTransaction();
        try {
           // dao.hazPersistente(vehiculo);
            Boolean existe =  dao.existeVehiculo("QWER89091");
            HibernateUtil.commitTransaction();
            
            assertTrue("El vehiculo no se encuentra registrado",existe);
            
        } catch (Exception e) {
            fail("El vehiculo no se encuentra registrado");
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
    @Test
    public void testEliminarVehiculo() throws Exception {
        
        VehiculoDAO dao = new VehiculoDAO();
        
        HibernateUtil.beginTransaction();
        try {
             dao.hazTransitorio("Y7U7IN");
            Vehiculo vehiculoB = dao.buscarVehiculosPlaca("Y7U7IN");
            HibernateUtil.commitTransaction();

            assertTrue(vehiculoB == null);
           
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
    @Test
    public void ordenarVehiculosPorE() throws Exception {
        
        VehiculoDAO dao = new VehiculoDAO();
        Vehiculo vehiculo = new Vehiculo("Aaaa00000","automovil","1999","Peugeut","OIUP2U3","Blanco");
        HibernateUtil.beginTransaction();
        try {
             dao.hazPersistente(vehiculo);
            Collection resultado = dao.ordenarVehiculosPor("curp","");
            HibernateUtil.commitTransaction();
            Vehiculo aux = (Vehiculo)resultado.iterator().next();
            assertTrue(aux.getCurp().equals("Aaaa00000"));
           
        } catch (Exception e) {
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }
     @Test
    public void ordenarVehiculosPorF() throws Exception {
        
        VehiculoDAO dao = new VehiculoDAO();
        //Vehiculo vehiculo = new Vehiculo("Aaaa00000","automovil","1999","Peugeut","OIUP2U3","Blanco");
        HibernateUtil.beginTransaction();
        try {
//             dao.hazPersistente(vehiculo);
            Collection resultado = dao.ordenarVehiculosPor("auto","");
            HibernateUtil.commitTransaction();
            Vehiculo aux = (Vehiculo)resultado.iterator().next();
            assertTrue(aux.getCurp().equals("Aaaa00000"));
           
        } catch (Exception e) {
            fail("No se pudo ordenar porque la columna no existe");
            HibernateUtil.rollbackTransaction();
            throw e;
        } finally{
            HibernateUtil.closeSession();
        }
    }


    



}
