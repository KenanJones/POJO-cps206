package edu.jalc.bicycle.gear;

class GearTest{
   public static void main(String... args){
      TestGetNumberOfTeeth();
      TestGetDiameter();
      TestGetWeight();
      System.out.println("All tests passed");
   }

   static void TestGetNumberOfTeeth(){
      System.out.println("testing getNumberOfTeeth");
      Gear gear = new Gear(11,0,0);
      assert(gear.getNumberOfTeeth() == 11);
   }

   static void TestGetDiameter(){
      System.out.println("testing getDiameter");
      Gear gear = new Gear(0,5.0,0);
      assert(gear.getDiameter() == 5.0);
   }

   static void TestGetWeight(){
      System.out.println("testing getWeight");
      Gear gear = new Gear(0,0,12.1);
      assert(gear.getWeight() == 12.1);
   }
}
