package DataSetTesting;

import java.util.Random;

/**
 * Assignment #12
 * Jordan Giacone and Cay Horstmann
 * 12/6/11
   This class models a die that, when cast, lands on a random
   face. It's fixed to implement Measurable
*/
public class Die implements Measurable
{
   private Random generator;
   private int sides,cast;

   /**
      Constructs a die with a given number of sides.
      @param s the number of sides, e.g. 6 for a normal die
   */
   public Die(int s)
   {
      cast = 0;
      sides = s;
      generator = new Random();
   }

   /**
      Simulates a throw of the die
      @return the face of the die 
   */
   public int cast()
   {
      cast = 1 + generator.nextInt(sides);
      return cast;
   }
   
   @Override
   /**
    * A method from the Measurable class, does the same thing as cast
    * @return The value that the die "rolled"
    */
   public double getMeasure()
   {
       return cast();
   }
}
