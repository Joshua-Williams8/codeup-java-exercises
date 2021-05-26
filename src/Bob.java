import java.util.Locale;
import java.util.Scanner;

public class Bob {
  public static void main(String[] args) {
    System.out.println("Hi my name is Bob, what is yours?");
    Scanner userInput = new Scanner(System.in);
    String name = userInput.nextLine();
    if(name.endsWith("!")){
      System.out.println("Whoa, chill out!");
    } else if(name.trim().equals("")){
      System.out.println("Fine. Be that way!");
    } else if(name.endsWith("?")){
      System.out.println("Sure.");
    } else {
      System.out.println("Whatever.");
    }

    System.out.println("So how's your day goin?");
    String day = userInput.nextLine();
    if(day.endsWith("!")){
      System.out.println("Whoa, chill out!");
    } else if(day.trim().equals("")){
      System.out.println("Fine. Be that way!");
    } else if(day.endsWith("?")){
      System.out.println("Sure.");
    } else {
      System.out.println("Whatever.");
    }

    System.out.println("Dude have you seen The Boys?");
    String hero = userInput.nextLine();
    int home = hero.toLowerCase(Locale.ROOT).indexOf("homelander");
    boolean homeThere = home != -1;
    if(hero.endsWith("!")){
      System.out.println("Whoa, chill out!");
    } else if(hero.trim().equals("")){
      System.out.println("Fine. Be that way!");
    } else if(hero.endsWith("?")){
      System.out.println("Sure.");
    } else if(homeThere){
      System.out.println("Dude like Homelander is like my favorite kinda.");
    } else {
      System.out.println("Whatever.");
    }


  }
}
