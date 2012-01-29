package DataSetting;

/**
 * 11/12/11
 * Assignment 15
 * This is the dataSet tester
 * @author Jordan Giacone
 */
public class DataSetTester 
{
    public static void main(String[] args)
    {
        DataSet d = new DataSet();
        int count = 0;
        
        while(count < 4)
        {
            d.addValue(count);
            count++;
        }
        
        System.out.println(d);
        System.out.println("\nExpected:\nLargest: 3\nSmallest: 0");
    }
}
/*Largest: 3
Smallest: 0

Expected:
Largest: 3
Smallest: 0*/
