package academy.learnprogramming;

class Example {
  private String name = "dog";

  { System.out.println(name); } // second

  private static int COUNT = 0;

  static { System.out.println(COUNT); } // first

  { 
    COUNT += 10;
    System.out.println(COUNT); // third
  }

  public Example() {
    System.out.println("constructor"); // fourth
  }
}

class Demo {

  static { add(2); } // first

  static void add(int number) { System.out.print(number + " "); }  // fifth

  Demo() { add(5); } // fourth

  static { add(4); } // second

  { add(6); }

  static { new Demo(); } // third { add(6) -> add(8) }

  { add(8); }
}

public class OrderOfInitialization {
  
  public static void main(String[] args) {
    new Example();
    new Demo();
  }
}
