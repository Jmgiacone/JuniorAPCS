package Primes;

/**
 * 11/2/11
 * @author Jordan Giacone
 * This is the PrimeGenerator class. It generates every prime factor of a 
 * given number
 */
public class PrimeGenerator 
{
    private int num;
    
    /**
     * Basic constructor
     * @param n The number from which to get the prime numbers
     */
    public PrimeGenerator(int n)
    {
        num = n;
    }
    
    /**
     * 
     * @param n The number to be tested for prime-ness
     * @return If the number is or isn't prime
     */
    public boolean isPrime(int n)
    {
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    /**
     * 
     * @return A string representation of all the prime factors of a number
     */
    public String toString()
    {
        String s = "";
        
        for(int i = 2; i < num; i++)
        {
            if(isPrime(i))
            {
                s += "\n " + i;
            }
        }
        
        if(s.equalsIgnoreCase(""))
        {
            return "There are no primes for this number";
        }
        else
        {
            return "The primes for " +num+ " are..." + s;
        }
    }
}
