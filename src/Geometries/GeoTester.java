package Geometries;

import java.util.Scanner;

/**
 * 11/30/11
 * Assignment #10
 * This is the tester of the static methods in the Geometry class
 * @author Jordan Giacone
 */
public class GeoTester 
{
    public static void main(String[] args)
    {
        double height, radius;
        Scanner reader = new Scanner(System.in);
        
        System.out.printf("Height please: ");
        height = reader.nextDouble();
        System.out.printf("Radius please: ");
        radius = reader.nextDouble();
        
        //printf like a bau5
        System.out.printf("\nSurface area of sphere: %.2f"
                + "\nVolume of Sphere %.2f"
                + "\nSurface area of Cylinder: %.2f"
                + "\nVolume of Cylinder: %.2f"
                + "\nSurface area of Cone: %.2f"
                + "\nVolume of Cone: %.2f\n", 
                Geometry.sphereSurface(radius), 
                Geometry.sphereVolume(radius),
                Geometry.cylinderSurface(radius, height),
                Geometry.cylinderVolume(radius, height),
                Geometry.coneSurface(radius, height),
                Geometry.coneVolume(radius, height));
        
    }
}

/*Height please: 5
Radius please: 5

Surface area of sphere: 314.16
Volume of Sphere 523.60
Surface area of Cylinder: 314.16
Volume of Cylinder: 392.70
Surface area of Cone: 157.08
Volume of Cone: 130.90
 
run:
Height please: 100
Radius please: 2

Surface area of sphere: 50.27
Volume of Sphere 33.51
Surface area of Cylinder: 1281.77
Volume of Cylinder: 1256.64
Surface area of Cone: 640.88
Volume of Cone: 418.88
BUILD SUCCESSFUL (total time: 6 seconds)

run:
Height please: 0
Radius please: 54

Surface area of sphere: 36643.54
Volume of Sphere 659583.66
Surface area of Cylinder: 18321.77
Volume of Cylinder: 0.00
Surface area of Cone: 9160.88
Volume of Cone: 0.00
BUILD SUCCESSFUL (total time: 8 seconds)
*/