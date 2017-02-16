import bicycle.*;

public class BicycleDriver{
   public static void main(String...args){
      Color color = new Color(11,37,55);
      Wheel wheel = new Wheel(27,33,"Giant",new Tire(1.5,1.5,27,"Michellin"));
      BikeFrame frame = new BikeFrame(66,37,17,color, "Giant",new Material("steel",13,129));
      Bicycle bi = new Bicycle(127.00, "Schwinn" ,wheel, frame, new GearSet(), new GearSet());
      /*System.out.printf("cost: $%.2f\nbrand: %s\ncolor:%d,%d,%d\nwheel: %s %f inch",
         bi.getCost(), bi.getBrand(), bi.getColor().getRed(), bi.getColor().getGreen(),
         bi.getColor().getBlue(), bi.getWheel().getBrand(), bi.getWheel().getDiameter());*/
      System.out.printf("cost: $%.2f%nbrand: %s%nwheel: %s %f inch",
         bi.getCost(), bi.getBrand(), bi.getWheel().getBrand(), bi.getWheel().getDiameter());
   }
}
