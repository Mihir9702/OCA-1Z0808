package academy.learnprogramming;

public class WholeNumericPrimitives {
  
  public static void main(String[] args) {
    long max = 32_123_456_789L;
    long n = 2_300;

    // octal (0-7)
    int oct = 8;
    int firstOct = 010; // 8 decimal
    int secondOct = 022; // 18 decimal

    int sumOct = firstOct + secondOct; // 26 decimal, 32 octal
    System.out.println("firstOct = " + firstOct + " secondOct = " + secondOct);
    System.out.println("decimal sum = " + sumOct + " octSum = " + Integer.toOctalString(sumOct));

    // hexadecimal (0-9 and A-F)
    int firstHex = 0xF; // 15 decimal
    int secondHex = 0x1E; // 30 decimal
    int sumHex = firstHex + secondHex; // 45 decimal, 2D hex
    System.out.println("firstHex = " + firstHex + " secondHex = " + secondHex);
    System.out.println("decimal sum = " + sumHex + " hexSum = " + Integer.toHexString(sumHex));

    // binary
    int firstBin = 0b1001; // 9 decimal
    int secondBin = 0b0111; // 7 decimal
    int sumBin = firstBin + secondBin; // 16 decimal, 10000 binary

    // int thirdBin = 0b2; // not valid! 0b is only for 0 and 1
    System.out.println("firstBin = " + firstBin + " secondBin = " + secondBin);
    System.out.println("decimal sum = " + sumBin + " binSum = " + Integer.toBinaryString(sumBin));
  }
}
