package academy.learnprogramming;

public class AssignmentOperators {
  
  public static void main(String[] args) {
    // int x = 1.0; // DOES NOT COMPILE
    // short y = 19812345; // DOES NOT COMPILE
    // int z = 9F; // DOES NOT COMPILE
    // long t = 1923012345678910; // DOES NOT COMPILE

    int x = (int)1.0; 
    short y = (short)19812345; 
    int z = (int)9F; 
    long t = 1923012345678910L;

    System.out.println("x= " + x); // x= 1
    System.out.println("y= " + y); // y= 20473
    System.out.println("z= " + z); // z= 9
    System.out.println("t= " + t); // t= 1923012345678910

    // overflow and underflow with byte (8 bits) (-128 to 127)
    byte myByte = 127;
    byte mySecondByte = -128;

    System.out.println("myByte= " + myByte); // myByte= 127
    System.out.println("mySecondByte= " + mySecondByte); // mySecondByte= -128

    // myByte + 1; // DOES NOT COMPILE
    myByte++; // -128

    // mySecondByte - 1; // DOES NOT COMPILE
    mySecondByte--; // 127

    System.out.println("myByte= " + myByte); // myByte= -128
    System.out.println("mySecondByte= " + mySecondByte); // mySecondByte= 127

    short a = 10;
    short b = 20;
    // short c = a * b; // DOES NOT COMPILE because a and b are promoted to int
    short c = (short)(a * b); // 200
    System.out.println("c= " + c); // c= 200
  }
}
