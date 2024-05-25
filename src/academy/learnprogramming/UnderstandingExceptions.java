package academy.learnprogramming;

public class UnderstandingExceptions {
  
  public static void main(String[] args) {
    int[] myArray = new int[2];
    System.out.println(myArray[5]); // ArrayIndexOutOfBoundsException

    String str = null;
    System.out.println(str.length()); // NullPointerException

    String[] stringArray = {"Welcome!"};
    System.out.println(stringArray[1]); // ArrayIndexOutOfBoundsException

    int x = 1;
    int y = 0;
    System.out.println(x / y); // ArithmeticException

    String numberStr = "abc";
    int number = Integer.parseInt(numberStr); // NumberFormatException

    Object o = new Object();
    String str2 = (String) o; // ClassCastException

    int[] myArray2 = new int[-2]; // NegativeArraySizeException

    int[] myArray3 = new int[2];
    myArray3 = null;
    System.out.println(myArray3[0]); // NullPointerException
  }
}
