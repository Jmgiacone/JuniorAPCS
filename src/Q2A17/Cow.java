/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2A17;

/**
 *
 * @author Jordan
 */
public class Cow implements Animal
{
    private String mySound, myType;
    
    /**
     * Constructs a cow of type animal
     * @param type Type of animal
     * @param sound Sound it makes
     */
    public Cow(String type, String sound)
    {
        mySound = sound;
        myType = type;
    }
    
    /**
     * Returns the type of animal this one is
     * @return The type
     */
    public String getType()
    {
        return myType;
    }
    
    /**
     * Returns the sound the animal makes
     * @return Their sound
     */
    public String getSound()
    {
        return mySound;
    }
    
}
