/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PigLatinProject;

import java.util.*;
/**
 * 9/7/11
 * Jordan Giacone
 * Assingment 5(i think)
 */
public class PigLatinator
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String englishPhrase, answer = "Jordan Giacone";
        while(!answer.equalsIgnoreCase("No"))
        {
            System.out.print("This program translates from english to pig " +
                    "latin\nEnter a phrase in engrish ");
            englishPhrase = reader.nextLine();

            System.out.printf("The translation of %s is: %s\n", englishPhrase,
                    toPigLatin(englishPhrase));
            
            System.out.print("Again? ");
            answer = reader.nextLine();
            System.out.println("");

        }
    }
    public static String toPigLatin(String english)
    {
        //String test = "I love to \"play\" with my friends"; This works
        String delims = "[ ,.?!;:-]+", end, start, startRep, endRep,
                startBeg, endBeg, toBeReturned;//dont 4get
        //to add \"\" String delims = "[ .,?!]+";
        String[] tokens = english.split(delims);
        
        
        for(int i = 0; i < tokens.length; i++)
        {
            if(!containsVowel(tokens[i]))
            {
                tokens[i] += "ay";
            }
            else if(beginsWithVowel(tokens[i]))
            {
                tokens[i] += "yay";
            }
            else if(containsVowel(tokens[i]) && !beginsWithVowel(tokens[i]))
            {
                for(int j = 0; j < tokens[i].length(); j++)
                {
                    if(beginsWithVowel(tokens[i].substring(j)))
                    {
                        start = tokens[i].substring(0, j);
                        end = tokens[i].substring(j, tokens[i].length());

                        if(Character.isUpperCase(tokens[i].charAt(0)))
                        {
                            //Soooo annoying to figure out!!!
                            
                            //The letter that will replace the first 
                            //letter of var end
                            endRep = String.valueOf(Character.
                                    toUpperCase(end.charAt(0)));
                            //The letter currently beginning var end
                            endBeg = String.valueOf(end.charAt(0));
                            
                            //Letter that will replace first latter of start
                            startRep = String.valueOf(Character.
                                    toLowerCase(start.charAt(0)));
                            
                            //The current first letter of var start
                            startBeg = String.valueOf(start.charAt(0));
                            
                            end = end.replace(endBeg, endRep);
                            start = start.replace(startBeg, startRep);
                            
                            start.replaceFirst(start, String.valueOf(
                                    Character.toLowerCase(start.charAt(0))));
                      }
                           tokens[i] = end + start + "ay";
                           break;
                    }
                }
            }
        }
        toBeReturned = toString(tokens);
        return toBeReturned;

        
    }
    public static boolean beginsWithVowel(String tokens)
    {
        
            if(tokens.charAt(0) == 'a' 
                    || tokens.charAt(0) == 'e' 
                    || tokens.charAt(0) == 'i' 
                    || tokens.charAt(0) == 'o' 
                    || tokens.charAt(0) == 'u' 
                    || tokens.charAt(0) == 'A' 
                    || tokens.charAt(0) == 'E' 
                    || tokens.charAt(0) == 'I' 
                    || tokens.charAt(0) == 'O' 
                    || tokens.charAt(0) == 'U')
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    public static boolean containsVowel(String tokens)
    {
       for(int i = 0; i < tokens.length(); i++)
       {
            if(tokens.charAt(i) == 'a' 
                    || tokens.charAt(i) == 'e' 
                    || tokens.charAt(i) == 'i' 
                    || tokens.charAt(i) == 'o' 
                    || tokens.charAt(i) == 'u' 
                    || tokens.charAt(i) == 'A' 
                    || tokens.charAt(i) == 'E' 
                    || tokens.charAt(i) == 'I' 
                    || tokens.charAt(i) == 'O' 
                    || tokens.charAt(i) == 'U')
            {
                return true;
            }
            else if(i == tokens.length() - 1)
            {
                return false;
            }
        }
        return false;
    }
    public static String toString(String[] tokens)
    {
        String returned = "";
        
        for(int i = 0; i < tokens.length; i++)
        {
            
            returned = returned + tokens[i] + " ";
        }
        return returned;
    }
    
}
/*run:
This program translates from english to pig latin
Enter a phrase in engrish What a beast!
The translation of What a beast! is: Atwhay ayay eastbay 
Again? yeppers

This program translates from english to pig latin
Enter a phrase in engrish Svetty Loves Java
The translation of Svetty Loves Java is: Ettysvay Oveslay AvAjay 
Again? fo shizzle

This program translates from english to pig latin
Enter a phrase in engrish Jordan Giacone is a BAU5
The translation of Jordan Giacone is a BAU5 is: Ordanjay Iaconegay isyay
 ayay AU5bay
Again? no

BUILD SUCCESSFUL (total time: 58 seconds)
*/