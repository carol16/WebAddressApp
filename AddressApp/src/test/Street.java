package test;
import java.io.Serializable;
import java.util.ArrayList;


public class Street implements Serializable{
  
  private String streetName;
 
  public String getStreetName() {
    return streetName;
  }
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }
  @Override
  public String toString() {
    return ","+streetName ;
  }
  public Street(String streetName) {
    super();
   
    this.streetName = streetName;
  }
  
 

}
