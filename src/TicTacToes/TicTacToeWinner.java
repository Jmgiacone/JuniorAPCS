package TicTacToes;

import java.util.Scanner;

/**
 * Assignment #7
 * 11/22/11
 * This is the copied and modified tester for the tic tac toe class
 * @author Jordan Giacone and Cay Horstmann
 */
public class TicTacToeWinner 
{
    public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String player = "x", choice = "sure buddy";
      TicTacToe game = new TicTacToe();
      boolean done = false;
      while(!choice.equalsIgnoreCase("NO"))
      {
          game.resetBoard();
          while (!game.isWinner() && !done)
          {
             System.out.printf("\n%s",game); 
             System.out.print(
                   "Row for " + player + " (-1 to exit): ");
             int row = in.nextInt();
             if (row < 0) 
             {
                done = true;
                choice = "no";
             }
             else
             {
                System.out.print("Column for " + player + ": ");
                int column = in.nextInt();
                game.set(row, column, player);
                if (player.equals("x")) 
                   player = "o"; 
                else 
                   player = "x";    
             }
          }

          System.out.printf("%s", game);
          System.out.printf("\nThe winner is %s!\n", game.getWinner());

          System.out.printf("How about we play again?\nAnswer: ");
          in.nextLine();
          choice = in.nextLine();
       }
   }
}
/*
|   |
|   |
|   |
Row for x (-1 to exit): 0
Column for x: 0

|x  |
|   |
|   |
Row for o (-1 to exit): 1
Column for o: 2

|x  |
|  o|
|   |
Row for x (-1 to exit): 1
Column for x: 1

|x  |
| xo|
|   |
Row for o (-1 to exit): 2
Column for o: 1

|x  |
| xo|
| o |
Row for x (-1 to exit): 2
Column for x: 
2
|x  |
| xo|
| ox|

The winner is X!
How about we play again?
Answer: sure
|   |
|   |
|   |
Row for o (-1 to exit): 0
Column for o: 0

|o  |
|   |
|   |
Row for x (-1 to exit): 1
Column for x: 1

|o  |
| x |
|   |
Row for o (-1 to exit): 0
Column for o: 1

|oo |
| x |
|   |
Row for x (-1 to exit): 2
Column for x: 2

|oo |
| x |
|  x|
Row for o (-1 to exit): 0
Column for o: 2
|ooo|
| x |
|  x|

The winner is O!
How about we play again?
Answer: sure

|   |
|   |
|   |
Row for x (-1 to exit): 0
Column for x: 0

|x  |
|   |
|   |
Row for o (-1 to exit): 1
Column for o: 1

|x  |
| o |
|   |
Row for x (-1 to exit): 1
Column for x: 0

|x  |
|xo |
|   |
Row for o (-1 to exit): 2
Column for o: 2

|x  |
|xo |
|  o|
Row for x (-1 to exit): 2
Column for x: 0
|x  |
|xo |
|x o|

The winner is X!
How about we play again?
Answer: no*/