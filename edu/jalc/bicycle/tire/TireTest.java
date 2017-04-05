package edu.jalc.bicycle.tire;

public class TireTest{
   public static void main(String... args){
      System.out.println("Testing Tire . . .");
      testGetThickness();
      testGetWidth();
      testGetSize();
      testGetBrand();
      System.out.println("Tire tests passed.");
   }

   static void testGetThickness(){
      System.out.println("testing getThickness");
      Tire tire = new Tire(10,0,0,null);
      assert(tire.getThickness() == 10);
   }

   static void testGetWidth(){
      System.out.println("testing getWidth");
      Tire tire = new Tire(0,20,0,null);
      assert(tire.getWidth() == 20);
   }

   static void testGetSize(){
      System.out.println("testing getSize");
      Tire tire = new Tire(0,0,100,null);
      assert(tire.getSize() == 100);
   }

   static void testGetBrand(){
      System.out.println("testing getBrand");
      Tire tire = new Tire(0,0,0,"test string");
      assert(tire.getBrand().getBrandName() == "test string");
   }
}
