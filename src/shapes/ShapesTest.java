package shapes;


public class ShapesTest {
  public static void main(String[] args) {
    //Old stuff below
//    Rectangle box1 = new Rectangle(5,4);
//    System.out.println(box1.getPerimeter());
//    System.out.println(box1.getArea());
//    Rectangle box2 = new Square(5);
//    System.out.println(box2.getPerimeter());
//    System.out.println(box2.getArea());

    Measurable myShape = new Rectangle(4,5);
    System.out.println(myShape.getPerimeter());
    System.out.println(myShape.getArea());

    myShape = new Square(5);
    System.out.println(myShape.getPerimeter());
    System.out.println(myShape.getArea());
    //Below doesn't work because we can't access the abstract class directly.
//    System.out.println(myShape.getLength);

  }
}
