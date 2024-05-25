package academy.learnprogramming;

import java.util.Arrays;

public class UsingArrays {
  
  public static void main(String[] args) {
    String[] pets = {"Parrot", "Cat", "Dog"};

    System.out.println(pets[0]); // Parrot
    System.out.println(pets[1]); // Cat
    System.out.println(pets[2]); // Dog
  
    pets[0] = "Bird";

    for (int i = 0; i < pets.length; i++) {
      System.out.println(pets[i]);
    }

    for (int i = 0; i < pets.length - 1; i++) {
      System.out.println(pets[i]);
    }

    for (String pet : pets) {
      System.out.println(pet);
    }

    System.out.println(Arrays.toString(pets));

    int[] numbers = new int[5];

    System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]

    String[] newPets = new String[5];

    System.out.println(Arrays.toString(newPets)); // [null, null, null, null, null]

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 10;
    }

    System.out.println(Arrays.toString(numbers)); // [10, 11, 12, 13, 14]

    Integer[] nums = new Integer[4]; 

    System.out.println(Arrays.toString(nums)); // [null, null, null, null]

    for (int i = 0; i < nums.length; i++) {
      nums[i] = i % 3;
    }

    System.out.println(Arrays.toString(nums)); // [0, 1, 2, 0]
  }
}
