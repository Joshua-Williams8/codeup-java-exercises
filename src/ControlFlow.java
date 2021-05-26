import java.util.Scanner;

public class ControlFlow {
  public static void main(String[] args) {
//    int x = 5;
//    if (x == 5) {
//      System.out.println("X is 5 dude.");
//    }
//    System.out.println("I print no matter what");

//    int y = 2;
//    if (y== 2){
//      System.out.println("y does equal 2");
//    } else {
//      System.out.println("Y does not equal 2");
//    }

//    short y = -5;
//    y= 30001;
//    if(y < 0){
//      System.out.println("The variable y contains a negative number value");
//    } else if (y >= 0 && y < 30000){
//      System.out.println("The variable y is a positive number");
//    } else {
//      System.out.println("y contains a numeric value that is very close to the max value for short type variables, which is " + Short.MAX_VALUE);
//    }

//    String iceCreamChoice;
//    iceCreamChoice = "French vanilla";
//    switch (iceCreamChoice) {
//      case "vanilla":
//        System.out.println("vanilla was chosen");
//        break;
//      case "chocolate":
//        System.out.println("chocolate was chosen");
//        break;
//      default:
//        System.out.printf("%s was chosen we don't have %s.",iceCreamChoice,iceCreamChoice);
//    }
//    boolean existence = true;
//
//    if(existence){
//      System.out.println("I exist.");
//    }

    //&& Return a true value if both expressions are true.

    //&& vs & / || vs |

    int a = 3, d = 0;
////The double && will only check the rest of the conditions if
//    if(a == 1 && d++ > 0){
//      //don't worry about it.
//      System.out.println("It was true");
//    }
//    if(a == 1 & d++ > 0){
//      //don't worry about it.
//      System.out.println("It was true");
//    }
//
//    System.out.println(a);
//    //D only got incremented once because it ran the code, and checked both sides on the & version.
//    System.out.println(d);
//
//    String josh = new String("Josh");
//
//    System.out.println(josh);
//    String testName = "Josh";
//    System.out.println(testName);
//
//    System.out.println(josh == testName);
//    //These aren't equal because josh isn't a string it's the creation of a string? which would be the name?
//
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("What is your name?");
//    String userInput = scanner.next();
//
//    System.out.println(userInput == testName);
//    System.out.println(userInput == josh);
//    //This is because it checks what is stored, the reference code. It does not check the value.
//    System.out.println(userInput.equals(josh));
//    System.out.println(userInput.equals(testName));
//// Above works because it checks the value rather than the stored variable?

    // Loops
//    int i = 1; //You have to declare the variable ?
//    while (i < 10){
//      System.out.println("Now I'm in the loop " + i);
//      i++;
//      //Command c to cancel forever loops
//    }
    for (int i = 0; i < 10; i++) {
      System.out.println(i);

    }



  }
}
