package DataSetTesting;

/**
   This program tests the DataSet class. Now testing the implementation of the 
 * die class using Measurable
 * Assignment #13
 * 12/8/11
 * @author Jordan Giacone and Cay Horstmann
*/
public class DataSetTester
{
   public static void main(String[] args)
   {
      DataSet bankData = new DataSet();

      bankData.add(new BankAccount(0));
      bankData.add(new BankAccount(10000));
      bankData.add(new BankAccount(2000));

      System.out.println("Average balance: " + bankData.getAverage());
      System.out.println("Expected: 4000");
      Measurable max = bankData.getMaximum();
      System.out.println("Highest balance: " + max.getMeasure());
      System.out.println("Expected: 10000");

      DataSet coinData = new DataSet();

      coinData.add(new Coin(0.25, "quarter"));
      coinData.add(new Coin(0.1, "dime"));
      coinData.add(new Coin(0.05, "nickel"));

      System.out.println("Average coin value: " + coinData.getAverage());
      System.out.println("Expected: 0.133");            
      max = coinData.getMaximum();
      System.out.println("Highest coin value: " + max.getMeasure());
      System.out.println("Expected: 0.25");   
      
      DataSet dieData = new DataSet();
      
      dieData.add(new Die(6));
      dieData.add(new Die(16));
      dieData.add(new Die(127));
      dieData.add(new Die(342)); //A Rhombicosidodecahedron has 342 sides. 
      
      System.out.printf("Average Roll Values: %.2f\n(No expectation due to "
              + "pseudorandom reslults)\n", dieData.getAverage());
      max = dieData.getMaximum();
      System.out.printf("Highest die value: %.2f\n", max.getMeasure());
      
      DataSet quizData = new DataSet();
      
      quizData.add(new Quiz(88.5, "B+"));
      quizData.add(new Quiz(51.34, "E-"));
      quizData.add(new Quiz(99.99, "A+"));
      quizData.add(new Quiz(66.79, "C++"));//LOL Programming Joke
      
      System.out.printf("Average Grade: %.2f\nExpected: 76.66\n", 
              quizData.getAverage());
      max = quizData.getMaximum();
      
      String gradeLetter;
      if(max.getMeasure() >= 93)
      {
          gradeLetter = "A";
      }
      else if(max.getMeasure() >= 90)
      {
          gradeLetter = "A-";
      }
      else if(max.getMeasure() >= 87)
      {
          gradeLetter = "B+";
      }
      else if(max.getMeasure() >= 83)
      {
          gradeLetter = "B";
      }
      else if(max.getMeasure() >= 80)
      {
          gradeLetter = "B-";
      }
      else if(max.getMeasure() >= 77)
      {
          gradeLetter = "C+";
      }
      else if(max.getMeasure() >= 73)
      {
          gradeLetter = "C";
      }
      else if(max.getMeasure() >= 70)
      {
          gradeLetter = "C-";
      }
      else if(max.getMeasure() >= 67)
      {
          gradeLetter = "D+";
      }
      else if(max.getMeasure() >= 63)
      {
          gradeLetter = "D";
      }
      else if(max.getMeasure() >= 60)
      {
          gradeLetter = "D-";
      }
      else if(max.getMeasure() >= 0)
      {
          gradeLetter = "F";
      }
      else 
      {
          gradeLetter = "Incorrect Programming";
      }
      System.out.printf("Max Grade: %.2f(%s)\nExpected 99.99(A)", 
              max.getMeasure(), gradeLetter);
      
   }
}
/*
Average balance: 4000.0
Expected: 4000
Highest balance: 10000.0
Expected: 10000
Average coin value: 0.13333333333333333
Expected: 0.133
Highest coin value: 0.25
Expected: 0.25
Average Roll Values: 72.75
(No expectation due to pseudorandom reslults)
Highest die value: 63.00
Average Grade: 76.66
Expected: 76.66
Max Grade: 99.99(A)
*/