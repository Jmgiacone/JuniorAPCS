/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2A16;

/**
 * 1/4/12
 * Assignment #16
 * @author Jordan Giacone
 * This is the Student class that inherits from Person
 */
public class Student extends Person
{
    private String major;
    
    /**
     * Constructs a student with a name, yob and major
     * @param newName Name of the student
     * @param newYob Year of birth
     * @param newMajor Major of the student
     */
    public Student(String newName, int newYob, String newMajor)
    {
        super(newName, newYob);
        
        major = newMajor;
    }
    
    /**
     * Returns the major of the student
     * @return the major of the student
     */
    public String getMajor()
    {
        return major;
    }
    
    /**
     * Changes the major of the student
     * @param m The new Major
     */
    public void setMajor(String m)
    {
        major = m;
    }
    
    /**
     * Returns a string representation of the instance variables
     * @return a string representation of the instance variables
     */
    public String toString()
    {
        return super.toString() + " and their major is "+major;
    }
}
