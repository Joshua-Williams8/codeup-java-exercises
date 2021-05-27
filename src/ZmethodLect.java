import java.util.Scanner;

public class ZmethodLect {
  //Thing below is basically a function?
  //Public means you can use it any where?,
  // static = the method belongs to the class, as opposed to instances of it.
  //void is for debugging and seeing things, but not for a true app?

  public static void sayHello(String name){
    System.out.printf("Hello %s\n",name);
  }
  public static void sayHello(String greeting,String name){
    System.out.printf("%s %s\n",greeting,name);
  }
  //You can have 2 functions have the same name long as they add more params? and use them
  public static void sayHello(int times){
    for(int i = 1; i <= times; i++){
      System.out.println("Hello Darling");
    }
  }

  public static int multiply(int num1, int num2){
    return num1 * num2;
  }

  //Recursive methods.
  //A method that calls it self.
  public static void count(int n) {
    if (n <= 0) {
      System.out.println("All done!");
      return;
    }
    System.out.println(n);
    count(n - 1);
  }


  public static void willYou(Scanner input){
    System.out.println("Can we go to mcdonalds");
    if(input.nextLine().equalsIgnoreCase(("yes"))){
      System.out.println("Thanks dude.");
    } else {
      willYou(input);
    }

  }


  public static void main(String[] args) {
    sayHello("Josh");
    sayHello("Hi","Josh");
    sayHello(2);
    System.out.println(multiply(3,2));
//    count(5);

    willYou(new Scanner (System.in));
  }
}
