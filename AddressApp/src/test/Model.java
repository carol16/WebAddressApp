package test;

import java.util.ArrayList;

public class Model {
  
  public String searchAddress(ArrayList<Person> p, String name){
    
    String address="";
    
     for(Person p1:p ){
       
       if(p1.getNameOfPerson().equals(name))
       {if(address.equals(""))
       {
         address=p1.getFlat().toString();
       }
       else
       {
         address= address+" and "+p1.getFlat().toString();
       }
       }
     }
    
    return address;
  }
  
 public String findTypeOfFlat(ArrayList<Flat> f, String name){
    
    String type="";
    
     for(Flat f1:f){
       
       if(f1.getFlatName().equals(name))
       {if(type.equals(""))
       {
         type=f1.getType();
       }
      
       }
     }
    
    return type;
  }

 public int findNoOfFlatsOwned(ArrayList<Person> p, String name)
 {
   int noOfFlats=0;
   
   for(Person p1:p)
   {
     if(p1.getNameOfPerson().equals(name)&&p1.getType().equals("owner")){
       noOfFlats++;
     }
   }
   
   return noOfFlats;
 }
 
 public float findArea(ArrayList<Person> p){
   
   float area=0;

   for(Person p1:p){
   
     if(p1.getType().equals("tenant")){
   Flat f1=p1.getFlat();
       if(area==0){
       area=f1.getArea();}
       else
       {area=area+f1.getArea();
       
       }area=area/p.size();
       
     }
   }
   if(p.size()!=0){
     area=area/p.size();
   }
   return area;
 }

}
