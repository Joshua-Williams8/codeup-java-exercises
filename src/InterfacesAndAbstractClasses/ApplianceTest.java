package InterfacesAndAbstractClasses;

//Abstract class
//Can serve as a super, but we can't directly instantiate or use/make an abstract class.

public class ApplianceTest {
  public static void main(String[] args) {
    // Appliance app1 = new Appliance(); //This gets an error but lets try the subclass we made.
    Refrigerator app1 = new Refrigerator("Freezer", "LG", true);
//    System.out.println(app1.brandName);
//    System.out.println(app1.getType());
    app1.keepFresh();



  }
}
