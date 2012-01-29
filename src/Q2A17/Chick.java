/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2A17;

import java.util.Random;

/**
 *
 * @author Jordan
 */
public class Chick implements Animal
{
    private String mySound, myType, mySound2;
    
    /**
     * Constructs a Chick object which has a type, and 2 sounds
     * @param type Type of animal
     * @param sound First sound
     * @param sound2 2nd sound
     */
    public Chick(String type, String sound, String sound2)
    {
        mySound = sound;
        myType = type;
        mySound2 = sound2;
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
        Random r = new Random();
        
        if(r.nextInt(2) + 1 == 1)
        {
            return mySound;
        }
        else
        {
            return mySound2;
        }
    }
    
}
