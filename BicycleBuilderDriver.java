import edu.jalc.bicycle.builders.*;
import edu.jalc.bicycle.frame.BikeFrame;
import edu.jalc.bicycle.wheel.Wheel;
import edu.jalc.bicycle.gear.GearSet;
import edu.jalc.bicycle.color.Color;
import edu.jalc.bicycle.tire.Tire;
import edu.jalc.bicycle.material.Material;
import edu.jalc.bicycle.*;

public class BicycleBuilderDriver{
  public static void main(String... args){
    Bicycle bike = new RoadBikeBuilder("Schwinn")
      .withCarbonFiberFrame()
      .withBigWheels()
      .paint(new Color(0,255,0))
      .build();
    System.out.println(bike.describe());
  }
}
