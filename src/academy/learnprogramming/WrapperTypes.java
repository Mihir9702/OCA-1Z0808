package academy.learnprogramming;

public class WrapperTypes {
  // wrappers are immutable
  // wrappers are objects
  public static void main(String[] args) {
    int myInt = 10; // primitive type
    Integer myInteger = new Integer(10); // wrapper class (boxing)
    Integer myInteger2 = 20; // autoboxing
    Integer myInteger3 = Integer.valueOf(10); // valueOf() method
    Integer myInteger4 = Integer.parseInt("3"); // parseInt() method
    // int myInt2 = null; // null pointer exception 
    Integer myInteger5 = null; // null is a valid value for wrapper types

    System.out.println("myInteger= " + myInteger);
    System.out.println("myInteger2= " + myInteger2);
    System.out.println("myInteger3= " + myInteger3);
    System.out.println("myInteger4= " + myInteger4);
    System.out.println("myInteger5= " + myInteger5);

    // converting wrapper to primitive
    int myInt3 = myInteger3; // unboxing
    int myInt4 = myInteger3.intValue(); // intValue() method
    // int myInt5 = myInteger5; // null pointer exception // primitives cannot be null

    // boxing -> converting primitive to wrapper
    Integer myInteger6 = new Integer(myInt); // constructor
    Integer myInteger7 = myInt; // autoboxing

    printSum(1, 5); // autoboxing of 1 and 5 to Integer
    printSum(myInteger, myInteger2); // no autoboxing
  }

  private static void printSum(Integer a, Integer b) {
    // int sum = a + b; // unboxing
    int sum = a.intValue() + b.intValue(); // intValue() method
    System.out.println("sum= " + sum);
  }
}
