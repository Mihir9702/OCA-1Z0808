package academy.learnprogramming;

public class MethodChaining {
  
  public static void main(String[] args) {
    String start = "  Java  ";
    String trimmed = start.trim(); // "Java"
    String lowerCase = trimmed.toLowerCase(); // "java"
    String result = lowerCase.replace('j', 'J'); // "Java"
    System.out.println(result);

    String result2 = "  Java  ".trim().toLowerCase().replace('j', 'J');
    System.out.println(result2);
    
    System.out.println(result.equals(result2)); // true

    String a = "abc";
    String b = a.toUpperCase();
    String c = b.replace('B', 'b').replace('C', 'c');
    System.out.println("a= " + a); // a= abc
    System.out.println("b= " + b); // b= ABC
    System.out.println("c= " + c); // c= Abc

    if (a.equalsIgnoreCase(b)) {
      System.out.println("String are equal");
    } else {
      System.out.println("String are not equal");
    }

    if (a.toLowerCase().trim().equals(b.toLowerCase().trim())) {
      System.out.println("Equal");
    } else {
      System.out.println("Not equal");
    }

    String z = "123";
    int zz = Integer.parseInt(z);
    System.out.println("zz= " + zz); // zz= 123

    // int bad = Integer.parseInt("a"); // throws NumberFormatException
    // System.out.println("bad= " + bad);

    int good = Integer.parseInt("123");
    System.out.println("good= " + good);

    int total = 0;
    String s1 = "1";
    String s2 = "2";
    String s3 = "3";
    total += Integer.parseInt(s1);
    total += Integer.parseInt(s2);
    total += Integer.parseInt(s3);
    System.out.println("total= " + total); // total= 6

    String s4 = "1.2";
    String s5 = "2.3";
    double d1 = Double.parseDouble(s4);
    double d2 = Double.parseDouble(s5);
    System.out.println("total= " + (d1 + d2)); // total= 3.5
  }
}
