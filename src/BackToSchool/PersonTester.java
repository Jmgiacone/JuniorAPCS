package BackToSchool;

/**
 * Jordan Giacone
 * 10/13/11
 * BackToSchool
 * This is the tester for all of my inheritance
 */
public class PersonTester 
{
    public static void main(String[] args)
    {
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        Student lynne = new Student("Lynne Brooke", 16, "F",
                "HS95129", 3.5);
        System.out.println(lynne);

        Teacher mrJava = new Teacher("Duke Java", 34, "M",
                "Computer Science",
                50000);
        System.out.println(mrJava);

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18,
                "F", "UCB123",
                                         4.0, 1, "English");
        System.out.println(ima);

    }
}
/*
Coach Bob, age:27, gender:M
Lynne Brooke, age:16, gender:F, Student Id:HS95129, GPA:3.5
Duke Java, age:34, gender:M, Subject:Computer Science, Salary:$50000.0
Ima Frosh, age:18, gender:F, Student Id:UCB123,
 GPA:4.0, Year:1, Major:English
*/