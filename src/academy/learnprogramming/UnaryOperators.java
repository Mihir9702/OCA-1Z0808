package academy.learnprogramming;

public class UnaryOperators {
  
  public static void main(String[] args) {
    int x = +3;

    System.out.println("x= " + x);

    double y = -x;

    System.out.println("x= " + x + " y= " + y);

    y = -y; // -1 * y

    System.out.println("x= " + x + " y= " + y);

    boolean a = true;
    boolean b = !a;

    System.out.println("a= " + a + " b= " + b);

    b = !b;

    System.out.println("a= " + a + " b= " + b);

    // increment and decrement have a higher order of precedence than + and -

    // int myInt = !5; // DOES NOT COMPILE
    // boolean myBoolean = -true; // DOES NOT COMPILE
    // boolean z = !0; // DOES NOT COMPILE

    int myInt = 5;
    int otherInt = ++myInt;
    System.out.println("myInt= " + myInt + " otherInt= " + otherInt); // myInt= 6 otherInt= 6

    int newInt = 5;
    int newOtherInt = newInt++;
    System.out.println("newInt= " + newInt + " newOtherInt= " + newOtherInt); // newInt= 6 newOtherInt= 5

    int count = 0;
    System.out.println(count); // 0
    System.out.println(++count); // 1
    System.out.println(count); // 1
    System.out.println(count--); // 1
    System.out.println(count); // 0

    // exam questions
    int e = 3;
    int f = ++e * 5 / e-- + --e;
    System.out.println("e= " + e + " f= " + f); // e= 2 f= 7

    int g = 6;
    int h = 2;
    int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
  }
}
