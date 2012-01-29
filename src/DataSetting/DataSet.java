package DataSetting;

/**
 * 11/12/11
 * Assignment 15
 * This is the DataSet class
 * @author Jordan Giacone
 */
public class DataSet 
{
    private int max, min;
    public DataSet()
    {
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }
    
    /**
     * Adds the passed in value to the total
     * @param x The number to be added
     */
    public void addValue(int x)
    {
        if(x > max)
        {
            max = x;
        }
        
        if(x < min)
        {
            min = x;
        }
    }
    
    /**
     * 
     * @return The largest number inputted
     */
    public int getLargest()
    {
        return max;
    }
    
    /**
     * 
     * @return The smallest number inputted
     */
    public int getSmallest()
    {
        return min;
    }
    
    public String toString()
    {
        return "Largest: "+getLargest()+ 
                "\nSmallest: " +getSmallest()+ "";
    }
}
