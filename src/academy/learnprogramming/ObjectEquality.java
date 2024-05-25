package academy.learnprogramming;

public class ObjectEquality {
  
  public static void main(String[] args) {
    // comparing objects
    Integer myInteger = 127;
    Integer myAnotherInteger = 127;

    System.out.println("myInteger == myAnotherInteger: " + (myInteger == myAnotherInteger)); // true

    System.out.println("128 == 128: " + (128 == 128)); // true

    System.out.println("myInteger hash= " + System.identityHashCode(myInteger)); // myInteger hash= 366712642
    System.out.println("myAnotherInteger hash= " + System.identityHashCode(myAnotherInteger)); // myAnotherInteger hash= 366712642

    myInteger = 128;
    myAnotherInteger = 128;

    System.out.println("myInteger hash= " + System.identityHashCode(myInteger)); // myInteger hash= 1829164700
    System.out.println("myAnotherInteger hash= " + System.identityHashCode(myAnotherInteger)); // myAnotherInteger hash= 2018699554

    System.out.println("myInteger == myAnotherInteger: " + (myInteger == myAnotherInteger)); // false

    Integer int1 = new Integer(1);
    Integer int2 = new Integer(1);
    Integer int3 = 1;

    System.out.println("int1 == int2: " + (int1 == int2)); // false
    System.out.println("int1 == int3: " + (int1 == int3)); // false
    System.out.println("int2 == int3: " + (int2 == int3)); // false

    System.out.println("int1.equals(int2): " + int1.equals(int2)); // true
    System.out.println("int1.equals(int3): " + int1.equals(int3)); // true
    System.out.println("int2.equals(int3): " + int2.equals(int3)); // true

    System.out.println("int1 hash= " + System.identityHashCode(int1)); // int1 hash= 366712642
    System.out.println("int2 hash= " + System.identityHashCode(int2)); // int2 hash= 1829164700
    System.out.println("int3 hash= " + System.identityHashCode(int3)); // int3 hash= 2018699554
  }
}
