package CurrencyConvert;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @uthor Jordan Giacone
 * This is a currency converter. Euros to Dollars
 */
public class Converter
{
    public static void main(String[] args)
    {
        //Formatting a double
        DecimalFormat d = new DecimalFormat("#.##");
        double conversion = Double.parseDouble(JOptionPane.
                showInputDialog("Please enter the amount of Euros " +
                "that are equal to a dollar"));

        double dollars = Double.parseDouble(JOptionPane.
                showInputDialog("How many dollars do you have?"));

        JOptionPane.showMessageDialog(null, "" +dollars+
                " Dollars is equal to" +d.format((dollars * conversion))+ 
                " Euros" +"\nIf you had" +d.format(dollars)+ 
                " Euros, you would have"+d.format((dollars / conversion))+ 
                " Dollars");
    }
}
