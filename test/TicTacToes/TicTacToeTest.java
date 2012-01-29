/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToes;

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
public class TicTacToeTest {
    
    public TicTacToeTest() {
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

//    /**
//     * Test of set method, of class TicTacToe.
//     */
//    @Test
//    public void testSet() {
//        System.out.println("set");
//        int i = 0;
//        int j = 0;
//        String player = " ";
//        TicTacToe instance = new TicTacToe();
//        instance.set(i, j, player);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isWinner method, of class TicTacToe.
//     */
//    @Test
//    public void testIsWinner() {
//        System.out.println("isWinner");
//        TicTacToe instance = new TicTacToe();
//        boolean expResult = false;
//        boolean result = instance.isWinner();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getWinner method, of class TicTacToe.
//     */
//    @Test
//    public void testGetWinner() {
//        System.out.println("getWinner");
//        TicTacToe instance = new TicTacToe();
//        String expResult = " ";
//        String result = instance.getWinner();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of isAWinner method, of class TicTacToe.
     */
    @Test
    public void testIsAWinner() {
        System.out.println("isAWinner");
        String player = " ";
        TicTacToe instance = new TicTacToe();
        instance.board = new String[][] {{"x","x","x"},{" "," "," "},{" "," "," "}};
        System.out.print(instance);
        boolean expResult = false;
        boolean result = instance.isAWinner("x");
        assertTrue(instance.isAWinner("x"));
        instance.board = new String[][] {{"o","x","x"},{" ","o"," "},{" ","o"," "}};
        System.out.printf("%s", instance);
        assertFalse(instance.isAWinner("o"));
        instance.board = new String[][] {{"x","x","x"},{" "," "," "},{" "," "," "}};
        assertFalse(instance.isAWinner("o"));
        instance.board = new String[][] {{"x","o","x"},{"x","o","o"},{" ","o"," "}};
        assertTrue(instance.isAWinner("o"));
        instance.board = new String[][] {{"o"," "," "},{" ","o"," "},{" "," ","o"}};
        System.out.printf("%s\n", instance);
        assertTrue(instance.isAWinner("o"));
        instance.board = new String[][] {{" "," ","x"},{" ","x"," "},{"x"," "," "}};
        System.out.printf("%s\n", instance);
        assertTrue(instance.isAWinner("x"));
        
    }

//    /**
//     * Test of toString method, of class TicTacToe.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        TicTacToe instance = new TicTacToe();
//        String expResult = " ";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
