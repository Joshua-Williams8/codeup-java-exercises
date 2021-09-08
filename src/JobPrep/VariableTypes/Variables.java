package JobPrep.VariableTypes;

//There are 3 variable types!
//note: Local, Instance, and Static!/Class varaible.
public class Variables {
//  The variable is declared using a data type with the identifier name ex:
  String aVar = "variable";
//  It can be initialized at the time of declaration or it can be assigned a value taken from the user.

//  NOTE: Java Instance Variable
//  Variables that are declared inside the class but OUTSIDE the scope of the any method area called instance variables in Java.
//  Can be initialized at the time of the class loading or when an object of the class is created.
//  Instance variables of different types have default values that are specified in the next point.
  public String aInstanceVar = "Instance!";
//  Below is an instance Method
  public void soutIV(){
    System.out.println(aInstanceVar);
  }
//  NOTE: Features
//1. To use an instance variable an object of the class mUST BE CREATED.
//  2. An instance variable is DESTROYED when the object it is associated with is destroyed.
//  3. An instance variable does not compulsory need to be initialized
//  4. Instance variables

//  NOTE: Limitations
//  1. I cannot be delcared static, abstract, sriftp, synchronized, and native.
//  2. It can be declared final and transient.
//  3. It can be of any of the 4 access mods

//  NOTE: Local Variable
//  A varaible declared inside the body of a method is called a local variable. You can use this varaible ONLY within the method and the other methods in the class aren't even aware, that it exists.
//  Used to store values that are required for aparticular method.

  public void soutLVInside(){
    String aLocalVar = "I'm inside this method!";

    System.out.println(aLocalVar);
  }
  public void soutLocVarInside(){
    String aLocalVar = "We're named the same thing cause we cannot see each other.";

    System.out.println(aLocalVar);
  }

//  NOTE: Static variable
//  A varaible that is declared as static, it cannot be local. You can create a single copy of it and share it among all the instances of the class.
// Have the same lifetime as the program. Only have one single copy of the entire class? USed for storing constants.
  public static String aStaticVar = "A Static string";

  public static void soutSV(){
    System.out.println(aStaticVar);
  }

  public static void main(String[] args) {
//    Notice how I can call the method, without have to make an object of the class first.
    soutSV();

    Variables var = new Variables();
    var.soutLocVarInside();
    var.soutIV();
//We can still access it in the object, even if it's static. But we have th eoption to class it directly, since we are in the class?.
    var.soutSV();

  }




}
