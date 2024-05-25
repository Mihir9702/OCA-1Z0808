package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods {
  
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add("dog");
    list.add(5);

    System.out.println(list); // [dog, 5]

    List<String> pets = new ArrayList<>();
    pets.add("dog");
    System.out.println(pets); // [dog]

    pets.add(0, "cat");
    System.out.println(pets); // [cat, dog]

    // pets.add(5) // DOES NOT COMPILE

    pets.add(1, "parrot");
    System.out.println(pets); // [cat, parrot, dog]

    pets.add(0, "husky");
    System.out.println(pets); // [husky, cat, parrot, dog]

    pets.add(1, "bird");
    System.out.println(pets); // [husky, bird, cat, parrot, dog]

    pets.remove("parrot");
    System.out.println(pets); // [husky, bird, cat, dog]

    pets.remove(2);
    System.out.println(pets); // [husky, bird, dog]

    pets.set(0, "newBird");
    System.out.println(pets); // [newBird, bird, dog]

    // pets.set(6, "myDog"); // throws IndexOutOfBoundsException: Index: 6, Size: 3

    List<String> newPets = new ArrayList<>();

    System.out.println(newPets.isEmpty()); // true
    System.out.println(newPets.size()); // 0

    if (newPets.isEmpty()) System.out.println("no newPets");
    if (newPets.size() == 0) System.out.println("no newPets");
    
    newPets.add("cat");

    System.out.println(newPets.isEmpty()); // false
    System.out.println(newPets.size()); // 1

    newPets.clear();

    System.out.println(newPets.isEmpty()); // true
    System.out.println(newPets.size()); // 0

    newPets.add("dog");

    System.out.println(newPets.contains("cat")); // false
    System.out.println(newPets.contains("dog")); // true

    List<String> newPets2 = new ArrayList<>();
    newPets2.add("dog");

    System.out.println(newPets.equals(newPets2)); // true

    newPets2.add("cat");

    System.out.println(newPets.equals(newPets2)); // false

    newPets.add("cat");

    System.out.println(newPets); // [dog, cat]
    System.out.println(newPets2); // [dog, cat]
    System.out.println(newPets.equals(newPets2)); // true

    // .equals() method must contain same size, elements, and order
  }
}
