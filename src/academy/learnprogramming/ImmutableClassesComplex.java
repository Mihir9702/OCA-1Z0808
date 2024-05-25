package academy.learnprogramming;

public class ImmutableClassesComplex {

  private final double real;
  private final double imaginary;

  public ImmutableClassesComplex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }
  
  public ImmutableClassesComplex plus(ImmutableClassesComplex b) {
    double newReal = real + b.getReal();
    double newImaginary = imaginary + b.getImaginary();
    return new ImmutableClassesComplex(newReal, newImaginary);
  }

  public ImmutableClassesComplex minus(ImmutableClassesComplex b) {
    double newReal = real - b.getReal();
    double newImaginary = imaginary - b.getImaginary();
    return new ImmutableClassesComplex(newReal, newImaginary);
  }

  public ImmutableClassesComplex times(ImmutableClassesComplex b) {
    double newReal = real * b.getReal() - imaginary * b.getImaginary();
    double newImaginary = real * b.getImaginary() + imaginary * b.getReal();
    return new ImmutableClassesComplex(newReal, newImaginary);
  }

  public static ImmutableClassesComplex plus(ImmutableClassesComplex a, ImmutableClassesComplex b) {
    // double real = a.real + b.real;
    // double imaginary = a.imaginary + b.imaginary;
    // return new ImmutableClassesComplex(real, imaginary);
    return a != null ? a.plus(b) : b;
  }
}
