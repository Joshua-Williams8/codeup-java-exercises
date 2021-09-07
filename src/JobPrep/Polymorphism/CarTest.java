package JobPrep.Polymorphism;

public class CarTest {
  public static void main(String[] args) {
    Car a = new Car();
    Car b = new ElectricCar();
    a.drive();
    b.drive();
  }
}
