package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList {
  
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(2);
    numbers.add(4);
    numbers.add(6);

    for (int i = 0; i < numbers.size(); i++) {
      System.out.println("element at index " + i + " is " + numbers.get(i));
      // numbers.remove(2); // throws IndexOutOfBoundsException
    }

    for (Integer integer : numbers) {
      System.out.println("number=" + integer);
      // numbers.remove(2); // throws ConcurrentModificationException
    }

    for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
      Integer number = iterator.next();
      System.out.println(number); // 2, 4, 6
      iterator.remove();
    }

    System.out.println(numbers); // []

    numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

    for (ListIterator<Integer> listIterator = numbers.listIterator(3); listIterator.hasPrevious();) {
      System.out.println(listIterator.previous()); // 3, 2, 1
      listIterator.remove();
    }

    System.out.println(numbers); // [4, 5, 6]

    List<String> list = Arrays.asList(createArray());

    // for loop
    long startTime = System.currentTimeMillis();

    for (int i = 0; i < list.size(); i++) {
      String temp = list.get(i);
    }

    long endTime = System.currentTimeMillis();

    long duration = endTime - startTime;

    System.out.println("for loop duration=" + duration + " ms");

    // for each loop

    startTime = System.currentTimeMillis();

    for (String temp : list) {}

    endTime = System.currentTimeMillis();

    duration = endTime - startTime;

    System.out.println("for each loop duration=" + duration + " ms");

    // iterator

    startTime = System.currentTimeMillis();

    for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
      String temp = iterator.next();
    }

    endTime = System.currentTimeMillis();

    duration = endTime - startTime;

    System.out.println("iterator duration=" + duration + " ms");

    // listIterator

    startTime = System.currentTimeMillis();

    for (ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext();) {
      String temp = listIterator.next();
    }

    endTime = System.currentTimeMillis();

    duration = endTime - startTime;

    System.out.println("listIterator duration=" + duration + " ms");




    // numbers.removeIf(number -> number % 2 == 0);
  }

  private static String[] createArray() {
    String[] stringArray = new String[10_000_000];

    for (int i = 0; i < stringArray.length; i++) {
      stringArray[i] = "Array " + i;
    }

    return stringArray;
  }
}
