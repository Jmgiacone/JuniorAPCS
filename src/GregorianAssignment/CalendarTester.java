package GregorianAssignment;

import java.util.*;

/**
 * 9/7/11
 * Jordan Giacone
 * Assignment 5?
 * This does calendar stufffffff
 */
public class CalendarTester
{
    public static void main(String[] args)
    {
        GregorianCalendar today = new GregorianCalendar();
        int birthYear, birthDay, birthMonth = -1, addDays;
        String monthString;
        Scanner reader = new Scanner(System.in);
        System.out.println("When is ur birfday?");
        System.out.print("Day? ");
        birthDay = reader.nextInt();
        //Being a bau5 and totally converting to a string
        while(birthMonth < 0)
        {
            System.out.print("Month? ");
            reader.nextLine();
            monthString = reader.nextLine();
            
            if(monthString.equalsIgnoreCase("January"))
            {
                birthMonth = 0;
            }
            else if(monthString.equalsIgnoreCase("February"))
            {
                birthMonth = 1;
            }
            else if(monthString.equalsIgnoreCase("March"))
            {
                birthMonth = 2;
            }
            else if(monthString.equalsIgnoreCase("April"))
            {
                birthMonth = 3;
            }
            else if(monthString.equalsIgnoreCase("May"))
            {
                birthMonth = 4;
            }
            else if(monthString.equalsIgnoreCase("June"))
            {
                birthMonth = 5;
            }
            else if(monthString.equalsIgnoreCase("July"))
            {
                birthMonth = 6;
            }
            else if(monthString.equalsIgnoreCase("August"))
            {
                birthMonth = 7;
            }
            else if(monthString.equalsIgnoreCase("September"))
            {
                birthMonth = 8;
            }
            else if(monthString.equalsIgnoreCase("October"))
            {
                birthMonth = 9;
            }
            else if(monthString.equalsIgnoreCase("November"))
            {
                birthMonth = 10;
            }
            else if(monthString.equalsIgnoreCase("December"))
            {
                birthMonth = 11;
            }
            else
            {
                System.out.println("That's not a month!");
            }
        }
        System.out.print("Year? ");
        birthYear = reader.nextInt();
        
        //Yay userInput of birfayzzz!!!
        GregorianCalendar userBirthday = new GregorianCalendar(birthYear, 
                birthMonth, birthDay);
        
        System.out.print("How many days would you liek to add to todays date?"
                + " ");
        addDays = reader.nextInt();
        today.add(Calendar.DAY_OF_MONTH, addDays);
        System.out.printf("It will be %d/%d/%d in %d days\nBTW, that's a %s\n", 
                today.get(Calendar.MONTH) + 1, 
                today.get(Calendar.DAY_OF_MONTH), 
                today.get(Calendar.YEAR), 
                addDays, 
                getDay(today.get(Calendar.DAY_OF_WEEK)));
        
        System.out.printf("You were born on a %s\n", getDay(userBirthday.get
                (Calendar.DAY_OF_WEEK)));
        
        System.out.print("How many days would you liek to add to your birfday"
                + "? ");
        addDays = reader.nextInt();
        
        userBirthday.add(Calendar.DAY_OF_MONTH, addDays);
        System.out.printf("It will be %d/%d/%d in %d days\nBTW, that's a %s\n"
                , userBirthday.get(Calendar.MONTH) + 1, 
                userBirthday.get(Calendar.DAY_OF_MONTH), 
                userBirthday.get(Calendar.YEAR), 
                addDays, 
                getDay(userBirthday.get(Calendar.DAY_OF_WEEK)));
    }
    //Method for converting those blasted numeric days of the week into
    //actual names
    public static String getDay(int dayNum)
    {
        if(dayNum == 1)
        {
            return "Sunday";
        }
        else if(dayNum == 2)
        {
            return "Monday";
        }
        else if(dayNum == 3)
        {
            return "Tuesday";
        }
        else if(dayNum == 4)
        {
            return "Wednesday";
        }
        else if(dayNum == 5)
        {
            return "Thursday";
        }
        else if(dayNum == 6)
        {
            return "Friday";
        }
        else if(dayNum == 7)
        {
            return "Saturday";
        }
        else
        {
           return "NOT A DAYYY!!";
        }
    }
}
/*run:
When is ur birfday?
Day? 9
Month? october
Year? 1994
How many days would you liek to add to todays date? 100
It will be 12/16/2011 in 100 days
BTW, that's a Friday
You were born on a Sunday
How many days would you liek to add to your birfday? 10000
It will be 2/24/2022 in 10000 days
BTW, that's a Thursday
  
run:
When is ur birfday?
Day? 4
Month? july
Year? 1776
How many days would you liek to add to todays date? 100000
It will be 6/22/2285 in 100000 days
BTW, that's a Monday
You were born on a Thursday
How many days would you liek to add to your birfday? 10000
It will be 11/21/1803 in 10000 days
BTW, that's a Monday

run:
When is ur birfday?
Day? 9
Month? october
Year? 1994
How many days would you liek to add to todays date? 1
It will be 9/8/2011 in 1 days
BTW, that's a Thursday
You were born on a Sunday
How many days would you liek to add to your birfday? 365
It will be 10/9/1995 in 365 days
BTW, that's a Monday
*/