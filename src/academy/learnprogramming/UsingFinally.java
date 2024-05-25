package academy.learnprogramming;

public class UsingFinally {
  
  public static void main(String[] args) {
    String[] array = new String[5];
    
    try {
      String element = upperCase(array);
      System.out.println("element = " + element);
    } catch (NullPointerException e) {
      System.out.println("error message: " + e.getMessage());
    } finally {
      System.out.println("finally block");
    }

    // exam tricks
    String str = "";
    try {
      // int result = 10 / 0; // 234
      str += "1";
      // int result = 10 / 0; // 1234
    } catch (Exception e) {
      str += "2";
    } finally {
      str += "3";
    }

    str += "4";
    System.out.println(str); // 134
  }

  public static String upperCase(String[] array) {
    return array[0].toUpperCase();
  }
}
