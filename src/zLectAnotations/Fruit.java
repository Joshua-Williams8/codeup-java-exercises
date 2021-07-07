package zLectAnotations;

public class Fruit implements Food{
  //  Since this implements food, it has to have a taste() method defined.


  private String flavor;

  @Deprecated
  public void tasteBitter(){
    System.out.println("ew");
  }
//The deprecated lets java know we are getting rid of this method and need to stop using it.

  @Deprecated
  private boolean hasFlesh;

  //This is what we want to swap out?
  private boolean eatableSeeds;

  //@Override is meant to override a method in a super class. This isn't required to do it, but it shows other devs that you want to use this instead.
  @Override
//  Below is needed because we are impleting Food
  public String taste(){
    return this.flavor;
  }

  public static void main(String[] args) {
    Fruit lime = new Fruit();
    lime.tasteBitter(); //See the difference? It's showing that it's been marked for "removal"
    lime.flavor = "oof";



  }
}
