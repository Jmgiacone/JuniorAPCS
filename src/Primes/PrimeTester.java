package Primes;

import javax.swing.JOptionPane;

/**
 * 11/2/11
 * @author Jordan Giacone
 * This is the Teter for the PrimeGenerator class
 */
public class PrimeTester 
{
    public static void main(String[] args)
    {
        String stop = "nahbro";
        while(!stop.equalsIgnoreCase("Yes"))
        {
            JOptionPane.showMessageDialog(null, 
                    new PrimeGenerator
                    (Integer.parseInt(
                    JOptionPane.showInputDialog
                    ("Please enter the number that you want "
                    + "prime factors for"))));
            
            stop = (JOptionPane.showInputDialog("How about we stop?"));
        }
        JOptionPane.showMessageDialog(null, "Thanks for playing!");
    }
}
