package Pairing;

import java.util.Scanner;

/**
 * 11/12/11
 * Assignment #14
 * This is a the tester of pairs
 * @author Jordan Giacone
 */
public class PairTester 
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give me the first number: ");
        
        double first = reader.nextDouble();
        System.out.print("And the second: ");
        
        System.out.println(new Pair(first, reader.nextDouble()));
        
        
    }
}
/*
Give me the first number: 5
And the second: 3
The sum is 8.0
The difference is 2.0
The product is 15.0
The average is 4.0
The distance is 2.0
The max is 5.0
and finally... The min is 3.0

Give me the first number: 3
And the second: 5
The sum is 8.0
The difference is -2.0
The product is 15.0
The average is 4.0
The distance is 2.0
The max is 5.0
and finally... The min is 3.0

Give me the first number: 4
And the second: 4
The sum is 8.0
The difference is 0.0
The product is 16.0
The average is 4.0
The distance is 0.0
The max is 4.0
and finally... The min is 4.0
 */