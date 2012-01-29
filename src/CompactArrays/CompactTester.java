package CompactArrays;

import java.io.*;
import java.util.*;

/**
 * 9/12/11
 * Jordan Giacone
 * Assignment 8
 * This removes all 0's from an array after reading from a text file
 */
public class CompactTester 
{
    public static void main(String[] args) throws IOException
    {
        Scanner reader = new Scanner(new File("src\\CompactArrays\\" +
                "compact.txt"));
        int size = 20, add = 0;
        int[] readNums = new int[size];
        
        for(int i = 0; i < readNums.length; i++)
        {
            readNums[i] = reader.nextInt();
        }
        
        System.out.printf("Here are your numbers.\n");
        for(int i = 0; i < readNums.length; i++)
        {
            System.out.println(readNums[i]);
        }
        
        System.out.println("");
        
        for(int i = 0; i < readNums.length; i++)
        {
            if(readNums[i] == 0)
            {
                add = i + 1;
                for(int j = i; j < readNums.length; j++)
                {
                    if(add == readNums.length)
                    {
                        readNums[j] = -1000;
                    }
                    else
                    {
                        readNums[j] = readNums[add];
                    }
                    add++;
                }
                i--;
                //copyOfRange will chop out chunks of an array for
                //you between 2 points
                readNums = Arrays.copyOfRange(readNums, 0, (readNums.
                        length - 1));
            }
        }
        System.out.println("");
        System.out.println("Now the 0's are gone.\nI'm  a magician!");
        
        for(int i = 0; i < readNums.length; i++)
        {
            System.out.println(readNums[i]);
        }
    }
}
/*
run:
Here are your numbers.
0
6
13
0
0
75
33
0
0
0
4
29
21
0
86
0
32
66
0
0


Now the 0's are gone.
I'm  a magician!
6
13
75
33
4
29
21
86
32
66
*/