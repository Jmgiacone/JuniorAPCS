 

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * Jordan Giacone
 * 11/16/11
 * Assignment 6
 * This is the permutation generator that I did in intro and Svetty Said 
 * i could still use
 */
public class PermutationOld
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int numTimes, numLow, numHigh;
        System.out.print("How many lists would you like? ");
        numTimes = reader.nextInt();
        System.out.print("What would you like the min number to be? ");
        numLow = reader.nextInt();
        System.out.print("What would you like the max number to be? ");
        numHigh = reader.nextInt();
        
        dispArrays(numTimes, numHigh, numLow);
        
        
    }
    
    public static void dispArrays(int numTimes, int numMax, int numLow)
    {
        int x = 1;
        System.out.printf("%d Randomly Permutated ArrayLists just for you!\n", numTimes);
        System.out.println();
        while (x <= numTimes)
        {
            System.out.printf("List %d: ",x);
            System.out.println(nextPerm(numMax, numLow));
            System.out.println();
            x++;
        }
    }

    public static ArrayList<Integer> nextPerm(int max, int min)
    {
        ArrayList <Integer> list = new ArrayList <Integer>();
        ArrayList <Integer> pool = new ArrayList <Integer>();
        Random r = new Random();
        int i, x;
        for(i = min; i <= max; i++)
        {
            pool.add(i);
        }
        
        for(i = max; i > 0; i--)
        {
            x = pool.remove(r.nextInt(i));
            list.add(x);
        }
        
        
        return list;
    }
}
/*
How many lists would you like? 10
What would you like the min number to be? 1
What would you like the max number to be? 0
10 Randomly Permutated ArrayLists just for you!

List 1: []

List 2: []

List 3: []

List 4: []

List 5: []

List 6: []

List 7: []

List 8: []

List 9: []

List 10: []

How many lists would you like? 20
What would you like the min number to be? 1
What would you like the max number to be? 20
20 Randomly Permutated ArrayLists just for you!

List 1: [3, 20, 7, 12, 17, 9, 16, 5, 14, 4, 11, 6, 18, 19, 1, 2, 15, 13, 10, 8]

List 2: [4, 3, 19, 1, 13, 8, 10, 12, 5, 6, 9, 20, 2, 16, 7, 15, 14, 18, 17, 11]

List 3: [11, 16, 7, 12, 9, 10, 13, 18, 2, 6, 15, 5, 19, 3, 17, 1, 4, 20, 8, 14]

List 4: [19, 15, 7, 2, 6, 9, 4, 1, 11, 13, 18, 14, 3, 20, 10, 8, 17, 16, 5, 12]

List 5: [6, 13, 9, 4, 11, 3, 17, 19, 14, 8, 5, 2, 12, 10, 15, 1, 20, 18, 16, 7]

List 6: [18, 2, 5, 7, 13, 15, 8, 14, 17, 19, 12, 20, 1, 10, 3, 9, 4, 16, 6, 11]

List 7: [3, 12, 10, 14, 7, 6, 2, 11, 19, 5, 13, 20, 16, 1, 9, 15, 8, 18, 17, 4]

List 8: [14, 19, 7, 3, 6, 11, 10, 20, 2, 8, 15, 17, 18, 5, 13, 4, 16, 1, 12, 9]

List 9: [3, 8, 20, 9, 19, 15, 10, 5, 14, 13, 7, 2, 11, 1, 4, 6, 16, 17, 12, 18]

List 10: [5, 11, 3, 17, 19, 12, 7, 1, 15, 2, 9, 18, 20, 8, 10, 4, 6, 13, 14, 16]

List 11: [2, 16, 14, 15, 4, 6, 19, 8, 17, 3, 1, 12, 13, 9, 18, 20, 10, 11, 5, 7]

List 12: [2, 11, 12, 5, 15, 8, 4, 3, 19, 1, 7, 18, 9, 20, 17, 14, 10, 6, 16, 13]

List 13: [2, 1, 3, 8, 18, 16, 5, 6, 13, 17, 7, 12, 14, 10, 4, 11, 19, 9, 15, 20]

List 14: [8, 5, 4, 18, 12, 17, 19, 15, 16, 9, 10, 3, 14, 6, 2, 11, 1, 13, 7, 20]

List 15: [6, 11, 5, 2, 12, 13, 15, 19, 14, 17, 3, 20, 1, 4, 16, 7, 10, 18, 8, 9]

List 16: [10, 19, 18, 14, 15, 8, 1, 4, 11, 16, 13, 9, 7, 12, 17, 5, 20, 3, 6, 2]

List 17: [2, 1, 6, 3, 11, 13, 8, 14, 18, 16, 10, 7, 9, 4, 19, 17, 15, 12, 5, 20]

List 18: [2, 4, 9, 19, 12, 8, 13, 17, 5, 3, 20, 16, 6, 18, 1, 15, 14, 7, 11, 10]

List 19: [15, 20, 9, 6, 13, 11, 3, 1, 10, 14, 19, 8, 7, 17, 4, 2, 16, 18, 12, 5]

List 20: [8, 5, 6, 1, 19, 12, 7, 14, 17, 18, 15, 9, 2, 4, 20, 16, 11, 10, 13, 3]

How many lists would you like? 5
What would you like the min number to be? 1
What would you like the max number to be? 5
5 Randomly Permutated ArrayLists just for you!

List 1: [3, 4, 1, 2, 5]

List 2: [1, 4, 5, 2, 3]

List 3: [5, 4, 1, 3, 2]

List 4: [3, 2, 1, 5, 4]

List 5: [3, 4, 1, 2, 5]

*/