package academy.learnprogramming;

public class CatchWithReturn {
  
  public static void main(String[] args) {
    System.out.println(calc());
  }

  public static int calc() {
    try {
      return 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Error");
      System.exit(0); // this will prevent the finally block from executing
      return 1;
    } finally { // finally always executes unless System.exit(0) is called
      System.out.println("Finally");
      // return 0;
    }
  }
}
