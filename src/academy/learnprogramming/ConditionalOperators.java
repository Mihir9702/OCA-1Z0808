package academy.learnprogramming;

public class ConditionalOperators {
  
  public static void main(String[] args) {
    boolean a = true;
    boolean b = false;
    boolean c = true;
    boolean d = a && b; // false
    boolean e = a || b; // true

    System.out.println("d= " + d);
    System.out.println("e= " + e);

    int f = 4;
    boolean g = false && (f++ < 4); // short-circuiting (f++ < 4) is not evaluated because the first operand is false
    boolean h = (f-- == 4) && !g; // !g is not evaluated because the first operand is false

    System.out.println("f= " + f); // 3
    System.out.println("g= " + g); // false
    System.out.println("h= " + h); // true

    int myInt = 3;
    int anotherInt = 4;
    boolean myBoolean = (myInt <= 3) && (anotherInt-- == 4) || (myInt++ == 4);

    System.out.println("myInt= " + myInt); // 3
    System.out.println("anotherInt= " + anotherInt); // 3
    System.out.println("myBoolean= " + myBoolean); // true

    boolean x = true, z = true;
    int y = 20;
    x = (y != 10) ^ (z = false); // ^ is the XOR operator

    System.out.println(x + ", " + y + ", " + z); 

    // ternary operator
    int t = 5;
    System.out.println(t > 2 ? t < 4 ? 10 : 8 : 7);

    if (t > 2) {
      if (t < 4) {
        System.out.println(10);
      } else {
        System.out.println(8);
      }
    } else {
      System.out.println(7);
    }

  }
}
