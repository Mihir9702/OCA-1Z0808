package exam;

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.util.function.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExamPrep {}

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
// * default methods only work with interfaces
// * do / while loops always execute at least once
// ** FileNotFormatException // IOException // FileNotFoundException
// ** Predicates
// ** Primitives
// ** Interfaces
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

// * Overloaded methods must have a different list of parameters, while overridden methods must have the exact same return type.
// * List is an interface and not a class. It cannot be instantiated. While Object is a concrete class, it does not implement the List interface

// exceptions are not polymorphic
// garbage collection

interface Contract {}
class Super implements Contract {}
class Sub extends Super {}
class Ref {
  public static void main(String[] args) {
    List objs = new ArrayList();
    Contract c1 = new Super();
    Contract c2 = new Sub();                // Line n1
    Super s1 = new Sub();
    objs.add(c1);
    objs.add(c2);
    objs.add(s1);                           // Line n2
    for(Object itm: objs) {
      System.out.println(itm.getClass().getName());
    }

  }
}



class Counter {
  private int i;
  public void count() {
    while (i <= 1) {
      for (int i = 0; i <= 4; ) {
        System.out.print(i + " ");
        i++;
      }
      i++;
    }
  }
}
class Caller {
  public static void main (String args[]) {
    new Counter().count();
  }
}



class Four {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10,4,-1,5);
    Collections.sort(list);
    Integer array[] = list.toArray(new Integer[4]);
    System.out.println(array[0]);

    StringBuilder sb = new StringBuilder();
    sb.append("Duke");

    System.out.println(sb.insert(0, "Hello "));
    System.out.println(sb.append(0, "Hello "));
    System.out.println(sb.add(0, "Hello "));
    System.out.println(sb.set(0, "Hello "));
    
    double d = new Double(1_000_000);
  }
}

class Rodent {
  public static Integer chew() throws Exception {
    System.out.println("Rodent is chewing");
    return 1;
  }
}
public class Beaver extends Rodent {
  protected Number chew() throws RuntimeException {
    System.out.println("Beaver is chewing on wood");
    return 2;
  }
}

class PrintNegative {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("-5");
    list.add("0");
    list.add("5");
    print(list, e -> e < 0);
  }
  public static void print(List<String> list, Predicate<Integer> p) {
    for (String num : list)
      if (p.test(num)) // Predicate<Integer> p, but num is a String
        System.out.println(num);
  }
}


class Two { 
  public static void main(String[] args) {
    // try {
    //   doStuff();
    //   System.out.println("1");
    // }
    // catch (Exception e) {
    //   System.out.println("2");
    // }
  }
  public static void doStuff() {
    if(Math.random() > 0.5) throw new RuntimeException(); doMoreStuff();
      System.out.println("3");
    }
  public static void doMoreStuff() {
    System.out.println("4");
  }
}

class NegativeModulo {
  // compilation fails
  static void getModulo(float f) {
    System.out.println(-f%-f);
  }
  public static void main(String[] args) {
    getModulo(2.0);
  }
}

interface Aquatic {
  // public int getNumberOfGills(int input) { return 2; }
  public static int getNumberOfGills(int input) { return 2; } // unless its static?
}

class ClownFish implements Aquatic {
  public String getNumberOfGills() { return "4"; }
  public String getNumberOfGills(int input) { return "6"; } // has to have the same return type

  public static void main(String[] args) {
    System.out.println(new ClownFish().getNumberOfGills(-1));
  }
}

class NumbersTest {
  public static void main(String[] args) {
    int numbers[];
    numbers = new int[2];
    numbers[0] = 10;
    numbers[1] = 20;
    numbers = new int[4]; // makes a new numbers[]
    numbers[2] = 30;
    numbers[3] = 40;
    for (int x : numbers) {
      System.out.print(" " + x);
    }
  }
}

class Dummy {
  public static void main(String[] args) {
    String[] array = {"Natural History", "Science"};
    List<String> museums = Arrays.asList(array);
    museums.set(0, "Art");
    System.out.println(museums.contains("Art"));
  }
}

class _C {                           // Line 1
  private static int $;                     // Line 2
  public static void main(String[] main) {
    String a_b;                             // Line 4
    System.out.print($);                    // Line 5
    System.out.print(a_b);                  // Line 6
} }


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


abstract interface Judgement {
  default void judge() { System.out.println("Judgement"); }
}

class Airplane {
  static int start = 2;
  final int end;
  public Airplane(int x) {
    x = 4;
    end = x;
  }
  public void fly(int distance) {
    System.out.print(end-start + " ");
    System.out.print(distance);
  }
  public static void main(String... start) {
    new Airplane(10).fly(5);
  }
}

class Whale {
  public static void main(String args[]) {
    boolean hungry = false;
    while (hungry=true) {
      ++Fish.count;
    }
    System.out.println(Fish.count);
  }
}
class Fish {
  static byte count;
}

class Ant {
  final void method() { }
}

abstract class Duck {
  protected int count;
  public abstract int getDuckies();
}

abstract class Tree {
  private void grow() {
    System.out.println("Tree is growing");
  }
  public static void main(String[] args) {
    Tree tree = new Oak();                 // Line 6
    tree.grow();
  }
}
class Oak extends Tree {
  protected void grow() {                  // Line 11
    System.out.println("Oak is growing");
  }
  protected void shedLeaves() {
    System.out.println("Oak is shedding leaves");
  }
}

class Ducklings extends Duck {
  private int age;
  public Ducklings(int age) { this.age = age; }
  public int getDuckies() { return this.age / count; }
  public static void main(String[] args) {
    Duck duck = new Ducklings(5);
    System.out.println(duck.getDuckies());   
  }
}

class Alpha {
  public String[] main = new String[2];
  Alpha(String[] main) {
    for (int i = 0; i < main.length; i++) {
      this.main[i] = main[i] + 5;
    }
  }
  public void main() {
    System.out.print(main[0] + main[1]);
  }
}

interface Universe {
  void doStuff();
}
class Star {
  public void doStuff() { System.out.println("Twinkle "); }
}

class Sun extends Star implements Universe {
  public void doStuff() { System.out.println("Shine "); }
}

class Doctor {
  protected int age;
}
class Surgeon extends Doctor {
  String special;
  Surgeon(String s) {
    special = s;
  }
  String getSpecial() {
    return special;
  }
}
class Hospital {
  public static void main(String[] args) {
    Surgeon s1 = new Surgeon("Liver");
    Surgeon s2 = new Surgeon("Heart");
    s1.age = 45;
    System.out.println(s1.age + " " + s1.getSpecial());
    System.out.println(s2.age + " " + s2.getSpecial());
  }
}

interface Cadet {}
abstract class Pilot {}
class SubPilot extends Pilot implements Cadet {}
class SubSubPilot extends SubPilot {}

class MainFunc {
  public static void main(String[] args) {
    ArrayList<Cadet> c = new ArrayList<>();
    c.add(new SubPilot());
  }
}

class Alpx {
  int ns;
  static int s;
  Alpx (int ns) {
    if (s < ns) {
      s = ns;
      this.ns = ns;
    }
  }
  void doPrint() {
    System.out.println("ns = " + ns + " s = " + s);
  }
}
class AlpxT {
  public static void main(String[] args) {
    Alpx ref1 = new Alpx(50);
    Alpx ref2 = new Alpx(125);
    Alpx ref3 = new Alpx(100);
    ref1.doPrint();
    ref2.doPrint();
    ref3.doPrint();
    String message = "Hi everyone!";
    System.out.println("message = " + message.replace("e","X"));

    do {
      int y = 1;
      System.out.println(y++ + " ");
    } while (y <= 10);
  }
}

class StaticMethods {
  static void one() {
    two();                 // Line 3
    StaticMethods.two();   // Line 4
    three();               // Line 5
    StaticMethods.four();  // Line 6
  }
  static void two() {}
  void three() {
    one;                   // Line 10
    StaticMethods.two();   // Line 11
    four();                // Line 12
    StaticMethods.four();  // Line 13
  }
  void four() {}
}

class ScopeTest {
  int j, k;
  public static void main(String[] args) {
    new ScopeTest().doStuff();
  }
  void doStuff() {
    int x = 5;
    doStuff2();
    System.out.println("x");
  }
  void doStuff2() {
    int y = 7;
    System.out.println("y");
    for(int z = 0; z < 5; z++) {
      System.out.println("z");
      System.out.println("y");
    }
  }
}

interface Truth { void tellItLikeItIs(); }
class Speak {
  public static void main(String[] args) {
    Speak speakIt = new Tell();
    Tell tellIt = new Tell();
    speakIt.tellItLikeItIs();           // Line 05
    (Truth)speakIt.tellItLikeItIs();    // Line 06
    ((Truth)speakIt).tellItLikeItIs();  // Line 07
    tellIt.tellItLikeItIs();            // Line 08
    (Truth).tellIt.tellItLikeItIs();    // Line 09
    ((Truth)tellIt).tellItLikeItIs();   // Line 10
  }
}
class Tell extends Speak implements Truth {
  public void tellItLikeItIs() {
    System.out.println("Right on!");
  }
}


class Report {
  int sizeMB;
  String title;
  public Report(int sizeMB, String title) {
    this.sizeMB = sizeMB;
    this.title = title;
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    String str = null;
    for (int e : arr) {
      str += e;
    }
    System.out.println(str);

  }
}


class Astr {
  public static void main(String[] args) {
    String[][] astr = new String[2][];
    astr[0] = new String[2];
    astr[1] = new String[3];
    int a = 42;
    for (int i = 0; i < astr.length; i++) {
      for (int j = 0; j < astr.length; j++) {
        astr[i][j] = "" + a;
        a++;
      }
    }
    for (String[] e : astr) {
      for (String c : e) {
        System.out.print(c + " ");
      }
    System.out.println();
    }
  }
}

class Overloading {
  void x(int i) {
    System.out.println("one");
  }
  void x(String s) {
    System.out.println("two");
  }
  void x(double d) {
    System.out.println("three");
  }
  static void y() {}
  public static void main(String[] args) {
    new Overloading().x(4.0);
  }
}

class Static {
  static int x = 10;
  public static void main(String[] args) {
    Static s = new Static();
    s.x++;
    Static.x++;
    s.x++;
    System.out.println(Static.x + " " + s.x);
  }
}

interface SpeakDialogue { default int talk() { return 7; } }
interface SingMonologue { default int talk() { return 5; } }
class Performance implements SpeakDialogue, SingMonologue {
  public int talk(String... x) {
    return x.length;
  }
  public static void main(String[] notes) {
    System.out.print(new Performance().talk(notes));
  }
}

class MyApp {
  String str = "default";
  MyApp(String s) { str = s; }
  void print() { System.out.println(str); }
  public static void main(String[] args) {
    new MyApp("hello").print(); // hello
    do {
      break;
    } while (true);
  }
}

class TestApps {
  public static void main(String[] args) {
    Samples2 s = new Samples2();
    s.dates();
  }
}

class Samples2 {

  void continueInLoop() {
    for (int ii = 0; ii < 3; ii++) {
     int count = 0;
     for (int jj = 3; jj > 0; jj--) {
       if (ii == jj) {
         ++count;
         break;
       }
     }
     System.out.print(count);
     continue;
    }
  }

  void arrayCopy() {
    int[] a = {1, 2, 3, 4, 5};
    System.arraycopy(a, 2, a, 1, 2);
    System.out.println(Arrays.toString(a));
  }

  void arrayList() {
    List sb = new ArrayList();
    sb.add("hammer");
    sb.add("nail");
    sb.add("hex");
    System.out.println(sb.get(1));
  }

  void table() {
    String[] table = { "aa", "bb", "cc" };
    for (String ss : table) {
      int ii = 0;
      while (ii < table.length) {
        System.out.println(ss + ", " + ii);
        ii++;
      }
    }
  }

  void loopMath() {
    for (int row = 4; row > 0; row--) {
      int col = row;
      while (col <= 4) {
        System.out.print(col);
        col++;
      }
      System.out.println();
    }
  }

  void breakInLoop() {
    boolean b = false;
    do {
      if (!b) {
        b = true;
        System.out.println("b-");
      }
    } while (!b);
    System.out.println("d");
  }

  void cast1() {
    // * interface Universe { void doStuff(); }
    // * class Star { public void doStuff() { System.out.println("Twinkle "); } }
    // * class Sun extends Star implements Universe { public void doStuff() { System.out.println("Shine "); } }

    Sun obj1 = new Sun();
    Star obj2 = obj1;
    ((Sun) obj2).doStuff(); // Shine
    ((Star) obj1).doStuff(); // Shine
    ((Universe) obj1).doStuff(); // Shine
  }

  void cast2() {
    float fVar = 123.123f;
    double dVar  = 123;
    short sVar = 123;
    int iVar = 123;
    long lVar = 123;
    iVar = fVar; // float to int
    fVar = iVar;
    dVar = fVar;
    lVar = sVar;
    fVar = dVar; // double to float
    dVar = iVar;
    iVar = dVar; // double to int
  }

  void localDateTime() {
    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    Period p = Period.of(1, 2, 3);
    d = d.minus(p);
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
    System.out.println(d.format(f));
  }

  void autoboxing() {
    List<Integer> ages = new ArrayList<>();
    ages.add(Integer.parseInt("5")); // is it autoboxing? // yes
    ages.add(Integer.valueOf("6"));  // is it autoboxing? // no
    ages.add(7);  // is it autoboxing? // yes
    ages.add(null);  // is it autoboxing? // no
    for (int age : ages) System.out.print(age);
  }

  void mathfun() {
    int x = 10;
    int y = x--;
    int z = --y;
    int a = x++;
    int b = x < y ? x < z ? x : y < z ? y : z;
    System.out.println(b);
  }

  void dates() {
    String date = LocalDate.parse("2016-07-13")
                        .plusDays(31)
                        .format(DateTimeFormatter.ISO_DATE_TIME);
    System.out.println(date);
  }
}

class WhackAnException {
  public static void main(String... hammer) {
    // try {
    //   throw new ClassCastException();
    // } catch (IllegalArgumentException e) {
    //   throw new IllegalArgumentException();
    // } catch (RuntimeException e) {
    //   throw new NullPointerException();
    // } finally {
    //   throw new RuntimeException();
    // }

  }
}

class TheFifthElement {
  public static void main(String[] args) {
    int[][] arr = new int[2][];

    arr[0] = new int[2];
    arr[0][0] = 1;

    arr[1] = new int[3];
    arr[1][2] = 30;
    // StringBuilder sb = new StringBuilder("1");  // earth
    // sb.append("2");                             // water
    // sb.append("3");                             // air
    // sb.append("4");                             // fire
    // sb.replace(4,4,"Leeloo");
    // System.out.println(sb);
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

class Machine {
  public static void main(String[] args) {
    int x1 = 50, x2 = 75;
    boolean b = x1 >= x2; // Line 4
    if(b = true) System.out.println("Success"); // Line 5
    else System.out.println("Failure");
  }
}


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
  static void i(int i) {
    i += 7;
  }

  static void s(String s) {
    s += " World";
  }

  void iint() {
    int j = 12;
    i(j); // needs to be System.out.println(m(j)); to print 19
    System.out.println(j); // prints 12
  }

  void str() {
    String s = "Hello";
    s(s); // needs to be System.out.println(s(s)); to print Hello World
    System.out.println(s); // prints Hello
  }

  public void main(String[] args) {
    iint();
    str();
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

  public static void main(String[] args) {
    Twin t1 = new Twin(13, "Male");
    Twin t2 = new Twin(13, "Male");
    if (t1 == t2) {
      System.out.println("Equal");
    } else {
      System.out.println("Not Equal"); // Not Equal cus == compares the references of the objects
    }

    if (t1.equals(t2)) {
      System.out.println("Equal"); // Equal cus .equals() compares the values of the objects
    } else {
      System.out.println("Not Equal");
    }

    System.out.println(t1.hashCode()); // 366712642
    System.out.println(t2.hashCode()); // 1829164700
  }
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

class Coat {
  public Long zipper() throws Exception {
    try {
      String checkZipper = (String)new Object();
    } catch (Exception e) {
      throw RuntimeException("Broken!"); // new keyword
    }
    return null;
  }
  public static void main(String... warmth) {
    try {
      new Coat().zipper();
      System.out.print("Finished!");
    } catch (Throwable t) {}
  }
}


class E1 {
  public static void main(String[] args) { 
    int i = 0;
    int[] iA = {10, 20};
    iA[i] = i = 30; // 
    System.out.println("" + iA[0] + " " + iA[1] + "  " + i);
  }
}

class E2 {
  public static void main(String[] args) {
    int k = 0;
    for (int i = 10; i > 0; i--) {
      while (i > 3) i -= 3;
      k += 1;
    }
    System.out.println(k);
  }
}

class E3 {
  public static void main(String[] args) {
    // provide me an example of one of those difficult ternary operator questions
    int x = 5;
    int y = 2;
    int z = 6;
    int a;
    // int a = x < 10 ? y > 3 ? z < 1 ? 1 : 2 : 3 : 4;

    if (x < 10) {
      if (y > 3) {
        if (z < 1) {
          a = 1;
        } else {
          a = 2;
        }
      } else {
        a = 3;
      }
    } else {
      a = 4;
    }

    System.out.println(a);
  }
}

