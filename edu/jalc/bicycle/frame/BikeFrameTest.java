package edu.jalc.bicycle.frame;

import edu.jalc.bicycle.material.Material;
import edu.jalc.bicycle.color.Color;

class BikeFrameTest{
   public static void main(String... args){
      testGetLength();
      testGetHeight();
      testGetWeight();
      testGetBrand();
      testGetColor();
      testGetMaterial();
      testSetColor();
      System.out.println("All tests passed");
   }

   static void testGetLength(){
      System.out.println("testing getLength");
      BikeFrame frame = new BikeFrame(100.0,0,0,null,null,null);
      assert(frame.getLength() == 100.0);
   }

   static void testGetHeight(){
      System.out.println("testing getHeight");
      BikeFrame frame = new BikeFrame(0,10.0,0,null,null,null);
      assert(frame.getHeight() == 10.0);
   }

   static void testGetWeight(){
      System.out.println("testing getWeight");
      BikeFrame frame = new BikeFrame(0,0,55.5,null,null,null);
      assert(frame.getWeight() == 55.5);
   }

   static void testGetBrand(){
      System.out.println("testing getBrand");
      BikeFrame frame = new BikeFrame(0,0,0,null,"Brand",null);
      assert(frame.getBrand().equals("Brand"));
   }

   static void testGetColor(){
      System.out.println("testing getColor");
      Color color = new Color(10,11,12);
      BikeFrame frame = new BikeFrame(0,0,0,color,null,null);
      assert(frame.getColor() == color);
   }

   static void testGetMaterial(){
      System.out.println("testing getMaterial");
      Material material = new Material("",10,20);
      BikeFrame frame = new BikeFrame(0,0,0,null,null,material);
      assert(frame.getMaterial() == material);
   }

   static void testSetColor(){
      System.out.println("testing setColor");
      BikeFrame frame = new BikeFrame(0,0,0,null,null,null);
      Color color = new Color(0,1,2);
      frame.setColor(color);
      assert(frame.getColor() == color);
   }
}
