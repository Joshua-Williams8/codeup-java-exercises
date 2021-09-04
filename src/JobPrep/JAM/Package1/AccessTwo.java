package JobPrep.JAM.Package1;

public class AccessTwo {
  public static void main(String[] args) {
    //    We can access the properties in the same package, while they are public and default
//    We can NOT access private stuff in the same package, only in the same class.
//    We can access protected stuff in the same package or directory.
    AccessOne a = new AccessOne();
    System.out.println(a.hours);
    System.out.println(a.minutes);

  }
}
