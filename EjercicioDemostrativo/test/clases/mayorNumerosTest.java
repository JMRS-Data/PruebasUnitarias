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
public class mayorNumerosTest {
    
    public mayorNumerosTest() {
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
     * Test of numeroMayor method, of class mayorNumeros.
     */
    @Test
    public void testNumeroMayor() {
        System.out.println("numeroMayor");
        int a = 0;
        int b = 0;
        int c = 0;
        mayorNumeros instance = new mayorNumeros();
        int expResult = 0;
        int result = instance.numeroMayor(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
