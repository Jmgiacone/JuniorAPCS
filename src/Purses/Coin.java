package Purses;

/**
 * Assignment #3
 * 11/8/11
 * This is the coin class
 * @author Jordan Giacone
 */
public class Coin 
{
    private String name;
    private double value;
    
    /**
     * Default Constructor. Constructs to a default with a value of -1
     */
    public Coin()
    {
        name = "DEFAULT";
        value = -1;
    }
    
    /**
     * The parameterized constructor
     * @param newName The name of the coin
     * @param newValue The value it's to hold
     */
    public Coin(String newName, double newValue)
    {
        name = newName;
        value = newValue;
    }
    
    /**
     * 
     * @return The name of the coin represented in a String
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * 
     * @return The value of the coin, represented by a double
     */
    public double getValue()
    {
        return value;
    }
    
    /**
     * A simple toString
     * @return A String representation of the instance variables associated 
     * with the Coin class
     */
    @Override
    public String toString()
    {
        return "" +name+ "";
    }
}
