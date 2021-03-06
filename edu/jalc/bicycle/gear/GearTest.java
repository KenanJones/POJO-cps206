package edu.jalc.bicycle.gear;

public class GearTest{
   public static void main(String... args){
      System.out.println("Testing Gear . . .");
      testGetNumberOfTeeth();
      testGetDiameter();
      testGetWeight();
      System.out.println("Gear tests passed.");
   }

   static void testGetNumberOfTeeth(){
      System.out.println("testing getNumberOfTeeth");
      Gear gear = new Gear(11,0,0);
      assert(gear.getNumberOfTeeth() == 11);
   }

   static void testGetDiameter(){
      System.out.println("testing getDiameter");
      Gear gear = new Gear(0,5.0,0);
      assert(gear.getDiameter() == 5.0);
   }

   static void testGetWeight(){
      System.out.println("testing getWeight");
      Gear gear = new Gear(0,0,12.1);
      assert(gear.getWeight() == 12.1);
   }
}
