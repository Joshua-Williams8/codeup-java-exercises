package InheritanceAndPolyLect;

public class Duck extends Bird {
  //Now Duck will get all the properties from Bird.
  //Only the public methods get extended into Duck, aka Duck inherents public methods.
  //Compiling and running are 2 different things
  //Compiling is translating it to 01s? and running is when we actaully see what the program does?

  //Now were going to override a method.
  public void makeNoise(){
    super.makeNoise();
    System.out.println("Quack Quack");
  }
  //Below is for my private vs protected example.
//  public void sayName(){
//    System.out.println(this.name);
//  }

//    public void sayName(){
//    System.out.println(super.name);
//  }


  //If you change the output or the inputs then it's an overload instead of an override.


}
