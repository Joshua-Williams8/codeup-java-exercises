package Electronics;

public class LaptopTest {
  public static void main(String[] args) {
    Laptop testDell = new Dell("Latitude");
//    LAptop cannot be instantiated because it's abstract, we want it abstract because each laptop needs to have a make and model.
    System.out.println(testDell.getMake());
    System.out.println(testDell.getModel());
  }
}
