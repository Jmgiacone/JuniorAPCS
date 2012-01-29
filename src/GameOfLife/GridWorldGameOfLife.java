///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
package GameOfLife;
//
//import info.gridworld.actor.Rock;
//import info.gridworld.grid.BoundedGrid;
//import info.gridworld.grid.Location;
//import java.io.*;
//import java.util.*;
///**
// * 9/18/11
// * Jordan Giacone
// * This plays the game of life!
// */
public class GridWorldGameOfLife
{
//    public static void main(String[] args) throws FileNotFoundException
//    {
//        BoundedGrid grid = new BoundedGrid(20, 20), newGrid;
//        //Instantiating all teh varz
//        Scanner scanner = new Scanner(new File("src\\GameOfLife\\" +
//                "life100.txt"));
//        int totalBacteria, row = -987, column = -987, rowSize = 20, 
//                columnSize = 20, gen = 0, numNeighbors;
//        String[] coordStrings = new String[100];
//        //2d Arrays ftw!
//        //String[][] grid = new String[rowSize][columnSize],newGrid;
//        
//        totalBacteria = scanner.nextInt();
//        /*Random blank line at beginning for some odd reason... 
//        hath been removed*/
//        scanner.nextLine();
//        //Filling coordStrings w/ both coordinates in 1 line
//        for(int i = 0; scanner.hasNext();  i++)
//        {
//            coordStrings[i] = scanner.nextLine();
//        }
//        
//        for(int i = 0; i < coordStrings.length; i++)
//        {
//                //Trimming off the first blank lines
//                coordStrings[i] = coordStrings[i].trim();
//                
//                /*This is cool, i'm splitting the string where both numbers will
//                have blank spaces, then i'll just trim off the fat... whilst 
//                 parsing them to integers. Triple method inception ^_^*/
//                row = Integer.parseInt(coordStrings[i].substring(0, 3).trim());
//                column = Integer.parseInt(coordStrings[i].substring(3).trim());
//                
//                //Preparing the values for arrays
//                row--;
//                column--;
//                grid.put(new Location(row, column), new Rock());
//                //grid[row][column] = "*";
//        }
//        
////        for(int i = 0; i < 20/*Fix later*/; i++)
////        {
////            for(int j = 0; j < 20/*Fix later also*/; j++)
////            {
////                if(grid[i][j] == null)
////                {
////                    //Converts null values :(, into white space :)
////                    grid[i][j] = " ";
////                }
////            }
////        }
//        
//        newGrid = grid;
//        //printGrid(grid);
//        //System.out.println();
//        while(gen <= 5)
//        {
//            grid = newGrid;
//            
//            
//            for(int i = 0; i < 20; i++)
//            {
//                for(int j = 0; j < 20; j++)
//                {
//                    numNeighbors = numNeighbors(grid, i, j);
//                    if(numNeighbors == -1)
//                    {
//                        System.out.println("OMG!!! NEGATIVE NEIGHBORZZZ");
//                        break;
//                    }
//                    if(grid[i][j].equalsIgnoreCase(" ") && numNeighbors == 3)
//                    {
//                        //New cell is born!
//                        newGrid[i][j] = "*";
//                    }
//                    else if(numNeighbors <= 1)
//                    {
//                        //They die... :(
//                        newGrid[i][j] = " ";
//                    }
//                    else if(numNeighbors >= 4)
//                    {
//                        //They die... :(
//                        newGrid[i][j] = " ";
//                    }
//                    else if(numNeighbors == 2 || numNeighbors == 3)
//                    {
//                        //No change :/
//                        newGrid[i][j] = grid[i][j];
//                    }
//                }
//            }
//            System.out.printf("Generation: %d\n\n", gen);
//            printGrid(newGrid);
//            System.out.println();
//            gen++;
//        }
//    }
//    
//    public static int numNeighbors(String[][] grid, int row, int column)
//    {
//        int numNeighbors = 0, columnUp = column + 1, columnDown = column - 1, 
//                rowUp = row + 1, rowDown = row -1;
//        
//        if(rowDown < 0)
//        {
//            rowDown = 0;
//        }
//        if(rowUp > 19)
//        {
//            rowUp = 19;
//        }
//        if(columnDown < 0)
//        {
//            columnDown = 0;
//        }
//        if(columnUp > 19)
//        {
//            columnUp = 19;
//        }
//        
//        for(int i = rowDown; i <= rowUp; i++)
//        {
//            for(int j = columnDown; j <= columnUp; j++)
//            {
//                if(i == row && j == column)
//                {
//                    //The point we're looking at can't be it's own neighbor
//                }
//                else if(grid[i][j].equalsIgnoreCase("*"))
//                {
//                    numNeighbors++;
//                }
//            }  
//        }
//        return numNeighbors;
//    }
//    
//    public static void printGrid(String[][] grid)
//    {
//        //Initial grid label type thing
//        System.out.println("     12345678901234567890");
//        System.out.println();
//        for(int i = 0; i < 20/*Fix later*/; i++)
//        {
//            //Side column numberzzz
//            System.out.printf("%d    ", i + 1);
//            for(int j = 0; j < 20/*Fix later also*/; j++)
//            {
//                System.out.printf(grid[i][j]);
//            }
//            System.out.println("");
//        }
//    }
}