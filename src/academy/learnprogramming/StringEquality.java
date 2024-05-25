package academy.learnprogramming;

public class StringEquality {
  
  public static void main(String[] args) {
    String name = "John";
    String anotherName = "John";
    String john = "Jo" + "hn";
    String newName = new String("John");

    System.out.println("name == anotherName: " + (name == anotherName)); // true
    System.out.println("name == john: " + (name == john)); // true
    System.out.println("name == newName: " + (name == newName)); // false

    System.out.println("name.equals(anotherName): " + name.equals(anotherName)); // true
    System.out.println("name.equals(john): " + name.equals(john)); // true
    System.out.println("name.equals(newName): " + name.equals(newName)); // true

    System.out.println("name (identity): " + System.identityHashCode(name)); // 366712642
    System.out.println("anotherName (identity): " + System.identityHashCode(anotherName)); // 366712642
    System.out.println("john (identity): " + System.identityHashCode(john)); // 366712642
    System.out.println("newName (identity): " + System.identityHashCode(newName)); // 1829164700

    String str1 = "abc";
    String str2 = "ab";
    String str3 = str2 + "c";

    System.out.println("str1 == str2: " + (str1 == str2)); // false
    System.out.println("str1 == str3: " + (str1 == str3)); // false

    System.out.println("str1.equals(str2): " + str1.equals(str2)); // false
    System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
  }
}
