/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PalindromeProblem;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 13giaconej
 */
public class PalindromeTesterTest {

    public PalindromeTesterTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of main method, of class PalindromeTester.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PalindromeTester.main(args);
        
    }

    /**
     * Test of removePunctuation method, of class PalindromeTester.
     */
    @Test
    public void testRemovePunctuation() {
        System.out.println("removePunctuation");
        char[] p = null;
        ArrayList<Character> expResult = null;
        ArrayList<Character> result = PalindromeTester.removePunctuation(p);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isPalindrome method, of class PalindromeTester.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        String p = "eye";
        boolean expResult = true;
        boolean result = PalindromeTester.isPalindrome(p);
        assertEquals(expResult, result);
        
    }

}