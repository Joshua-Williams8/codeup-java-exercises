package util;



public class InputTest {
  public static void main(String[] args) {

    Input testing = new Input();
//    System.out.println("Give me a string");
//    System.out.println(testing.getString());
//    System.out.println("Please follow the prompt");
//    System.out.println(testing.yesNo());
//    System.out.println("give me an integer between 1 and 10");
//    System.out.println(testing.getInt(1,10));
//    System.out.println("give me any Integer!");
//    System.out.println(testing.getInt());
//    System.out.println("give me an double float between 1.50 and 10.41");
//    System.out.println(testing.getDouble(1.50,10.41));
//    System.out.println("give me any double float!");
//    System.out.println(testing.getDouble());

    //Bonus
    System.out.println(testing.getString("Give me a string please."));
    System.out.println(testing.getInt("Give me an integer please."));
    System.out.println(testing.getDouble("Give me a double please."));


  }
}
