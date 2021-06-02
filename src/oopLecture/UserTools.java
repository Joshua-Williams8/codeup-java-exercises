package oopLecture;

import java.util.Scanner;

public class UserTools {
  public static Scanner scanner = new Scanner(System.in);

  //The reason we can see the User object type, is beause it's public, so it's "Global scope"
  public static void logIn(User u) {
    //User is the data type in this instance instead of a String, or int.
    System.out.println("Please enter your password");
    String userPassword = scanner.nextLine();
    if (userPassword.equals(u.getPassword())) {
      System.out.println("Password entered is correct!");
      u.isLoggedIn = true;
    } else {
      System.out.println("That password is incorrect");
    }
  }

  public static void logOut(User u) { //User is the data type in this instance instead of a String, or int.
    System.out.println("Do you want to Log Out?");
    String userLogout = scanner.nextLine();
    if (userLogout.equals(u.getPassword())) {
      System.out.println("You have successfully logged out.");
      u.isLoggedIn = false;

    } else {
      System.out.println("You are still logged in.");
    }
  }


//Below is commented out and useable in the user manager?
//  public static void main(String[] args) {
//    User testUser = new User();
//    testUser.username = "Testname";
////    testUser.password = "testPass";
//    testUser.setPassword("testPass");
//    System.out.println(testUser.getPassword());
//
//    testUser.email = "emailtest";
//
//    UserTools.logIn(testUser);
//  }

  public static void changePassword(User u) {
    if (!u.isLoggedIn) {
      System.out.println("Sorry you are logged out...");
      logIn(u);
    } else {
      System.out.println("Please enter your current password");
      String oldPass = scanner.nextLine();
      if (oldPass.equals(u.getPassword())) {

        System.out.println("Please enter your new password");
        String newPass = scanner.nextLine();
        System.out.println(u.getPassword());
        u.setPassword(newPass);
        System.out.println("Password updated!");
        System.out.println(u.getPassword());
      } else {
        System.out.println("You entered the wrong password!");

      }
    }
  }

  public static void changeUsername(User u) {
    if (!u.isLoggedIn) {
      System.out.println("Sorry you are logged out...");
      logIn(u);
    } else {
      System.out.println("Please enter your new username.");
      Scanner scanner = new Scanner(System.in);
      String newName = scanner.nextLine();
      System.out.println(u.username);
      u.username = newName;
      System.out.println("Username updated!");
      System.out.println(u.username);
    }

  }

  public static void editPref(User u) {
    if (!u.isLoggedIn) {
      System.out.println("Sorry you are currently logged out, please login.");
      UserTools.logIn(u);
    } else {
      System.out.println("Welcome to your preferences. Would you like to:\n1.Change your password. \n2. Logout\n3.Change Username");
      int userChoice = scanner.nextInt();
      switch (userChoice) {
        case 1:
          UserTools.changePassword(u);
          editPref(u);
          break;
        case 2:
          UserTools.logOut(u);
          break;
        case 3:
          UserTools.changeUsername(u);
      }
    }
  }
}
