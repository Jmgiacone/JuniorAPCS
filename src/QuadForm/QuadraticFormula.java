package QuadForm;

/**
 * Jordan Giacone
 * 10/19/11
 * Assignment ?
 * This is the class that solves the Quadratic Formula (with imaginary numbers!)
 */
public class QuadraticFormula
{
    private double a,b,c;
    
    /**
     * 
     * @param newA The A value
     * @param newB The B value 
     * @param newC The C value
     */
    public QuadraticFormula(double newA, double newB, double newC)
    {
        a = newA;
        b = newB;
        c = newC;
    }
    
    /**
     * 
     * @return The number of real solutions in the given equation 
     */
    public int numRealSolutions()
    {
        if((Math.pow(b, 2) - (4 * a * c)) > 0)
        {
            return 2;
        }
        else if ((Math.pow(b, 2) - (4 * a * c)) == 0)
        {
            return 1;
        }
        else if ((Math.pow(b, 2) - (4 * a * c)) < 0)
        {
            return 0;
        }
        else
        {
            return -999;
        }
    }
    /**
     * 
     * @return T or F depending if there are imaginary solutions
     */
    public boolean hasImaginarySolutions()
    {
        return (((Math.pow(b, 2)) - (4 * a * c)) < 0);
    }
    /**
     * 
     * @return Returns a string representation of
     *         the answer to -b + (rest of equation)
     */
    public String calcPlus()
    {
        //(-b +- sqrt((b^2)-4ac))/2a
        if(hasImaginarySolutions())
        {
            return "" +(-b + (Math.sqrt(Math.abs(Math.pow(b, 2) - (4 * a * c)
                    )))) / (2 * a)+ "i";
        }
        else
        {
            return "" +((-b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) 
                    / (2 * a))+ "";
        }
    }
    /**
     * 
     * @return Returns a string representation of
     *         the answer to -b - (rest of equation)
     */
    public String calcMinus()
    {
        if(hasImaginarySolutions())
        {
            return "" +(-b - (Math.sqrt(Math.abs(Math.pow(b, 2) - (4 * a * c)
                    )))) / (2 * a)+ "i";
        }
                
        return "" +((-b - Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) 
                    / (2 * a))+ "";
    }
    /**
     * 
     * @return A String representation of the values of all the 
     *         instance variables
     */
    public String toString()
    {
        if(calcPlus().equalsIgnoreCase(calcMinus()))
        {
            return "The real answer is " +calcPlus()+ "";
        }
        if(hasImaginarySolutions())
        {
            return "The Answers were imaginary\nThey are(+)" +calcPlus()+ 
                    " and(-) " +calcMinus()+ "";
        }
        return "The real answer(+) is " +calcPlus()+ " and(-) "
                +calcMinus()+ "";
    }
    
}
