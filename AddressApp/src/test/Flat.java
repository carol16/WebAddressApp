package test;

public class Flat {
  private int area;
  Flat(int area, String flatName, String type, Building build) {
    super();
   
    this.area = area;
    this.flatName = flatName;
    this.type = type;
    this.build = build;
  }
  
  @Override
  public String toString() {
    return flatName+ build.toString();
  }
  private String flatName,type;
  Building build;
 
  public int getArea() {
    return area;
  }
  public void setArea(int area) {
    this.area = area;
  }
  public String getFlatName() {
    return flatName;
  }
  public void setFlatName(String flatName) {
    this.flatName = flatName;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public Building getBuild() {
    return build;
  }
  public void setBuild(Building build) {
    this.build = build;
  }
  

}
