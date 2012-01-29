package Q2A16;

/**
 * 1/4/12
 * Assignment #16
 * @author Jordan Giacone
 * This tests the hierarchy between Person and its' subclasses
 */
public class inheritanceTester 
{
    static Person dKamen = new Person("Dean Kamen", 1492);
    static Student timChoh = new Student("Tim Choh", 999, "Being a nub");
    static Instructor svetty = new Instructor("Svetty", 191919, 9000.00000001);
    
    public static void main(String[] args)
    {
        System.out.println("Regular");
        dispNames();
        
        dKamen.setName("Dean \"I started FIRST\" Kamen");
        timChoh.setName(("Tim Choooooh"));
        svetty.setName("Svetlik");
        
        System.out.println("Change Names");
        dispNames();
        
        dKamen.setYob(000);
        timChoh.setYob(000);
        svetty.setYob(000);
        
        System.out.println("New YOB");
        dispNames();
        
        timChoh.setMajor("Biology");
        svetty.setSalary(10000000);
        
        System.out.println("Change Major/salary");
        
        dispNames();
    }
    
    public static void dispNames()
    {
        System.out.println(dKamen);
        System.out.println(timChoh);
        System.out.println(svetty+"\n");
    }
    
}
/*
Regular
This Person's name is Dean Kamen and their year of birth is 1492
This Person's name is Tim Choh and their year of birth is 999 and their major is Being a nub
This Person's name is Svetty and their year of birth is 191919 and their salary is $9000.00000001

Change Names
This Person's name is Dean "I started FIRST" Kamen and their year of birth is 1492
This Person's name is Tim Choooooh and their year of birth is 999 and their major is Being a nub
This Person's name is Svetlik and their year of birth is 191919 and their salary is $9000.00000001

New YOB
This Person's name is Dean "I started FIRST" Kamen and their year of birth is 0
This Person's name is Tim Choooooh and their year of birth is 0 and their major is Being a nub
This Person's name is Svetlik and their year of birth is 0 and their salary is $9000.00000001

Change Major/salary
This Person's name is Dean "I started FIRST" Kamen and their year of birth is 0
This Person's name is Tim Choooooh and their year of birth is 0 and their major is Biology
This Person's name is Svetlik and their year of birth is 0 and their salary is $1.0E7
*/
