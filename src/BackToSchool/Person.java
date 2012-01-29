package BackToSchool;

/**
 * Jordan Giacone
 * 10/13/11
 * BackToSchool
 * This is the Person class which defines an actual person
 */
public class Person
{
  protected String myName ;   // name of the person
  protected int myAge;        // person's age
  protected String myGender;  // "M" for male, "F" for female

  // constructor
  /**
   * Constructs a basic person with name, age, and gender
   * @param name Their name
   * @param age Their age
   * @param gender Their gender
   */
  public Person(String name, int age, String gender)
  {
    myName = name; myAge = age ; myGender = gender; 
  }

  /**
   * Returns a String representation of the instance variables of this class
   * @return a String representation of the instance variables of this class
   */
  public String toString()
  {
    return myName + ", age:" + myAge + ", gender:" +myGender;
  }
  
  /**
   * Returns the name of the person
   * @return Their name
   */
  public String getName()
  {
      return myName;
  }
  
  /**
   * Changes the name of the person
   * @param name The name to change to
   */
  public void setName(String name)
  {
      myName = name;
  }
  
  /**
   * Returns the age of the person
   * @return Their age
   */
  public int getAge()
  {
      return myAge;
  }
  
  /**
   * Sets the age to the parameter age
   * @param age The age to be set to
   */
  public void setAge(int age)
  {
      myAge = age;
  }
  
  /**
   * Returns the gender of the person
   * @return Their gender
   */
  public String getGender()
  {
      return myGender;
  }
  
  /**
   * Changes the gender of the person
   * @param gender The gender to be changed to
   */
  public void setGender(String gender)
  {
      myGender = gender;
  }
}

