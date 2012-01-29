/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2A16;

/**
 * 1/4/12
 * Assignment #16
 * @author Jordan Giacone
 * This class inherits from Person as well
 */
public class Instructor extends Person
{
    private double salary;
    
    /**
     * Constructs an Instructor with a name, yob, and salary
     * @param newName The name of the person
     * @param newYob The Year of Birth of the person
     * @param newSalary The salary of the Instructor
     */
    public Instructor(String newName, int newYob, double newSalary)
    {
        super(newName, newYob);
        salary = newSalary;
    }
    
    /**
     * Returns salary
     * @return The salary
     */
    public double getSalary()
    {
        return salary;
    }
    
    /**
     * Changes the salary
     * @param s The new salary of the Instructor
     */
    public void setSalary(double s)
    {
        salary = s;
    }
    
    /**
     * Returns a string representation of the instance variables
     * @return a string representation of the instance variables
     */
    public String toString()
    {
        return super.toString() + " and their salary is $"+salary;
    }
}
