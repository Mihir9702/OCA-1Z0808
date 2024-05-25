package academy.learnprogramming;

public class StringConcatenation {
  
  public static void main(String[] args) {
    String text = "hello";
    String anotherText = new String("hello");

    System.out.println(2 + 3); // 5
    System.out.println("a" + "b"); // ab
    System.out.println(1 + 2 + "d"); // 3d

    int number = 10;
    int anotherNumber = 20;
    System.out.println("result= " + number + anotherNumber); // result= 1020
    System.out.println("result= " + (number + anotherNumber)); // result= 30

    String str = "";
    for (int i = 0; i < 10; i++)  {
      str += i + " ";
    }

    System.out.println(str);

    String hello = "hello";
    String world = "world";
    // hello + world; // DOES NOT COMPILE

    System.out.println(hello);
  }
}
