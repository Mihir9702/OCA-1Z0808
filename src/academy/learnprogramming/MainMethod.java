package academy.learnprogramming;

public class MainMethod {
 
  /**
   * 
   * @param args command line arguments
   * "args": ["Oracle", "Java", "Certification"]
   */
  public static void main(String[] args) {
    // printing size of arguments
    System.out.println("args-size " + args.length);

    /* 
     * printing arguments
     * args[0] = 1st argument
     */
    for (int i = 0; i < args.length; i++) {
      System.out.println("args[" + i + "] = " + args[i]);
    }

    int mySum = sum(2, 3);
  }

  /**
   * Calculates sum of two integers
   * @param a operand
   * @param b operand
   * @return sum of a and b
   */
  public static int sum(int a, int b) {
    return a + b;
  }
}
