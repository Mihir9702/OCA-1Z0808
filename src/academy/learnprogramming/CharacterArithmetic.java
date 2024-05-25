package academy.learnprogramming;

public class CharacterArithmetic {
  
  public static void main(String[] args) {
    // char 0 - 65535
    char myCharA = 'A';
    char myCharNum = '1';

    System.out.println("myCharA= " + myCharA);
    System.out.println("myCharA isLetter= " + Character.isLetter(myCharA));
    System.out.println("myCharA isDigit= " + Character.isDigit(myCharA));


    System.out.println("myCharNum= " + myCharNum);
    System.out.println("myCharNum isLetter= " + Character.isLetter(myCharNum));
    System.out.println("myCharNum isDigit= " + Character.isDigit(myCharNum));

    // exam examples

    char letter = 65; // 'A'
    int myInt = letter + 3; // 65 + 3 = 68
    char myNewLetter = (char) myInt; // 'D'

    char myChar = 65; // 'A'
    char newChar = (char)(myChar + 1); // 'B'
    boolean b = newChar == 'B'; // true
    boolean c = (newChar++ < 'D'); // true // B < D

    System.out.println("myChar= " + myChar); // A
    System.out.println("newChar= " + newChar); // C
    System.out.println("b= " + b); // true
    System.out.println("c= " + c); // true
  }
}
