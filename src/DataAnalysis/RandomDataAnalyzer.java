package DataAnalysis;

import java.util.Random;

/**
 * Jordan Giacone
 * Assignment 21
 * This takes in 100 random numbers between 0 and 1000 and prints out average 
 * and max
 */
public class RandomDataAnalyzer 
{
    public static void main(String[] args)
    {
        Random r = new Random();
        DataSet set = new DataSet();
        
        for(int i = 0; i < 1000; i++)
        {
            set.add((double)r.nextInt(1001));
        }
        System.out.printf("The Max number is: %.2f, the Min is: %.2f "
                + "\nand the Average is: %.2f\n"
                ,set.getMaximum(),set.getMin(),set.getAverage());
    }
}
/*The Max number is: 999.00, the Min is: 0.00
and the Average is: 489.51
 * 
The Max number is: 999.00, the Min is: 0.00
and the Average is: 500.07
 * 
The Max number is: 1000.00, the Min is: 0.00
and the Average is: 488.37
 */