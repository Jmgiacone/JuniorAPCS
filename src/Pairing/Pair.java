package Pairing;

import java.util.Scanner;

/**
 * 11/12/11
 * Assignment #14
 * This is the pair class
 * @author Jordan Giacone
 */
public class Pair 
{
    private Scanner reader;
    private double first,second;
    /**
     * Constructs a pair.
     * @param aFirst The first value of the pair
     * @param aSecond The second value of the pair
     */
    public Pair(double aFirst, double aSecond)
    {
        reader = new Scanner(System.in);
        first = aFirst;
        second = aSecond;
    }
    
    /**
     * Computes the sum of the values of this pair.
     * @return The sum of the first and second values
     */
    public double getSum()
    {
        return first + second;
    }
    
    /**
     * This computes the difference of first and second
     * @return First - second 
     */
    public double getDifference()
    {
        return first - second;
    }
    
    /**
     * This computes the product of first and second
     * @return Fist * second
     */
    public double getProduct()
    {
        return first * second;
    }
    
    /**
     * Computes the average of first and second 
     * @return The average of first and second
     */
    public double getAverage()
    {
        return (first + second) / 2.0;
    }
    
    /**
     * Calculates the distance (absolute value of the difference) of first and 
     * second
     * @return The distance
     */
    public double getDistance()
    {
        return Math.abs(first - second);
    }
    
    /**
     * Computes the bigger of first and second
     * @return The bigger of first and second 
     */
    public double getMax()
    {
        if(first > second)
        {
            return first;
        }
        else
        {
            return second;
        }
    }
    
    /**
     * Computes the smaller of first and second
     * @return the smaller of first and second
     */
    public double getMin()
    {
        if(first < second)
        {
            return first;
        }
        else
        {
            return second;
        }
    }
    
    public String toString()
    {
        return "The sum is " +getSum()+ 
                "\nThe difference is " +getDifference()+
                "\nThe product is " +getProduct()+ 
                "\nThe average is " +getAverage()+
                "\nThe distance is " +getDistance()+ 
                "\nThe max is " + getMax()+ 
                "\nand finally... The min is " +getMin()+ "";
    }
}
