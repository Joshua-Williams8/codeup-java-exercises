import java.util.Locale;
import util.Input;

public class ServerNameGenerator {
  //Static fields are usable without creating an instance of the class. ONLY DOES THIS BEHAVIOR FOR INSIDE THE CLASS? But not anywhere else? without static I'd have to create an object holding ServerName... then object.adjs to use adjs array.
  //If these weren't static you would have to make a SNG object in what ever class you wanted to use these in like I did with the get object below, for get.yesNo
  //
  public static Input get = new Input();
  public static String[] adjs = {"Nice","Kind","Strong","Smart","Kindred","Happy","Insightful","Heroic","Creative","Amazing"};
  public static String[] nouns = {"Lion","Tiger","Cobra","Salamander","Snake","Spider","Gecko","Iguana","Cheetah","Panther" };
  //Need the static so it's usable in the same class?
  public static String randomEle(String[] array){
    int arrayR = (int) (Math.random() * array.length);
    return array[arrayR];
  }
  public static void SNGApp(){
    System.out.println("Here is your randomized server name:");
    System.out.printf("%s-%s\n", randomEle(adjs).toLowerCase(), randomEle(nouns).toLowerCase());
    if(get.yesNo()){
      SNGApp();
    } else {
      System.out.println("Tell your friends about our random generator!");
    }

  }

  public static void main(String[] args) {

//    System.out.println("Here is your randomized server name:");
//    System.out.printf("%s-%s\n", randomEle(adjs).toLowerCase(), randomEle(nouns).toLowerCase());

    SNGApp(); // Made it repeatable.
  }

}
