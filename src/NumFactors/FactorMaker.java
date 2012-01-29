package NumFactors;

import java.util.ArrayList;

/**
 *
 * @author Jordan Giacone
 */
public class FactorMaker 
{
    private ArrayList<Integer> factors = new ArrayList<Integer>();
    private int num, div, notPrime, first, second, firstStrain;
    
    public FactorMaker(int newNum)
    {
        num = newNum;
        div = 0;
        for(int i  = num - 1; i > 0; i--)
        {
            if(num % i == 0)
            {
                first = i;
                second = num / i;
            }
        }
    }
    
    public boolean hasNextFactor()
    {
        for(int i = first; i > 0; i--)
        {
            if(first % i == 0)
            {
                if(isPrime(i))
                {
                    factors.add(i);
                }
                if(isPrime(first / i))
                {
                    factors.add(first / i);
                }
                else
                {
                    first /= i;
                }
                
                
            }
        }
        return true;
    }
    public int nextFactor(int num)
    {
        return num / div;
    }
    public boolean isPrime(int n)
    {
        for(int i = n - 1; i > 0; i--)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public int getNum()
    {
        return num;
    }
}
