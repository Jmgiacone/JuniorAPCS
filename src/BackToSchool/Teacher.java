package BackToSchool;

/**
 * Jordan Giacone
 * 10/13/11
 * BackToSchool
 * This is the teacher class
 */
public class Teacher extends Person
{
    protected String mySubject;
    protected double mySalary; 
    
    /**
     * Constructs a Teacher which inherits from Person
     * @param name Their name
     * @param age Their age
     * @param gender Their gender
     * @param subject The subject they teach
     * @param salary How much money the make
     */
    public Teacher(String name, int age, String gender, 
            String subject, double salary)
    {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }
    
    /**
     * Sets the salary to the given parameter
     * @param salary The salary to be had
     */
    public void setSalary(double salary)
    {
        mySalary = salary;
    }
    
    /**
     * Returns the salary of the Teacher
     * @return Their salary
     */
    public double getSalary()
    {
        return mySalary;
    }
    
    /**
     * Returns the subject that the teacher teaches 
     * @return Their subject
     */
    public String getSubject()
    {
        return mySubject;
    }
    
    /**
     * Changes the subject of the teacher to the parameter
     * @param subject The new subject
     */
    public void setSubject(String subject)
    {
        mySubject = subject;
    }
    
    /**
   * Returns a String representation of the instance variables in the Teacher
   * class
   * @return a String representation of the instance variables in the Teacher
   * class
   */
    public String toString()
    {
        String str = super.toString();
        str += ", Subject:" +mySubject+ ", Salary:$" +mySalary+ "";
        return str;
    }
}
