/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package FunLoops;

import java.util.ArrayList;

/**
 * 8/29
 * Jordan Giacone
 * Assignment 3
 * This is the base class for FunLoops
 */
public class FunLoops
{
    public FunLoops()
    {

    }

    public void magicsquare(int numSquares)
    {
        int[] finalMagicSquares = new int[numSquares];
        int num = 1, loop = 0, count = 0, squareCount = 0, arraySpot = 0;
        for(int i = 0; i < numSquares; num++)
        {
            if(Math.sqrt(num) != Math.round(Math.sqrt(num)))
            {
                //Not a square... :(
            }
            else
            {
                //Is a square
                loop = 0;
                count = 0;
                while(count < num)
                {
                    loop++;
                    count += loop;
                    if(num == count)
                    {
                        //Magic Square
                        finalMagicSquares[arraySpot] = num;
                        arraySpot++;
                        squareCount++;
                        i++;
                    }

                 }
            }
        }
        System.out.printf("The first %d magic squares:\n", numSquares);
        for(int k = 0; k < finalMagicSquares.length; k++)
        {
            System.out.println(finalMagicSquares[k]);
        }
     }
    
     public String reverse(int num)
     {
         int count = 0;
         char[] numChar;
         String numString = String.valueOf(num), reversedNum;
         
         numChar = numString.toCharArray();
         char[] stringChar = new char[numChar.length];
         
         for(int i = 1; i <= numChar.length; i++)
         {
            stringChar[count] = numChar[numChar.length - i];
            count++;
         }
         return String.copyValueOf(stringChar);
         
     }
     //This code isn't mine, i found it at http://www.java2s.com/
     //Tutorial/Java/0120__Development/LeastCommonMultipleLCMoftwostrictly
     //positiveintegernumbers.htm
     //I would rather cite code than to not turn in an assignment on time
     public int lcm(int x1, int x2)
     {
          int max,min;
          if (x1 > x2) 
          {
              max = x1;
              min = x2;
          } 
          else 
          {
              max = x2;
              min = x1;
          }
          for(int i = 1; i <= min; i++) 
          {
              if( (max * i) % min == 0 ) 
              {
                  return i * max;
              }
          }
          return -5;
     }

     public int nextSquare(int lastNum)
     {
         return (lastNum + 1) * (lastNum + 1);
     }

     public int nextPyramidNumber(int lastNum, int lastPyramidNum)
     {
         return lastPyramidNum + lastNum + 1;
     }

}
