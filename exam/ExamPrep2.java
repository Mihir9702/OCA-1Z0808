package exam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExamPrep2 {}

// .subString() returns a new string starting at the specified index and ending at the end of the string
// .subString(int beginIndex, int endIndex) returns a new string starting at the specified beginIndex and ending at the specified endIndex
// .subString(int beginIndex, int endIndex) endIndex is exclusive

// * Exceptions DO NOT terminate the application as they can be caught and handled
// * long and float values are not allowed in switch statements
// * long cannot be cast to int or short or byte | int cannot be cast to short or byte
// * float cannot be cast to int or short or byte | double cannot be cast to float or int or short or byte
// * Periods are immutable and used to represent a quantity of time in years, months, and days (LocalDate and LocalDateTime) NOT (LocalTime)
// * Main benefit of lambda functions is it allows you to write code that has the execution deferred
// * abstract only applies to classes and methods and interfaces
// * interfaces can't be instantiated inside a class or method

class Exceptions {
  class MissingInfoException extends Exception {}
  class AgeOutofRangeException extends Exception {}
  class Candidate {
    String name;
    int age;
    Candidate (String name, int age) throws Exception {
      if (name == null) {
        throw new MissingInfoException();
      } else if (age <= 10 || age >= 150) {
          throw new AgeOutofRangeException();
      } else {
          this.name = name;
          this.age = age;
      }
    }
    public String toString() {
      return name + " age: " + age;
    }
  }
  public static void main(String[] args) {
    // Candidate c = new Candidate("James", 20);      // Line 6
    // Candidate c1 = new Candidate("Williams", 32);  // Line 7
    try {
      Candidate c = new Candidate("James", 20);      // Line 6
      Candidate c1 = new Candidate("Williams", 32);  // Line 7
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

class WaterBottle {
  private String brand;
  private boolean empty;
  public static void main(String[] args) {
    WaterBottle wb = new WaterBottle();
    System.out.print("Empty = " + wb.empty);    // Line 6
    System.out.print(", Brand = " + wb.brand);  // Line 7
  } 
}

interface Money {
  int cash = 0;
  abstract void earn(int amount);
  public void spend(int amount);
}

class LocalCurrency implements Money {
  int cash = 100;
  public void earn(int amount) {
    cash = cash + amount;
  }
  public void spend(int amount) {
    cash = cash - amount;
  }
}

class UnderPaidJavaCoder {
  public static void main(String[] args) {
    Money m = new LocalCurrency();
    m.earn(5000);
    m.spend(200);
    System.out.println(m.cash);
  }
}

interface Z {}
class X implements Z {
  public String toString() {
    return "X";
  }
  public static void main(String[] args) {
    Y myY = new Y();
    X myX = myY;
    Z myZ = myX;
    System.out.print(myX); // Y
    System.out.print((Y)myX); // Y
    System.out.print(myZ); // Y
  }
}
class Y extends X {
  public String toString() {
    return "Y";
  }
}

class Salmon {
  int count;
  public void Salmon() { count = 4; }
  public static void main(String[] args) {
    Salmon s = new Salmon();
    System.out.println(s.count);
  }
}

class Order {
  String value = "t";
  { value += "a"; }
  { value += "c"; }
  public Order() {
    value += "b";
  }
  public Order(String s) {
    value += s;
  }
  public static void main(String[] args) {
    Order order = new Order("f");
    order = new Order();
    System.out.println(order.value);
  }
}

class Loop {
  private static int count;
  private static String[] stops = new String[] { "Washington",
      "Monroe", "Jackson", "LaSalle" };
  public static void main(String[] args) {
    while (count < stops.length) {
    if (stops[count++].length() < 8) {
      continue;
    }
  }
  System.out.println(count); }
}

class Shoot {
  interface Target {
    boolean needToAim(double angle);
  }
  static void prepare(double angle, Target t) {
    boolean ready = t.needToAim(angle);        // Line k1
    System.out.println(ready);
  }
  public static void main(String[] args) {
    prepare(45, d -> d > 5 || d < -5);         // Line k2
  }
}

class A {
  void mA() { System.out.print("aaa"); }
}
class B extends A {
  protected void mA() { System.out.print("AAA"); }
  void mB() { System.out.print("BBB"); }
}
class Test {
  public static void main (String[] args) {
    final A ab = new B();
    B bb = (B) ab;                         // Line t1
    bb.mB();
    ab.mA();                               // Line t2
    // BBBAAA
  }
}

interface HasVocalCords {
  public abstract void makeSound();
}
interface CanBark extends HasVocalCords {
  public void bark();
}

class WhackAnException {
  public static void main(String... hammer) {
    try {
      throw new ClassCastException();
    } catch (IllegalArgumentException e) {
      throw new IllegalArgumentException();
    } catch (RuntimeException e) {
      throw new NullPointerException();
    } finally {
      throw new RuntimeException(); // RuntimeException
    }
  }
}

class Cargo { /* valid, customs-cleared code */ }
class CargoPlane {
  void load(Cargo cargo) throws RuntimeException {  // Line 06
    System.out.print("Cargo loaded - ");    }
  void fly(){ /* valid, ICAO-cleared code */ }
  void unload(Cargo cargo) throws Exception {
    System.out.println("Cargo unloaded");    }
  public static void main(String[] args) {
    Cargo cargo = new Cargo();
    CargoPlane plane = new CargoPlane();
    plane.load(cargo);                              // Line 14
    plane.fly();
    plane.unload(cargo); // * needs to be in try catch block
  }
}

class IceCream {
  public static void main(String[] args) {
    int flavors = 30;
    int eaten = 0;
    switch(flavors) {
      case 30: eaten++; // 0
      case 40: eaten+=2; // 1 + 2 = 3
      default: eaten--; // no break statements so default is ran (3 - 1)
    }
    System.out.println(eaten); // 3 - 1 = 2
  }
}



class Natural {
  private int i;
  void disp() {
    while (i <= 5) {
      for (int i = 1; i <= 5;) {
        System.out.println(i + " "); // 1 2 3 4 5
        i++;
      }
      i++; // i = 6
      System.out.println(); // prints *1 2 3 4 5*, 6 times
    }
  }
  public void main() {
    new Natural().disp(); 
  }
}

class Computer {
  protected final int process() { return 5; }
}
class Laptop extends Computer {
  public final int process() { return 3; } // cannot override final method from class Computer
}

interface HasExoskeleton {
  abstract int getNumberOfSections();              
}
abstract class Insect implements HasExoskeleton {  
  abstract int getNumberOfLegs();
}
class Beetle extends Insect { // will not compile
  int getNumberOfLegs() { return 6; }
  // * Ex. The code fails to compile because [Beetle] the first concrete subclass,
  // * doesn't implement getNumberofSections() which is inherited as an abstract method.
  // * There is nothing wrong with this interface method definition.
  // * An abstract class is not required to implement any abstract methods,
  // * including those inherited from an interface
  // * The code fails at compilation-time @ class Beetle extends Insect
  // * tldr: Beetle implements HasExoskeleton if its subclass of Insect and requires getNumberOfSections()
}


class Vowel {
  private char var;
  public void main(String[] args) {
    char var1 = 'a';
    char var2 = var1;
    var2 = 'e';
    Vowel obj1 = new Vowel();
    Vowel obj2 = obj1; // obj1 and obj2 are pointing to the same object
    obj1.var = 'i';
    obj2.var = 'o'; // obj1.var = 'o'
    System.out.println(var1 + ", " + var2); // a, e
    System.out.println(obj1.var + ", " + obj2.var); // o, o
  }
}

class Samples {
  void exams() {
    List<String> exams = Arrays.asList("OCA", "OCP");
    for (String e1 : exams)
      for (String e2: exams)
        System.out.println(e1 + " " + e2); // OCA OCA, OCA OCP, OCP OCA, OCP OCP
  }

  void cast() {
    char c = Byte.MAX_VALUE + 1;
    byte b = c; // Compilation fails cus char cannot be cast to byte
    if (b >= 0) System.out.println("pos");
    else System.out.println("neg");
  }

  void localDate() {
    LocalDate today = LocalDate.of(2019, 1, 1);
    today.plusHours(); // Compilation fails cus time cannot be modified in LocalDate
    System.out.println(today);
  }

  void loop() {
    int k = 0;
    for (int i = 10; i > 0; i--) {
      while (i > 3) // 10 > 3, 7 > 3, 4 > 3
        i -= 3;
      k += 1; // only executed 1 time cus while loop (10 > 3 so i = 7) then (7 > 3 so i = 4) then (4 > 3 so i = 1) then 1 is not greater than 3 so while loop is done and k += 1 is executed
    }
    System.out.println("k=" + k);
  }

  void nestedLoop1() {
    for (int row = 3; row > 0; row--) {
      int column = row;
      while (column <= 3) {
        System.out.print(column);
        column++;
      }
      System.out.println();
    }
  }

  void breakInLoop() {
    for (int i = 0; i < 10; i++) {
      System.out.println(i); 
      System.out.println("end");
      break;
    } 
    // * 0 end - break statement terminates the loop
  }

  void nestedLoop2() {
    int arr[] = {1, 2, 3};
    for (int var : arr) {
      int i = 1;
      while (i <= var) {
        System.out.println(i + " ");
      }
    }
  }

  void condition1() {
    int flair = 15;
    if (flair >= 15 && flair < 37) {
      System.out.println("a"); // executes
    } if (flair == 37) {
      System.out.println("b");
    } else {
      System.out.println("c"); // executes
    }
    // a /n c
  }

  void condition2() {
    boolean b = false;
    if (b = true) System.out.println("Success"); // can assign true to b to run if statement
    else System.out.println("Failure");
  }

  void strings() {
    String a = "";
    a += 2;
    a += 'c';
    a += false;
    System.out.println(a == "2cfalse"); // false
    System.out.println(a.equals("2cfalse")); // true
  }
  
}

class App {
  static void m(int i) {
    i += 7;
  }
  public void main(String[] args) {
    int j = 12;
    m(j); // needs to be System.out.println(m(j)); to print 19
    System.out.println(j); // prints 12
  }
}

class Twin {
  int age;
  String gender;
  Twin (int age, String gender) {
    this.age = age;
    this.gender = gender;
  }
  public boolean equals() {
    return this.age == age & this.gender == gender;
  }
  // * proper equals() method
  public boolean equals(Twin t) {
    return this.age == t.age & this.gender == t.gender;
  }
}

public static void main(String[] args) {
  Twin t1 = new Twin(13, "Male");
  Twin t2 = new Twin(13, "Male");
  if (t1 == t2) {
    System.out.println("Equal");
  } else {
    System.out.println("Not Equal"); // Not Equal cus == compares the references of the objects
  }

  System.out.println(t1.hashCode()); // 366712642
  System.out.println(t2.hashCode()); // 1829164700
}



class Shapes {
  class Shape {}
  class Square extends Shape {}

  Shape shape = null;
  Square square = null;

  // * shape = (Square) new Square(); // compiles but throws ClassCastException at runtime
  // * shape = new Square(); // compiles
  // * square = (Square) new Square(); // compiles
  // * square = new Square(); shape = square; // compiles
}

class StringBuilderTest {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Same");
    String str = "Same";

    if (sb.equals(str)) {
      System.out.println("Match 1");
    } else if (sb.toString().equals(str.toString())) {
      System.out.println("Match 2"); // Match 2 cus toString().equals() compares the values of the strings
    } else {
      System.out.println("No Match");
    }
  }
}

class InfiniteLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 10;) {
      i = i++; // infinite loop
      System.out.println("Hello World");
    }
  }
}

class TestingListArray {
  // ? Compilation fails 
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < 5; i++) list.add("" + i);
    System.out.println(list.remove(list.indexOf("4")));
  }
}

class ListTest {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Perl");
    list.add("Perl");
    list.add("Closure");

    if (list.remove("Perl")) list.add("Emacs Lisp");
    System.out.println(list); // only removes the first instance of "Perl"
  }
}

class Casting {
  public static void main(String[] args) {
    Object obj = new Integer(3);
    String sstr = (String) obj;
    System.out.println(sstr); // ClassCastException: Integer cannot be cast to String
  }
}