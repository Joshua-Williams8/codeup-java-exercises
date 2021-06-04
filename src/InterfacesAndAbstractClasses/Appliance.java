package InterfacesAndAbstractClasses;

public abstract class Appliance {
  //When we want to create a superclass for sub classes, but we don't want to beable to use the superclass?
  protected String type;
  protected String brandName;

  public String getType() {
    return type;
  }

  public abstract void setType(String type);
//  We want it like above because you don't want
//  public void setType(String type) {
//    this.type = type;
//  }

  public  abstract void setBrandName(String brandName);

  public void getBrandName(String brandName) {
    this.brandName = brandName;
  }

  //Below is a constructor but we can't use it it's just to make an appliance.
  public Appliance(String type, String brandName){
    this.type = type;
    this.brandName = brandName;
    System.out.println("Test hello");
  }
//  public abstract void keepFresh();

}
