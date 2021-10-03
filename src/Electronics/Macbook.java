package Electronics;
//TODO: Make an interface so you cannot change the make, and only are able to change the model, and other properties.
public class Macbook extends Laptop {
  public Macbook(){
    setMake("Macbook");
  }
  public Macbook(String model){
    setMake("Macbook");
    setModel(model);
  }
}
