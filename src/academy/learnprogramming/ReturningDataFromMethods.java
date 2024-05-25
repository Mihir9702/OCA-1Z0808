package academy.learnprogramming;

public class ReturningDataFromMethods {
  
  public static void main(String[] args) {
    int number = 2;
    String word = "xyz";

    System.out.println(number(number));
    System.out.println(word(word));
  }

  public static int number(int number) {
    return number * 2;
  }

  public static String word(String word) {
    return word + "abc";
  }
}
