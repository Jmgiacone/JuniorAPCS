/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PigLatinProject;

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
public class PigLatinatorTest {
    
    public PigLatinatorTest() {
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
     * Test of main method, of class PigLatinator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PigLatinator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toPigLatin method, of class PigLatinator.
     */
    @Test
    public void testToPigLatin() {
        System.out.println("toPigLatin");
        String english = "jordan is a bau5";
        String expResult = "ordanjayisyayayayau5bay";
        String result = PigLatinator.toPigLatin(english);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
