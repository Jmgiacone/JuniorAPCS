package Q2A17;

public class Farm
{
    private Animal[] a = new Animal[3];
    
    /**
     * Constructs a farm full of animals
     */
    public Farm()
    {
        a[0] = new NamedCow("cow","elsie", "moo");
        a[1] = new Chick("chick","cluck", "cheet");
        a[2] = new Pig("pig","oink");
    }
    
    /**
     * Displays the sounds that the animals make
     */
    public void animalSounds()
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i].getType() + " goes " + a[i].getSound());
        }
        System.out.println("The cow is known as " +
            ((NamedCow)a[0]).getName());
    }
}