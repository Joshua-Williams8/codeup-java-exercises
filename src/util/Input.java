package util;


import java.util.Scanner;

public class Input {

  private Scanner scanner = new Scanner(System.in);
  //Below was the way Jay did it, but I'm not sure if what effects it can have?.
  //The rest of the code works with it either way
// private Scanner scanner;
//  public InputOtherWay(){
//    this.scanner = new Scanner(System.in);
//  }


  public String getString(){
   String outPut = scanner.nextLine();
   return outPut;
  }
  public String getString(String prompt){
    System.out.println(prompt);
    String outPut = scanner.nextLine();
    return outPut;
  }

  public boolean yesNo(){
//    Scanner why = new Scanner(System.in);
    System.out.println("Press enter y or yes to continue");
    String outPut = scanner.nextLine();
    if(outPut.equalsIgnoreCase("y") || outPut.equalsIgnoreCase("yes")){
      return true;
    } else {
      return false;
    }
  }
  public boolean yesNo(String prompt){
    System.out.println(prompt);
    String outPut = scanner.nextLine();
    if(outPut.equalsIgnoreCase("y") || outPut.equalsIgnoreCase("yes") || outPut.equalsIgnoreCase("ye") || outPut.equalsIgnoreCase("yea") || outPut.equalsIgnoreCase("ya")){
      return true;
    } else {
      return false;
    }
  }

  public int getInt(int min, int max){
    System.out.printf("Enter a number between %d, and %d\n", min, max);
    int outPut = scanner.nextInt();
    scanner.nextLine();
    if(outPut >= min && outPut <= max) {
      return outPut;
    } else {
      return getInt(min,max);
    }
  }


 public int getInt() {
   int outPut = scanner.nextInt();
   scanner.nextLine();
   return outPut;
  }
  public int getInt(String prompt) {
    System.out.println(prompt);
    int outPut = scanner.nextInt();
    scanner.nextLine();
    return outPut;
  }
  public double getDouble(double min, double max){
    System.out.printf("enter a number between %f, and %f\n", min, max);
    double outPut = scanner.nextDouble();
    scanner.nextLine();
    if(outPut >= min && outPut <= max) {
      return outPut;
    } else {
      return getDouble(min,max);
    }
  }
  public double getDouble() {
    double outPut = scanner.nextDouble();
    scanner.nextLine();
    return outPut;
  }
  public double getDouble(String prompt) {
    System.out.println(prompt);
    double outPut = scanner.nextDouble();
    return outPut;
  }
//
//  public static void main(String[] args) {
//
//    Input testing = new Input();
//    System.out.println(testing.getInt());
//
//  }


}
