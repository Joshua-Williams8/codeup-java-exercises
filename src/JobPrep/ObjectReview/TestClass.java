package JobPrep.ObjectReview;

//An entity that has a state and behavior is known as an object. It can be physical or logical. An Ex. of a logical or intanigal object would be the bakning system.

public class TestClass {
//  NOTE: 3 characteristics, State Behavior, Identity
//  State: Represents the data or value of an object.
//  Behavior represents the behavior or FUNCTIONALITY of an object like depositing and withdrawing from a bankaccount
//  Identity: is implemented with an unique ID. The value of the ID is not visble to the User, it's just used internally by the JVM to ID each object uniquely.

  //State
  private int aInt = 2;


//  behavior below
  public int getAInt() {
    return aInt;
  }
  public void setAInt(int x){
    this.aInt = x;
  }

  public static void main(String[] args) {
    TestClass t = new TestClass();
    System.out.println(t.getAInt());
    t.setAInt(5);
    System.out.println(t.getAInt());

//    ID below.
    System.out.println(t);

  }

}
