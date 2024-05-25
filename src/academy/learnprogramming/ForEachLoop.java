package academy.learnprogramming;

public class ForEachLoop {
  
  public static void main(String[] args) {
    String[] names = {"Jimmy", "John", "Tom", "Anthony"};

    for (int i = 0; i < names.length; i++) {
      System.out.println("names[i] = " + names[i]);
    }

    for (String name : names) {
      System.out.println("name = " + name);
    }

    StringBuilder[] builders = {
      new StringBuilder("For"),
      new StringBuilder("Loop")
    };

    for (StringBuilder builder : builders) {
      System.out.println(builder);
    }

    for (StringBuilder builder : builders) {
      builder.append("123");
      System.out.println(builder);
    }

    String pets = "Parrot";

    // for (String pet : pets) {} // DOES NOT COMPILE

    // for (int name : names) {} // DOES NOT COMPILE

    for (char c : pets.toCharArray())  {
      System.out.println(c);
    }
  }
}
