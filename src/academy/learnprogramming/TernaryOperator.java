package academy.learnprogramming;

public class TernaryOperator {
  
  public static void main(String[] args) {
    int x = 10;
    int y;

    if (x > 5) y = 2 * x;
    else y = 4 * x;

    System.out.println("y = " + y); // 20

    // ternary operator
    y = (x > 5) ? (2 * x) : (4 * x);

    System.out.println("y = " + y); // 20

    int a = 1;
    int b = 1;
    int c = a < 10 ? a++ : b++;

    System.out.println("a = " + a + ", b = " + b + ", c = " + c); // a = 2, b = 1, c = 1

    int d = 1;
    int e = 2;
    int f = 3;

    if (d < 10) f = d++ < 1 ? e++ : f++;
    else f = (d + e) < 2 ? d++ : e++;

    System.out.println("d = " + d + ", e = " + e + ", f = " + f); // d = 2, e = 2, f = 3
  }
}
