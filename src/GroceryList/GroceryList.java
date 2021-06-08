package GroceryList;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryList {


  public static Input input = new Input();

  public static HashMap<String, ArrayList<GroItem>> catList = new HashMap<>();

  //We use the HashMap with the Key being the Category.
  //The 2nd part is the List
  //Inside the List(That's inside each cat) we put items, with properties
  //Those props are the name and the amount?

  public static void groceryMenu() {
//    ArrayList<GroceryList.GroItem> catList = new ArrayList(); // Maybe lets try it the other way first.
//    HashMap<String, Double> gList = new HashMap<>();
    System.out.println("Would you like to make a grocery list?");
    //Using my input It ask a yes or no and returns a boolean
    boolean answer = input.yesNo();
    //We convert the keys to an array for many uses.
    String[] keyArray = catList.keySet().toArray(new String[0]);
    //We see if I wanted to enter a grocery list.
    if (answer) {
      //I print out the categories.
      System.out.println("Here are the Categories:");
      for (String key : keyArray) {
        System.out.printf("|%s|\t", key);
      }
      groceryMenu2();

    } else {
      //This happens if the if is false.
      System.out.println("Sorry bye.");
      //This exits the program. while we're inside of a void element.
      System.exit(0);
    }
  }

  //We're cutting this part of the app in half so we can repeat it if the user puts an invalid answer in.
  public static void groceryMenu2() {

    System.out.println("\nPlease enter a valid category.");
    //using get string to get what the user has chosen.
    String choice = input.getString();
    //This is where we are storing the haskKey/Cat for editing the list.
    String hashKey = "";
    //to see if th user gives us a valid option
    boolean valid = false;
    //Just making a keyArray again.
    String[] keyArray = catList.keySet().toArray(new String[0]);
    //Checking the user's input.
    for (String key : keyArray) {
      if (choice.equalsIgnoreCase(key)) {
        valid = true;
        hashKey = key;
      }
    }
    //If it's valid we go through with making the list
    if (valid) {
      System.out.printf("What grocery are you adding to %s?\n", hashKey);
      String grocery = input.getString();
      System.out.printf("How many \"%s\" are you getting?\n", grocery);
      int amount = input.getInt();
      GroItem item = new GroItem(grocery, amount);
      catList.get(hashKey).add(item);
    } else {
      //If it's invalid we display the cats again, and tell them to enter another one and rerun part2 of the app.
      System.out.println("Sorry that's not a category.");
      System.out.println("Here are the Categories:");
      for (String key : keyArray) {
        System.out.printf("|%s|  ", key);
      }
      groceryMenu2();
    }
    //We are seeing if the user would like to continue
    System.out.println("Would you like to continue adding items?");
    boolean cont = input.yesNo();
    //If yes then we display the cats again, and run Grocery Menu2
    if(cont){
      System.out.println("Here are the Categories:");
      for (String key : keyArray) {
        System.out.printf("|%s|  ", key);
      }
      groceryMenu2();
      //If no we show them the final list with all the cats and the items they picked.
    } else {
      System.out.println("Below is your list by category.");
      //Were using our keyArray to access the HashMap of categories
      for (String key : keyArray) {
        //We are printing out each category, with it's list
        System.out.printf("%s Products: ", key);
        //Were accessing each GroceryList.GroItem inside of each ArrayList inside of the each HashMap...
        for (GroItem list  : catList.get(key)){
          System.out.printf("|%d %s|",list.getAmount(),list.getName());

        }
        //Now that were are going back into the next category we clear the line?
        System.out.println(" ");
      }
    }

  }

  public static void main(String[] args) {
    //We are just adding category list
    //The key is the category, and the 2nd part takes in an ArrayList, so I don't have to redefine it every time we add or take away from it.
    //Each list will have a GroceryList.GroItem object.
    catList.put("Dairy", new ArrayList<>());
    catList.put("Meat", new ArrayList<>());
    catList.put("Drink", new ArrayList<>());
    catList.put("Other", new ArrayList<>());


    groceryMenu();


  }
}
