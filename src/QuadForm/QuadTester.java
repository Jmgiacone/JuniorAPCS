package QuadForm;

import javax.swing.JOptionPane;

/**
 * Jordan Giacone
 * 10/19/11
 * Assignment ?
 * This is the tester for the Quadratic Formula
 */
public class QuadTester 
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, new QuadraticFormula
               (Double.parseDouble(JOptionPane.showInputDialog
               ("Please enter the value of a")),
                Double.parseDouble(JOptionPane.showInputDialog
                ("Now b")),
                Double.parseDouble(JOptionPane.showInputDialog
                ("And finally c"))));
    }
}
 