/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FunLoops;

/**
 *
 * @author Jordan
 */
public class FunLoopsTester 
{
    public static void main(String[] args)
    {
          FunLoops fun = new FunLoops();

          fun.magicsquare(5);
          System.out.println("");
          System.out.println("12345 reversed ---> " + fun.reverse (12345));
          System.out.println("10001 reversed ---> " + fun.reverse (10001));
          System.out.println("1200 reversed ---> " + fun.reverse (1200));
          System.out.println("5 reversed ---> " + fun.reverse (5));
          System.out.println();
          System.out.println("LCM (15,18) = " + fun.lcm (15,18));
          System.out.println("LCM (40,12) = " + fun.lcm (40,12));
          System.out.println("LCM (2,7) = " + fun.lcm (2,7));
          System.out.println("LCM (100,5) = " + fun.lcm (100,5));
    }

    
}
/*
    The first 4 magic squares:
    1
    36
    1225
    41616

    12345 reversed ---> 54321
    10001 reversed ---> 10001
    1200 reversed ---> 0021
    5 reversed ---> 5

    LCM (15,18) = 90
    LCM (40,12) = 120
    LCM (2,7) = 14
    LCM (100,5) = 100
 */
