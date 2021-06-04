package InheritanceAndPolyLect;

public class BirdTestLect {
  public static void main(String[] args) {
    Bird bluejay = new Bird(); //Bluejay is refering to the Bird class, so it can become a Bird object
    bluejay.setName("Bluejay");
    bluejay.setCanFly(true);
    bluejay.makeNoise();


    Duck mallard = new Duck();
    mallard.setName("Mally");

    mallard.makeNoise();
//    System.out.println(mallard.getName());

    Penguin baba = new Penguin();
    baba.makeNoise();
    baba.move();


  }
}
