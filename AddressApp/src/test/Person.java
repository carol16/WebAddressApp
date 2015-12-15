package test;
import java.util.Enumeration;
import java.util.Vector;



public class Person{
  @Override
  public String toString() {
    return "Person [nameOfPerson=" + nameOfPerson + ", type=" + type + ", flat=" + flatList.toString() + "]";
  }
  private String nameOfPerson,type;
 
private Flat flatList =null;
public String getNameOfPerson() {
  return nameOfPerson;
}
public void setNameOfPerson(String nameOfPerson) {
  this.nameOfPerson = nameOfPerson;
}
public String getType() {
  return type;
}
public Person(String nameOfPerson, String type,Flat flat) {
  super();
  this.nameOfPerson = nameOfPerson;
  this.type = type;
 
  this.flatList=flat;
}
public void setType(String type) {
  this.type = type;
}

public Flat getFlat() {
  return flatList;
}
public void setFlat(Flat flat) {
  this.flatList=flat;
}
 
}
