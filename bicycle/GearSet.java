import java.util.*;

public class GearSet{

   private int numberOfGears;
   private ArrayList<Gear> gears;
   private double weight;
   private String brand;

   public static void main(String... args){

   }

   public int getNumberOfGears(){
      return numberOfGears;
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
   
   public void setNumberOfGears(int num){
      numberOfGears = num;
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
