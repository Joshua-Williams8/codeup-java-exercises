package shapes;

import util.Input;

public class CircleApp {

  public static void main(String[] args) {
    Input testing = new Input();
    System.out.println("Please enter the new circle's radius");
    Circle testCircle = new Circle();
    System.out.println(testCircle.radius);
    System.out.println(testCircle.getCircumference());
    System.out.println(testCircle.getArea());

    System.out.println("Example for 10 below.");
    Circle testCircle2 = new Circle(10);
    System.out.println(testCircle2.radius);
    System.out.println(testCircle2.getCircumference());
    System.out.println(testCircle2.getArea());
//    System.out.println("Would You like to see another Circle?");
//    testing.yesNo();
    testCircle.newCircle();
  }
}
