package Q2Assignment14;

/**
 * 12/12/11
 * Assignment #14
 * @author Jordan Giacone
 * This is the DataSet class which adds Comparable Objects
 */
public class DataSet
{
    private Comparable max, min;
    private int count;
    
    /**
     * Sets max and min to null, for base instantiation
     */
    public DataSet()
    {
        max = null;
        min = null;
    }
    
    /**
     * Adds a Comparable object and determines if it's smaller or larger
     * than max or min
     * @param c The Comparable object to be added to the DataSet
     */
    public void add(Comparable c)
    {
        if(count == 0)
        {
            max = c;
            min = c;
        }
        
        if(c.compareTo((String) min) < 0)
        {
            min = c;
        }
        else if(c.compareTo((String) max) > 0)
        {
            max = c;
        }
        count++;
    }
    
    /**
     * Returns the maximum Comparable entered in the DataSet
     * @return The max
     */
    public Comparable getMaximun()
    {
        return max;
    }
    
    /**
     * Returns the minimum Comparable entered in the DataSet
     * @return The min 
     */
    public Comparable getMinimun()
    {
        return min;
    }
    
    /**
     * Returns a String representation of the instance variables in the DataSet
     * @return The values of max and min
     */
    @Override
    public String toString()
    {
        return "\nThe max(alphabetically last) word is: " +max+ 
                 "\nThe min(alphabetically first) word is:" +min+ "\n";
    }
    
}
