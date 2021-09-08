package JobPrep.Encapsulation;
//Encapsulation in Java is a process of wrapping code and data together into a single unit.

//We can create a fully encapsulated class in JAva by making all the data members of the class private, then we use getters and setters instead to access the data.

public class Example {
  private String myString = "A string";

  public String getMyString() {
    return myString;
  }

  public void setMyString(String myString) {
    this.myString = myString;
  }


}
