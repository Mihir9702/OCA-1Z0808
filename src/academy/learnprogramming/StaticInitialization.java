package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {
 
  private static final int SIZE;

  private static int one;

  private static final int two;

  private static final int three = 3;

  private static final List<String> NAMES = new ArrayList<>();

  static {
    System.out.println("first static init");
    int rows = 5;
    int cols = 4;
    SIZE = rows * cols;
  }

  static {
    System.out.println("second static init");
    one = 1;
    two = 2;
    one = three;
    one = 2;
    one = three;
  }

  static {
    System.out.println("third static init");
    NAMES.add("Jimmy");
    NAMES.add("Timmy");
  }

  public static void main(String[] args) {
    System.out.println(NAMES);
  }
}
