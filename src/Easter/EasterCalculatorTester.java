package Easter;

import java.util.Scanner;

/**
 * 11/12/11
 * Assignment 16
 * This is the Easter tester
 * @author Jordan
 */
public class EasterCalculatorTester 
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the year that you wish to calculate "
                + "Easter on: ");
        System.out.println(new EasterCalculator(reader.nextInt()));
    }
}
/*
Enter the year that you wish to calculate Easter on: 2001
In 2001, Easter occured/will occur on 15 of April
 
Enter the year that you wish to calculate Easter on: 1994
In 1994, Easter occured/will occur on 3 of April 
 
Enter the year that you wish to calculate Easter on: 2012
In 2012, Easter occured/will occur on 8 of April 
*/