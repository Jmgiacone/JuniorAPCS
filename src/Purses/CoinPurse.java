package Purses;

import java.util.ArrayList;

/**
 * Assignment #3
 * 11/8/11
 * This is the best assignment. Using a coin class
 * @author Jordan
 */
public class CoinPurse 
{
    //The ArrayList of Coin objects that holds the coins.
    private ArrayList<Coin> coins;
    
    /**
     * Constructs an empty purse
     */
    public CoinPurse()
    {
        coins = new ArrayList<Coin>();
    }
    
    /**
     * This method tests to see if the contents of each Purse is the same
     * regardless of order in the ArrayList
     * @param other The other Purse to be compared to 
     * @return True or False depending on if the contents are the same
     */
    public boolean sameCoins(CoinPurse other)
    {
        if(coins.size() != other.coins.size())
        {
            return false;
        }
        int numMatches = 0;
        for(int i = 0; i < coins.size(); i++)
        {
            for(int j = 0; j < coins.size(); j++)
            {
                if(coins.get(i).getName().equalsIgnoreCase
                        (other.coins.get(j).getName()))
                {
                    numMatches++;
                    j = coins.size();
                }
            }
        }
        if(numMatches == coins.size())
        {
            return true;
        }
        else
        {
            return false;
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
     * This method adds a coin to the Purse
     * @param c The Coin object that you want added
     */
    public void addCoin(Coin c)
    {
        coins.add(c);
    }
    
    public String toString()
    {
        return "" +coins+ "";
    }
    
}
