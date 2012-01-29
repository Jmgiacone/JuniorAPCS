package KnightsTour;

import java.util.*;
import java.io.*;
/**
 *
 * @author Jordan
 */
public class KTour2Tester 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Knight k = new Knight();
        Scanner scanner = new Scanner(new File("src\\KnightsTour\\"
                + "access.txt"));
        int[][] board = new int[12][12], valueBoard = new int[8][8];
        String[] valueString = new String[8];
        int arrayOffset = 0;
        
        for(int i = 0; scanner.hasNextLine(); i++)
        {
            valueString[i] = scanner.nextLine();
        }
        
//        for(int i = 0; i < valueString.length; i++)
//        {
//            System.out.println(valueString[i]);
//        }
        
        for(int i = 0; i < valueString.length; i++)
        {
            for(int j = 0; j < valueString.length; j++)
            {
                if(arrayOffset == 14)
                {
                    valueBoard[j][i] = Integer.parseInt(valueString[i].
                            substring(arrayOffset).trim());
                    arrayOffset = 0;
                }
                else
                {
                    valueBoard[j][i] = Integer.parseInt(valueString[i].
                            substring(arrayOffset, arrayOffset + 2).trim());
                    arrayOffset += 2;
                }
            }
        }
        
//        for(int i = 0; i < valueBoard.length; i++)
//        {
//            System.arraycopy(valueBoard[i], 0, board[i + 2], 
//                    2, valueBoard.length);
//        }
        dispBoard(board);
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
