package academy.learnprogramming;

class NoMeatException extends Exception {} // checked exception
class NoPlantsException extends RuntimeException {} // unchecked exception

interface Omnivore {
  void eatMeat(int amount) throws NoMeatException;
  void eatPlants(int amount);
} 

class Bear implements Omnivore {
  @Override
  public void eatMeat(int amount) throws NoMeatException {
    if (amount <= 0) {
      throw new NoMeatException();
    }

    System.out.println("Eating meat");
  }

  public void eatPlants(int amount) {
    if (amount <= 0) {
      throw new NoPlantsException();
    }

    System.out.println("Eating plants");
  }
}


// * checked exceptions require try/catch block
// * unchecked exceptions can be called directly

public class MethodsWithExceptions {
  
  public static void main(String[] args) {
    try {
      new Bear().eatMeat(-2);
    } catch (NoMeatException e) {
      e.printStackTrace();
      System.out.println("Bear is hungry");
    }

    new Bear().eatPlants(-2);
  }
}
