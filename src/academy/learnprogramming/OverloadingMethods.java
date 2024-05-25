package academy.learnprogramming;

public class OverloadingMethods {
  
  public void walk(int miles) {}

  public void walk(short feet) {}

  public boolean walk() {
    return false;
  }

  void walk(int miles, short feet) {}

  public void walk(float miles) {}

  // public int walk(float miles) {} // DOES NOT COMPILE

  // public static void walk(float miles) {} // DOES NOT COMPILE

  public void walk(int[] lengths) {}

  // public void walk(int... varargs) {} // DOES NOT COMPILE

  public static void main(String[] args) {
    run(9L);
    jump("test");
    jump(5);

    sum(1, 2);
  }

  public static void run(int length) {}

  public static void run(Integer length) {}

  public static void run(double km) {}

  public static void jump(String s) {
    System.out.println("string");
  }

  public static void jump(Object o) {
    System.out.println("object");
  }

  public static int sum(int a, int b) {
    System.out.println("int sum");
    return a + b;
  }

  public static long sum(long a, long b) {
    System.out.println("long sum");
    return a + b;
  }

  public static Integer sum(Integer a, Integer b) {
    System.out.println("Integer sum");
    return a + b;
  }

  public static int sum(int... numbers) {
    System.out.println("sum varargs");
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }

    return sum;
  }
}
