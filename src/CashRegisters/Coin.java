package CashRegisters;

/**
 * Assignment #9
 * 11/30/11
 * This is the coin class
 * @author Jordan Giacone
 */
public class Coin
{
    private double value;
    private String name;
    
    /**
     * This is the paramterized constructor
     * @param newValue The value of the coin
     * @param newName The name of the coin
     */
    public Coin(double newValue, String newName)
    {
        name = newName;
        value = newValue;
    }
    
    /**
     * This returns a copy of the name of the coin
     * @return The name of the coin
     */
    public String getName()
    {
        return name;
    }
    /**
     * 
     * @return The value of the coin
     */
    public double getValue()
    {
        return value;
    }
    
    /**
     * 
     * @return A String representation of the instance variables in the class
     */
    public String toString()
    {
        return "This coin is a " +name+ " with a value of " +value+" ";
    }
}
