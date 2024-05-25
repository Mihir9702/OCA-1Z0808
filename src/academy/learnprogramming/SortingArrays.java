package academy.learnprogramming;

import java.util.Arrays;

public class SortingArrays {
  
  public static void main(String[] args) {
    int[] numbers = {5, 10, 2};

    Arrays.sort(numbers);

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("numbers[" + i + "] = " + numbers[i]);
    }

    System.out.println(Arrays.toString(numbers)); // [2, 5, 10]

    String[] strings = {"50", "9", "500"};
    Arrays.sort(strings);

    System.out.println(Arrays.toString(strings)); // [50, 500, 9]
  }
}
