package academy.learnprogramming;

// 1. When two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
// 2. When one of the values is integral (byte, short, int, long) value and the other is floating-point (float, double) value, Java will automatically promote the integral value to the floating-point value's data type.
// 3. Small data types (byte, short, and char), are first promoted to int any time they're used with a Java binary arithmetic operator, even if neither of the operands is int.
// 4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands. (e.g int + float = float)

public class NumericPromotion {

  public static void main(String[] args) {
    // promotion is converting smaller data type into a larger data type
    int x = 5;
    double y = 10.55;

    System.out.println("x + y = " + (x + y)); // 15.55 // x is promoted to double

    byte b = 10;
    int c = 5;
    double d = 4.5;

    double result = b + c + d; // b is promoted to int, then result is promoted to double
    System.out.println("result= " + result); // 19.5

    // casting is converting larger data type into a smaller data type
    double myDouble = 5.55;
    int myInt = 4 + (int)myDouble; // myDouble is casted to int
    System.out.println("myInt= " + myInt); // 9

    int anotherInt = 125;
    byte myByte = 15; // byte can only hold up to 127

    int intResult = anotherInt + myByte; // myByte is promoted to int
    byte byteResult = (byte)(anotherInt + myByte); // anotherInt + myByte is casted to byte
    System.out.println("intResult= " + intResult); // 140
    System.out.println("byteResult= " + byteResult); // -116
  }
}
