package edu.jalc.bicycle.color;

class ColorTest{
   public static void main(String... args){
      testGetRed();
      testGetGreen();
      testGetBlue();
      System.out.println("All tests passed");
   }

   static void testGetRed(){
      System.out.println("testing getRed");
      Color color = new Color(10,0,0);
      assert(color.getRed() == 10);
   }

   static void testGetGreen(){
      System.out.println("testing getGreen");
      Color color = new Color(0,10,0);
      assert(color.getGreen() == 10);
   }

   static void testGetBlue(){
      System.out.println("testing getBlue");
      Color color = new Color(0,0,10);
      assert(color.getBlue() == 10);
   }
}
