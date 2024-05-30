package exam;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class ExamPrep4 {
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

  public static void main(String[] args) {
    Samples3 s = new Samples3();
    s.scope(); 
    s.os(); 
    s.eString();
    s.strMatch();
    s.math();
    s.bools();
    s.stopLoop();
    s.byteVal();
    s.matrix();
    s.print();
  }
}

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

}
