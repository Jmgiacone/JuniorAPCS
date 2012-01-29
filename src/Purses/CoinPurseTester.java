/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Purses;

import javax.swing.JOptionPane;

/**
 * Assignment #3
 * 11/8/11
 * This is the tester for CoinPurse
 * @author Jordan Giacone
 */
public class CoinPurseTester 
{
    public static void main(String[] args)
    {
        CoinPurse p1 = new CoinPurse(), p2 = new CoinPurse();
        boolean stop = false,stopLoop = false;
        String coins;
        
    
        JOptionPane.showMessageDialog(null, "I can tell if your Purses are the same!"
                + "\nJust help me populate them for you!");
        
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
                    p1.addCoin(new Coin(coins, 999));
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
                    p2.addCoin(new Coin(coins, 999));
                }
            }
            
            JOptionPane.showMessageDialog(null, "Here are the contents of "
                    + "the second Purse " +p2+ "");
            
            
            JOptionPane.showMessageDialog(null, "Contents of Purse 1 " +p1+ ""
                    + "\nContents of Purse 2 "+p2+ "");
            JOptionPane.showMessageDialog(null, "Do these bags have the same "
                    + "contents?\nThat answer is... " +p1.sameCoins(p2)+ "!");
            
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
