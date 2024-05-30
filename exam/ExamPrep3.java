package exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExamPrep3 {}

// * default methods only work with interfaces
// * do / while loops always execute at least once
// ** FileNotFormatException // IOException // FileNotFoundException
// ** Predicates
// ** Primitives
// ** Interfaces

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
}
