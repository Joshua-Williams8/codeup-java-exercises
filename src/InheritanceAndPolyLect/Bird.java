package InheritanceAndPolyLect;

public class Bird {
  private boolean canFly;

  public boolean isCanFly() {
    return canFly;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }

  //What kind of bird? //The reason why the we use getters and setters, it's to protect the property, by not directly interating with them.
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void makeNoise(){
    System.out.print(this.getName() + " goes ");
//    System.out.println("Tweet Tweet");//What if we need different noises for different birds??
  }
  //Protected access modifier is like a private, but not just for the class but it's also for all the subclasses. So a good way to test this is by swapping it with protected. So Private means ONLY THE CALSS IT'S IN can have getters and setters that access it.

  public void move(){
    System.out.println("*flapping noises*");
  }



}
