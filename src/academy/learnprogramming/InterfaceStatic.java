package academy.learnprogramming;

class InterfaceStaticRabbit implements InterfaceStatic {
  
  public InterfaceStaticRabbit() {}
  
  public static void main(String[] args) {
    System.out.println(InterfaceStatic.getJumpHeight());
  }
}

public interface InterfaceStatic {
  
  static int getJumpHeight() {
    return 2;
  }
}
