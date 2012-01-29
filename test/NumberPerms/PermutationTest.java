/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberPerms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan
 */
public class PermutationTest {
    
    public PermutationTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Permutation.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        //Permutation.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextPermutation method, of class Permutation.
     */
    @Test
    public void testGetNextPermutation() {
        System.out.println("getNextPermutation");
        int[] list = new int[10];
        for(int i = 0; i < 10; i++)
        {
            list[i] = i;
        }
        int[] expResult = null;
        int[] result = null;
        //int[] result = Permutation.getNextPermutation(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
