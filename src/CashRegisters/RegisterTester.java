package CashRegisters;

import java.util.Scanner;

/**
 * 11/130/11
 * Assignment #9
 * @author Jordan Giacone
 */
public class RegisterTester 
{
    public static void main(String[] args)
    {
        String stop = "no";
        Scanner reader = new Scanner(System.in);
        Coin quarter = new Coin(.25, "Quarter"), goldenDollar = new Coin
                (1, "Golden Dollar");
        CashRegister c = new CashRegister();
        
        while(!stop.equalsIgnoreCase("Yes"))
        {
            System.out.printf("How big of a purchase to make?\nChoice: ");
            c.recordPurchase(reader.nextDouble());
            System.out.printf("Pay how many dollars?\nChoice: ");
            c.enterPayment(goldenDollar, reader.nextDouble());
            System.out.printf("Change is %s dollars\n", c.giveChange());
            
            reader.nextLine();
            System.out.printf("How about we stop?\nChoice: ");
            
            stop = reader.nextLine();
        }
        
    }
}
/*run:
How big of a purchase to make?
Choice: 10
Pay how many dollars?
Choice: 5
Change is -5.0 dollars
How about we stop?
Choice: no
How big of a purchase to make?
Choice: 10
Pay how many dollars?
Choice: 15
Change is 5.0 dollars
How about we stop?
Choice: no
How big of a purchase to make?
Choice: 0
Pay how many dollars?
Choice: 0
Change is 0.0 dollars
How about we stop?
Choice: yes
*/