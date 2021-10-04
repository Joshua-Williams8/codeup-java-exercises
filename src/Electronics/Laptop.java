package Electronics;

public abstract class Laptop implements LaptopInterface {
  private int releaseYear;
  private double weight;
  private String make;
  private String model;

  public Laptop(String model) {
    this.model = model;
  }

  public Laptop() {
  }

  public int getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
