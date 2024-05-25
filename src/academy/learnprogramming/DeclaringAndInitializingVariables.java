package academy.learnprogramming;

public class DeclaringAndInitializingVariables {

  // $ and _ are valid characters for identifiers
  // changing identifiers i.e public to Public is legal but not recommended

  public static void main(String[] args) {
    // declaring and initializing

    // two lines
    int myNumber; // declaration
    myNumber = 10; // initialization
    System.out.println("myNumber= " + myNumber);

    // one line
    double myDouble = 7.50; // declaration and initialization
    System.out.println("myDouble= " + myDouble);

    float myFloat1, myFloat2, myFloat3;
    float myFloat4; float myFloat5;
    float myFloat6 = 5f, myFloat7 = 10f, myFloat8;
    boolean b1, b2; // is the same as boolean b1; boolean b2;
    b1 = b2 = true; // chained assignment

    // double d1, double d2; // DOES NOT COMPILE

    int i1;
    int i2;
    // int i3; i4 // DOES NOT COMPILE

    char cHaR;
    char Char;

    char A$b;
    float okFloat;
    double $Ok2Double1;
    double _alsoDouble;
    float __OkButNotNice$_123;

    // illegal examples
    // double 3point; // identifiers cannot begin with a number
    // double my@street; // '@' is not a letter, digit, $ or _
    // float *$coffee; // '*' is not a letter, digit, $ or _
    // double public; // 'public' is a reserved word
    double Public; // but this works although not recommended
    
  }
}