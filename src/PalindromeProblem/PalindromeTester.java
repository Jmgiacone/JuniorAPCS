package PalindromeProblem;

import java.util.*;

/**
 * 9/6/11
 * Jordan Giacone
 * Problem 4
 * this does tests w/ palindromes
 */
public class PalindromeTester
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String palindrome, response = "DEFAULT RESPONSE, DOESN'T DO ANYTHING YET";
        
        while(!response.equalsIgnoreCase("NO"))
        {
            System.out.print("Please enter your best guess at a Palindrome: ");
            palindrome = reader.nextLine();

            if(isPalindrome(palindrome))
            {
                System.out.printf("\"%s\" is most definitely a Palindrome\n"
                        , palindrome);
            }
            else
            {
                System.out.printf("\"%s\" is most definitely NOT a Palindrome\n"
                        , palindrome);
            }
            
            System.out.print("Wanna go again sonny? ");
            response = reader.nextLine();
            System.out.println();
            
        }
    }
    static ArrayList<Character> removePunctuation(char[] p)
    {
        ArrayList<Character> arraySwitch = new ArrayList<Character>();
        for(int i = 0; i < p.length; i++)
        {
            p[i] = Character.toLowerCase(p[i]);
        }
        for(int i = 0; i < p.length; i++)
        {
            arraySwitch.add(p[i]);
        }
        for(int i = 0; i < arraySwitch.size(); i++)
        {
            if(arraySwitch.get(i) == '&' || arraySwitch.get(i) == ',' 
                    || arraySwitch.get(i) == '.' || arraySwitch.get(i)
                    == '\047' || arraySwitch.get(i) == '\u0020')
            {
                arraySwitch.remove(i);
                i--;
            }
        }
        return arraySwitch;
    }
    static boolean isPalindrome(String p)
    {
        int correct = 0;
        ArrayList <Character> originalP = new ArrayList<Character>(),
                testP = new ArrayList<Character>();
        originalP = removePunctuation(p.toCharArray());
        int j = 0;
        char rep;
        //This inverts the "strings"
        for(int i = originalP.size() - 1; i >= 0; i--)
        {
           rep = originalP.get(i);
           testP.add(rep);
           j++;
        }
        j = 0;
        correct = 0;
        for(int i = originalP.size() - 1; i >= 0; i--)
        {
           if(originalP.get(i) == testP.get(i))
           {
               correct++;
           }
           j++;
        }
        
        if(originalP.size() == 1)
        {
            return false;
        }
        if(correct == originalP.size())
        {
            return true;
        }
        return false;
    }
}
/*
Please enter your best guess at a Palindrome: Jordan Giacone iz a bau5
Jordan Giacone iz a bau5 is most definitely NOT a Palindrome
Wanna go again sonny? yes

Please enter your best guess at a Palindrome: Madam, i'm adam
Madam, i'm adam is most definitely a Palindrome
Wanna go again sonny? yepppp

Please enter your best guess at a Palindrome: I like java, but i like svetty too
I like java, but i like svetty too is most definitely NOT a Palindrome
Wanna go again sonny? no
*/
