package oopLecture;

public class Car {

  public String model;
  public int year;
  public String color;
  public void run() {
    System.out.println("The car is running");
  }
  //This is a blue print our Car objects?
  public static void main(String[] args) {
    Car car1 = new Car(); // Were making a new object, with the template we have.
    System.out.println(car1); //This is just the ID java gave it?

    car1.model = "Kia";
    car1.color = "Yellow";
    car1.year = 2018;
    System.out.println(car1.model);
    System.out.println(car1.color);
    System.out.println(car1.year);

    Car car2 = new Car(); // instantiate?

    System.out.println(car2);
    car2.model = "Dodge";
    System.out.println(car2.model);
    System.out.println(car2.color); // Says null cause it's not defined or holding a value.
  }
}
