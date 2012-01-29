/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GameOfLife;

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
public class LifeTesterTest {
    
    public LifeTesterTest() {
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
     * Test of main method, of class LifeTester.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        LifeTester.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numNeighbors method, of class LifeTester.
     */
    @Test
    public void testNumNeighbors() {
        System.out.println("numNeighbors");
        String[][] grid = new String[][]{{" ", " ", "*"},{" ","*","*"},{"*","*","*"}};
        int row = 1;
        int column = 1;
        int expResult = 4;
        int result = LifeTester.numNeighbors(grid, row, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        /*
         {{" "," ","*"},
         *{" ","*","*"},
         *{"*","*","*"}}
         */
    }
}
