package Geometries;

/**
 * Assignment #10
 * 11/30/11
 * This is the Geometry class full of static calculation methods
 * @author Jordan Giacone
 */
public class Geometry 
{
   //NO CONSTRUCTOR, IT'S STATIC
    
   /**
   * Calculates and returns the volume of a sphere given the radius
   * @param r The radius of the sphere for which the volume is desired 
   * @return The calculated volume of the sphere with a given radius r
   */ 
   public static double sphereVolume(double r)
   {
       return 4.0 / 3 * Math.PI * Math.pow(r, 3);
   }
   
   /**
    * Calculates and returns the surface area of a sphere with a given radius
    * @param r The radius of the sphere for which surface area is desired
    * @return The surface area of a sphere with a given radius r
    */
   public static double sphereSurface(double r)
   {
       return 4 * Math.PI * Math.pow(r, 2);
   }
   
   /**
    * Calculates and returns the volume of a cylinder with given height and 
    * radius
    * @param r The radius of the cylinder that you want the volume of
    * @param h The height of the cylinder that you want the volume of
    * @return The volume of a cylinder with given height and radius h and r
    * respectively
    */
   public static double cylinderVolume(double r, double h)
   {
       return Math.PI * Math.pow(r, 2) * h;
   }
   
   /**
    * Calculates and returns the surface area of a cylinder with the given 
    * radius and height
    * @param r The radius of the cylinder for which surface area is desired
    * @param h The height of the cylinder for which surface area is desired
    * @return The calculated surface area of a cylinder with a given radius 
    * and height r and h respectively
    */
   public static double cylinderSurface(double r, double h)
   {
       return (2.0 * Math.PI * Math.pow(r, 2)) + (2.0 * Math.PI * r * h);
   }
   
   /**
    * Calculates and returns the volume of a cone with the given radius and 
    * height
    * @param r The radius of the cone for which the volume is desired
    * @param h The height of the cone for which the volume is desired
    * @return The calculated volume of a cone with given radius and height
    * r and h, respectively
    */
   public static double coneVolume(double r, double h)
   {
       return (1 / 3.0) * Math.PI * Math.pow(r, 2) * h;
   }
   
   /**
    * Calculates the surface area of a cone with the given radius and height r
    * and h
    * @param r The radius of the cone for which the surface area is desired
    * @param h The height of the cone for which the surface area is desired
    * @return The calculated surface area of a cone with given radius and 
    * height r and h
    */
   public static double coneSurface(double r, double h)
   {
       return (Math.PI * r * h) + (Math.PI * Math.pow(r, 2));
   }
}
