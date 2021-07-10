package ArraysLect;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class ArracysLect {
  public static void main(String[] args) {
//    String[] languages = {"html", "css", "javascript", "java"};
//    System.out.println(languages);
    //All the data that goes into an array HAS TO BE the same data type.
    int[] nums = {14,64,34,44};
    System.out.println(nums); //Shows where the array is stored in the app, aka not human readable, aka an object reference.
    System.out.println(Arrays.toString(nums));
//    System.out.println(nums[0]);
//    for (int i = 0; i<= nums.length - 1; i++) {
//      System.out.println(nums[i]); // we get an exception If we call an element that's not in the array like the 4th one.(happens at run time, not an error which happens during compiling?
//    }

//    for (int num : nums) {
//      System.out.println(num); //Works by running through each element, as "num" or what ever I want to call it.
//    }

    //Arrays in Java are DEFINED by their data type.
    //Yo change points in the array, you can..
    nums[3] = 55;
//    nums[4] = 2; //We get an array index is out of bounds, because unlike javascript it doesn't automatically increase the array size. The size is NOT dynamic, it's static.
    String[] names = new String[5];
    System.out.println(Arrays.toString(names)); //We get null if we don't define them first. //null is the define value for string?
    //For booleans it defaults to false?
//    boolean[] testBool = new boolean[2];
//    System.out.println(Arrays.toString(testBool));
    //for ints is it 0?
    //    int[] test = new int[2];
//    System.out.println(Arrays.toString(test)); //Prints out 2 0s.




    names[0] = "Josh";
    names[1] = "Trey";
    names[2] = "Chris";
    names[3] = "Bryan";
    names[4] = "Will";

//    Arrays.fill(names, "Trill");
//    for (String name : names){
//      System.out.println(name);
//    }


//        int[] testFill = new int[2];
//        Arrays.fill(testFill, 4); //We overwrite all the values in an array, good for filling in our own defaults values.
//        System.out.println(Arrays.toString(testFill)); //Prints out 2 0s.

//    int[] sameNums = {14,64,34,55};
//    System.out.println(Arrays.toString(nums));
//    System.out.println(Arrays.toString(sameNums));
//
//    System.out.println(Arrays.equals(nums, sameNums)); // can't use ==
//    int[] moreNums = Arrays.copyOf(nums, 5); //Second number is the new length.
//    System.out.println(Arrays.toString(moreNums));
    int[] unsortedNums = {50,30,-14,2,5};
//    System.out.println(Arrays.toString(unsortedNums));

    Arrays.sort(unsortedNums); //unlike javascript, it changes the order of the original array, without needing to redefine it as such, like js

//    System.out.println(Arrays.toString(unsortedNums));

    String[][] stuff = {
      {"Ah","be","cee"},
      {"Dea","eek","fefe"},
      {"wow","wee","nro"}
    };
    for (String[] ele : stuff){ //Note the type stringArray
      System.out.println(ele);// Prints the object references
      for (String eleEle : ele){ //Note the type just String
        System.out.println(eleEle);
      }
    }
  }
}
