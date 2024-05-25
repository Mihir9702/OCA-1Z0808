package academy.learnprogramming;

public class CompoundAssignmentOperators {
  
  public static void main(String[] args) {
    int x = 2;
    int z = 3;

    x = x * z; // simple assignment
    x *= z; // shorter form of x = x * z

    System.out.println("x= " + x); // x= 18

    // int a += 5; // DOES NOT COMPILE because a is not initialized
    // int b += z; // DOES NOT COMPILE because b is not initialized

    // without explicit casting
    long a = 10;
    int b = 4;
    // b = b * a; // DOES NOT COMPILE because b * a is promoted to long
    b = (int)(b * a); // explicit casting
    b *= a; // compound assignment operator

    System.out.println("b= " + b); // b= 40

    // exam questions
    long c = 4;
    long d = (c = 2); // c = 2 is an assignment expression that returns 2

    System.out.println("c= " + c + " d= " + d); // c= 2 d= 2

    long e = 3;
    long f = 2;
    long h = 1;

    long i = e + 3 * (f = 3) - (h -= 2);
    System.out.println("e= " + e + " f= " + f + " h= " + h + " i= " + i); // e= 3 f= 3 h= -1 i= 13
  }
}
