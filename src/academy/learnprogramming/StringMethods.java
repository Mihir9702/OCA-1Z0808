package academy.learnprogramming;

public class StringMethods {
  
  public static void main(String[] args) {
    // 0 1 2 3 4 5 6 7 8 9 10
    // j a v a   i s   f u n
    String str = "java is fun";

    // length
    System.out.println("length= " + str.length());

    // charAt
    System.out.println("charAt= " + str.charAt(0)); // j
    System.out.println("charAt= " + str.charAt(2)); // v
    System.out.println("charAt= " + str.charAt(6)); // i
    System.out.println("charAt= " + str.charAt(10)); // n
    // System.out.println("charAt= " + str.charAt(11)); // throws exception

    // indexOf
    System.out.println("indexOf= " + str.indexOf('a')); // 1
    System.out.println("indexOf= " + str.indexOf('a', 2)); // 3
    System.out.println("indexOf= " + str.indexOf("fun")); // 8
    System.out.println("indexOf= " + str.indexOf("fun", 10)); // -1

    // substring
    System.out.println("substring= " + str.substring(8)); // fun
    System.out.println("substring= " + str.substring(0, 5)); // java
    System.out.println("substring= " + str.substring(4, 4)); // empty string
    // System.out.println("substring= " + str.substring(4, 2)); // throws exception
    // System.out.println("substring= " + str.substring(8, 14)); // throws exception

    // toLowerCase
    System.out.println("toLowerCase= " + str.toLowerCase());

    // toUpperCase
    System.out.println("toUpperCase= " + str.toUpperCase());

    // equals
    System.out.println("equals= " + str.equals("java is fun")); // true
    System.out.println("equals= " + str.equals("Java is fun")); // false

    // startsWith
    System.out.println("startsWith= " + str.startsWith("java")); // true
    System.out.println("startsWith= " + str.startsWith("Java")); // false

    // endsWith
    System.out.println("endsWith= " + str.endsWith("fun")); // true
    System.out.println("endsWith= " + str.endsWith("Fun")); // false

    // contains
    System.out.println("contains= " + str.contains("is")); // true
    System.out.println("contains= " + str.contains("si")); // false

    // replace
    System.out.println("replace= " + str.replace('a', 'A')); // jAvA is fun
    System.out.println("replace= " + str.replace(" ", "_")); // java_is_fun

    // trim
    System.out.println("trim= " + str.trim()); // java is fun
    System.out.println("trim= " + " java is fun   ".trim()); // java is fun
  }
}
