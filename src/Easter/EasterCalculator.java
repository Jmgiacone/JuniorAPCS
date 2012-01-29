package Easter;

/**
 * 11/12/11
 * Assignment 16
 * This is the easter cacluator
 * @author Jordan
 */
public class EasterCalculator 
{
    private int a,y,b,c,d,e,g,h,j,k,m,r,n,p;
    public EasterCalculator(int year)
    {
        y = year;
        a = y % 19;
        b = y / 100;
        c = y % 100;
        d = b / 4;
        e = b % 4;
        g = ((8 * b) + 13) / 25;
        h = ((19 * a) + b - d - g + 15) % 30;
        j = c / 4;
        k = c % 4;
        m = ((11 * h) + a) / 319;
        r = ((2 * e) + (2 * j) - k - h + m + 32) % 7;
        n = (h - m + r + 90) / 25;
        p = (h - m + r + n + 19) % 32;
    }
    
    public String toString()
    {
        String month;
        
        if(n == 1)
        {
            month = "January";
        }
        else if(n == 2)
        {
            month = "February";
        }
        else if(n == 3)
        {
            month = "March";
        }
        else if(n == 4)
        {
            month = "April";
        }
        else if(n == 5)
        {
            month = "May";
        }
        else if(n == 6)
        {
            month = "June";
        }
        else if(n == 7)
        {
            month = "July";
        }
        else if(n == 8)
        {
            month = "August";
        }
        else if(n == 9)
        {
            month = "September";
        }
        else if(n == 10)
        {
            month = "October";
        }
        else if(n == 11)
        {
            month = "November";
        }
        else if(n == 12)
        {
            month = "December";
        }
        else 
        {
            month = "BAD CALCULATION";
        }
        
        return "In "+y+ ", Easter occured/will occur on "+p+" of "+month+"";
    }
}
