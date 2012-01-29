package CashRegisters;

import java.util.Scanner;

/**
 * 12/4/12
 * This is the fixed register tester. 
 * Testing for returning a certain amount of coinage
 * Assignment #11
 * @author Jordan Giacone
 */
public class RegisterTester2 
{
    public static void main(String[] args)
    {
        String stop = "no", choice;
        Scanner reader = new Scanner(System.in);
        Coin penny = new Coin(.01, "Penny"), nickel = new Coin(.05, "Nickel"),
                dime = new Coin(.1, "Dime"), 
                quarter = new Coin(.25, "Quarter"), 
                goldenDollar = new Coin(1, "Golden Dollar"), 
                coinChoice = null;
        CashRegister2 c = new CashRegister2();
        
        while(!stop.equalsIgnoreCase("Yes"))
        {
            System.out.printf("How big of a purchase(in dollars) "
                    + "to make?\nChoice: ");
            c.recordPurchase(reader.nextDouble());
            System.out.printf("Pay how many dollars?\nChoice: ");
            c.enterPayment(goldenDollar, reader.nextDouble());
           
            while(coinChoice == null)
            {
                System.out.printf("Which coin shall you pay with?\nChoice: ");
                reader.nextLine();
                choice = reader.nextLine();
                if(choice.equalsIgnoreCase(penny.getName()))
                {
                    coinChoice = new Coin(penny.getValue(), penny.getName());
                }
                else if(choice.equalsIgnoreCase(nickel.getName()))
                {
                    coinChoice = new Coin(nickel.getValue(), nickel.getName());
                }
                else if(choice.equalsIgnoreCase(dime.getName()))
                {
                    coinChoice = new Coin(dime.getValue(), dime.getName());
                }
                else if(choice.equalsIgnoreCase(quarter.getName()))
                {
                    coinChoice = new Coin(quarter.getValue(), quarter.getName());
                }
                else if(choice.equalsIgnoreCase(goldenDollar.getName()))
                {
                    coinChoice = new Coin(goldenDollar.getValue(), 
                            goldenDollar.getName());
                }
                else 
                {

                }
            }
            
            System.out.printf("Change is %d %ss\n", c.giveChange(coinChoice), 
                    coinChoice.getName());
            
            coinChoice = null;
            System.out.printf("How about we stop?\nChoice: ");
            
            stop = reader.nextLine();
        }
        
    }
}
/*run:
How big of a purchase(in dollars) to make?
Choice: 10000
Pay how many dollars?
Choice: 999
Which coin shall you pay with?
Choice: golden dollar
Change is -9001 Golden Dollars
How about we stop?
Choice: no
How big of a purchase(in dollars) to make?
Choice: 10
Pay how many dollars?
Choice: 11
Which coin shall you pay with?
Choice: penny
Change is 100 Pennys
How about we stop?
Choice: no
How big of a purchase(in dollars) to make?
Choice: 1000000000
Pay how many dollars?
Choice: 100000000000
Which coin shall you pay with?
Choice: quarter
Change is 2147483647 Quarters
How about we stop?
Choice: yes
*/