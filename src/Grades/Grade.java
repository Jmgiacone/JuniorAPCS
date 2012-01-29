package Grades;

/**
 * 11/12/11
 * Assignment 17
 * This is the grade class
 * @author Jordan Giacone
 */
public class Grade 
{
    private String grade;
    private double numericGrade;
    
    /**
     * Constructs a grade based on the inputted String
     * @param newG The grade given
     */
    public Grade(String newG)
    {
        grade = newG;
    }
    
    /**
     * Calculates the numeric grade based on the String give in the 
     * constructor. If the grade is invalid, it returns -1
     * @return The numeric value of the String grade
     */
    public double getNumericGrade()
    {
        if(grade.length() == 1)
        {
            if(grade.equalsIgnoreCase("A"))
            {
                return 4;
            }
            else if(grade.equalsIgnoreCase("B"))
            {
                return 3;
            }
            else if (grade.equalsIgnoreCase("C"))
            {
                return 2;
            }
            else if(grade.equalsIgnoreCase("D"))
            {
                return 1;
            }
            else if(grade.equalsIgnoreCase("F"))
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
        else if(grade.length() == 2)
        {
            if(grade.substring(0, 1).equalsIgnoreCase("A"))
            {
                return 4;
            }
            else if(grade.substring(0, 1).equalsIgnoreCase("B"))
            {
                if(grade.substring(1).equalsIgnoreCase("+"))
                {
                    return 3.3;
                }
                else if(grade.substring(1).equalsIgnoreCase("-"))
                {
                    return 2.7;
                }
                else
                {
                    return -1;
                }
            }
            else if (grade.substring(0, 1).equalsIgnoreCase("C"))
            {
                if(grade.substring(1).equalsIgnoreCase("+"))
                {
                    return 2.3;
                }
                else if(grade.substring(1).equalsIgnoreCase("-"))
                {
                    return 1.7;
                }
                else
                {
                    return -1;
                }
            }
            else if(grade.substring(0, 1).equalsIgnoreCase("D"))
            {
                if(grade.substring(1).equalsIgnoreCase("+"))
                {
                    return 1.3;
                }
                else if(grade.substring(1).equalsIgnoreCase("-"))
                {
                    return .7;
                }
                else
                {
                    return -1;
                }
            }
            else if(grade.substring(0, 1).equalsIgnoreCase("F"))
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return -1;
        }
    }
    
    /**
     * 
     * @return A string representation of the instance variables
     */
    public String toString()
    {
        return "Numeric Value: "+getNumericGrade()+"";
    }
}
