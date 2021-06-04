package shapes;

public class Square extends Rectangle {

  private double side;



  public Square(double side) {
      super(side,side);
      //Below is old solution with out superclass,
//      this.width = side;
//      this.length = side;
      this.side = side;
  }


  public double getSide() {
    return this.side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  @Override
  public double getPerimeter() {
    return 4 * this.side;
  }

  @Override
  public double getArea() {
    return Math.pow(this.side, 2 );
  }
}
