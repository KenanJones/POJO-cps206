package edu.jalc.bicycle;

import edu.jalc.bicycle.frame.BikeFrame;
import edu.jalc.bicycle.wheel.Wheel;
import edu.jalc.bicycle.gear.GearSet;

public class BicycleTest{
   public static void main(String... args){
      System.out.println("Testing Bicycle . . .");
      testGetCost();
      testGetWheel();
      testGetFrame();
      testGetBrand();
      testGetFrontGears();
      testGetBackGears();
      testSetCost();
      testSetWheel();
      testSetFrame();
      testSetFrontGears();
      testSetBackGears();
      //testPedal();
      //testBrake();
      //testTurn();
      System.out.println("Bicycle tests passed.");
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
      assert(bicycle.getBrand().getBrandName().equals("My Brand"));
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
   
   static void testPedal(){
     System.out.println("testing pedal");
     Bicycle bike = new Bicycle(0,null,null,null,null,null);
     assert(bike.getSpeed() == 0);
     bike.pedal();
     assert(bike.getSpeed() == 1);
     bike.pedal();
     assert(bike.getSpeed() == 2);
   }
   static void testBrake(){
     System.out.println("testing brake");
     Bicycle bike = new Bicycle(0,null,null,null,null,null);
     assert(bike.getSpeed() == 0);
     bike.pedal();
     bike.pedal();
     bike.brake();
     assert(bike.getSpeed() == 1);
     bike.brake();
     assert(bike.getSpeed() == 0);
   }
   static void testTurn(){
     System.out.println("testing turn");
     Bicycle bike = new Bicycle(0,null,null,null,null,null);
     bike.turn(100);
     assert (bike.getDirection().get() == 100);
     bike.turn(150);
     assert (bike.getDirection().get() == 250);
     bike.turn(120);
     assert (bike.getDirection().get() == 10);
     bike.turn(-100);
     assert (bike.getDirection().get() == 270);
     bike.turn(-500);
     assert (bike.getDirection().get() == 130);
   }
}
