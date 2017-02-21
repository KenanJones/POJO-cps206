package edu.jalc.bicycle;

import edu.jalc.bicycle.frame.BikeFrame;
import edu.jalc.bicycle.wheel.Wheel;
import edu.jalc.bicycle.gear.GearSet;

class BicycleTest{
   public static void main(String... args){
      testGetCost();
      testGetWheel();
      testGetFrame();
      testGetBrand();
      testGetFrontGears();
      testGetBackGears();
      testSetCost();
      testSetWheel();
      testSetFrame();
      testSetBrand();
      testSetFrontGears();
      testSetBackGears();
      System.out.println("All tests passed");
   }

   static void testGetCost(){
      System.out.println("testing getCost");
      Bicycle bicycle = new Bicycle(150.0,null,null,null,null,null);
      assert(bicycle.getCost() == 150.0);
   }

   static void testGetWheel(){
      System.out.println("testing getWheel");
      Wheel wheel = new Wheel(10,10,"brand",null);
      Bicycle bicycle = new Bicycle(0,null,wheel,null,null,null);
      assert(bicycle.getWheel() == wheel);
   }

   static void testGetFrame(){
      System.out.println("testing getFrame");
      BikeFrame frame = new BikeFrame(10,10,10,null,"brand",null);
      Bicycle bicycle = new Bicycle(0,null,null,frame,null,null);
      assert(bicycle.getFrame() == frame);
   }

   static void testGetBrand(){
      System.out.println("testing getBrand");
      Bicycle bicycle = new Bicycle(0,"My Brand",null,null,null,null);
      assert(bicycle.getBrand().equals("My Brand"));
   }

   static void testGetFrontGears(){
      System.out.println("testing getFrontGears");
      GearSet gears = new GearSet();
      Bicycle bicycle = new Bicycle(0,null,null,null,gears,null);
      assert(bicycle.getFrontGears() == gears);
   }

   static void testGetBackGears(){
      System.out.println("testing getBackGears");
      GearSet gears = new GearSet();
      Bicycle bicycle = new Bicycle(150.0,null,null,null,null,gears);
      assert(bicycle.getBackGears() == gears);
   }

   static void testSetCost(){
      System.out.println("testing setCost");
      Bicycle bicycle = new Bicycle(0,null,null,null,null,null);
      bicycle.setCost(100.0);
      assert(bicycle.getCost() == 100.0);
   }

   static void testSetWheel(){
      System.out.println("testing setWheel");
      Bicycle bicycle = new Bicycle(0,null,null,null,null,null);
      Wheel wheel = new Wheel(10,10,"brand",null);
      bicycle.setWheel(wheel);
      assert(bicycle.getWheel() == wheel);
   }

   static void testSetFrame(){
      System.out.println("testing setFrame");
      Bicycle bicycle = new Bicycle(0,null,null,null,null,null);
      BikeFrame frame = new BikeFrame(10,10,10,null,"brand",null);
      bicycle.setFrame(frame);
      assert(bicycle.getFrame() == frame);
   }

   static void testSetBrand(){
      System.out.println("testing setBrand");
      Bicycle bicycle = new Bicycle(0,null,null,null,null,null);
      bicycle.setBrand("My Brand");
      assert(bicycle.getBrand().equals("My Brand"));
   }

   static void testSetFrontGears(){
      System.out.println("testing setFrontGears");
      GearSet gears = new GearSet();
      Bicycle bicycle = new Bicycle(0,null,null,null,null,null);
      bicycle.setFrontGears(gears);
      assert(bicycle.getFrontGears() == gears);
   }

   static void testSetBackGears(){
      System.out.println("testing setBackGears");
      GearSet gears = new GearSet();
      Bicycle bicycle = new Bicycle(150.0,null,null,null,null,null);
      bicycle.setBackGears(gears);
      assert(bicycle.getBackGears() == gears);
   }
}
