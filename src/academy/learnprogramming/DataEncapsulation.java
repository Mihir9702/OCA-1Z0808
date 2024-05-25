package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DataEncapsulationCompany {
  private String name;
  private List<String> employees = new ArrayList<>();

  public void printSorted() {
    System.out.println("company name = " + name);
    Collections.sort(employees);
    System.out.println("sorted = " + employees);
  }

  public void setName(String name) {
    if (name == null || name.isEmpty()) { throw new NullPointerException("name cannot be null"); }
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addEmployee(String name) {
    if (name == null || name.isEmpty()) { throw new NullPointerException("name cannot be null"); }
    employees.add(name);
  }
}

public class DataEncapsulation {
  
  public static void main(String[] args) {
    DataEncapsulationCompany company = new DataEncapsulationCompany();
    company.setName("MyCompany");
    company.addEmployee("John");
    company.addEmployee("Anthony");
    company.addEmployee("Jimmy");
    company.printSorted();


    // company.addEmployee(null);
    // company.addEmployee("Jimmy"); // NullPointerException
 
    company.printSorted(); // NullPointerException because Collections.sort(null) throws NullPointerException
  }
}
