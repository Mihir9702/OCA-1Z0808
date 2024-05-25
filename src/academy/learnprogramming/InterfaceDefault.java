package academy.learnprogramming;

class InterfaceCow implements InterfaceDefault {
  
    public InterfaceCow() {}
  
    @Override
    public void eatPlants() {
      System.out.println("Cow eating plants");
    }
}

class InterfaceRabbit implements InterfaceDefault {
  
    public InterfaceRabbit() {}

    // contains eatPlants() method from InterfaceHerbivore
}

public interface InterfaceDefault {

  default void eatPlants() {
    System.out.println("Eating plants");
  }
}