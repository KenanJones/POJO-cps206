import bicycle.*;

public class BicycleDriver{
   public static void main(String...args){
      Bicycle bi = new Bicycle(127.00,"Schwinn",new Color(18,56,11),new Wheel(27,33,"Giant",new Tire(1.5,1.5,27,"Michellin")), new Frame(66,37,17,"Giant",new Material("steel",13,129)), new GearSet(), new GearSet());
      System.out.printf("cost: $%.2f\nbrand: %s\ncolor:%d,%d,%d\nwheel: %s %f inch",
         bi.getCost(), bi.getBrand(), bi.getColor().getRed(), bi.getColor().getGreen(), bi.getColor().getBlue(), bi.getWheel().getBrand(), bi.getWheel().getDiameter());
   }
}