package NumberPerms;

import java.util.*;

/**
 * 11/16/11
 * Assignment 6
 * This is the permutation assignment using a regular array
 * @author Jordan Giacone
 */
public class Permutation 
{
    private static Random r = new Random();
        
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many randomly permutated numbers do you want?"
                + "\nChoice: ");
        int j = reader.nextInt();
        int[] list = new int[j];
        
        for(int i = 0; i < list.length; i++)
        {
            list[i] = i + 1;
        }
        
        final int[] finalList = Arrays.copyOf(list, list.length);
        System.out.print("How many times do you want to loop?\nChoice: ");
        int loop = reader.nextInt();
        
        for(int i = 0; i < loop; i++)
        {
            dispArray(i, getNextPermutation(list));
            list = resetList(list);
        }
        
        
    }
    
    /**
     * This is the method that permutates the given int array
     * @param x The int array containing the values that you want to permutate
     * @return The permutated array
     */
    public static int[] getNextPermutation(int[] x)
    {
        int[] other  = new int[x.length];
        int temp, max = x.length,stop = max, element;
        
        for(int i = 0; x.length != 0; i++)
        {
            element = r.nextInt(max);
            temp = x[element]; 
            x[element] = x[max - 1];
            other[i] = temp;
            x[max - 1] = -999;
            max--;
            x = Arrays.copyOf(x, max);
        }
        
        return other;
    }
    
    /**
     * This is a method to display the contents of the array
     * @param count The number of the list. Run 1,2,3
     * @param list The array to be displayed
     */
    public static void dispArray(int count,int[] list)
    {
        System.out.printf("#%d.\n", count + 1);
        for(int i = 0; i < list.length; i++)
        {
            System.out.printf("%d\n", list[i]);
        }
        System.out.println();
    }
    
    /**
     * This sets the values of each element of the array back to 1-the length
     * of the passed in array
     * @param list The array to be reset
     * @return The reset array
     */
    public static int[] resetList(int[] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            list[i] = i + 1;
        }
        return list;
    }
}
/*run:
How many randomly permutated numbers do you want?
Choice: 10
How many times do you want to loop?
Choice: 5
#1.
4
6
2
1
9
10
3
5
8
7

#2.
5
6
3
8
7
1
9
2
4
10

#3.
2
9
7
1
4
10
3
8
5
6

#4.
1
8
7
9
10
5
3
6
2
4

#5.
6
2
1
5
4
8
10
9
3
7

run:
How many randomly permutated numbers do you want?
Choice: 3
How many times do you want to loop?
Choice: 2
#1.
3
2
1

#2.
3
1
2

run:
How many randomly permutated numbers do you want?
Choice: 7
How many times do you want to loop?
Choice: 5
#1.
7
2
5
3
4
1
6

#2.
3
5
1
7
6
2
4

#3.
7
6
2
1
4
3
5

#4.
3
2
5
1
6
4
7

#5.
3
2
4
5
1
7
6

*/