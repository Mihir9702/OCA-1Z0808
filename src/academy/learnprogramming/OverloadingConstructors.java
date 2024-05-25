package academy.learnprogramming;

class OverloadingConstructorsDog {
  private String name;
  private String breed;
  private double weight;

  public OverloadingConstructorsDog(String name) {
    this.name = name;
    breed = "husky";
    weight = 30.0;
  }

  public OverloadingConstructorsDog(String name, String breed) {
    this.name = name;
    this.breed = breed;
    weight = 30.0;
  }

  public OverloadingConstructorsDog(String name, String breed, double weight) {
    this.name = name;
    this.breed = breed;
    this.weight = weight;
  }

  public void print() {
    System.out.println("name = " + name + " breed = " + breed + " weight = " + weight);
  }
}

public class OverloadingConstructors {
  
  public static void main(String[] args) {
    OverloadingConstructorsDog dog1 = new OverloadingConstructorsDog("Jimmy");
    dog1.print(); // name = Jimmy breed = husky weight = 30.0

    OverloadingConstructorsDog dog2 = new OverloadingConstructorsDog("Anthony", "Pitbull");
    dog2.print(); // name = Anthony breed = Pitbull weight = 30.0

    OverloadingConstructorsDog dog3 = new OverloadingConstructorsDog("Rex", "German Shepherd", 40.0);
    dog3.print(); // name = Rex breed = German Shepherd weight = 40.0
  }

}
