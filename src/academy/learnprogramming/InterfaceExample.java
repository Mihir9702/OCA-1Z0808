package academy.learnprogramming;

abstract class InterfaceAnimal {

  public InterfaceAnimal() {}
}

// class Dog extends Animal implements HasTail, CanRun {}
abstract class InterfaceDog extends InterfaceAnimal implements InterfaceExample { 
  
  public InterfaceDog() {}

  @Override
  public int getTailLength() {
    return 5;
  }

  public static void main(String[] args) {
    InterfaceDog dog = new InterfaceDog() {
      @Override
      public int getWeight() {
        return 0;
      }
    };
    System.out.println(dog.getTailLength()); // 5
  }
}

public interface InterfaceExample {

  // public static final int DEFAULT_TAIL_LENGTH = 2; // redundant
  int DEFAULT_TAIL_LENGTH = 2;

  // public int getTailLength(); // redundant
  // public abstract int getTailLength(); // redundant
  int getTailLength();

  int getWeight();
}

// each interface must be defined in their own file
// this is for demonstration purposes only

// public interface CanRun { 
//   void run(int speed);
//   public abstract void walk();
// }

