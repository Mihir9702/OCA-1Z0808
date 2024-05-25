package academy.learnprogramming;

public class DoWhileLoop {
  
  public static void main(String[] args) {
    int a = 0;

    do {
      a++;
    } while(false);

    System.out.println("a = " + a); // a = 1

    // while(false) { a++; } // unreachable statement
    // while (true) { a++; } // infinite loop

    int x = 20;

    while (x > 10) x--;

    System.out.println("x = " + x); // x = 10

    int x2 = 20;

    // one line
    do x--; while (x2 > 10); 

    // multiple lines
    do x--;
    while (x2 > 10); 

    System.out.println("x2 = " + x2); // x2 = 10

    int number = 10;

    do {
      number--;

      while (number > 5) {
        number += 1;
      }
    } while (number < 10);

    System.out.println("number = " + number); // number = 6
  }
}
