package NumFactors;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class Factors 
{
    public static void main(String[] args)
    {
        FactorMaker f = new FactorMaker(
                Integer.parseInt(JOptionPane.
                showInputDialog("Please enter your number")));
        
        while(f.hasNextFactor())
        {
            f.nextFactor(f.nextFactor(f.getNum()));
        }
    }   
}
