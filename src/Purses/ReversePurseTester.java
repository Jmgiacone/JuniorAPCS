package Purses;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 11/9/11
 * Assignment #4
 * This is the ReversePurse tester
 * @author Jordan Giacone
 */
public class ReversePurseTester 
{
    public static void main(String[] args)
    {
        //Instantiate the purse
        ReversePurse p1 = new ReversePurse();
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
            
            JOptionPane.showMessageDialog(null, "The contents of Purse 1 "
                    + "are " +p1+ "");
            //Reversing!
            p1.reverse();
            JOptionPane.showMessageDialog(null, "Here they are reversed! " 
                    +p1+ "");
            
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
