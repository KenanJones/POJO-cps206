package edu.jalc.bicycle.gear;

import java.util.ArrayList;

class GearSetTest{
   public static void main(String... args){
      TestGetWeight();
      TestGetGears();
      TestsetWeight();
      TestsetGears();
      System.out.println("All tests passed");
   }

   static void TestGetWeight(){
      System.out.println("testing getWeight");
      GearSet gears = new GearSet(10,new Gear(0,0,0));
      assert(gears.getWeight() == 10);
   }

   static void TestGetGears(){
      System.out.println("testing getGears");
      Gear gear = new Gear(10,11,12);
      GearSet gears = new GearSet(0,gear,gear);
      assert(gears.getGears().size() == 2);
      assert(gears.getGears().get(0) == gear);
      assert(gears.getGears().get(1) == gear);
   }

   static void TestsetWeight(){
      System.out.println("testing setWeight");
      GearSet gears = new GearSet(0,new Gear(0,0,0));
      gears.setWeight(10);
      assert(gears.getWeight() == 10);
   }

   static void TestsetGears(){
      System.out.println("testing setGears");
      ArrayList<Gear> gearList = new ArrayList<>();
      GearSet gears = new GearSet(0,new Gear(0,0,0));
      gears.setGears(gearList);
      assert(gears.getGears() == gearList);
   }
}
