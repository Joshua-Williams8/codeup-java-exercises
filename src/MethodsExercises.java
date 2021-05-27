public class MethodsExercises {
  public static int add(int x, int y){
    return x + y;
  }
  public static int sub(int x, int y){
    return x - y;
  }
  public static int multiply(int x, int y){
    return x * y;
  }
  public static int divide(int x, int y){
    return x / y;
  }
  public static int mod(int x, int y){
    return x % y;
  }



  public static void main(String[] args) {
    System.out.println(add(1,2));//equals 3
    System.out.println(sub(4,3));// equals 1
    System.out.println(multiply(3,3));//equals 9
    System.out.println(divide(8,2));//equals 4
    System.out.println(mod(12,5));//equals 2
    System.out.println(divide(4,0)); //returns errors?
  }
}
