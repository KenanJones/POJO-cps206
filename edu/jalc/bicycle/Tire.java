package bicycle;

public class Tire{

   private final double thickness;
   private final double width;
   private final double size;
   private final String brand;

   public Tire(double thickness, double width, double size, String brand){
      this.thickness = thickness;
      this.width = width;
      this.size = size;
      this.brand = brand;
   }

   public double getThickness(){
      return thickness;
   }

   public double getWidth(){
      return width;
   }

   public double getSize(){
      return size;
   }

   public String getBrand(){
      return brand;
   }
}
