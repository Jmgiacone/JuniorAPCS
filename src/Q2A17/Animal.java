package Q2A17;

/**
 * 1/10/12
 * This is the interface Animal of which all other classes implement
 * @author Jordan Giacone
 */
public interface Animal 
{
    /**
     * Returns the sound that the given animal makes
     * @return Their sound
     */
    public String getSound();
    
    /**
     * Returns the type of animal the given instance is
     * @return The type
     */
    public String getType();
}
