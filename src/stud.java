public class stud {
    public static void main(String args[]) {
    college a = new college(); // This is the regular method, with the object type of college.
    college b = new univ(); // You can use the new college object to make a new variable and call univ rather than college for a different set of intructions
    univ c = new univ(); //Does the same as above, but
    //univ d = new college(); //You cannot make a univ and call college.

      a.move();
    b.move();
  }
}

