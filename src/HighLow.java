import java.util.Scanner;

public class HighLow {


  public static void highLow() {
    Scanner sc = new Scanner(System.in);
    int randomNum = (int) (Math.random() * 100);
    System.out.println("Welcome to High Low!\nGuess a number between 1 and 100.");
    int userGuess = sc.nextInt();
    int guessCount = 1;
    int maxGuess = 10;
    while (userGuess > 100 || userGuess < 1) {
      System.out.printf("%d is an invalid number please enter a number between 1 and 100.", userGuess);
      userGuess = sc.nextInt();
    }
    while (userGuess != randomNum && guessCount <= maxGuess) {
      if (userGuess < randomNum) {
          System.out.println("HIGHER");
        userGuess = sc.nextInt();
        guessCount++;

      } else if (userGuess > randomNum) {
        System.out.println("LOWER");
        userGuess = sc.nextInt();
        guessCount++;

      }
    }
    if (guessCount > maxGuess) {
      System.out.println("You're out of guesses! You went over 10 guesses.");
    } else {
      System.out.println("GOOD GUESS!");
      System.out.printf("You guessed the correct number it was\n%d\nYou made %d guesses.\n", randomNum, guessCount);
    }
    System.out.println("Press y then enter to play again.");
    Scanner sc2 = new Scanner(System.in);
    String confirm = sc2.nextLine();
    if (confirm.equalsIgnoreCase("y")) {
      highLow();
    }
  }

  public static void main(String[] args) {
    highLow();
  }
}
