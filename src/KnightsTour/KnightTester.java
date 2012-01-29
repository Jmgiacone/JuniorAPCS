package KnightsTour;

/**
 * 9/26/11
 * Jordan Giacone
 * Assignment 8?
 * This tests my knight class and does his tour
 */
public class KnightTester 
{
    public static void main(String[] args)
    {
        Knight k = new Knight();
        int[][] board = new int[12][12];
        int[] vert = new int[8], horiz = vert;
        int steps;
        
        dispBoard(board);
        
        for(steps = 0; k.hasMove(board); steps++)
        {
            //board[k.getX()][k.getY()] = k.chooseMove(board);
            dispBoard(board);
        }
        System.out.printf("Your knight made %d Moves\n", k.movesMade());
    }
    
    public static void dispBoard(int[][] board)
    {
        System.out.println("    1  2  3  4  5  6  7  8");
        for(int i = 2; i < 10; i++)
        {
            System.out.printf("%d   ", i - 1);
            for(int j  = 2; j < 10; j++)
            {
                System.out.printf("%d  ", board[i][j]);
            }
            System.out.println("");

        }
        System.out.println("\n");
    }
}