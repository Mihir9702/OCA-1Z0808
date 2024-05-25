package academy.learnprogramming;

public class MethodDesign {
  
  public void jump() {} // public access modifier

  // void public void jump2() {}  // DOES NOT COMPILE

  void jump3() {} // default access modifier

  public final void jump4() {} // final means it cannot be overridden

  public static final void jump5() {} // static means it can be called without an instance of the class

  public final static void jump6() {} // order of static and final does not matter

  // public modifier void jump7() {} // DOES NOT COMPILE

  // public String void jump8() {} // DOES NOT COMPILE

  final public void jump9() {} // order of final and public does not matter

  final static public void jump10() {} // order of final, static, and public does not matter

  // String int public void jump11() {} // DOES NOT COMPILE
}
