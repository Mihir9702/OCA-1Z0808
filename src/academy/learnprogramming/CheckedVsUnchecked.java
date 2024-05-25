package academy.learnprogramming;

public class CheckedVsUnchecked {
  
  public static void main(String[] args) {
    
    // myMethod(); // checked exception
    myMethod2(); // unchecked exception
  }

  public static void myMethod() throws Exception { // checked exception
    throw new Exception("Failed to load");
  }

  public static void myMethod2() throws RuntimeException { // unchecked exception
    throw new RuntimeException("Incorrect Parameter Type");
  }
}
