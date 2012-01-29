package Purses;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 11/7/11
 * Assignment #1
 * This is the purse tester
 * @author Jordan Giacone
 */
public class OriginalTester 
{
    public static void main(String[] args)
    {
        //Instantiate the purse
        PurseOriginal p1 = new PurseOriginal();
        Scanner reader = new Scanner(System.in);
        String coins;
        boolean stop = false, stopLoop = false;
        
        
        //Loop until told not to  
        while(!stopLoop)
        {
            JOptionPane.showMessageDialog(null, 
                    "Start putting stuff in purse 1");
            stop  = false;
            
            //filling first purse
            while(!stop)
            {
                coins = JOptionPane.showInputDialog("Lets put stuff in. "
                        + "Press Q to quit");
                if(coins.equalsIgnoreCase("Q"))
                {
                    stop = true;
                }
                else
                {
                    p1.addCoin(coins);
                }
            }
            if(JOptionPane.showInputDialog("How about we go again?")
                    .equalsIgnoreCase("Yes"))
            {
                p1.delContents();
            }
            else
            {
                stopLoop = true;
            }
        }
    }
}
