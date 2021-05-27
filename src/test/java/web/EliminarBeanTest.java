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
public class EliminarBeanTest {
    
    public EliminarBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class EliminarBean.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        EliminarBean instance = new EliminarBean();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNombre method, of class EliminarBean.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        EliminarBean instance = new EliminarBean();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getId method, of class EliminarBean.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        EliminarBean instance = new EliminarBean();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setId method, of class EliminarBean.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        EliminarBean instance = new EliminarBean();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEdad method, of class EliminarBean.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        EliminarBean instance = new EliminarBean();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setEdad method, of class EliminarBean.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        EliminarBean instance = new EliminarBean();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCargo method, of class EliminarBean.
     */
    @Test
    public void testGetCargo() {
        System.out.println("getCargo");
        EliminarBean instance = new EliminarBean();
        String expResult = "";
        String result = instance.getCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCargo method, of class EliminarBean.
     */
    @Test
    public void testSetCargo() {
        System.out.println("setCargo");
        String cargo = "";
        EliminarBean instance = new EliminarBean();
        instance.setCargo(cargo);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getFechaVinculacion method, of class EliminarBean.
     */
    @Test
    public void testGetFechaVinculacion() {
        System.out.println("getFechaVinculacion");
        EliminarBean instance = new EliminarBean();
        Date expResult = null;
        Date result = instance.getFechaVinculacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setFechaVinculacion method, of class EliminarBean.
     */
    @Test
    public void testSetFechaVinculacion() {
        System.out.println("setFechaVinculacion");
        Date fechaVinculacion = null;
        EliminarBean instance = new EliminarBean();
        instance.setFechaVinculacion(fechaVinculacion);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRol method, of class EliminarBean.
     */
    @Test
    public void testGetRol() {
        System.out.println("getRol");
        EliminarBean instance = new EliminarBean();
        String expResult = "";
        String result = instance.getRol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setRol method, of class EliminarBean.
     */
    @Test
    public void testSetRol() {
        System.out.println("setRol");
        String rol = "";
        EliminarBean instance = new EliminarBean();
        instance.setRol(rol);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getMensaje method, of class EliminarBean.
     */
    @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        EliminarBean instance = new EliminarBean();
        String expResult = "";
        String result = instance.getMensaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setMensaje method, of class EliminarBean.
     */
    @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String mensaje = "";
        EliminarBean instance = new EliminarBean();
        instance.setMensaje(mensaje);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of guardar method, of class EliminarBean.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        EliminarBean instance = new EliminarBean();
        instance.guardar();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
