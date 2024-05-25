package academy.learnprogramming;

public class EqualityOperators {
  
  public static void main(String[] args) {
    int a = 5;
    int b = 3;
    boolean c = a == b; // false 
    boolean d = a != b; // true
    boolean e = (a == b) == ! (a != b); // true

    // boolean g = true == 0; // DOES NOT COMPILE
    // boolean h = false != "true"; // DOES NOT COMPILE

    boolean x = true;
    boolean y = false;
    boolean z = (y = true) && (x = false); 

    System.out.println("x= " + x + " y= " + y + " z= " + z); // x= false y= true z= false
  }
}
