import java.util.Scanner;

public class ZExeceptionsStudy {
  public String maybeAnInt = "43";
  public String definitelyNotAnInt = "oof";


  public void askForAnInt(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please give an Int");
    String userInput = sc.nextLine();
    try {
      int[] numbers = {1, 2, 3, 4, 5};
      int userInputInt = Integer.parseInt(userInput);
      System.out.printf("The integer is %d\n", userInputInt);
      System.out.println(numbers[6]);
    } catch (NumberFormatException nfe){
      //We are using Nfe or Number format... cause we know that's the only kind of exeception we can get.
      System.out.printf("Oh no you put %s\n", nfe);
    } catch (IndexOutOfBoundsException iobe){
      System.out.println("oop out of bounds...");
      System.out.println(iobe);
    } finally {
      System.out.println("The final always shows up?");
    }
  }
}
