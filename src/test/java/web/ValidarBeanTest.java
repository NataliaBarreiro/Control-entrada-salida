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
public class ValidarBeanTest {
    
    public ValidarBeanTest() {
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
     * Test of getUsuario method, of class ValidarBean.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        ValidarBean instance = new ValidarBean();
        String expResult = "";
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setUsuario method, of class ValidarBean.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String usuario = "";
        ValidarBean instance = new ValidarBean();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getMensaje method, of class ValidarBean.
     */
    @Test
    public void testGetMensaje() {
        System.out.println("getMensaje");
        ValidarBean instance = new ValidarBean();
        String expResult = "";
        String result = instance.getMensaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setMensaje method, of class ValidarBean.
     */
    @Test
    public void testSetMensaje() {
        System.out.println("setMensaje");
        String mensaje = "";
        ValidarBean instance = new ValidarBean();
        instance.setMensaje(mensaje);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of guardar method, of class ValidarBean.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        ValidarBean instance = new ValidarBean();
        instance.guardar();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
