package academy.learnprogramming;

public class ImmutableClasses {
  
  public static void main(String[] args) {
    ImmutableClassesComplex a = new ImmutableClassesComplex(5.0, 6.0);
    ImmutableClassesComplex b = new ImmutableClassesComplex(-3.0, 4.0);

    ImmutableClassesComplex bPlusA = b.plus(a);

    System.out.println("a.real= " + a.getReal() + " a.imaginary= " + a.getImaginary());
    System.out.println("b.real= " + b.getReal() + " b.imaginary= " + b.getImaginary());
    System.out.println("bPlusA.real= " + bPlusA.getReal() + " bPlusA.imaginary= " + bPlusA.getImaginary());
  }
}
