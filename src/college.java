public class college {
  public void move() {
    System.out.println("College is open");
  }
}
class univ extends college {
  public void move() {
    System.out.println("University is open too");
  }
}
//When a subclass defines the same method or property as a superclass, the subclass overrides the definition from the parent class

