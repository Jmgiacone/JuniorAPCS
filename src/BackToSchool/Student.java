package BackToSchool;

/**
 * Jordan Giacone
 * 10/13/11
 * BackToSchool
 * This is the student class inheriting from Person
 */
public class Student extends Person
{
  protected String myIdNum;    // Student Id Number
  protected double myGPA;      // grade point average

  /**
   * Constructs a Student that inherits from Person
   * @param name Their name
   * @param age Their age
   * @param gender Their gender
   * @param idNum Their idNumber
   * @param gpa Their Grade Point Average
   */
  // constructor
  public Student(String name, int age, String gender,
                 String idNum, double gpa)
  {
    // use the super class' constructor
    super(name, age, gender);

    // initialize what's new to Student
    myIdNum = idNum;
    myGPA = gpa;
  }
  
  /**
   * Returns the id number of the student
   * @return Their id number
   */
  public String getIdNum()
  {
      return myIdNum;
  }
  
  /**
   * Changes the id of the student
   * @param idNum The idNum to be changed to
   */
  public void setIdNum(String idNum)
  {
      myIdNum = idNum;
  }
  
  /**
   * returns the gpa of the student
   * @return Their gpa
   */
  public double getGpa()
  {
      return myGPA;
  }
  
  /**
   * Changes their gpa to the parameter
   * @param gpa The gpa to be changed to
   */
  public void setGpa(double gpa)
  {
      myGPA = gpa;
  }
  
  /**
   * Returns a String representation of the instance variables in the Student
   * class
   * @return a String representation of the instance variables in the Student
   * class
   */
  public String toString()
  {

      return super.toString() + ", Student Id:" +myIdNum+ ", " +
              "GPA:" +myGPA+ "";
  }
}