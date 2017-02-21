package edu.jalc.bicycle.wheel;

import edu.jalc.bicycle.tire.Tire;

class WheelTest{
   public static void main(String... args){
      testGetDiameter();
      testGetWeight();
      testGetBrand();
      testGetTire();
      testSetTire();
      System.out.println("All tests passed");
   }

   static void testGetDiameter(){
      System.out.println("testing getDiameter");
      Wheel wheel = new Wheel(10,0,null,null);
      assert(wheel.getDiameter() == 10);
   }

   static void testGetWeight(){
      System.out.println("testing getWidth");
      Wheel wheel = new Wheel(0,10,null,null);
      assert(wheel.getWeight() == 10);
   }

   static void testGetBrand(){
      System.out.println("testing getBrand");
      Wheel wheel = new Wheel(0,0,"brand",null);
      assert(wheel.getBrand().equals("brand"));
   }

   static void testGetTire(){
      System.out.println("testing getTire");
      Tire tire = new Tire(1,1,1,null);
      Wheel wheel = new Wheel(0,0,null,tire);
      assert(wheel.getTire() == tire);
   }

   static void testSetTire(){
      System.out.println("testing getTire");
      Wheel wheel = new Wheel(0,0,null,null);
      Tire tire = new Tire(1,1,1,null);
      wheel.setTire(tire);
      assert(wheel.getTire() == tire);
   }
}