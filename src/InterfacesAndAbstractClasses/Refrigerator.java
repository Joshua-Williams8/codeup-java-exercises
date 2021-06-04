package InterfacesAndAbstractClasses;

import java.util.Scanner;

class Refrigerator extends Appliance {
  //We need this statement below because we are not able to call Appliance directly?
  private boolean hasIce;

  public boolean isHasIce() {
    return hasIce;
  }

  public void setHasIce(boolean hasIce) {
    this.hasIce = hasIce;
  }

  public Refrigerator(String type, String brandName, boolean hasIce) {
    super(type, brandName);
    this.hasIce = hasIce;

    //this.type = type;
    //this.brandName - brandName;
  }
  public void setType(String type){
    this.type = type;
  }
  public void setBrandName(String brandName){
    this.brandName = brandName;
  }

  public void keepFresh(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Would you like to put something in here?");
    String userChoice = sc.nextLine();
    while (userChoice.equalsIgnoreCase("y")){
      System.out.println("What would you like to put in the fridge?");
      String item = sc.nextLine();
      System.out.printf("Ok thanks for the %s!\n", item);
      System.out.println("Would you like to put another item in the fridge?");
      userChoice = sc.nextLine();

    }
    System.out.println("Bye!");
  }


}
