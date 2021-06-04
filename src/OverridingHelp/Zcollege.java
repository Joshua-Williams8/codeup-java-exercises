package OverridingHelp;

public class Zcollege {
  public void move() {
    System.out.println("College is open");
  }
}
// We're saying that OverridingHelp.univ is an extension of college class?
//If you call OverridingHelp.univ rather than college you'll get this other set of instructions for move?
class univ extends Zcollege {
  public void move() {
    System.out.println("University is open too");
  }
}
//When a subclass defines the same method or property as a superclass, the subclass overrides the definition from the parent class

