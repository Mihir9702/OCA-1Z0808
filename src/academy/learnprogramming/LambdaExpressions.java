package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class LambdaAnimal {
  private String type;
  private boolean canJump;
  private boolean canSwim;

  public LambdaAnimal(String type, boolean canJump, boolean canSwim) {
    this.type = type;
    this.canJump = canJump;
    this.canSwim = canSwim;
  }

  public boolean canJump() {
    return canJump;
  }

  public boolean canSwim() {
    return canSwim;
  }

  public String getType() {
    return type;
  }
}

interface CheckLambdaAnimal {
  boolean check(LambdaAnimal lambdaAnimal);
}

class CheckCanJump implements CheckLambdaAnimal {

  @Override
  public boolean check(LambdaAnimal lambdaAnimal) {
    return lambdaAnimal.canJump();
  }
}

interface AnotherCheck {
  boolean check(LambdaAnimal first, LambdaAnimal second);
}

// lambdas are anonymous functions
// (parameter) -> { body }
// lambdas are functional interfaces
public class LambdaExpressions {

  public static void main(String[] args) {
    List<LambdaAnimal> animals = new ArrayList<>();
    animals.add(new LambdaAnimal("fish", false, true));
    animals.add(new LambdaAnimal("rabbit", true, false));
    animals.add(new LambdaAnimal("dog", true, true));

    printCheck(animals, new CheckCanJump()); // using a class that implements CheckLambdaAnimal interface

    printCheck(animals, animal -> animal.canSwim()); // lambda expression
    printCheck(animals, animal -> !animal.canSwim()); // lambda expression

    printCheck(animals, (animal) -> {
      System.out.println("checking animal = " + animal.getType());
      return animal.canJump();
    });

    LambdaAnimal fish = animals.get(0);
    LambdaAnimal rabbit = animals.get(1);
    LambdaAnimal dog = animals.get(2);

    printTwoParams(fish, rabbit, (first, second) -> first.canJump() && second.canSwim()); // AnotherCheck
    printTwoParams(fish, dog, (first, second) -> first.canSwim() && second.canSwim()); // AnotherCheck

    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Anthony");
    names.add("Jimmy");
    names.add("Timmy");

    System.out.println("names = " + names);

    names.removeIf(name -> name.charAt(0) == 'J'); // lambda expression
    // names.removeIf((String name) -> { // lambda block
    //   return name.charAt(0) == 'J';
    // });

    System.out.println("names = " + names);
  }

  private static void printTwoParams(LambdaAnimal first, LambdaAnimal second, AnotherCheck check) {
    System.out.println(check.check(first, second));
  }

  private static void printCheck(List<LambdaAnimal> animals, CheckLambdaAnimal filter) {
    for (LambdaAnimal animal : animals) {
      if (filter.check(animal)) {
        System.out.println(animal.getType());
      }
    }

    System.out.println();
  }

  private static void printPredicate(List<LambdaAnimal> animals, Predicate<LambdaAnimal> filter) {
    for (LambdaAnimal animal : animals) {
      if (filter.test(animal)) {
        System.out.println(animal.getType());
      }
    }

    System.out.println();
  }
}