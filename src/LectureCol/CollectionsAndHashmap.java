package LectureCol;

import shapes.Square;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CollectionsAndHashmap {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,4};
    //Cannot create an arrraylist of primitive data types
    //The way around this is to use different reference types for primitive types.
    ArrayList<Integer> collectionOfNums = new ArrayList<>();
    //To fill in information we...
    //We didn't have to give it a set length also.
    collectionOfNums.add(15);
    collectionOfNums.add(43);
    collectionOfNums.add(19);
    collectionOfNums.add(0,20); //This will be placed at the 0 index, and push everything else back.
//Below is a regular for loop, notice the .get() rather than [i]
    //Also notice the use of size() rather than length
    for (int i = 0; i < collectionOfNums.size(); i++){
//      System.out.println(collectionOfNums.get(i));
    }

//    for (Integer collectionOfNum : collectionOfNums){
//      System.out.println(collectionOfNum);
//    }
    //souting the collection vs the Array.
    System.out.println(Arrays.toString(numbers));//For a regular array you have to use the toString method off of Arrays.
//    System.out.println(collectionOfNums);//It automatically uses the toString method that converts it into something readable.
//    System.out.println(collectionOfNums.contains(109)); //Returns a boolean if you want the index use below.
//    System.out.println(collectionOfNums.indexOf(109)); //Returns -1 if it''s not in the array.
    ArrayList<String> studentNames = new ArrayList<>();
    studentNames.add("bada");
    studentNames.add("bing");
    studentNames.add("bada");

//    System.out.println(studentNames.isEmpty());
    collectionOfNums.remove((Integer) 19); //This removes a number I'm looking for.
    collectionOfNums.remove(0); //This removes the first index?
//    System.out.println(collectionOfNums);
//
//    System.out.println(studentNames);
//    studentNames.remove("bada"); //Removed only the first bada.
//    // Also this returns a boolean, if it returns true it removes if not it's returns false?
//    System.out.println(studentNames);

    ArrayList stuff = new ArrayList();

    stuff.add("TestString");
    stuff.add(31);
    stuff.add(new Square(4));//This isn't what java is meant to do.


    //The Object is the simplest data type
//    for (Object thing: stuff){
//      System.out.println(thing);
//    }
//    System.out.println(stuff.get(2));

    stuff.set(2,30);
//    System.out.println(stuff);

// A hashmap is a collection of KEY VALUE pairs.,First or left hand side is the KEy, the 2nd is the value.
    HashMap<Character, Square> squares = new HashMap<>();
    squares.put('A', new Square(5));

    System.out.println(squares.get('A').getArea()); // We access the value at the Key.
    //We get 0 without having the B key defined.
    System.out.println(squares.getOrDefault('B', new Square(0)).getArea());
    squares.put('B', new Square(3));
    System.out.println(squares.getOrDefault('B', new Square(0)).getArea());
    //So if B isn't taken already we get 0, but since B is now defined we get what B is which the sides are 3, so it will give us the Area of 3.
    System.out.println(squares.get('C'));

    //Contains Value is not going to do a simple comparison
    System.out.println(squares.containsValue(new Square(5))); //is false

    //Keys have to always be unique, but the value can be repeated as many times as you want.

    //
  }
}
