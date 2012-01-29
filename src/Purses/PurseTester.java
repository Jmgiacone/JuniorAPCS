package Purses;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 11/7/11
 * Assignment #2
 * This is the purse tester testing transfer method
 * @author Jordan Giacone
 */
public class PurseTester 
{
    public static void main(String[] args)
    {
        //Instantiate the purse
        Purse p1 = new Purse(), p2 = new Purse();
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
            stop  = false;
            JOptionPane.showMessageDialog(null, "Here are the contents of "
                    + "the first Purse " +p1+ "");
            
            JOptionPane.showMessageDialog(null, 
                    "Start putting stuff in purse 2");
            
            //filling 2nd purse
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
                    p2.addCoin(coins);
                }
            }
            
            JOptionPane.showMessageDialog(null, "Here are the contents of "
                    + "the second Purse " +p2+ "");
            JOptionPane.showMessageDialog(null, 
                    "TRANSFERRING!");//How many r's?
            
            p1.transfer(p2);//Doing the transfer
            
            JOptionPane.showMessageDialog(null, "Contents of Purse 1 " +p1+ ""
                    + "\nContents of Purse 2 "+p2+ "");
            
            //Checking if we go for another looop
            if(JOptionPane.showInputDialog("How about we go again?")
                    .equalsIgnoreCase("Yes"))
            {
                p1.delContents();
                p2.delContents();
            }
            else
            {
                stopLoop = true;
            }
        }
    }
}
