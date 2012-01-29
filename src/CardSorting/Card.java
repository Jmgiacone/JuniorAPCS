package CardSorting;

/**
 * Jordan Giacone
 * 10/13/11
 * This is the card class where it takes in shorthand and such
 */
public class Card 
{
    private String rank, suit;
    public Card(String both)
    {
        if(both.length() == 3)
        {
            rank = both.substring(0,2);
            suit = both.substring(2);
        }
        else
        {
            rank = both.substring(0,1);
            suit = both.substring(1);
        }
    }
    public void setVars() throws RankNotFoundException, SuitNotFoundException
    {
        if(suit.equalsIgnoreCase("H"))
        {
            suit = "Hearts";
        }
        else if(suit.equalsIgnoreCase("C"))
        {
            suit = "Clubs";
        }
        else if(suit.equalsIgnoreCase("S"))
        {
            suit = "Spades";
        }
        else if(suit.equalsIgnoreCase("D"))
        {
            suit = "Diamonds";
        }
        else 
        {
            //OMG I WROTE AN EXCEPTION
            suit = "INVALID";
            throw new RankNotFoundException("The Rank that was given "
                    + "is invalid");
        }
        
        if(rank.equalsIgnoreCase("A"))
        {
            rank = "Ace";
        }
        else if(rank.equalsIgnoreCase("2"))
        {
            rank = "Two";
        }
        else if(rank.equalsIgnoreCase("3"))
        {
            rank = "Three";
        }
        else if(rank.equalsIgnoreCase("4"))
        {
            rank = "Four";
        }
        else if(rank.equalsIgnoreCase("5"))
        {
            rank = "Five";
        }
        else if(rank.equalsIgnoreCase("6"))
        {
            rank = "Six";
        }
        else if(rank.equalsIgnoreCase("7"))
        {
            rank = "Seven";
        }
        else if(rank.equalsIgnoreCase("8"))
        {
            rank = "Eight";
        }
        else if(rank.equalsIgnoreCase("9"))
        {
            rank = "Nine";
        }
        else if(rank.equalsIgnoreCase("10"))
        {
            rank = "Ten";
        }
        else if(rank.equalsIgnoreCase("J"))
        {
            rank = "Jack";
        }
        else if(rank.equalsIgnoreCase("Q"))
        {
            rank = "Queen";
        }
        else if(rank.equalsIgnoreCase("K"))
        {
            rank = "King";
        }
        else 
        {
            //NOT AGAIN!!! :)
            rank = "INVALID";
            throw new SuitNotFoundException("The suit provided is invalid");
            
        }
    }
    //toString couldn't be overidden, so i had to make it toStrings
    public String toStrings() throws SuitNotFoundException, 
            RankNotFoundException
    {
        
        setVars();
        return "" +rank+ " of " +suit+ "";
    }
}
