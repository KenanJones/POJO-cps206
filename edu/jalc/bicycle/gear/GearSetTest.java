package edu.jalc.bicycle.gear;

import java.util.ArrayList;
import java.util.Arrays;

public class GearSetTest{
   public static void main(String... args){
      System.out.println("Testing GearSet . . .");
      testGetWeight();
      testGetGears();
      testsetGears();
      System.out.println("GearSet tests passed.");
   }

   static void testGetWeight(){
      System.out.println("testing getWeight");
      GearSet gears = new GearSet(10,new Gear(0,0,0));
      assert(gears.getWeight() == 10);
   }

   static void testGetGears(){
      System.out.println("testing getGears");
      Gear gear = new Gear(10,11,12);
      GearSet gears = new GearSet(0,gear,gear);
      ArrayList<Gear> testList = new ArrayList(Arrays.asList(0,gear,gear));
      assert(gears.getGears().equals(testList));
   }

   static void testsetGears(){
      System.out.println("testing setGears");
      ArrayList<Gear> gearList = new ArrayList<>();
      GearSet gears = new GearSet(0,new Gear(0,0,0));
      gears.setGears(gearList);
      assert(gears.getGears() == gearList);
   }
}
