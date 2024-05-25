package academy.learnprogramming;

import java.util.Arrays;

public class SearchingArrays {
  
  public static void main(String[] args) {
    
    int[] numbers = {1, 3, 5, 6, 7};

    System.out.println(Arrays.binarySearch(numbers, 2)); // -2
    System.out.println(Arrays.binarySearch(numbers, 5)); // 2
    System.out.println(Arrays.binarySearch(numbers, 7)); // 4
    System.out.println(Arrays.binarySearch(numbers, 1)); // 0
    System.out.println(Arrays.binarySearch(numbers, 3)); // 1
    System.out.println(Arrays.binarySearch(numbers, 6)); // 3
    System.out.println(Arrays.binarySearch(numbers, 4)); // -3

    int[] notSorted = {5, 4, 10, 8, 6};
    Arrays.sort(notSorted);

    System.out.println(Arrays.toString(notSorted)); // [4, 5, 6, 8, 10]
    System.out.println(Arrays.binarySearch(notSorted, 5)); // notSorted: 0 // sorted: 1
    System.out.println(Arrays.binarySearch(notSorted, 8)); // notSorted: -3 // sorted: 3
  }
}
