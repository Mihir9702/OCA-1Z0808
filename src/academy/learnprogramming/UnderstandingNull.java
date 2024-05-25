package academy.learnprogramming;

public class UnderstandingNull {
 
  static Object myObject = new Object();
  static Object myOtherObject; // null by default

  static String myString;

  public static void main(String[] args) {
    Object myLocalObject = new Object();
    Object anotherLocalObject;

    String name = "Java";
    String anotherName = null;

    System.out.println("myObject= " + myObject);
    System.out.println("myOtherObject= " + myOtherObject);

    System.out.println("myLocalObject= " + myLocalObject);
    // System.out.println("anotherLocalObject= " + anotherLocalObject); // DOES NOT COMPILE

    System.out.println("name= " + name);
    System.out.println("anotherName= " + anotherName);

    myString = "Java";

    System.out.println("myString= " + myString); // null
    myString.toLowerCase(); // NullPointerException

    System.out.println("myString= " + myString);
  }
}
