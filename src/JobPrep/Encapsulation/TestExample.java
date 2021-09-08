package JobPrep.Encapsulation;

public class TestExample {
  public static void main(String[] args) {
    Example test = new Example();
//     NOTE: Can't access this outside of the class cause it's PRIVATE, and encapsulated inside of the other class.
//    System.out.println(test.myString);
//    NOTE: works because we are accessing a PUBLIC method, rather than the variable directly.
    System.out.println(test.getMyString());
  }
}
