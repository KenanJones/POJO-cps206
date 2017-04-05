import edu.jalc.bicycle.BicycleTest;
import edu.jalc.bicycle.frame.BikeFrameTest;
import edu.jalc.bicycle.wheel.WheelTest;
import edu.jalc.bicycle.gear.GearSetTest;
import edu.jalc.bicycle.gear.GearTest;
import edu.jalc.bicycle.brand.BrandTest;
import edu.jalc.bicycle.tire.TireTest;
import edu.jalc.bicycle.color.ColorTest;
import edu.jalc.bicycle.material.MaterialTest;
import edu.jalc.bicycle.DirectionTest;
//import edu.jalc.bicycle.actions.*;

public class TestDriver{
   public static void main(String... args){
      BicycleTest.main();
      BikeFrameTest.main();
      WheelTest.main();
      TireTest.main();
      GearSetTest.main();
      GearTest.main();
      ColorTest.main();
      MaterialTest.main();
      BrandTest.main();
      DirectionTest.main();
      System.out.println("All tests passed.");
   }
}