package Purses;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 11/7/11
 * Assignment #2
 * This is the Purse Class with transfer method
 * @author Jordan Giacone
 */
public class Purse 
{
    private final String PENNY = "Penny", 
            NICKEL = "Nickel", 
            DIME = "Dime", 
            QUARTER = "Quarter";
    
    ArrayList <String> coins;//The variable that holds 
    //all of the coins inputted
    
    /**
     * This constructs an empty purse object
     */
    public Purse()
    {
        coins  = new ArrayList<String>();
    }
    
    /**
     * Adds a coin to the purse, will tell you if invalid
     * @param coinName The name of the coin you want to put in
     */
    public void addCoin(String coinName)
    {
        if(coinName.equalsIgnoreCase(PENNY) || 
                coinName.equalsIgnoreCase(NICKEL) || 
                coinName.equalsIgnoreCase(DIME) || 
                coinName.equalsIgnoreCase(QUARTER))
        {
            coins.add(coinName);
            JOptionPane.showMessageDialog(null, "You added a " +coinName+ "!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "" +coinName+ " Isn't a coin!");
        }
    }
    
    /**
     * Clears the entire contents of the Purse
     */
    public void delContents()
    {
        coins.clear();
    }
    /**
     * Transfers all the contents from Purse other into the current purse
     * @param other The Purse that we're transferring from
     */
    public void transfer(Purse other)
    {
        coins.addAll(other.coins);
        other.coins.clear();
    }
    
    /**
     * Returns a String representation of the contents of the Purse
     * @return a String representation of the contents of the Purse
     */
    public String toString()
    {
        return "" +coins+ "";
    }
}
