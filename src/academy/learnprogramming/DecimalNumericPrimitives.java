package academy.learnprogramming;

public class DecimalNumericPrimitives {
 
  public static void main(String[] args) {
    float myFloat = 25.4F;

    float underScoreFloat = 25_231.42323F;

    double myDouble = 25.4;
    double myDouble2 = 25.4F; // converts float to double automatically
    double anotherDouble = 2.45D; // D is optional, but good practice to include it
    double underScoreDouble = 10_000_000.5_123_456;
    double scientific = 5.000125E03; // 5.000125 * 10^3 = 5000.125
    double scientific2 = 5.000125E3; // 5.000125 * 10^3 = 5000.125

    double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number
    System.out.println("hexPi= " + hexPi); // 3.14

  }
}
