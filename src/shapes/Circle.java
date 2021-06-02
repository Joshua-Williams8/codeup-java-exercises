package shapes;

import util.Input;

//public class Circle(double radius) { // ?? Use this?
public class Circle {
  Input getting = new Input();


  public double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  public Circle(){
   this.radius = getting.getDouble();
  }
  public double getArea(){
    return Math.PI * (Math.pow(this.radius,2));
  }

  public double getCircumference(){
    return 2 * Math.PI * this.radius;
  }
  public boolean newCircle(){
    System.out.println("Would you like to check out another circle?");
    boolean ask = getting.yesNo();
//    System.out.println("You should be asking me?");
    //You can't put this in the if state cause it won't run properly?
    if (ask){
      this.radius = getting.getDouble();
//      System.out.println(this.radius);
      System.out.printf("New circumference is %f.\n",getCircumference());
      System.out.printf("New area is %f.\n", getArea());
      return newCircle();
    } else {
      return false;
    }
  }






}
