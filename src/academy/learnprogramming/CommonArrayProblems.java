package academy.learnprogramming;

public class CommonArrayProblems {
  
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("numbers[i] = " + numbers[i]);
    }

    for (int i = 1; i <= numbers.length; i++) {
      System.out.println(i + " - " + numbers[i]);
    }

    // int[20] nums; // DOES NOT COMPILE

    int[] nums = new int[20]; // array of size 20 with default values of 0

    // int size = numbers.length(); // DOES NOT COMPILE
    int size = numbers.length; // 5

    // numbers.length = 10; // DOES NOT COMPILE - length is final
  }
}
