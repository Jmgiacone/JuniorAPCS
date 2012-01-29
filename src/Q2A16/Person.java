/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2A16;

/**
 * 1/4/12
 * Assignment #16
 * @author Jordan Giacone
 * This is the parent class Person
 */
public class Person 
{
    private String name;
    private int yob;
    
    /**
     * Constructs a person w/ a name and yob
     * @param newName Name of the guy
     * @param newYob Year of birth
     */
    public Person(String newName, int newYob)
    {
        name = newName;
        yob = newYob;
    }
    
    /**
     * Returns the name
     * @return name of the person
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Returns the year of birth
     * @return The year of birth
     */
    public int getYob()
    {
        return yob;
    }
    
    /**
     * Changes the name of the person
     * @param n The new name of the person
     */
    public void setName(String n)
    {
        name = n;
    }
    
    /**
     * changes the yob
     * @param y The new Year of Birth
     */
    public void setYob(int y)
    {
        yob = y;
    }
    
    /**
     * Returns a string representation of the instance variables
     * @return a string representation of the instance variables
     */
    public String toString()
    {
        return "This Person's name is "+name+" and their year of "
                + "birth is "+yob;
    }
}
