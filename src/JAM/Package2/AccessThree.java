package JAM.Package2;

import JAM.Package1.AccessOne;

public class AccessThree extends AccessOne {
//  public class AccessThree {

    public static void main(String[] args) {
//      Default properties cannot be seen from different packages. Only usable to the same package.
//    We can access the properties in different packages, while they are public
//    //    We can NOT access private stuff in a different package, only in the same class.
//    We can NOT access protected stuff in a different package, only the same package.
//    It only lets other packages know if it's related to the ORIGINAL class. so if we EXTEND accessOne, that means we can use the protected stuff, BUT only if we use the subclass and not the super.
//    AccessOne a = new AccessOne();
    AccessThree a = new AccessThree();
//Now we have access after using the sub class from the extension
    System.out.println(a.hours);
    System.out.println(a.minutes);

  }


}
