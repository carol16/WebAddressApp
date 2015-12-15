package test;
import java.io.Serializable;


public class Building implements Serializable{
 
  private String bName;
  Street street;
 
 
  public String getbName() {
    return bName;
  }
  public void setbName(String bName) {
    this.bName = bName;
  }
  public Street getStreet() {
    return street;
  }
  public void setStreet(Street street) {
    this.street = street;
  }
  @Override
  public String toString() {
    return ","+ bName + street.toString();
  }
  public Building(String bName, Street street) {
    super();
   
    this.bName = bName;
    this.street = street;
  }
  

}
