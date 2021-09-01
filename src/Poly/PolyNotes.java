package Poly;

class Bird {
  //  this is method for bird
  public void sing(){
    System.out.println("Tweet Tweet Tweet");

  }
  //  This is a property
  public int feathers = 90;
}

//Since Chicken extends bird it has access to all of bird's methods and properties or variables.
class Chicken extends Bird {
//Polymoprtheism literally means many forms.
//Many versions of the same method, but it prioritizes the one from it's class.
//  Gotta be the exact name of the method, and the exact same parameters.
  public void sing(){
    System.out.println("Bok Bok Bok");
  }

}



public class PolyNotes {


  public static void main(String[] args) {
    Bird b = new Bird();
    b.sing();
    Chicken r = new Chicken();
    r.sing();


  }

}


