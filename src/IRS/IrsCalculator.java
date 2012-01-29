/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IRS;

import javax.swing.*;
/**
 * 8/29
 * Jordan Giacone
 * Assignment 2
 * This calculates IRS Tax stuff
 */
public class IrsCalculator 
{
    public static void main(String[] args)
    {
        String marriageAnswer = "TEMPORARY STATE", incomeString, 
                maritalStatus = "Unititialized";
        int income = -1; 
        double tax = -1, overAmount = -1;
        
        while(!marriageAnswer.equalsIgnoreCase("yes") && 
                !marriageAnswer.equalsIgnoreCase("no"))
        {
             marriageAnswer = JOptionPane.showInputDialog("Are you married?");
        }
        
        while(income < 0)
        {
            incomeString = JOptionPane.showInputDialog("How much moneyz do "
                    + "you make per year?");
            income = Integer.parseInt(incomeString);
        }
        if(marriageAnswer.equalsIgnoreCase("no"))
        {
            maritalStatus = "Single";
            if(income > 0 && income < 27050)
            {
                tax = income * .15;
            }
            else if(income > 27050 && income < 65550)
            {
                overAmount = income - 27050;
                tax  = 4057.5 + (.275 * overAmount);
            }
            else if(income > 65550 && income < 136750)
            {
                overAmount = income - 65550;
                tax  = 14645 + (.305 * overAmount);
            }
            else if(income > 136750 && income < 297350)
            {
                overAmount = income - 136750;
                tax  = 36361 + (.355 * overAmount);
            }
            else if(income > 297350)
            {
                overAmount = income - 297350;
                tax  = 93374 + (.391 * overAmount);
            }
        }
        else if(marriageAnswer.equalsIgnoreCase("yes"))
        {
            maritalStatus = "Married";
            if(income > 0 && income < 45200)
            {
                tax  = .15 * income;
            }
            else if(income > 45200 && income < 109250)
            {
                overAmount = income - 45200;
                tax  = 6780 + (.275 * overAmount);
            }
            else if(income > 109250 && income < 166500)
            {
                overAmount = income - 109250;
                tax  = 24393.75 + (.305 * overAmount);
            }
            else if(income > 166500 && income < 297350)
            {
                overAmount = income - 166500;
                tax  = 41855 + (.355 * overAmount);
            }
            else if(income > 297350)
            {
                overAmount = income - 297350;
                tax  = 88306 + (.391 * overAmount);
            }
        }
        
        JOptionPane.showMessageDialog(null, "Marital Status: " +maritalStatus+ 
                "\nYour taxable income is $" +overAmount+
                "\nYour income tax is $" +tax+ "!");
     }
 }
