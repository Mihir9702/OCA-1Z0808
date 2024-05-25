package academy.learnprogramming;

class PolyAnimal {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printDetails() {
    System.out.println("name= " + name);
  }

  public void define() {
    System.out.println("Animal");
  }
}

class PolyDog extends PolyAnimal implements PolyCanRun, PolyHasTail {
  private int age;

  public PolyDog() {
    super();
  }

  public PolyDog(int age) {
    super();
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  @Override
  public int getTailLength() {
    return DEFAULT_TAIL_LENGTH;
  }

  @Override
  public void run(int speed) {
    System.out.println("Dog is running at speed= " + speed);
  }

  @Override
  public void define() {
    System.out.println("Dog");
  }
}

class PolyHusky extends PolyDog {
  public PolyHusky() {
    super();
  }

  public PolyHusky(int age) {
    super();
  }
}

class PolyCat extends PolyAnimal implements PolyCanRun {
  public PolyCat() {
    super();
  }

  @Override
  public void run(int speed) {
    System.out.println("Cat is running at speed= " + speed);
  }

  public void getSpeed(int speed) {
    System.out.println("Cat speed is= " + speed);
  }
}

class PolyRabbit extends PolyAnimal {
  public PolyRabbit() {
    super();
  }

  @Override
  public void define() {
    System.out.println("Rabbit");
  }
}

interface PolyCanRun {
  void run(int speed);
}

interface PolyCanWalk {
  void walk(int speed);
}

interface PolyHasTail {
  int DEFAULT_TAIL_LENGTH = 2;
  int getTailLength();
}

public class Polymorphism {
  
  public static void main(String[] args) {
    PolyHusky husky = new PolyHusky(5);
    husky.setName("Rex");

    PolyDog dog = husky; // upcasting
    dog.printDetails();
    
    PolyHasTail hasTail = husky; // upcasting
    System.out.println("tail= " + hasTail.getTailLength());

    PolyCanRun canRun = husky; // upcasting
    canRun.run(20);

    PolyAnimal polyAnimal = husky; // upcasting
    polyAnimal.printDetails();

    PolyAnimal cat = new PolyCat();
    PolyCat myCat = (PolyCat) cat; // downcasting
    myCat.getSpeed(10); // because casting was applied in previous line, you can call getSpeed()
    ((PolyCat) cat).getSpeed(10); // you can also cast in the same line as the method call

    // PolyDog myDog = (PolyDog) myCat; // ClassCastException - different hierarchy

    PolyAnimal rabbit = new PolyRabbit();
    rabbit.define(); // Rabbit
    // java will override the method call to the child class at runtime

    define(new PolyHusky()); // Dog
    define(new PolyRabbit()); // Rabbit
  }

  // Polymorphism Parameters
  // static void define(PolyHusky husky) {
  //   husky.define();
  // }

  // static void define(PolyRabbit rabbit) {
  //   rabbit.define();
  // }

  // reuse code with polymorphism
  static void define(PolyAnimal animal) {
    animal.define();
  }
}
