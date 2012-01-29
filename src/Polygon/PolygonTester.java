/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polygon;

import java.util.Scanner;

/*
 * Jordan Giacone
 * P.2
 * Assignment 1
 * This is the tester for the RegularPolygon Class
 */
public class PolygonTester 
{
   public static void main(String[] args)
   {
       Scanner reader = new Scanner(System.in);
       String answer = "again";
       //Instantiating a polygon w/ blank constructor for a test
       RegularPolygon poly = new RegularPolygon(), 
       //Assigned shapes
       square = new RegularPolygon(4, 10), 
       octagon = new RegularPolygon(8, 5.75), 
       enneadecagon = new RegularPolygon(19, 2), 
       eneacontakaihenagon = new RegularPolygon(91, .5);
       
       while(answer.equalsIgnoreCase("again"))
       {
           System.out.print("Would you like to RUN the homework or "
                   + "CREATE your own? ");
           answer = reader.nextLine();
           if(answer.equalsIgnoreCase("run"))
           {
               //Printing out attributes
               System.out.println("Default Constructor\n-------------------");
               poly.getStats();
               System.out.println();
               System.out.println("Square\n------");
               square.getStats();
               System.out.println();
               System.out.println("Octagon\n-------");
               octagon.getStats();
               System.out.println();
               System.out.println("Enneadecagon\n------------");
               enneadecagon.getStats();
               System.out.println();
               System.out.println("Eneacontakaihenagon\n-------------------");
               eneacontakaihenagon.getStats();
               
               answer = "broken";
           }
           else if(answer.equalsIgnoreCase("create"))
           {
               System.out.println("Please enter the values of your new "
                       + "baby Polygon");
               System.out.print("Number of Sides: ");
               int numSides = reader.nextInt();
               System.out.print("Length of a side: ");
               RegularPolygon p = new RegularPolygon(numSides, 
                       reader.nextDouble());
               p.getStats();
               answer = "broken";
           }
           else
           {
               System.out.println("Incorrect Answer, try again");
           }
       }
   }
}
/*
Output:

Default Constructor
-------------------
Number of Sides = 3
Length of Sides = 5.00
Radius of circumscribed circle = 2.89
Radius of inscribed circle = 1.44
Vertex angle = 60.00
Perimeter = 15.00
Area = 10.83

Square
------
Number of Sides = 4
Length of Sides = 10.00
Radius of circumscribed circle = 7.07
Radius of inscribed circle = 5.00
Vertex angle = 90.00
Perimeter = 40.00
Area = 100.00

Octagon
-------
Number of Sides = 8
Length of Sides = 5.75
Radius of circumscribed circle = 7.51
Radius of inscribed circle = 6.94
Vertex angle = 135.00
Perimeter = 46.00
Area = 159.64

Enneadecagon
------------
Number of Sides = 19
Length of Sides = 2.00
Radius of circumscribed circle = 6.08
Radius of inscribed circle = 5.99
Vertex angle = 161.05
Perimeter = 38.00
Area = 113.86

Eneacontakaihenagon
-------------------
Number of Sides = 91
Length of Sides = 0.50
Radius of circumscribed circle = 7.24
Radius of inscribed circle = 7.24
Vertex angle = 176.04
Perimeter = 45.50
Area = 164.68
 
Would you like to RUN the homework or CREATE your own? create
Please enter the values of your new baby Polygon
Number of Sides: 8
Length of a side: 6
Number of Sides = 8
Length of Sides = 6.00
Radius of circumscribed circle = 7.84
Radius of inscribed circle = 7.24
Vertex angle = 135.00
Perimeter = 48.00
Area = 173.82 
*/