package exam;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExamPrep3 {}

// * (class A / class B extends A) | A cls = new B(); -> valid
// * this() and super() can not be used in the same constructor
// * size() is a method in the List interface | NOT an array
// * Integer, String, int -> valid switch types
// * StringBuilder > String -> StringBuilder consumes less memory
// * byteValue() only exists in the Integer class
// * (unlike primitive vars) the changes made through a copy of an object reference get reflected in the object itself
// * int x = 0xE -> 14
// ** What are fields?
// ** What causes compile errors?
// ** Import Libraries

class Phone {
  private int size;
  public Phone(int s) { this.size = s; }
  public static void home(Phone p, int ns) {
    p = new Phone(ns);
    p.size = 4;
  }

  public static void main(String[] args) {
    final Phone phone = new Phone(3);
    home(phone, 7);
    System.out.println(phone.size); // 3
  }
}

class Mammal {
  public Mammal(int age) { System.out.print("Mammal"); }
}

class Platypus extends Mammal {
  public Platypus() {
    // * requires super() to be the first statement in the constructor
    System.out.print("Platypus"); // Line 08
  }
  public static void main(String[] args) {
    new Mammal(5); // Line 11
  }
}

interface Bev {}
class Cof implements Bev {}
class Ja extends Cof {}
class BeCoja {
  public static void main(String[] args) {
    Cof c = new Ja(); // * compatible types: Ja is a Cof
    Cof cc = new Bev(); 
    Bev b = new Cof();
    Bev bb = new Ja();
    Bev bbb = new Bev();
    Ja j = new Cof(); // * incompatible types: Cof cannot be converted to Ja
  }
}


class Create {
  Create() {
    System.out.print("1 ");
  }
  Create(int num) {
    System.out.print("2 ");
  }
  Create(Integer num) {
    System.out.print("3 ");
  }
  Create(Object num) {
    System.out.print("4 ");
  }
  Create(int... nums) {
    System.out.print("5 ");
  }
  public static void main(String[] args) {
    new Create(100);
    new Create(100L);
  }
}

class PassString {
  String str = "";
  static void pass(String str) {
    str.concat("Passed ");
  }

  public static void main(String[] args) {
    String str = "Failed ";
    pass(str);
    System.out.println(str);
  }
}

class ForLoopConditions {
  public static void main(String[] args) {
    int a = 10;
    for (; a <= 20; ++a) { // * ++a is executed after the loop body
      if (a % 3 == 0) a++; else if (a % 2 == 0) a = a * 2; // * a = 10 (a % 2 == 0) -> a = 20
      System.out.println(a); // * prints 20 and ends the loop (a = 21)
    }
  }
}

class EmptySpace {
  // * trim() removes leading and trailing spaces (   Jane Doe   -> Jane Doe) (" " -> " ")
  // * The trick here is that the trim() method returns a new String object and does not modify the original String object.
  // * The original String object is not modified because String objects are immutable.
  public static void main(String[] args) {
    String str = " ";
    str.trim(); // * str = str.trim()
    System.out.println(str.equals("") + " " + str.isEmpty()); // prints false false

    System.out.println(" ".trim().equals("")); // prints true
    System.out.println(" ".trim().isEmpty()); // prints true
  }
}

class StringBuilderMutation {
  static void m(StringBuilder sb) {
    sb.append("er");
  }
  public static void main(String[] args) {
    StringBuilder sb2 = new StringBuilder("moth");
    m(sb2);
    System.out.println(sb2); // prints mother
  }
}

class JC {
  String name = "Java";
}
class Uni {
  public static void main(String[] args) {
    JC cs[] = { new JC(), new JC() };
    cs[0].name = "OCA";
    for (JC c : cs) c = new JC();
    for (JC c : cs) System.out.print(c.name);
  }
}

class Rope { public static int length = 0; }
class RopeSwing {
  private static Rope rope1 = new Rope();
  private static Rope rope2 = new Rope();
  { System.out.println(rope1.length); }
  public short type() {
  }
  public static void main(String[] args) {
    rope1.length = 2;
    rope2.length = 8;
    System.out.println(rope1.length);
  }
}

class WhatReturnsShort {
  public short type() {
    // * return new Integer(3); -> Integer cannot be converted to short
    // * return new Short(6).longValue(); -> long cannot be converted to short
    // * return 5L; -> long cannot be converted to short
    return new Byte((byte) 6);
  }
}

class BirdSeed {
  private int numberBags;
  boolean call;
  public BirdSeed() {
    this(2); // calls the constructor with the int parameter
    call = false;
    new BirdSeed(2); // creates a new object and does not assign the value to the numberBags field
  }
  public BirdSeed(int numberBags) {
    this.numberBags = numberBags;
  }
  public static void main(String[] args) {
    BirdSeed seed = new BirdSeed();
    System.out.println(seed.numberBags);
  }
}

class TestField {
  int x;
  int y;
  public void doStuff(int x, int y) {
    this.x = x;
    y = this.y;
  }
  public void display() {
    System.out.print(x + " " + y + " : ");
  }
  public static void main(String[] args) {
    TestField m1 = new TestField();
    m1.x = 100;
    m1.y = 200;
    TestField m2 = new TestField();
    m2.doStuff(m1.x, m1.y);
    m1.display();
    m2.display();
  }
}

class Printer {
  public void print() {
    try {
      throw new FileNotFoundException();
    } catch (IOException exception) {
      System.out.print("Z");
    } catch (FileNotFoundException enfe) {
      System.out.print("X");
    } finally {
      System.out.print("Y");
    }
  }
  public static void main(String... ink) {
    new Printer().print();
  }
}

class Deer {
  public Deer() { System.out.print("Deer"); }
  public Deer(int age) { System.out.print("DeerAge"); }
  private boolean hasHorns() { return false; }
  public static void main(String[] args) {
    Deer deer = new Reindeer(5);
    System.out.println(","+deer.hasHorns());             // Line 07
  }
}
class Reindeer extends Deer {
  public Reindeer(int age) { System.out.print("Reindeer"); }
  public boolean hasHorns() { return true; }             // Line 12
}

class Series {
  private boolean flag;
  public void displaySeries() {
    int num = 2;
    while (flag) {
      if (num % 7 == 0)
        flag = false;
      System.out.print(num);
      num += 2;
    }
  }
  public static void main(String[] args) {
    new Series().displaySeries();
  }
}


class Samples3 {

  void print() {
    System.out.println(28 + 5 <= 4 + 29);
    System.out.println((28 + 5) <= (4 + 29));
  }

  void matrix() {
    String[][] arr = {{"byte", "short", "int"}, {"long", "char"}};
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
        if (arr[i][j].equals("short")) {
          break;
        }
      }
      continue;
    }
  }

  void bools() {
    Boolean[] barr = new Boolean[3];
    barr[0] = new Boolean(Boolean.parseBoolean("tRUE"));
    barr[1] = new Boolean("True");
    barr[2] = new Boolean(false);
    System.out.println(barr[0] + " " + barr[1] + " " + barr[2]);
  }

  void byteVal() {
    Integer integer = new Integer(4);
    System.out.print(integer.byteValue());

    int i = new Integer(4)
    System.out.print(i.byteValue()); // * byteValue() only exists in the Integer class
  }

  void stopLoop() {
    boolean keepGoing = true;
    int result = 15, i = 10;
    do {
      i--;
      if(i==8) keepGoing = false;
      result -= 2;                 // Line 8
    } while(keepGoing);
    System.out.println(result);
  }

  void math() {
    int x = 5;
    System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7); // 8
  }

  void scope() {
    private String p = "protected"; // * illegal start of expression (private)
    System.out.println("This stack" + p);
  }

  void os() {
    // * (Right Side) | WML or MWL -> -1
    // * (Middle)     | LMW or LWM -> 0
    // * (Left Side)  | WLM or MLW -> 1
    String[] os = new String[] {"Windows", "Mac", "Linux"};
    System.out.println(Arrays.binarySearch(os, "Linux")); 
    System.out.println(Arrays.binarySearch(os, "RedHat")); 
  }

  void eString() {
    String eVal = "123456789";
    System.out.println(
      eVal.subString(
        eVal.indexOf("2"), // * indexOf() returns int
        eVal.indexOf("0").concat("0") // * int does not have concat()
      )
    );
  }

  void strMatch() {
    StringBuilder sb = new StringBuilder();
    String hw = "Hello World";
    sb.append("Hello").append("World");

    if (hw == sb.toString()) { System.out.println("match"); }
    if (hw.equals(sb.toString())) { System.out.println("match+"); }
  }

  void XOR() {
    boolean x = true, z = true;
    int y = 20;
    x = (y != 10) ^ (z=false);  
    System.out.println(x+", "+y+", "+z);
  }

  void localDate() {
    LocalDate xmas = LocalDate.of(2016, 12, 25);
    xmas.setYear(2017); // DNE
    System.out.println(xmas.getYear());
  }

  void rowCol() {
    int count = 0;
    ROW_LOOP: for(int row = 1; row <=3; row++)
      for(int col = 1; col <=2 ; col++) {
        if(row * col % 2 == 0) continue ROW_LOOP;  // Line 6
        count++;
      }
    System.out.println(count);
  }

  void rawList() {
    List list = new ArrayList();
    list.add(new StringBuilder(""));
    list.add("");
    for (Object e : list) 
      // Not sure which condition is true
      if (e instanceof StringBuilder) ((StringBuilder)e).append("OK");
      else ((String)e).concat("OK"); 
    System.out.println(list); // prints [OK, ] 
  }

  void ex() {
    ArrayList<Integer> values = new ArrayList<>();
    values.add(4);
    values.add(5);
    values.set(1, 6);
    values.remove(0);
    for (Integer v : values) System.out.print(v);
  }
}

class RunSamples {
  public static void main(String[] args) {
    Samples3 s = new Samples3();
    // s.scope(); 
    // s.os(); 
    // s.eString();
    // s.strMatch();
    // s.math();
    // s.bools();
    // s.stopLoop();
    // s.byteVal();
    // s.matrix();
    // s.print();
    // s.XOR();
    // s.localDate();
    // s.rowCol();
    // s.rawList();
    s.ex();
    "a".replace("a","b");
    "a".replace('a','b');
    "a".replace(0,"a".length(),"b");
    "a".replace(new StringBuilder('a'),"");
    "a".replace(new StringBuilder('a'), new StringBuilder("b"));
    new StringBuilder("a").replace("","b");
    new StringBuilder("a").replace('a','b');
    new StringBuilder("a").replace(0,1,"b");
  }
}

class ChooseWisely {
  public ChooseWisely() { super(); }
  public int choose(int choice) { return 5; }
  public int choose(short choice) { return 2; }
  public int choose(long choice) { return 11; }
  public static void main(String[] path) {
    System.out.print(new ChooseWisely().choose((byte)2+1));
  }
}


class RopeT {
  public static int LENGTH = 5;
  static {
    LENGTH = 10;
  }
  public static void swing() {
    System.out.print("swing ");
  }
}
 
public class Chimp {
  public static void main(String[] args) {
    RopeT.swing();                           // Line 5
    new RopeT().swing();                     // Line 6
    System.out.println(LENGTH);             // Line 7
  }
}