package KnightsTour;

import java.util.Random;

/**
 * 9/26/11
 * Jordan Giacone
 * This is the knight class :)
 */
public class Knight 
{
   private Random r = new Random();
   private int[] position = new int[2], prevPosition;
   private int[][] availableMoves;
   private int x, y, choice, numMoves, count, madeMoves;
   
   public Knight()
   {
       position[0] = 2;
       position[1] = 2;
       x = position[0];
       y = position[1];
       choice = -999;
       availableMoves = new int[8][2];
       numMoves = 0;
       count = 0;
       madeMoves = 0;
   }
   public void moveTo(int newX, int newY)
   {
       prevPosition = position;
       position[0] += newX;
       position[1] += newY;
       x = position[0];
       y = position[1];
   }
   public void moveTo(int[] coords)
   {
       prevPosition = position;
       position[0] += coords[0];
       position[1] += coords[1];
       x = position[0];
       y = position[1]; 
   }
   
   public int[] getCoords()
   {
       return position;
   }
   
   public boolean hasMove(int[][] board)
   {
       x = position[0];
       y = position[1];
       
       
    if(board[x + 1][y - 2] == 0 && !(x + 1 > 9) && !(y - 2 < 2))
       {
           return true;
       }
       if(board[x + 2][y - 1] == 0 && !(x + 2 > 9) && !(y - 1 < 2))
       {
           return true;
       }
       if(board[x + 2][y + 1] == 0 && !(x + 2 > 9) && !(y + 1 > 9))
       {
           return true;
       }
       if(board[x + 1][y + 2] == 0 && !(x + 1 > 9) && !(y + 2 > 9))
       {
           return true;
       }
       if(board[x - 1][y + 2] == 0 && !(x - 1 < 2) && !(y + 2 > 9)) 
       {
           return true;
       }
       if(board[x - 2][y + 1] == 0 && !(x - 2 < 2) && !(y + 1 > 9)) 
       {
           return true;
       }
       if(board[x - 2][y - 1] == 2 && !(x - 2 < 2) && !(y - 1 < 2)) 
       {
           return true;
       }
       if(board[x - 1][y - 2] == 0 && !(x - 1 < 2) && !(y - 2 < 2))
       {
           return true;
       }
       return false;
   }
   
   
   public int chooseMove(int[][] board, int[][] easeOfMove)
   {
       int lowest = 9999, x = -1, y = -2;
       availableMoves = availableMoves(board);
       if(numMoves <= 0)
       {
           System.out.println("Negative numMoves!");
       }
       for(int i = 0; i < availableMoves.length; i++)
       {
           if(easeOfMove[availableMoves[i][0]][availableMoves[i][1]] < lowest)
           {
               lowest = easeOfMove[availableMoves[i][0]][availableMoves[i][1]];
               x = availableMoves[i][0];
               y = availableMoves[i][1];
           }
       }
       
       if(lowest < 3 && x > 0 && y > 0)
       {
           moveTo(x,y);
           madeMoves++;
           return madeMoves;
       }
       choice = r.nextInt(numMoves) + 1;
       
       if(choice == 1)
       {
           moveTo(availableMoves[0]);
       }
       else if(choice == 2)
       {
           moveTo(availableMoves[1]);
       }
       else if(choice == 3)
       {
           moveTo(availableMoves[2]);
       }
       else if(choice == 4)
       {
           moveTo(availableMoves[3]);
       }
       else if(choice == 5)
       {
           moveTo(availableMoves[4]);
       }
       else if(choice == 6)
       {
           moveTo(availableMoves[5]);
       }
       else if(choice == 7)
       {
           moveTo(availableMoves[6]);
       }
       else if(choice == 8)
       {
           moveTo(availableMoves[7]);
       }
       madeMoves++;
       return madeMoves;
   }
   
   public int[][] availableMoves(int[][] board)
   {
       count = 0;
       for(int i = 0; i < availableMoves.length; i++)
       {
           for(int j = 0; j < availableMoves[i].length; j++)
           {
               availableMoves[i][j] = 0;
           }
       }
       numMoves = 0;
       
       x = position[0];
       y = position[1];
       
    if(board[x + 1][y - 2] == 0 && !(x + 1 > 9) && !(y - 2 < 2))
       {
           availableMoves[count][0] = 1;
           availableMoves[count][1] = -2;
           count++;
           numMoves++;
       }
       if(board[x + 2][y - 1] == 0 && !(x + 2 > 9) && !(y - 1 < 2))
       {
           availableMoves[count][0] = 2;
           availableMoves[count][1] = -1;
           count++;
           numMoves++;
       }
       if(board[x + 2][y + 1] == 0 && !(x + 2 > 9) && !(y + 1 > 9))
       {
           availableMoves[count][0] = 2;
           availableMoves[count][1] = 1;
           count++;
           numMoves++;
       }
       if(board[x + 1][y + 2] == 0 && !(x + 1 > 9) && !(y + 2 > 9))
       {
           availableMoves[count][0] = 1;
           availableMoves[count][1] = 2;
           count++;
           numMoves++;
       }
       if(board[x - 1][y + 2] == 0 && !(x - 1 < 2) && !(y + 2 > 9)) 
       {
           availableMoves[count][0] = -1;
           availableMoves[count][1] = 2;
           count++;
           numMoves++;
       }
       if(board[x - 2][y + 1] == 0 && !(x - 2 < 2) && !(y + 1 > 9)) 
       {
           availableMoves[count][0] = -2;
           availableMoves[count][1] = 1;
           count++;
           numMoves++;
       }
       if(board[x - 2][y - 1] == 2 && !(x - 2 < 2) && !(y - 1 < 2)) 
       {
           availableMoves[count][0] = -2;
           availableMoves[count][1] = -1;
           count++;
           numMoves++;
       }
       if(board[x - 1][y - 2] == 0 && !(x - 1 < 2) && !(y - 2 < 2))
       {
           availableMoves[count][0] = -1;
           availableMoves[count][1] = -2;
           count++;
           numMoves++;
       }
       return availableMoves;
   }
           
   public int getX()
   {
       return position[0];
   }
   
   public int getY()
   {
       return position[1];
   }
   
   public int movesMade()
   {
       return madeMoves;
   }
}
