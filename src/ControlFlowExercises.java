import javax.swing.*;
import java.util.Scanner;

public class ControlFlowExercises {
  public static void main(String[] args) {

    int i = 5;
//    while(i <= 15){
//      System.out.println(i++);
//    }

    // A dowhile loop that will count 2's starting with 0 ending at 100

//    i = 0;
//    do {
//      i += 2;
//      System.out.println(i);
//    } while (i < 100 );

    // backwards by 5's from 100 to -10
//    i=100;
//    do {
//      i -= 5;
//      System.out.println(i);
//    } while (i > -10);

//    long bigI = 2;
//
//    do {
//      System.out.println(bigI);
//      bigI = bigI * bigI;
//    }
//    while (bigI < 1000000);

//    for(long a = 100; a >= -10; a-=5) {
//      System.out.println(a);
//    }
//    for(long a = 2; a < 1000000; a*=a) {
//      System.out.println(a);
//    }

//    for(short a = 0; a <= 30; a++){
//      if(a % 3 == 0 && a % 5 == 0) {
//        System.out.println("FizzBuzz");
//      } else if(a % 3 == 0) {
//        System.out.println("Fizz");
//      } else if(a % 5 == 0) {
//        System.out.println("Buzz");
//      } else {
//        System.out.println(a);
//      }
//    }
    Scanner userInput = new Scanner(System.in);
    boolean askNum = true;
    while (askNum) {
      System.out.println("What number would you like to go to?\n");
      long max = userInput.nextInt();

      System.out.println("Here is your table!\n");

      System.out.println("number\t| squared | cubed");
      System.out.println("------\t| ------- | -----");
      for (long e = 0; e <= max; e++) {
//      System.out.print(e + "\t\t|");
        System.out.printf(" %-7d|", e);

        long sq = e * e;
        System.out.printf(" %-8d|", sq);
        long cu = e * e * e;
        System.out.printf(" %-5d%n", cu);



      }
      int answer = JOptionPane.showConfirmDialog(null, "Would you like to check another table?");
      if (answer == 0) {
        continue;
      } else {
        askNum = false;
        break;
      }
    }



    boolean askGrade = true;

    while (askGrade) {
      System.out.println("Please enter a numerical grade from 0 to 100.");
      int grade = userInput.nextInt();
      boolean Ap = grade >= 98 && grade <= 100;
      boolean A = grade >= 90 && grade <= 97;
      boolean Am = grade >= 88 && grade <= 90;

      boolean Bp = grade >= 85 && grade <= 87;
      boolean B = grade >= 82 && grade <= 84;
      boolean Bm = grade >= 80 && grade <= 81;

      boolean Cp = grade >= 76 && grade <= 79;
      boolean C = grade >= 71 && grade <= 75;
      boolean Cm = grade >= 67 && grade <= 70;

      boolean Dp = grade >= 64 && grade <= 66;
      boolean D = grade >= 62 && grade <= 63;
      boolean Dm = grade >= 60 && grade <= 61;

      boolean F = grade >= 0 && grade <= 59;

      if(Ap){
        System.out.println("You got an A+!");
      } else if(A){
        System.out.println("You got a A!");
      } else if(Am){
        System.out.println("You got a A-!");
      } else if(Bp){
        System.out.println("You got a B+!");
      } else if(B){
        System.out.println("You got a B!");
      } else if(Bm){
        System.out.println("You got a B-!");
      } else if (Cp){
        System.out.println("You got a C+.");
      } else if (C){
        System.out.println("You got a C.");
      } else if (Cm){
        System.out.println("You got a C-.");
      } else if (Dp){
        System.out.println("You got a D+.");
      } else if (D){
        System.out.println("You got a D.");
      } else if (Dm){
        System.out.println("You got a D-.");
      } else if(F){
        System.out.println("You're failing you got a F.");
      } else {
        System.out.println("You didn't enter a valid number?");
        continue;
      }

//      System.out.println("Please enter 0 if you want to continue checking grade letters. If you are done, press any other characters then press enter.");

//      String zeroOrOne = userInput.next();
//      if (zeroOrOne.equals("0")) {
////        continue;
////      } else {
////        askGrade = false;
////        break;
////      }
      int answer = JOptionPane.showConfirmDialog(null, "Do you want to check more grade numbers?");
            if (answer == 0) {
        continue;
      } else {
        askGrade = false;
        break;
      }
    }

  }
}
