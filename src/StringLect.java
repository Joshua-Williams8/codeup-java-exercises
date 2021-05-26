import java.util.Locale;
import java.util.Scanner;

public class StringLect {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    //Remember if taking input or wanted the values of something to be equal use the
    //.equal method to test if 2 variables are equal in value.
    // For strings you can also use .equalsIgnoreCase
//    String bada = "bada";
//    String bing = "BING";
//    if(bada.toLowerCase(Locale.ROOT).charAt(0) == bing.toLowerCase(Locale.ROOT).charAt(0) ){
//      System.out.println("Both words being with B.");
//    } else {
//      System.out.println("oop");
//    }
//
//    String Test = "Test";
//
//    System.out.println(Test.startsWith("T")); //Checking for this sequence of characters
//    System.out.println(Test.endsWith("st"));

    //.indexOf tells you when the stuff your seraching for in a string starts

    //.length() same idea as JS except you need the ().

    String testSub = "Dude bro.";

//    System.out.println(testSub.substring(5,9));

    //.replace() returns the string after replacing certain parts.

//    System.out.println(testSub.replace("bro", "bruh"));

    ///.trim() takes white space off the end and the front.
    String testWhiteSpace = "      oh    no    .     ";
    System.out.printf("Test %s!", testWhiteSpace.trim());
    String hero = "Work please";
    int home = hero.toLowerCase(Locale.ROOT).indexOf("home");
    System.out.println(home);
  }

}
