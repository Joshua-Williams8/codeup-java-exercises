package grades;

import shapes.Square;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
//  public static String[] searchKeys = {"BryciPryci5","CodeBreakingAndy","Trill-Will", "LEO-pard"};
  public static Scanner sc = new Scanner(System.in);

  public static void mainMenu(HashMap<String, Student> hashmap){

    String[] keyArray = hashmap.keySet().toArray(new String[0]);
//    System.out.println(Arrays.toString(testArray));

    System.out.println("Here are the GitHub usernames of our students:");
    for (String key: keyArray ){
      System.out.printf("|%s|\t", key);
    }
    System.out.println("\nWhat student would you like to see more information on?");
    String choice = sc.nextLine();
    String search = "";
    boolean useData = false;
    for(String test: keyArray){
      if(test.equalsIgnoreCase(choice)){
        useData = true;
        search = test;
//        System.out.printf("This is equal %s\n", test);
      } else {
//        System.out.println("Not equal");
      }
    }
    if(useData){
      double average = hashmap.get(search).getGradeAverage();
      String name = hashmap.get(search).getName();
      String ghName = search;
      System.out.printf("Name: %s - GitHub Username: %s\n Current Average: %f\n", name, search, average);


    } else{
      System.out.printf("Sorry, no student found with the GitHub username of %s.\n",choice);
    }
    System.out.println("Would you like to see another student?\n Please enter y or yes to see another student.");

    choice = sc.nextLine();
    if(choice.equals("y") || choice.equals("yes")){
      mainMenu(hashmap);
    } else {
      System.out.println("Have a good day goodbye!");
    }


  }



  public static void main(String[] args) {

  HashMap<String, Student> students = new HashMap<>();

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
