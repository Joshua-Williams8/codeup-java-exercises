//import java.io.IOException;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//Terminal note - cd / goes up 1 level.
//pwd print working directory aka show current location
//ls list the directories inside of the current wd
//

public class ZFileIO {

  public void readFileAndOutPut(Path dataFile) {
    List<String> currentList = new ArrayList<>();
    try {
      currentList = Files.readAllLines(dataFile);
//      System.out.println("Made the list?");
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    for (String line : currentList) {
      System.out.println(line);
    }
  }

  public static void main(String[] args) throws IOException {
    Path path = Paths.get("src");
    System.out.println(path);//this is not a string it's a representation of the path object
    System.out.println(path.toAbsolutePath()); //Gives you entire (absolute) path to src.

    Path pathLect = Paths.get("src", "FileIOLecture.java");
    System.out.println(pathLect);//this is not a string it's a representation of the path object
    System.out.println(pathLect.toAbsolutePath()); //Gives you entire (absolute) path to src.
    Path dataPlace = Paths.get("src/data");
    try {
      if (Files.notExists(dataPlace)) {
        System.out.println("This directory does not exist so we are making it.");
        Files.createDirectories(dataPlace); //Need this inside of a try and catch?
        //Creates a data folder inside of src.
      } else {
        System.out.println("The directory already exist.");
      }
    } catch (IOException ioe) {
      System.out.println("IO exception");
    }
    //Below should make the file.
    Path dataFile = Paths.get(String.valueOf(dataPlace), "data.txt");
    try {
      if (Files.notExists(dataFile)) {
        System.out.println("File.txt made");
        Files.createFile(dataFile);
      } else {
        System.out.println("File.txt is already made....");
      }
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }

    //How to write to the file?

    List<String> nameList = Arrays.asList("Bada", "Bing", "Livia", "Agrippina");
    //This will clear out and re-write the list.
    //This if we want just add to the list we use
    //StandardOpenOption.APPEND

    try {
      Files.write(dataFile, nameList);
//      Files.write(dataFile, nameList, StandardOpenOption.APPEND); //This appends instead of writing over.
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    //Printing the list by line into the console.

//    List<String> currentList = new ArrayList<>();
//    try {
//      currentList = Files.readAllLines(dataFile);
//      System.out.println("Made the list?");
//    } catch (IOException ioe){
//      ioe.printStackTrace();
//    }
//
//    for (String line : currentList){
//      System.out.println(line);
//    }

    ZFileIO io = new ZFileIO();
    //Moved our for loop above for printing lines, into a method.
    //the io is the current class were on from the method, and were calling it below.
    //This method takes in a Path to a file.
    //If the method was static we could access Since were inside of the class.
    io.readFileAndOutPut(dataFile);

    List<String> nameList2 = new ArrayList<>();
    nameList2.add("Hi");
    try {
      Files.write(dataFile, nameList2, StandardOpenOption.APPEND);
      io.readFileAndOutPut(dataFile);
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
    List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(dataFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

    Iterator<String> listIterator = currentList.iterator();
    while (listIterator.hasNext()) {
      String empress = listIterator.next();
      if (empress.equals("Hi")) {
        System.out.println("Remove hi??");
        listIterator.remove();
      }
    }

    try {
      Files.readAllLines(dataFile);
      System.out.println("Made the list?");
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }

    System.out.println(currentList);

    System.out.println("BREAK");
    try {
      Files.writeString(dataFile, "What\n", StandardOpenOption.APPEND);
    } catch (IOException ioe){
      ioe.printStackTrace();
    }
    io.readFileAndOutPut(dataFile);

  }
}
