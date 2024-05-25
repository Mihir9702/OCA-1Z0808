package academy.learnprogramming;

import java.util.Arrays;

public class WorkingWithArrays {
  
  public static void main(String[] args) {
    int[] one = new int[3]; // {0, 0, 0}
    int[] two = new int[] {10, 11, 12}; // {10, 11, 12}

    double[] a = new double[4 * 5 / 2];

    int x = 4;
    int y = 4;

    double[] c = new double[x * y]; // creates an array with 16 elements
    int[] three = {10, 11, 12}; // {10, 11, 12} - anonymous array
    int[] four = {}; // empty array of size 0

    int[] a1;
    int[] a2;
    int a3[];
    int a4[];

    int[] ids, types; // two arrays
    int ids2[], types2; // one array and one variable
    int ids3[], types3[]; // two arrays

    String[] animals = {"Parrot", "Dog", "Cat"}; // {Parrot, Dog, Cat}
    String[] myAnimals = animals; // points to the same array
    String[] otherAnimals = {"Parrot", "Dog", "Cat"}; // {Parrot, Dog, Cat}

    System.out.println(animals.equals(myAnimals)); // true
    System.out.println(animals == myAnimals); // true
    System.out.println(Arrays.equals(animals, myAnimals)); // true

    System.out.println(animals.equals(otherAnimals)); // false
    System.out.println(animals == otherAnimals); // false
    System.out.println(Arrays.equals(animals, otherAnimals)); // true

    System.out.println(animals); // [Ljava.lang.String;@15db9742
    System.out.println(animals.toString()); // [Ljava.lang.String;@15db9742

    System.out.println(Arrays.toString(animals)); // [Parrot, Dog, Cat]
  }
}
