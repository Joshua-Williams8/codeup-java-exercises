package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
  private String name;
  private ArrayList<Integer> grades; //= new ArrayList<>(); //Don't put this here? Not best practice?
//  private int[] grades;

  public String getName() {
    return name;

  }

  public Student(String name) {
    this.name = name;
    //You want to make a new list for each student
    this.grades = new ArrayList<>();
  }

//Didn't do arrays right way but I'll keep this to compare.
//  public void addGrade(int grade){
//    //First we make a copyof the current array and add to the length
//    int[] newArray = Arrays.copyOf(this.grades, this.grades.length + 1);
//    //Now we are adding in that new value into the array.
//    newArray[this.grades.length] = grade;
//    //Now we redefine the value of grades to the new array, because we don't return anything from a void method
//    this.grades = newArray;
//  }

  public void addGrade(int grade) {
    this.grades.add(grade);
  }

  public double getGradeAverage() {
    int count = 0;
    double sum = 0;
    for (int grade : this.grades) {
      count++;
//      System.out.println(count);
//      System.out.println(grade);
      //I cast the sum because we need to beable to divide down to th decimal.
      sum =  (double) grade + sum;
//      System.out.println(sum);
    }
//    System.out.println(sum);
//    System.out.println(count);
    double result = sum / count;
    return result;
  }

  public static void swapArrays(String[] arrayOne, String[] arrayTwo){

    for(int i = 0; i <= arrayOne.length -1; i++){
      String copyOne = arrayOne[i];
      arrayOne[i] = arrayTwo[i];
      arrayTwo[i] = copyOne;

    }
  }

  public static void main(String[] args) {
    String[] testOne = {"One","Two","Three"};
    String[] testTwo = {"six","five","four"};

    swapArrays(testOne,testTwo);
    System.out.println(Arrays.toString(testOne));
    System.out.println(Arrays.toString(testTwo));

////    Setting up test student object to make sure things are working as expected.
//    Student notMe = new Student("NotJosh");
//    notMe.addGrade(25);
//    notMe.addGrade(20);
//    System.out.println(notMe.grades); // expecting [20,25]
//    System.out.println(notMe.getGradeAverage()); //expecting 22.5

  }


}
