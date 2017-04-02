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
    public void testCrearVehiculo() throws Exception {
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

}
