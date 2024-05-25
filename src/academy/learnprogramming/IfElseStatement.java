package academy.learnprogramming;

public class IfElseStatement {
  
  public static void main(String[] args) {
    boolean b = true;

    if (!b || b == false) {
      System.out.println("false");
    }

    if (b) { 
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    int x = 1;
    // if (x) {} // DOES NOT COMPILE
    // if (x = 1) {} // DOES NOT COMPILE
    if (x == 1) {}

    int testScore = 76;
    char grade;

    if (testScore >= 90) {
      grade = 'A';
    } else if (testScore >= 80) {
      grade = 'B';
    } else if (testScore >= 70) {
      grade = 'C';
    } else if (testScore >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }

    System.out.println("grade = " + grade);

    int hoursOfDay = 10;
    if (hoursOfDay < 11)  System.out.println("Morning");
    else if (hoursOfDay < 17) System.out.println("Afternoon");
    else System.out.println("Evening");
  }
}
