package GroceryList;

public class GroItem {
  private String name;
  private int amount;

  public GroItem(String name, int amount){
    this.name = name;
    this.amount = amount;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmount() {
    return this.amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
