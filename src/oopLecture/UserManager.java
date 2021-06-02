package oopLecture;

import java.util.Scanner;

public class UserManager {
  //We don't have to reference the userTools class because it's a public class, and we can access it.


  public static Scanner scanner = new Scanner(System.in);

  public static void startMenu(User u){
    System.out.println("Welcome, what would you like to do?");
    System.out.println("1. Log in.\n2. Exit Program.");
    int userChoice = scanner.nextInt();
    if (userChoice == 1) {
      UserTools.logIn(u);
      UserTools.editPref(u);
    } else {
      System.out.println("Thank you for your time. Bye!");
    }
  }


  public static void main(String[] args) {
    User testUser = new User();
    testUser.username = "Testname";
//    testUser.password = "testPass";
    testUser.setPassword("testPass");
    System.out.println(testUser.getPassword());

    testUser.email = "emailtest";
//We can user usertools as seen below, since it's public
//    UserTools.logIn(testUser);
////    testUser.isLoggedIn = true;
//    UserTools.changePassword(testUser);
    startMenu(testUser);


  }
}

