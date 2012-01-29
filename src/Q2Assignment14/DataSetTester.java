package Q2Assignment14;

import java.util.Scanner;

/**
 * 12/12/11
 * Assignment #14
 * @author Jordan Giacone
 * This is the tester for the DataSet class
 */
public class DataSetTester 
{

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        DataSet stringData = new DataSet();
        String max, min;
        
        System.out.println("Enter 5 Strings");
        
        for(int i = 1; i <=5; i++)
        {
            System.out.printf("%d: ", i);    
            stringData.add(reader.nextLine());
        }
        
        
        max = (String)stringData.getMaximun();
        min = (String)stringData.getMinimun();
        
        System.out.println(stringData);
        
        
        
    }
}
/*
Enter 5 Strings
1: jordan
2: michael
3: giacone
4: is
5: bau5

The max(alphabetically last) word is: michael
The min(alphabetically first) word is: bau5
 
Enter 5 Strings
1: bananna
2: apple
3: kiwi
4: cranberry
5: strawberry
The max(alphabetically last) word is: strawberry
The min(alphabetically first) word is: apple
 
Enter 5 Strings
1: michael malis
2: tim choh
3: adam poncher
4: svetty
5: keith harris

The max(alphabetically last) word is: tim choh
The min(alphabetically first) word is: adam poncher
*/
