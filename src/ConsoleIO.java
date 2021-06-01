import java.util.Scanner;


public class ConsoleIO {
  public static void main(String[] args) {
    System.out.println("Test print ln");
    String name = "Keith";
    System.out.printf("Testprint %s", name);

    System.out.format("\ntest format %d number and %S's", 31, "String s");
    System.out.printf("\ntest boolean %b", false);
    //d fo integer numbers
    //s string, S will make everything uppercase?
    // b for boolean
    //f for floats.

    //For next part you need the import java.util.Scanner all the way up top line 1
    Scanner scannerTest = new Scanner(System.in);
    System.out.println(" ");
//    System.out.println("How are you?");

//    String userInput = scannerTest.next();
//    String userInput = scannerTest.nextLine();

//    System.out.printf("You're feeling: %s%n", userInput);
//exceptions vs errors, exceptions happen during run times,
    System.out.println("Give me a number.");
    int testNum = scannerTest.nextInt();
    System.out.printf("Here's the number %d%n", testNum);



  }
}
