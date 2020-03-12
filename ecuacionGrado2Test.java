/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciones;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Bilal
 */
public class ecuacionGrado2Test {
    ecuacionGrado2 ecuacion1=new ecuacionGrado2(1.0,-5.0,6.0);
    ecuacionGrado2 ecuacion2=new ecuacionGrado2(2.0,-7.0,3.0);
    ecuacionGrado2 ecuacion3=new ecuacionGrado2(5.0,-8.0,1.0);
    ecuacionGrado2 ecuacion4=new ecuacionGrado2(4.0,-3.0,2.0);
    public ecuacionGrado2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getCoeficienteA method, of class ecuacionGrado2.
     */
    @Test
    public void testGetCoeficienteA() {
        System.out.println("getCoeficienteA");
        //ecuacionGrado2 instance = null;
        double expResult = 1.0;
        double result = ecuacion1.getCoeficienteA();
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCoeficienteB method, of class ecuacionGrado2.
     */
    @Test
    public void testGetCoeficienteB() {
        System.out.println("getCoeficienteB");
        //ecuacionGrado2 instance = null;
        double expResult = -5.0;
        double result = ecuacion1.getCoeficienteB();
        assertEquals(expResult, result, -5.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCoeficienteC method, of class ecuacionGrado2.
     */
    @Test
    public void testGetCoeficienteC() {
        System.out.println("getCoeficienteC");
        //ecuacionGrado2 instance = null;
        double expResult = 1.0;
        double result = ecuacion3.getCoeficienteC();
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscriminante method, of class ecuacionGrado2.
     */
    @Test
    public void testGetDiscriminante() {
        System.out.println("getDiscriminante");
        //ecuacionGrado2 instance = null;
        double expResult = 1.0;
        double result = ecuacion1.getDiscriminante();
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculaRaices method, of class ecuacionGrado2.
     */
    @Test
    public void testCalculaRaices() {
        System.out.println("calculaRaices");
        //ecuacionGrado2 instance = null;
        int expResult = 2;
        int result = ecuacion1.calculaRaices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
