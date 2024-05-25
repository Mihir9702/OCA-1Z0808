package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class UsingWrappersInList {
  
  public static void main(String[] args) {
    // List<double> doubleList = new ArrayList<>(); // DOES NOT COMPILE
    List<Double> doubleList = new ArrayList<>();

    doubleList.add(10.5); // autoboxing
    doubleList.add(new Double(55.10));
    doubleList.remove(55.10); // autoboxing

    double first = doubleList.get(0); // unboxing to primitive

    System.out.println(doubleList); // [10.5]
    System.out.println(first); // 10.5

    List<Integer> numbers = new ArrayList<>();
    numbers.add(null);

    System.out.println(numbers); // [null]

    // int number = numbers.get(0); // NullPointerException

    List<Integer> nums = new ArrayList<>();
    nums.add(1); // [1]
    nums.add(2); // [1, 2]
    // nums.remove(1); // [1]
    nums.remove(new Integer(1)); // [2]

    System.out.println(nums); // [1]
  }
}
