package HelperMethods;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * Assignment #5
 * 11/10/11
 * This is an program that finds the largest and smallest elements in an array
 * @author Jordan Giacone
 */
public class ArrayLargeSmall 
{
    public static int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    
    public static void main(String[] args)
    {
        //Defining size of array
        int[] x = new int[Integer.parseInt(JOptionPane.
                showInputDialog("How many numbers do you want to have?"))];
        
        for(int i = 0; i < x.length; i++)
        {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog
                    ("Give me number " +(i + 1)+ ""));
        }
        //Mass output bau5
        JOptionPane.showMessageDialog(null, "Here's the smallest: "
                + "" +getSmallest(x)+ " ,the largest: " 
                +getLargest(x)+ " , the average of min + max: " 
                +findAverageOfLargeAndSmall(x)+ " ,and finally, the "
                + "median of all elements: " +calculateMedian(x)+ ".");
    }
    
    /**
     * This method returns the smallest int in the array
     * @param x The int array to be searched
     * @return The smallest int in the array
     */
    public static int getSmallest(int[] x)
    {
        for(int i = 0; i < x.length; i++)
        {
            if(x[i] < min)
            {
                min = x[i];
            }
        }
        return min;
    }
    
    /**
     * This method returns the largest int in the array
     * @param x The array to be searched
     * @return The largest int in the array
     */
    public static int getLargest(int[] x)
    {
        for(int i = 0; i < x.length; i++)
        {
            if(x[i] > max)
            {
                max = x[i];
            }
        }
        return max;
    }
    
    /**
     * This returns the average of the smallest and largest numbers 
     * in the array
     * @param x The array to get smallest and largest from
     * @return The average of the smallest and largest
     */
    public static double findAverageOfLargeAndSmall(int[] x)
    {
        //Making sure that max and min aren't defaulted
        if(min == Integer.MAX_VALUE)
        {
            getLargest(x);
            getSmallest(x);
        }
        return (double)((max + min) / 2);
    }
    
    /**
     * This method calculates the median value from a given int array
     * @param x The int array to have median calculated from
     * @return The Median of the array
     */
    public static double calculateMedian(int[] x)
    {
        //Is the length odd?
        Arrays.sort(x);
        if(x.length % 2 != 0)
        {
            return x[(x.length / 2)];
        }
        else
        {
            return (double)(x[(x.length / 2) - 1] + x[(x.length / 2)]) / 2;
        }
    }
}
