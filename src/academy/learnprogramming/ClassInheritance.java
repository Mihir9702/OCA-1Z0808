package academy.learnprogramming;

class ClassInheritanceAnimal {
  private int age; 
  private String name; // protected means that it can be accessed by subclasses

  public ClassInheritanceAnimal() {}

  public ClassInheritanceAnimal(int age) {
    System.out.println("Animal");
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void eat() {
    System.out.println("Animal is eating");
  }

  public double getAverageWeight() {
    return 10.0;
  }

  public void print() {
    System.out.println("name= " + name + " age= " + age);
  }
}

class ClassInheritanceDog extends ClassInheritanceAnimal {

  public ClassInheritanceDog() {
    super();
    System.out.println("Dog");
  }

  @Override // optional
  public void eat() {
    super.eat();
    System.out.println("Dog is eating");
  }

  public double getAverageWeight() { 
    return super.getAverageWeight() + 20; // super calls the parent method
  }
}

class ClassInheritanceHusky extends ClassInheritanceDog {

  public ClassInheritanceHusky() {
    super();
    System.out.println("Husky");
  }

  @Override // cannot override final methods
  public void eat() {
    super.eat();
    System.out.println("Husky is eating");
  }
}

class ClassInheritanceCat extends ClassInheritanceAnimal {

  public ClassInheritanceCat() {
    super();
    System.out.println("Cat");
  }
}

class ClassInheritanceRabbit extends ClassInheritanceAnimal {

  public ClassInheritanceRabbit() {
    // super; // DOES NOT COMPILE
    // super().setAge(3); // DOES NOT COMPILE

    super();
    super.setAge(3);
    this.setAge(3);
    setAge(3);
  }

  public ClassInheritanceRabbit(int age) {
    // this(age); // recursive call
    // this(); // recursive call

    // super();
    // this();
    // setAge(3);
    // super(3);
    // super(age);
  }
}

class ClassInheritanceBird {

  public void fly() {
    System.out.println("Bird is flying");
  }

  public void eat(int amount) {
    System.out.println("Bird is eating" + amount + " units of food");
  }
}

class ClassInheritanceEagle extends ClassInheritanceBird {

  // overloading - same method name, different parameters
  public int fly(int height) {
    System.out.println("Eagle is flying " + height + " meters");
    return height;
  }

  // @Override
  // public int eat(int amount) { // DOES NOT COMPILE
  //   return amount;
  // }
}

class ClassInheritanceReptile {

  protected boolean hasLegs() {
    return true;
  }

  protected double getWeight() {
    return 2.0;
  }
}

class ClassInheritanceSnake extends ClassInheritanceReptile {

  @Override
  protected boolean hasLegs() {
    return false;
  }

  @Override
  public double getWeight() { // can not be more restrictive i.e. protected -> private
    return 10.0;
  }
}

public class ClassInheritance {
  
  public static void main(String[] args) {
    ClassInheritanceHusky husky = new ClassInheritanceHusky(); // Animal Dog Husky
    new ClassInheritanceCat(); // Animal Cat

    ClassInheritanceDog dog = new ClassInheritanceDog(); 

    dog.setName("Rex");
    dog.setAge(3);
    dog.print(); // name= Rex age= 3

    husky.eat(); // Animal is eating, Dog is eating, Husky is eating
    System.out.println(husky.getAverageWeight()); // 30.0

  }
}
