package OverridingHelp;

public class Zstud {
    public static void main(String args[]) {
    Zcollege a = new Zcollege(); // This is the regular method, with the object type of college.
    Zcollege b = new univ(); // You can use the new college object to make a new variable and call OverridingHelp.univ rather than college for a different set of intructions
    univ c = new univ(); //Does the same as above, but
    //OverridingHelp.univ d = new OverridingHelp.Zcollege(); //You cannot make a OverridingHelp.univ and call college.

      a.move();
    b.move();
  }
}

