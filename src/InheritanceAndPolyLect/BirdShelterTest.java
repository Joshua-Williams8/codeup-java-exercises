package InheritanceAndPolyLect;

public class BirdShelterTest {
  //This also allows us to make polymorphic Arrays
  public static void main(String[] args) {

  Bird[] birds = new Bird[3];

  birds[0] = new Bird();
  birds[1] = new Penguin();
  birds[2] = new Duck();

  for (Bird birdy : birds){
    birdy.makeNoise();
  }
  }

}
