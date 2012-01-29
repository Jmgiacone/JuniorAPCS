package Horoscopes;

/**
 * Jordan Giacone
 * 10/19/11
 * This is the Horoscope Class
 */
/*
Jan 20 - Feb 18 Aquarius
Feb 19- March 20 Pisces
March 21 - April 19 Aries
April 20 - May 20 Taurus
May 21 - June 20 Gemini
June 21 - July 22 Cancer
July 23 - August 22 Leo
August 23 - September 22 Vertigo
September 23 - October 20 Libra
October 21 -11 November Scorpio
November 22 - December 21 Saggittarius
December 22 - January 19 Capricorn
*/
public class Horoscope 
{
    private int month, day;
    /**
     * 
     * @param newDay The day of your birth
     * @param newMonth The month of your birth
     */
    public Horoscope(int newDay, String newMonth)
    {
        if(newMonth.equalsIgnoreCase("January"))
        {
            month = 1;
        }
        else if(newMonth.equalsIgnoreCase("February"))
        {
            month = 2;
        }
        else if(newMonth.equalsIgnoreCase("March"))
        {
            month = 3;
        }
        else if(newMonth.equalsIgnoreCase("April"))
        {
            month = 4;
        }
        else if(newMonth.equalsIgnoreCase("May"))
        {
            month = 5;
        }
        else if(newMonth.equalsIgnoreCase("June"))
        {
            month = 6;
        }
        else if(newMonth.equalsIgnoreCase("July"))
        {
            month = 7;
        }
        else if(newMonth.equalsIgnoreCase("August"))
        {
            month = 8;
        }
        else if(newMonth.equalsIgnoreCase("September"))
        {
            month = 9;
        }
        else if(newMonth.equalsIgnoreCase("October"))
        {
            month = 10;
        }
        else if(newMonth.equalsIgnoreCase("November"))
        {
            month = 11;
        }
        else if(newMonth.equalsIgnoreCase("December"))
        {
            month = 12;
        }        
        day = newDay;
    }
    /**
     * 
     * @return A String representation of all the instance variables in the 
     *         class
     */
    public String toString()
    {
        String str, symbol, fortune;
        if((month == 1 && day >= 20) || (month == 2 && day <= 18))
        {
            symbol = "Aquarius";
            fortune = "Look out for water borne contaminants...";
        }
        else if((month == 2 && day >= 19) || (month == 3 && day <= 20))
        {
            symbol = "Pisces";
            fortune = "You might have a bad experience with fish...";
        }
        else if((month == 3 && day >= 21) || (month == 4 && day <= 19))
        {
            symbol = "Aries";
            fortune = "There is a lot of fresh air in your life";
        }
        else if((month == 4 && day >= 20) || (month == 5 && day <= 20))
        {
            symbol = "Taurus";
            fortune = "Grab life by the horns... hehe get it?";
        }
        else if((month == 5 && day >= 21) || (month == 6 && day <= 20))
        {
            symbol = "Gemini";
            fortune = "There will be lots of random events in your life";
        }
        else if((month == 6 && day >= 21) || (month == 7 && day <= 22))
        {
            symbol = "Cancer";
            fortune = "Don't catch it...";
        }
        else if((month == 7 && day >= 23) || (month == 8 && day <= 22))
        {
            symbol = "Leo";
            fortune = "Fear the day that you see a lion next...";
        }
        else if((month == 8 && day >= 23) || (month == 9 && day <= 22))
        {
            symbol = "Vertigo";
            fortune = "Hello, hello, i'm at a place called vertigo!";
        }
        else if((month == 9 && day >= 23) || (month == 10 && day <= 20))
        {
            symbol = "Libra";
            fortune = "Your life is OUT OF BALANCE";
        }
        else if((month == 10 && day >= 21) || (month == 11 && day <= 21))
        {
            symbol = "Scorpio";
            fortune = "What's that on your arm?";
        }
        else if((month == 11 && day >= 22) || (month == 12 && day <= 21))
        {
            symbol = "Saggittarius";
            fortune = "What a dumb name...";
        }
        else if((month == 12 && day >= 22) || (month == 1 && day <= 19))
        {
            symbol = "Capricorn";
            fortune = "Nope";
        }
        else 
        {
            symbol = "Not a legit birthday!";
            fortune = "You will get hit by a truck for your ignorance!";
        }
        return "Your astrological Symbol is: " +symbol+ 
                "\nYour Fortune is: " +fortune+"";
    }
}
