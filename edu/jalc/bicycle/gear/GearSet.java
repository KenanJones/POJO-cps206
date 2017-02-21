package edu.jalc.bicycle.gear;

import java.util.ArrayList;
import java.util.Arrays;

public class GearSet{

   private ArrayList<Gear> gears;
   private final double weight;

   public GearSet(){weight = 0;}

   public GearSet(double weight, Gear... gears){
      this. weight = weight;
      this.gears = new ArrayList(Arrays.asList(gears));
   }
   public int getNumberOfGears(){
      return gears.size();
   }

   public double getWeight(){
      return weight;
   }

   public ArrayList<Gear> getGears(){
      return (ArrayList<Gear>)gears.clone();
   }

   public void setGears(ArrayList<Gear> gears){
      this.gears = gears;
   }
}
