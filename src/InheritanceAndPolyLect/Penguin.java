package InheritanceAndPolyLect;

public class Penguin extends Bird{
  //Use the isA test to decide if you should make a class of a class.

  public void makeNoise(){
    System.out.println("Honk Honk");
  }
  public void move(){
    System.out.println("Waddle Waddle");
  }
}
