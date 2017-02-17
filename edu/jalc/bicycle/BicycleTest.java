package edu.jalc.bicycle;

import edu.jalc.bicycle.frame.BikeFrame;
import edu.jalc.bicycle.wheel.Wheel;
import edu.jalc.bicycle.gear.GearSet;

class BicycleTest{
   public static void main(String... args){
      TestGetCost();
      TestGetWheel();
      TestGetFrame();
      TestGetBrand();
      TestGetFrontGears();
      TestGetBackGears();
      TestSetCost();
      TestSetWheel();
      TestSetFrame();
      TestSetBrand();
      TestSetFrontGears();
      TestSetBackGears();
      System.out.println("All tests passed");
   }

   static void TestGetCost(){
      System.out.println("testing getCost");
      Bicycle bicycle = new Bicycle(150.0,null,null,null,null,null);
      assert(bicycle.getCost() == 150.0);
   }

   static void TestGetWheel(){
      System.out.println("testing getWheel");
      Wheel wheel = new Wheel(10,10,"brand",null);
      Bicycle bicycle = new Bicycle(0,null,wheel,null,null,null);
      assert(bicycle.getWheel() == wheel);
   }

   static void TestGetFrame(){
      System.out.println("testing getFrame");
      BikeFrame frame = new BikeFrame(10,10,10,null,"brand",null);
      Bicycle bicycle = new Bicycle(0,null,null,frame,null,null);
      assert(bicycle.getFrame() == frame);
   }

   static void TestGetBrand(){
      System.out.println("testing getBrand");
      Bicycle bicycle = new Bicycle(0,"My Brand",null,null,null,null);
      assert(bicycle.getBrand().equals("My Brand"));
   }

   static void TestGetFrontGears(){
      System.out.println("testing getFrontGears");
      GearSet gears = new GearSet();
      Bicycle bicycle = new Bicycle(0,null,null,null,gears,null);
      assert(bicycle.getFrontGears() == gears);
   }

   static void TestGetBackGears(){
      System.out.println("testing getBackGears");
      GearSet gears = new GearSet();
      Bicycle bicycle = new Bicycle(150.0,null,null,null,null,gears);
      assert(bicycle.getBackGears() == gears);
   }

   static void TestSetCost(){
      System.out.println("testing setCost");
      Bicycle bicycle = new Bicycle(0,null,null,null,null,null);
      bicycle.setCost(100.0);
      assert(bicycle.getCost() == 100.0);
   }

   static void TestSetWheel(){
      System.out.println("testing setWheel");
      Bicycle bicycle = new Bicycle(0,null,null,null,null,null);
      Wheel wheel = new Wheel(10,10,"brand",null);
      bicycle.setWheel(wheel);
      assert(bicycle.getWheel() == wheel);
   }

   static void TestSetFrame(){
      System.out.println("testing setFrame");
      Bicycle bicycle = new Bicycle(0,null,null,null,null,null);
      BikeFrame frame = new BikeFrame(10,10,10,null,"brand",null);
      bicycle.setFrame(frame);
      assert(bicycle.getFrame() == frame);
   }

   static void TestSetBrand(){
      System.out.println("testing setBrand");
      Bicycle bicycle = new Bicycle(0,null,null,null,null,null);
      bicycle.setBrand("My Brand");
      assert(bicycle.getBrand().equals("My Brand"));
   }

   static void TestSetFrontGears(){
      System.out.println("testing setFrontGears");
      GearSet gears = new GearSet();
      Bicycle bicycle = new Bicycle(0,null,null,null,null,null);
      bicycle.setFrontGears(gears);
      assert(bicycle.getFrontGears() == gears);
   }

   static void TestSetBackGears(){
      System.out.println("testing setBackGears");
      GearSet gears = new GearSet();
      Bicycle bicycle = new Bicycle(150.0,null,null,null,null,null);
      bicycle.setBackGears(gears);
      assert(bicycle.getBackGears() == gears);
   }
}
