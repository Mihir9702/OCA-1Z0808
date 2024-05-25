package academy.learnprogramming;

public class StringImmutability {
  
  public static void main(String[] args) {
    String hello = "hello";
    String world = "world";
    String helloWorld = hello + world;

    System.out.println(hello); // hello
    System.out.println(helloWorld); // helloworld

    hello = hello.toUpperCase();

    System.out.println(hello); // HELLO
    System.out.println(helloWorld); // helloworld

    String replaceResult = helloWorld.replace('h', 'H');

    System.out.println(replaceResult); // Helloworld
    System.out.println(helloWorld); // helloworld

    // concat
    String s1 = "1"; // s1 is now 1
    String s2 = s1.concat("2"); // s2 is now 12
    s2.concat("3"); // not captured

    System.out.println(s1); // 1
    System.out.println(s2); // 12

  }
}
