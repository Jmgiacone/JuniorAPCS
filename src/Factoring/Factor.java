package Factoring;

import java.util.Scanner;
public class Factor
{
    public static void main(String[] args)
    {
        int a, b, c, newB, newA, start, end;
        String stop = "NOOOOOOPE, Just Chuck Testa";
        Scanner reader = new Scanner(System.in);
        boolean sol = false;
        
        
        while (!stop.equalsIgnoreCase("Yes"))
        {
            a = 0;
            b = 0;
            c = 0;
            newA = 0;
            newB = 0;
            start = 0;
            end = 0;
            
            System.out.println("Ax^2 + Bx + C");
            System.out.print("A: ");
            a = reader.nextInt();
            System.out.print("B: ");
            b = reader.nextInt();
            System.out.print("C: ");
            c = reader.nextInt();
        
            /*
             * find AC
             * find factors of AC that add to B
             * ab = AC and a + b = B
             * Ax^2 + ax + bx + C
             */
            if(c < 0)
            {
                start = a * c;
                end  = - (a * c);
            }
            else
            {
               end = a * c;
               start  = - (a * c); 
            }
            for(int j = start; j <= end; j++)
            {
                for(int k = start; k <= end; k++)
                {
                    if((j + k == b) && (j * k == a * c))
                    {
                        sol = true;
                        if(a != 1)
                        {
                            newA = j;
                            newB = k;

                            if(newA % a == 0 && newB % c == 0)
                            {
                                newA /= a;
                                newB /= c;
                            }
                            else if(newB % a == 0 && newA % c == 0)
                            {
                                //newA = newA / c;
                                newA /= c;
                                newB /= a;
                            }

                            if(newA == newB)
                            {
                                System.out.printf("%dx^2 + %dx + %d factors out "
                                        + "to be:\n(%dx + %d)(%dx + %d)\n", a, b, 
                                        c, a, c, newB, newA);
                                j = (a * c) + 1;
                                k = j;
                            }
                        }
                        else
                        {
                            if(j == k)
                            {
                                System.out.printf("%dx^2 + %dx + %d factors out to be:"
                                    + "\n(x + %d)^2\n", a, b, c, j);
                                j = (a * c) + 1;
                                k = j;
                            }
                            else
                            {
                                System.out.printf("%dx^2 + %dx + %d factors out to be:"
                                        + "\n(x + %d)(x + %d)\n", a, b, c, j, k);
                                j = (a * c) + 1;
                                k = j;
                            }

                            
                        }
                    }
                }
            }
            if(sol == false)
            {
                System.out.printf("%dx^2 + %dx + %d has no real solutions :("
                    + "\n", a, b, c);
            }
            
            System.out.print("Wanna Stop? ");
            reader.nextLine();
            stop = reader.nextLine();
          }
    }
}  