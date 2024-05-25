package academy.learnprogramming;

import java.util.Arrays;

public class VariableArguments {
  

  // public static void main(String[] args) {
  //   System.out.println(args.length); // 0
  //   System.out.println(Arrays.toString(args)); // []
  // }

  public static void main(String... args) {
    System.out.println(args.length); // 0
    System.out.println(Arrays.toString(args)); // []

    print(args);
    print("Java"); // [Java]
    print("this", "is", "my", "string", "array"); // [this, is, my, string, array]
    print("variable", "arguments", "are", "cool"); // [variable, arguments, are, cool]
  }

  private static void print(String... myArguments) {
    System.out.println(Arrays.toString(myArguments)); // [Java, 8, is, cool]
  }
}
