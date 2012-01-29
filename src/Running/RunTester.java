package Running;

import java.util.ArrayList;
import java.util.Random;

/**
 * 11/22/11
 * Assignment #8
 * This does the run assignment
 * @author Jordan Giacone
 */
public class RunTester 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> x = new ArrayList<Integer>();
        Random r = new Random();
        int[] list = new int[22];
        boolean inRun = false;
        int count = 1;
        
        while (count < list.length - 1)
        {
            list[count] = r.nextInt(6) + 1;
            count++;
        }
        
        list[0] = -999;
        list[list.length - 1] = -999;
        //Pseudocode translated into real code
        for(int i = 1; i < list.length - 1; i++)
        {
            if(inRun)
            {
                if(list[i] != list[i - 1])
                {
                    System.out.printf(")");
                    inRun = false;
                }
            }
            else
            {
                if(list[i] == list[i + 1])
                {
                    System.out.printf("(");
                    inRun = true;
                }
            }
            if(i == list.length - 2 && !inRun)
            {
                System.out.printf("%d\n", list[i]);
            }
            else
            {
                System.out.printf("%d", list[i]);
            }
            
        }
        if(inRun)
        {
            System.out.printf(")\n");
        }
    }
}
/*
 Run
 12456(22)161(33)43241(666)
 
 4315(11)54(33)1642365(22)6
  
 3142515161634(33)25262 
 */