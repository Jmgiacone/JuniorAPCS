package BackToSchool;

/**
 * Jordan Giacone
 * 10/13/11
 * BackToSchool
 * This is the CollegeStudent class, inheriting from Student from Person
 */
public class CollegeStudent extends Student
{
    protected String myMajor;
    protected int myYear;
    
    /**
     * Constructs a collegeStudent with name, age, gender, idNumber, gpa, year
     * and major
     * @param name Their name
     * @param age Their age
     * @param gender Their gender
     * @param idNum Their Personal ID number
     * @param gpa Their gpa
     * @param year Their year in school
     * @param major Their major
     */
    public CollegeStudent(String name, int age, String gender
            , String idNum,double gpa,int year,String major)
    {
        super(name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    }
    
    /**
     * Returns the year that the CollegeStudent is in
     * @return The year
     */
    public int getYear()
    {
        return myYear;
    }
    
    /**
     * 
     * @param year 
     */
    public void setYear(int year)
    {
        myYear = year;
    }
    
    /**
     * Returns the major of the college student
     * @return Their major
     */
    public String getMajor()
    {
        return myMajor;
    }
    
    /**
     * Changes the major of the college student to the parameter
     * @param major The new major
     */
    public void setMajor(String major)
    {
        myMajor = major;
    }
    
    /**
    * Returns a String representation of the instance variables in the Student
    * class
    * @return a String representation of the instance variables in the Student
    * class
    */ 
    public String toString()
    {
        String str = super.toString();
        str += ", Year:" +myYear+ ", Major:" +myMajor+ "";
        return str;
    }
}
