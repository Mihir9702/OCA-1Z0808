package academy.learnprogramming;

public class MethodReturnType {
  
  public void jump() {} // return type void

  public void jump2() { return; } // return type void - return statement on void is optional

  public String jump3() { return ""; } // return type String

  // public String jump4() {} // DOES NOT COMPILE - missing return statement

  // public jump5() {} // DOES NOT COMPILE - missing return type

  String jump6(int a) { 
    if (a == 5) {
      return "";
    }

    // return null; // ? does this work
    return ""; // - must return a String
  }

  int getInt() {
    return 9;
  }

  int getLong() {
    return (int)9L;
  }

  int expanded() {
    // int temp = 10;
    // return temp;
    return 10;
  }

  boolean isTrue() {
    // return 5 < 10; // valid return statement
    return 5 == 5; // valid return statement
  }

  public void test() {}

  // public void 2test() {} // DOES NOT COMPILE - method name cannot start with a number
  
  public void $test() {} // valid method name
  public void _test() {} // valid method name
}
