/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MF
 */
public class ejercicioPotenciaTest {
    
    public ejercicioPotenciaTest() {
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
     * Test of potencia2 method, of class ejercicioPotencia.
     */
    @Test
    public void testPotenciaA() {
        
        int exp = 0;
        String espera = "0";
        
        assertEquals(espera, ejercicioPotencia.potencia2(exp));
        assertTrue(ejercicioPotencia.potencia2(exp)==espera);
        System.out.println("Caso 1, Resultado es: "+ejercicioPotencia.potencia2(exp));
    }
    
    @Test
    public void testPotenciaB() {
        int exp = 1;
        String espera = "2";
        assertEquals(espera, ejercicioPotencia.potencia2(exp));
      //  assertTrue(ejercicioPotencia.potencia2(exp)==espera);
        System.out.println("Caso 2, Resultado es: "+ejercicioPotencia.potencia2(exp));
    }
    
    @Test
    public void testPotenciaC() {
        int exp = 4;
        String espera = "16";
        assertEquals(espera, ejercicioPotencia.potencia2(exp));
      //  assertTrue(ejercicioPotencia.potencia2(exp)==espera);
        System.out.println("Caso 3, Resultado es: "+ejercicioPotencia.potencia2(exp));
    }
    
    @Test
    public void testPotenciaD() {
        int exp = 5;
        String espera = "25";
        assertEquals(espera, ejercicioPotencia.potencia2(exp));
      //  assertTrue(ejercicioPotencia.potencia2(exp)==espera);
        System.out.println("Caso 4, Resultado es: "+ejercicioPotencia.potencia2(exp));
    }
    
    @Test
    public void testPotenciaE() {
        int exp = 8001;
        String espera = "64016001";
        assertEquals(espera, ejercicioPotencia.potencia2(exp));
      //  assertTrue(ejercicioPotencia.potencia2(exp)==espera);
        System.out.println("Caso 5, Resultado es: "+ejercicioPotencia.potencia2(exp));
    }
}
