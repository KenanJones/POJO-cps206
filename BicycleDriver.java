import edu.jalc.bicycle.frame.BikeFrame;
import edu.jalc.bicycle.wheel.Wheel;
import edu.jalc.bicycle.gear.GearSet;
import edu.jalc.bicycle.color.Color;
import edu.jalc.bicycle.tire.Tire;
import edu.jalc.bicycle.material.Material;
import edu.jalc.bicycle.*;

public class BicycleDriver{
   public static void main(String...args){
      Color color = new Color(11,37,55);
      Wheel wheel = new Wheel(27,33,"Giant",new Tire(1.5,1.5,27,"Michellin"));
      BikeFrame frame = new BikeFrame(66,37,17,color, "Giant",new Material("steel",13,129));
      Bicycle bi = new Bicycle(127.00, "Schwinn" ,wheel, frame, new GearSet(), new GearSet());
      /*System.out.printf("cost: $%.2f%nbrand: %s%nwheel: %s %.0f inch%n",
         bi.getCost(), bi.getBrand(), bi.getWheel().getBrand(), bi.getWheel().getDiameter());*/
      System.out.println(bi);
      bi.ride();
      bi.pedal();
      bi.brake();
      bi.turn(30);
      bi.turn(27);
      bi.turn(-44);
      bi.doTrick();
   }
}
