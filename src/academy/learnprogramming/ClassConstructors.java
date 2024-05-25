package academy.learnprogramming;

class ClassConstructorsDog {

  private String name;
  private String color;
  private int age;
  
  public ClassConstructorsDog(String name, String color, int age) { // this is a constructor
    System.out.println("constructor");
    this.name = name;
    this.color = color;
    this.age = age;
  } 

  public void printColor() {
    System.out.println("color= " + this.color);
  }

  public void changeColor(String color) {
    this.color = color;
  }

  public void printAge() {
    System.out.println("age= " + this.age);
  }

  public void birthday() {
    this.age += 1;
  }

  // public dog() {} // DOES NOT COMPILE
  // public void Dog() {} // this is a method, not a constructor
}

public class ClassConstructors {
  
  public static void main(String[] args) {
    ClassConstructorsDog dog = new ClassConstructorsDog("Roofus", "brown", 13); // this will trigger the constructor

    dog.printColor();
    dog.changeColor("white");
    dog.printColor();

    dog.printAge();
    dog.birthday();
    dog.printAge();
  }
}
