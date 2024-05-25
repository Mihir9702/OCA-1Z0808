package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {
  
  public static void main(String[] args) {
    List<String> names = new ArrayList();
    names.add("Tony");
    names.add("Jimmy");
    names.add("Anthony");

    Object[] namesArray = names.toArray();
    System.out.println(namesArray.length); // 3

    String[] stringArray = names.toArray(new String[0]);

    String[] anotherStringArray = names.toArray(new String[names.size()]);

    String[] petsArray = {"dog", "cat", "parrot"};
    List<String> petsList = Arrays.asList(petsArray); // returns fixed size list
    // List<String> petsList = Arrays.asList("dog", "cat", "parrot"); // returns fixed size list
    System.out.println(petsList.size()); // 3

    petsList.set(0, "bird");
    System.out.println(petsList); // [bird, cat, parrot]
    System.out.println(Arrays.toString(petsArray)); // [bird, cat, parrot]

    petsArray[0] = "husky";
    System.out.println(petsList); // [husky, cat, parrot]
    System.out.println(Arrays.toString(petsArray)); // [husky, cat, parrot]

    // petsList.add("newDog"); // throws UnsupportedOperationException
    // petsList.remove(1); // throws UnsupportedOperationException

    List<String> list = Arrays.asList("one", "two", "three"); // returns fixed size list
    System.out.println(list); // [one, two, three]
    // list.add("four"); // throws UnsupportedOperationException
  }
}
