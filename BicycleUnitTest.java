import bicycle.*;

class BicycleUnitTest{
   public static void main(String... args){
      //tests
   }
   
   static void TestGetCost(){
      Bicycle bicycle = new Bicycle(150.0,null,null,null,null,null);
      assert(bicycle.getCost() == 150.0);
   }
}