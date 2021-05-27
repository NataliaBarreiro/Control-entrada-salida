/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

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
public class EditarBeanTest {
    
    public EditarBeanTest() {
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
     * Test of getNombre method, of class EditarBean.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        EditarBean instance = new EditarBean();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNombre method, of class EditarBean.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        EditarBean instance = new EditarBean();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdad method, of class EditarBean.
     */
    @Test
    public void testGetEdad() {
        System.out.println("getEdad");
        EditarBean instance = new EditarBean();
        int expResult = 0;
        int result = instance.getEdad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setEdad method, of class EditarBean.
     */
    @Test
    public void testSetEdad() {
        System.out.println("setEdad");
        int edad = 0;
        EditarBean instance = new EditarBean();
        instance.setEdad(edad);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCargo method, of class EditarBean.
     */
    @Test
    public void testGetCargo() {
        System.out.println("getCargo");
        EditarBean instance = new EditarBean();
        String expResult = "";
        String result = instance.getCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setCargo method, of class EditarBean.
     */
    @Test
    public void testSetCargo() {
        System.out.println("setCargo");
        String cargo = "";
        EditarBean instance = new EditarBean();
        instance.setCargo(cargo);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getRol method, of class EditarBean.
     */
    @Test
    public void testGetRol() {
        System.out.println("getRol");
        EditarBean instance = new EditarBean();
        String expResult = "";
        String result = instance.getRol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setRol method, of class EditarBean.
     */
    @Test
    public void testSetRol() {
        System.out.println("setRol");
        String rol = "";
        EditarBean instance = new EditarBean();
        instance.setRol(rol);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getMensaje method, of class EditarBean.
     */
    @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        EditarBean instance = new EditarBean();
        String expResult = "";
        String result = instance.getMensaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMensaje method, of class EditarBean.
     */
    @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String mensaje = "";
        EditarBean instance = new EditarBean();
        instance.setMensaje(mensaje);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of guardar method, of class EditarBean.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        EditarBean instance = new EditarBean();
        instance.guardar();
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
