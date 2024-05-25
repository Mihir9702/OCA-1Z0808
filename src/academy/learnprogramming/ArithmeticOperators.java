package academy.learnprogramming;

public class ArithmeticOperators {
  
  public static void main(String[] args) {
    
    int result = 3 - 2 + 2 * 2 + 3;

    System.out.println("result= " + result);

    result = 4 / 2 + 1 - 4 * 2 + 10;

    System.out.println("result= " + result);

    int a = 4;
    int b = 3 - 2 * --a; // decrement then use a
    System.out.println("a= " + a + " b= " + b); // a=3 b=-3

    a = 4;
    b = 3 - 2 * a--; // use a then decrement
    System.out.println("a= " + a + " b= " + b); // a=3 b=-5

    long c = 2;
    long d = 4 + 3 * c++; // use c then increment
    System.out.println("c= " + c + " d= " + d); // c=3 d=10

    result = 10 - 3 * (2 + 1) - 4 / (1 + 3);
    System.out.println("result= " + result); // 0

    int i = 10;
    int j = 3;

    int k = i / j;
    int e = 10 % 2;
    int mod = i % j;
    System.out.println("k= " + k + " e= " + e + " mod= " + mod); // k=3 e=0 mod=1

    int f = 12;
    int g = 5;
    int h = 2;

    int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;
    // 12 / 2 - 10 % 7 - 2 * 12 % 5 - 2 * 3
    // 6 - 10 % 7 - 24 % 5 - 6 
    // 6 - 3 - 4 - 6 
    // -7

    System.out.println("m= " + m);
  }
}
