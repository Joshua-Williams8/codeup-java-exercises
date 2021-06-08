package grades;


import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
  //Scanner made here so we can use it in all of the methods.
  public static Scanner sc = new Scanner(System.in);

  //This takes in a hashmap that uses a string key, and a Student object.
  public static void mainMenu(HashMap<String, Student> hashmap) {
//This makes an array of all the "key" values or github usernames for me.
    String[] keyArray = hashmap.keySet().toArray(new String[0]);
//    System.out.println(Arrays.toString(testArray));

    System.out.println("Here are the GitHub usernames of our students:");
    //Prints out all the user names.
    for (String key : keyArray) {
      System.out.printf("|%s|\t", key);
    }
    System.out.println("|Display \"All\"|");

    System.out.println("\nWhat student would you like to see more information on?");
    //predefine some variables for our search function, if it matches, it makes the use data true, and redefines search as the key hash, so it matches the case for later when we pull data from the hashmap.
    String choice = sc.nextLine();
    String search = "";
    boolean useData = false;
    //.containsKey?
    for (String test : keyArray) {
      if (test.equalsIgnoreCase(choice)) {
        useData = true;
        search = test;
//        System.out.printf("This is equal %s\n", test);
      } else {
        //This is inside of our for loop if it doesn't equal the search then we don't want to do anything.
      }
    }
    //If useData is true, meaning it was a valid search, we gather the data needed to print the message with the required info.
    if (useData) {
      double average = hashmap.get(search).getGradeAverage();
      String name = hashmap.get(search).getName();
      String ghName = search;
      System.out.printf("\nName: %s - GitHub Username: %s\nCurrent Average: %.2f\n", name, search, average);
      //If the choice was "all" we print all of the data for all of the students using out keyArray from eariler, to access each hashmap and student.
    } else if (choice.equalsIgnoreCase("all")) {

      for (String student : keyArray) {
        double average = hashmap.get(student).getGradeAverage();
        String name = hashmap.get(student).getName();
        String ghName = student;
        System.out.printf("\nName: %s - GitHub Username: %s\nCurrent Average: %.2f\n\n", name, ghName, average);
      }
      //If it's an invalid search we let them search again still but also tell them that it was not found.
    } else {
      System.out.printf("Sorry, no student found with the GitHub username of %s.\n", choice);
    }
    System.out.println("Would you like to see another student?\nPlease enter y or yes to see another student.");
    //If the answer is y or yes then we rerun the app if not we end it.
    choice = sc.nextLine();
    if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
      mainMenu(hashmap);
    } else {
      System.out.println("Have a good day goodbye!");
    }

  }


  public static void main(String[] args) {
    //Making the hashmap for the function
    HashMap<String, Student> students = new HashMap<>();
    //Making the students, and inputing the grades.
    students.put("BryciPryci5", new Student("Bryce"));

    students.get("BryciPryci5").addGrade(60);
    students.get("BryciPryci5").addGrade(74);
    students.get("BryciPryci5").addGrade(86);

    students.put("Trill-Will", new Student("Will"));
    students.get("Trill-Will").addGrade(80);
    students.get("Trill-Will").addGrade(75);
    students.get("Trill-Will").addGrade(90);

    students.put("CodeBreakingAndy", new Student("Andy"));
    students.get("CodeBreakingAndy").addGrade(90);
    students.get("CodeBreakingAndy").addGrade(94);
    students.get("CodeBreakingAndy").addGrade(92);

    students.put("LEO-pard", new Student("Leo"));
    students.get("LEO-pard").addGrade(89);
    students.get("LEO-pard").addGrade(63);
    students.get("LEO-pard").addGrade(78);


    mainMenu(students);


//    System.out.println(students.get("LEO-pard").getGradeAverage());


  }

}
