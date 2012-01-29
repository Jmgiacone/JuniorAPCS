package Horoscopes;

import javax.swing.JOptionPane;

/**
 * Jordan Giacone
 * 10/19/11
 * This is the tester for my Horoscopes
 */
public class HoroscopeTester 
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, 
                new Horoscope(Integer.parseInt
                (JOptionPane.showInputDialog
                ("When is the Day of your Birth?"))
                ,JOptionPane.showInputDialog
                ("Which is the month of your birth?")));
    }
}
