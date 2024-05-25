package academy.learnprogramming;

abstract class AbstractAnimal {

  private String name;

  public AbstractAnimal() {}

  // public static abstract void run() {}
  // abstract methods can only be declared in abstract classes
  // abstract methods can not be private, final, static, strictfp

  public abstract void run(); // abstract methods can not have a body

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getWeight() {
    return 10;
  }
}

abstract class AbstractDog extends AbstractAnimal {
  
  public AbstractDog() {
    super();
  }

  public abstract int getWeight();

  protected void printName() {
    System.out.println("name= " + getName());
  }
}

class AbstractHusky extends AbstractDog {
  
  public AbstractHusky() {
    super();
  }

  public int getWeight() {
    return 20;
  }

  @Override
  public void run() {
    System.out.println("Husky running");
  }

  @Override
  public void printName() {
    System.out.println("Husky name= " + getName());
  }
}

public class AbstractClass {
  
  public static void main(String[] args) {
    AbstractHusky husky = new AbstractHusky();
    System.out.println("weight= " + husky.getWeight());

    husky.printName(); // name= null
    husky.setName("Rex");
    husky.printName(); // name= Rex

    // new AbstractDog(); // error: AbstractDog is abstract; cannot be instantiated
  }
}
