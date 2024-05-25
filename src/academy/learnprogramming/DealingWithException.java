package academy.learnprogramming;

public class DealingWithException {
  
  public static void main(String[] args) {
    int a = 10;
    int b = 0;

    // divide(a, b); // Exception in thread "main" java.lang.ArithmeticException: / by zero

    try {
      int result = divide(a, b);
      System.out.println("result = " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error dividing message: " + e.getMessage());
    }
  }

  public static int divide(int a, int b) {
    return a / b;
  }
}
