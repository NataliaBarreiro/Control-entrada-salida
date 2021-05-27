/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author natal
 */
public class CrearBeanTest {
    
    public CrearBeanTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }


    /**
     * Test of getNombre method, of class CrearBean.
     */
    @org.junit.Test
    public void testGetNombre() {
        System.out.println("getNombre");
        CrearBean instance = new CrearBean();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNombre method, of class CrearBean.
     */
    @org.junit.Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        CrearBean instance = new CrearBean();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getId method, of class CrearBean.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        CrearBean instance = new CrearBean();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setId method, of class CrearBean.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        CrearBean instance = new CrearBean();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEdad method, of class CrearBean.
     */
    @org.junit.Test
    public void testGetEdad() {
        System.out.println("getEdad");
        CrearBean instance = new CrearBean();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setEdad method, of class CrearBean.
     */
    @org.junit.Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        CrearBean instance = new CrearBean();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCargo method, of class CrearBean.
     */
    @org.junit.Test
    public void testGetCargo() {
        System.out.println("getCargo");
        CrearBean instance = new CrearBean();
        String expResult = "";
        String result = instance.getCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCargo method, of class CrearBean.
     */
    @org.junit.Test
    public void testSetCargo() {
        System.out.println("setCargo");
        String cargo = "";
        CrearBean instance = new CrearBean();
        instance.setCargo(cargo);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getFechaVinculacion method, of class CrearBean.
     */
    @org.junit.Test
    public void testGetFechaVinculacion() {
        System.out.println("getFechaVinculacion");
        CrearBean instance = new CrearBean();
        Date expResult = null;
        Date result = instance.getFechaVinculacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setFechaVinculacion method, of class CrearBean.
     */
    @org.junit.Test
    public void testSetFechaVinculacion() {
        System.out.println("setFechaVinculacion");
        Date fechaVinculacion = null;
        CrearBean instance = new CrearBean();
        instance.setFechaVinculacion(fechaVinculacion);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRol method, of class CrearBean.
     */
    @org.junit.Test
    public void testGetRol() {
        System.out.println("getRol");
        CrearBean instance = new CrearBean();
        String expResult = "";
        String result = instance.getRol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setRol method, of class CrearBean.
     */
    @org.junit.Test
    public void testSetRol() {
        System.out.println("setRol");
        String rol = "";
        CrearBean instance = new CrearBean();
        instance.setRol(rol);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMensaje method, of class CrearBean.
     */
    @org.junit.Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        CrearBean instance = new CrearBean();
        String expResult = "";
        String result = instance.getMensaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setMensaje method, of class CrearBean.
     */
    @org.junit.Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String mensaje = "";
        CrearBean instance = new CrearBean();
        instance.setMensaje(mensaje);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of guardar method, of class CrearBean.
     */
    @org.junit.Test
    public void testGuardar() {
        System.out.println("guardar");
        CrearBean instance = new CrearBean();
        instance.guardar();
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
