package bicycle;

import java.util.*;

public class GearSet{

   private ArrayList<Gear> gears;
   private double weight;

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
