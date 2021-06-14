package zLectAnotations;

public class Fruit implements Food{

  private String flavor;

  @Deprecated
  public void tasteBitter(){
    System.out.println("ew");
  }

  @Deprecated
  private boolean hasFlesh;

  //This is what we want to swap out?
  private boolean eatableSeeds;

  //@Override is meant to override a method in a super class. This isn't required to do it, but it shows other devs that you want to use this instead.
  @Override
  public String taste(){
    return this.flavor;
  }

  public static void main(String[] args) {
    Fruit lime = new Fruit();
    lime.tasteBitter(); //See the difference? It's showing that it's been marked for "removal"
    lime.flavor = "oof";



  }
}