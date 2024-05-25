package academy.learnprogramming;

// public void myMethod() {} // DOES NOT COMPILE
// public static void myMethod() {} // DOES NOT COMPILE

// PIC (package, import, class)

public class VariableScope {
  
  public static void main(String[] args) {
    int myLocalInt = 10;
    
    {
      {
        {
          int myOtherInt = 20;
          System.out.println("myOtherInt= " + myOtherInt);
          System.out.println("In most cases, you should declare variables in the smallest scope possible.");
        }
      }
    }

    {
      int myOtherInt = 30;
      System.out.println("myOtherInt= " + myOtherInt);
    }
    
    System.out.println("myLocalInt= " + myLocalInt);
    
    int myOtherInt = 40;
    System.out.println("myOtherInt= " + myOtherInt);
    
    {
      int myOtherInt2 = 50;
      System.out.println("myOtherInt2= " + myOtherInt2);
    }
    
    // System.out.println("myOtherInt2= " + myOtherInt2); // DOES NOT COMPILE

    int myOtherInt2 = 60;
    System.out.println("myOtherInt2= " + myOtherInt2);
    
    {
      int myOtherInt3 = 70;
      System.out.println("myOtherInt3= " + myOtherInt3);
    }
  }
}
