package bicycle;

class BicycleTest{
   public static void main(String... args){
      //tests
   }

   static void TestGetCost(){
      Bicycle bicycle = new Bicycle(150.0,null,null,null,null,null);
      assert(bicycle.getCost() == 150.0);
   }

   static void TestGetWheel(){
      Wheel wheel = new Wheel(10,10,"brand",null);
      Bicycle bicycle = new Bicycle(0,null,wheel,null,null,null);
      assert(bicycle.getWheel() == wheel);
   }

   static void TestGetFrame(){
      BikeFrame frame = new BikeFrame(10,10,10,"brand",null);
      Bicycle bicycle = new Bicycle(0,null,null,frame,null,null);
      assert(bicycle.getFrame() == frame);
   }

   /*static void TestGetCost(){
      Bicycle bicycle = new Bicycle(150.0,null,null,null,null,null);
      assert(bicycle.getCost() == 150.0);
   }

   static void TestGetCost(){
      Bicycle bicycle = new Bicycle(150.0,null,null,null,null,null);
      assert(bicycle.getCost() == 150.0);
   }

   static void TestGetCost(){
      Bicycle bicycle = new Bicycle(150.0,null,null,null,null,null);
      assert(bicycle.getCost() == 150.0);
   }*/
}
