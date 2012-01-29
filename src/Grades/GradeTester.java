package Grades;

import java.util.Scanner;

/**
 * 11/12/11
 * Assignment 17
 * This is the grade tester
 * @author Jordan Giacone
 */
public class GradeTester 
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        boolean stop = false;
        
        while(!stop)
        {
            System.out.println("Enter a letter grade");
            System.out.println(new Grade(reader.nextLine()));
            
            System.out.println("Lets go again!\nHow about it ");
            if(reader.nextLine().equalsIgnoreCase("NO"))
            {
                stop = true;
            }
        }
    }
}
/*
Enter a letter grade
a
Numeric Value: 4.0
Lets go again!
How about it 
yes
Enter a letter grade
b-
Numeric Value: 2.7
Lets go again!
How about it 
sure
Enter a letter grade
a+
Numeric Value: 4.0
Lets go again!
How about it 
yeerp
Enter a letter grade
c+
Numeric Value: 2.3
Lets go again!
How about it 
yer
Enter a letter grade
c++
Numeric Value: -1.0
Lets go again!
How about it 
j
Enter a letter grade
f
Numeric Value: 0.0
Lets go again!
How about it 
yes
Enter a letter grade
f-
Numeric Value: 0.0
Lets go again!
How about it 
no
*/