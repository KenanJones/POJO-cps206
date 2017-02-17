package edu.jalc.bicycle.color;

class ColorTest{
   public static void main(String... args){
      TestGetRed();
      TestGetGreen();
      TestGetBlue();
      TestsetRed();
      TestsetGreen();
      TestsetBlue();
      System.out.println("All tests passed");
   }

   static void TestGetRed(){
      System.out.println("testing getRed");
      Color color = new Color(10,0,0);
      assert(color.getRed() == 10);
   }

   static void TestGetGreen(){
      System.out.println("testing getGreen");
      Color color = new Color(0,10,0);
      assert(color.getGreen() == 10);
   }

   static void TestGetBlue(){
      System.out.println("testing getBlue");
      Color color = new Color(0,0,10);
      assert(color.getBlue() == 10);
   }

   static void TestsetRed(){
      System.out.println("testing setRed");
      Color color = new Color(0,0,0);
      color.setRed(10);
      assert(color.getRed() == 10);
   }

   static void TestsetGreen(){
      System.out.println("testing setGreen");
      Color color = new Color(0,0,0);
      color.setGreen(10);
      assert(color.getGreen() == 10);
   }

   static void TestsetBlue(){
      System.out.println("testing setBlue");
      Color color = new Color(0,0,0);
      color.setBlue(10);
      assert(color.getBlue() == 10);
   }
}
