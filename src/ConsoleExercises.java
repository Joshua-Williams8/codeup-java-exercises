import java.util.Scanner;

public class ConsoleExercises {
  public static void main(String[] args) {

//    //Part 1 below
//    double pi = 3.14159;
//    System.out.printf("The value of pi is approximately %.2f %n", pi);
//    //PArt 2.1 below
//    Scanner userInt = new Scanner(System.in);
//    System.out.println("Enter an integer.");
//    int userInput = userInt.nextInt();
//    System.out.printf("Test %d%n", userInput); //Will error if not integer.
    //Part 2.2
    Scanner userString = new Scanner(System.in);
//    System.out.println("Please enter a word.");
//    String word1 = userString.next();
//    System.out.println("Please enter another word.");
//    String word2 = userString.next(); //If you put a space it puts in in the next variable instead of asking about it.
//    System.out.println("Please one LAST word.");
//    String word3 = userString.next();
//    System.out.printf("First word: %s%n Second word: %s%n Third word: %s%n",word1,word2,word3);
//    System.out.println("Enter a sentence.");
//
//    String sentence = userString.nextLine();
//    System.out.println(sentence);
//


    Scanner math = new Scanner(System.in);
    math.useDelimiter("\n");
    System.out.println("Please enter the length.");
    String lengthS = math.next();
    Integer length = Integer.parseInt(lengthS);

    System.out.println("Please enter the width.");
    String widthS = math.next();
    Float width = Float.parseFloat(widthS);

    System.out.println("Please enter the Height");
    String heightS = math.next();
    Float height = Float.parseFloat(heightS);

    Float area = length * width;
    Float perimeter = (length * 2) + (width * 2);
    System.out.printf("Area: %.2f%n", area);
    System.out.printf("Perimeter: %.2f%n", perimeter);

    Float volume = area * height;
    System.out.printf("Volume: %.2f%n", volume);
  }


}
