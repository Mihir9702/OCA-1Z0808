package academy.learnprogramming;

class Closed extends RuntimeException {}
class ClosedForLunch extends Closed {}

public class CatchingExceptions {
  
  public static void main(String[] args) {
    // need to be able to catch checked exceptions
    // need to handle subclass exceptions before superclass exceptions

    try {
      visit();
    } catch (ClosedForLunch e) { // subclass
      System.out.println("Closed for lunch");
    } catch (Closed e) { // superclass
      System.out.println("Closed");
    }

    System.out.println(calc());
  }

  public static void visit() {
    boolean b = Math.random() < 0.5;

    if (b) {
      throw new ClosedForLunch();
    }

    throw new Closed();
  }

  public static String calc() {
    String result = "";
    String str = null;

    try {
      try {
        result += "start"; // result = "start"
        str.length();
        result += "end";
      } catch (NullPointerException e) {
        result += "npe"; // result = "startnpe"
        throw new RuntimeException();
      } finally {
        result += "finally"; // result = "startnpefinally"
        throw new Exception();
      }
    } catch (Exception e) {
      result += "finished"; // result = "startnpefinallyfinished"
    }

    return result;
  }
}
