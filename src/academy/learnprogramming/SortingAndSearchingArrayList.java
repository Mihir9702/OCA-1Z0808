package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingAndSearchingArrayList {
  
  public static void main(String[] args) {
    // Sorting
    System.out.println("Sorting");
    List<String> numsList = new ArrayList<>();
    numsList.add("500");
    numsList.add("10");
    numsList.add("9");
    numsList.add("50");
    numsList.add("40");

    System.out.println(numsList); // [500, 10, 9, 50, 40]

    Collections.sort(numsList);

    System.out.println(numsList); // [10, 40, 50, 500, 9]

    List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
    System.out.println(numbers); // [5, 4, 8, 10, 11, 7, 3]

    Collections.sort(numbers);
    System.out.println(numbers); // [3, 4, 5, 7, 8, 10, 11]

    System.out.println(" ");
    System.out.println("Searching");
    // Searching
    List<String> numsList2 = new ArrayList<>();
    numsList2.add("500");
    numsList2.add("10");
    numsList2.add("9");
    numsList2.add("50");
    numsList2.add("40");

    System.out.println(numsList2); // [500, 10, 9, 50, 40]

    int index = Collections.binarySearch(numsList2, "10");
    System.out.println(index); // -1

    Collections.sort(numsList2);
    System.out.println(numsList2); // [10, 40, 50, 500, 9]

    index = Collections.binarySearch(numsList2, "10");
    System.out.println(index); // 0

    index = Collections.binarySearch(numbers, 7);
    System.out.println(index); // 3

    Collections.sort(numbers);
    System.out.println(numbers); // [3, 4, 5, 7, 8, 10, 11]

    index = Collections.binarySearch(numbers, 7);
    System.out.println(index); // 3
  }
}
