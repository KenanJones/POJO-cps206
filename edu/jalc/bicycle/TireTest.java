package bicycle;

class TireTest{
   public static void main(String... args){
      TestGetThickness();
      TestGetWidth();
      TestGetSize();
      TestGetBrand();
      System.out.println("All tests passed");
   }

   static void TestGetThickness(){
      System.out.println("testing getThickness");
      Tire tire = new Tire(10,0,0,null);
      assert(tire.getThickness() == 10);
   }

   static void TestGetWidth(){
      System.out.println("testing getWidth");
      Tire tire = new Tire(0,20,0,null);
      assert(tire.getWidth() == 20);
   }

   static void TestGetSize(){
      System.out.println("testing getSize");
      Tire tire = new Tire(0,0,100,null);
      assert(tire.getSize() == 100);
   }

   static void TestGetBrand(){
      System.out.println("testing getBrand");
      Tire tire = new Tire(0,0,0,"test string");
      assert(tire.getBrand() == "test string");
   }
}
