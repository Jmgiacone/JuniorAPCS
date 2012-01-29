/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polygon;

/**
 * Jordan Giacone
 * P.2
 * Assignment 1
 * This is the RegularPolygon Class which builds the actual polygon
 */
class RegularPolygon
{

   private int myNumSides;        // # of sides
   private double mySideLength;   // length of side
   private double myR;            // radius of circumscribed circle
   private double myr;            // radius of inscribed circle
    
   // constructors
   public RegularPolygon()
   {
       myNumSides = 3;
       mySideLength = 5; //No instruction on this value so i made it 5
       myr = getr(); //defining the variables for ease of display
       myR = getR();
   }
   
   public RegularPolygon(int numSides, double sideLength)
   {
       myNumSides = numSides;
       mySideLength = sideLength;
       myr = getr();
       myR = getR();
       
   }

   // private methods
   private void calcr()
   {
       //(.5 * s) * (cot(PI / n))
       myr = (.5 * mySideLength) * (1 / (Math.tan((Math.PI / myNumSides))));
   }
 
   private void calcR()
   {
       //(.5 * s) * (csc(PI / n))
       myR = (.5 * mySideLength) * (1 / (Math.sin((Math.PI / myNumSides))));
   }   
   
   // public methods
   public double vertexAngle()
   {
       //x = ((n - 2) / n) * 180;
       
       double sidesAsDouble = myNumSides;
       
       return ((myNumSides - 2) / sidesAsDouble) * 180; 
   }

   public double Perimeter()
   {
       //p = ns
       return myNumSides * mySideLength;
   }
   
   public double Area()
   {
       //(.5 * n * (R^2)) * (sin((2PI) / n));
       return (.5 * myNumSides * (Math.pow(myR, 2.0))) * 
              (Math.sin((2.0 * Math.PI) / myNumSides));
   }

   public double getNumside()
   {
       return myNumSides;
   }

   public double getSideLength()
   {
       return mySideLength;   
   }
   
   public double getR()
   {
       calcR();
       return myR;
   }
   
   public double getr()
   {
       calcr();
       return myr;
   }
   
   //A little something extra that i added in for easy display of attributes
   public void getStats()
   {
       System.out.printf("Number of Sides = %d\n"
               + "Length of Sides = %.2f\n"
               + "Radius of circumscribed circle = %.2f\n"
               + "Radius of inscribed circle = %.2f\n"
               + "Vertex angle = %.2f\n"
               + "Perimeter = %.2f\n"
               + "Area = %.2f\n",myNumSides, mySideLength, myR ,myr, 
               vertexAngle(), Perimeter(), Area());
       
   }
}