package bicycle;

import java.util.*;

public class GearSet{

   //private int numberOfGears; //this is just the size of the arraylist
   private ArrayList<Gear> gears;
   private double weight;
   private String brand;

   public static void main(String... args){

   }

   public int getNumberOfGears(){
      return gears.size();
   }

   public double getWeight(){
      return weight;
   }

   public String getBrand(){
      return brand;
   }

   public ArrayList<Gear> getGears(){
      return gears;
   }
      
   public void setWeight(double weight){
      this.weight = weight;
   }
   
   public void setBrand(String brand){
      this.brand = brand;
   }
   
   public void setGears(ArrayList<Gear> gears){
      this.gears = gears;
   }
}
