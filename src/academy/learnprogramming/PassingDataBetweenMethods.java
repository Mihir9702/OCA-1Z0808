package academy.learnprogramming;

public class PassingDataBetweenMethods {
  
  public static void main(String[] args) {
    int number = 4;
    System.out.println("number= " + number);

    newNumber(5);
    System.out.println("number= " + number);

    String name = "Jimmy";
    System.out.println("name= " + name);

    newName(name);
    System.out.println("name= " + name);

    StringBuilder sb = new StringBuilder();

    StringBuilder s = sb;
    s.append("Anthony");

    build(sb);
    System.out.println("s= " + s);
    System.out.println("sb= " + sb);
  }

  public static void newNumber(int number) {
    System.out.println("newNumber= " + number);
    number = 10;
    System.out.println("newNumber= " + number);
  }

  public static void newName(String name) {
    System.out.println("newName= " + name);
    name = "Timmy";
    System.out.println("newName= " + name);
  }

  public static void build(StringBuilder s) {
    System.out.println("build= " + s);
    s.append("Tom");
  }
}
