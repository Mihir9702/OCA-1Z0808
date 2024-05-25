package academy.learnprogramming;

public class WhileLoop {
  
  public static void main(String[] args) {
    int spaceOnHdd = 5;

    while (spaceOnHdd > 0) {
      spaceOnHdd--;
      System.out.println("spaceOnHdd = " + spaceOnHdd);
    }

    // while (true) {} // infinite loop
  }
}
