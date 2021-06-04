package shapes;

public class Rectangle {

  protected double length;
  protected double width;

//  protected Rectangle(){
//
//  }
  //Above was for my old solution without using the super class.

  public Rectangle(double len, double wid){
    this.length = len;
    this.width = wid;
  }


  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getPerimeter(){
    return (2 * this.length) + (2 * this.width);
  }

  public double getArea(){
    return this.width * this.length;
  }

}
