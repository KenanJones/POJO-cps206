package edu.jalc.bicycle.gear;

import java.util.ArrayList;

public class GearSet{

   private ArrayList<Gear> gears;
   private double weight;
   
   public GearSet(){}
   
   public GearSet(double weight, ArrayList<Gear> gears){
      this. weight = weight;
      this.gears = gears;
   }
   
   public GearSet(double weight, Gear... gears){
      this. weight = weight;
      this.gears = new ArrayList<>();
      for(Gear gear: gears){
         this.gears.add(gear);
      }
   }
   public int getNumberOfGears(){
      return gears.size();
   }

   public double getWeight(){
      return weight;
   }

   public ArrayList<Gear> getGears(){
      return gears;
   }

   public void setWeight(double weight){
      this.weight = weight;
   }

   public void setGears(ArrayList<Gear> gears){
      this.gears = gears;
   }
}
