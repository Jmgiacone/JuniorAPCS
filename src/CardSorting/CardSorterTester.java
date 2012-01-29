package CardSorting;

import javax.swing.JOptionPane;
/**
 * Jordan Giacone
 * 10/13/11
 * This is the tester class, utilizing JOptionPane
 */
public class CardSorterTester 
{
    public static void main(String[] args) throws SuitNotFoundException,
            RankNotFoundException
    {
        JOptionPane.showMessageDialog(null, "Your Card is a " +new 
                Card(JOptionPane.showInputDialog
                ("Please Enter the Shorthand")).toStrings()+ "");
    }
}
