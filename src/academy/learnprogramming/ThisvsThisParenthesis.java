package academy.learnprogramming;

class Person {
  private String firstName;
  private String lastName;

  public Person() {
    this("Eric", "Johnson"); // calls Person(String, String) constructor
  }

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }
}

public class ThisvsThisParenthesis {
  
  public static void main(String[] args) {
    Person person = new Person();
    System.out.println(person.getFullName()); // Eric Johnson
  }
}
