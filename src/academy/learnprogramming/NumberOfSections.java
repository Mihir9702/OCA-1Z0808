package academy.learnprogramming;

interface HasExoskeleton {
  abstract int getNumberOfSections();
}

abstract class Insect implements HasExoskeleton {
  abstract int getNumberOfLegs();
}

abstract class Beetle extends Insect { 
  int getNumberOfLegs() { return 6; }
  public abstract int getNumberOfSections();
}

public class NumberOfSections {
  
}
