/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2A17;

/**
 *
 * @author Jordan
 */
public class NamedCow extends Cow
{
    private String myName;
    
    /**
     * Constructs a NamedCow which is a cow extension
     * @param type Type of animal
     * @param name Name of animal
     * @param sound Sound it makes
     */
    public NamedCow(String type, String name, String sound)
    {
        super(type, sound);
        myName = name;
    }
    
    /**
     * Returns the name of the cow
     * @return The name of the cow
     */
    public String getName()
    {
        return myName;
    }
}
