package TicTacToes;

/**
 * Assignment #7
 * 11/22/11
 * A 3 x 3 tic-tac-toe board.
 * @author Jordan Giacone and Cay Horstmann
 */
public class TicTacToe
{
   public String[][] board;
   private static final int ROWS = 3;
   private static final int COLUMNS = 3;

   /**
      Constructs an empty board.
   */
   public TicTacToe()
   {
      board = new String[ROWS][COLUMNS];
      // Fill with spaces
      for (int i = 0; i < ROWS; i++)
         for (int j = 0; j < COLUMNS; j++)
            board[i][j] = " ";
   }

   /**
      Sets a field in the board. The field must be unoccupied.
      @param i the row index 
      @param j the column index 
      @param player the player ("x" or "o")
   */
   public void set(int i, int j, String player)
   {
      if (board[i][j].equals(" "))
         board[i][j] = player;
   }
   
   public boolean isWinner()
   {
       if(getWinner().equalsIgnoreCase(""))
       {
           return false;
       }
       return true;
   }
   
   /**
    * Returns the winner of the board. Returns "" if none
    * @return The winner of the game, x,o, or ""
    */
   public String getWinner()
   {
       int o = 0, x = 0;
       for(int i = 0; i < board.length; i++)
       {
           for(int j = 0; j < board.length; j++)
           {
               if(board[i][j].equalsIgnoreCase("O"))
               {
                   o++;
               }
               else if(board[i][j].equalsIgnoreCase("X"))
               {
                   x++;
               }
           }
       }
       if(x < 3 && o < 3)
       {
           return "";
       }
       else
       {
           if(isAWinner("x"))
           {
               return "X";
           }
           else if(isAWinner("O"))
           {
               return "O";
           }
       }
       return "0";
   }

   /**
    * 
    * @param player The player to be checked for winning
    * @return True or False depending on if they won or not
    */
   public boolean isAWinner(String player)
   {
       int yes = 0, row = 0, col = 0;
       //Checking Vertical
       for(row = 0; col < board.length; row++)
       {
          if(row == board.length)
          {
              break;
          }
          if(board[row][col].equalsIgnoreCase(player)) 
          {
              yes++;
          }
          if(row == board.length - 1 && yes != board.length)
          {
              row = -1;
              col++;
              yes = 0;
          }
       }
       
       if(yes == board.length)
       {
           return true;
       }
       
       yes = 0; 
       row = 0;
       //Horizontal
       for(col = 0; row < board.length; col++)
       {
          if(col == board.length)
          {
              break;
          }
          if(board[row][col].equalsIgnoreCase(player)) 
          {
              yes++;
          }
          if(col == board.length - 1 && yes != board.length)
          {
              col = -1;
              row++;
              yes = 0;
          }
       }
       
       if(yes == board.length)
       {
           return true;
       }
       
       row = 0;
       yes = 0;
       //Diagonal (L -> R)
       for(col = 0; col < board.length; col++)
       {
          if(board[row][col].equalsIgnoreCase(player)) 
          {
              yes++;
          }
          row++;
       }
       
       if(yes == board.length)
       {
           return true;
       }
       yes = 0;
       //Diagonal (R -> L)
       row = board.length - 1;
       for(col = 0; col >= 0; col++)
       {
          if(row < 0)
          {
              break;
          }
          if(board[row][col].equalsIgnoreCase(player)) 
          {
              yes++;
          }
          row--;
       }
       
       if(yes == 3)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   
   /**
    * This method resets the board to a blank one
    */
   public void resetBoard()
   {
       for (int i = 0; i < ROWS; i++)
         for (int j = 0; j < COLUMNS; j++)
            board[i][j] = " ";
   }     
   /**
      Creates a string representation of the board, such as
      |x  o|
      |  x |
      |   o|
      @return the string representation
   */
   public String toString()
   {
      String r = "";
      for (int i = 0; i < ROWS; i++)
      {
         r = r + "|";
         for (int j = 0; j < COLUMNS; j++)         
            r = r + board[i][j];
         r = r + "|\n";
      }
      return r;
   }
}
