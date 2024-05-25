package academy.learnprogramming;

public class StringBuilderExample {
  
  public static void main(String[] args) {
    String myString = "";

    for (char c = 'a'; c <= 'z'; c++) {
      myString += c; // every iteration this will create a new String object
    }

    System.out.println(myString);

    // with String Builder
    StringBuilder sb = new StringBuilder(); // create a new StringBuilder object

    for (char c = 'a'; c <= 'z'; c++) {
      sb.append(c); // append to the StringBuilder object
    }

    System.out.println(sb); // call the toString() method on the StringBuilder object
  }
}
