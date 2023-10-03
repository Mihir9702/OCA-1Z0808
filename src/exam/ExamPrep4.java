package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// * Overloaded methods must have a different list of parameters, while overridden methods must have the exact same return type.

public class ExamPrep4 {}


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

class Two { 
  public static void main(String[] args) {
    try {
      doStuff();
      System.out.println("1");
    }
    catch (Exception e) {
      System.out.println("2");
    }
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