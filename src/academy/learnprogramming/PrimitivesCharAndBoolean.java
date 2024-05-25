package academy.learnprogramming;

public class PrimitivesCharAndBoolean {
  
  public static void main(String[] args) {
    char ch = 'a';

    // char ch1 = 'ab'; // error: unclosed character literal
    char ch1 = '1'; // valid
    char uniChar = '\u03A9'; // uppercase greek omega character
    char romanNumber = '\u216C'; // roman 50 number

    System.out.println("ch1 = " + ch1);
    System.out.println("uniChar = " + uniChar);
    System.out.println("romanNumber = " + romanNumber);

    boolean myBoolean = true;
    boolean myFalseBoolean = false;

    System.out.println("myBoolean = " + myBoolean);
    System.out.println("myFalseBoolean = " + myFalseBoolean);

    // boolean true = false; // error: not a statement
    // boolean public = false; // error: not a statement
    // boolean void = false; // error: not a statement
    // boolean if = false; // error: not a statement
    // boolean else = false; // error: not a statement
    // boolean return = false; // error: not a statement
    // boolean null = false; // error: not a statement

  } 
}
