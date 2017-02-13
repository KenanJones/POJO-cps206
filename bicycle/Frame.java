package bicycle;

public class Frame{

   private final double length;
   private final double height;
   private final Material material;
   private final double weight;
   private final String brand;
   
   public Frame(double length, double height, double weight, String brand, Material material){
      this.length = length;
      this.height = height;
      this.weight = weight;
      this.brand = brand;
      this.material = material;
   }

   public double getLength(){
      return length;
   }

   public double getWeight(){
      return weight;
   }

   public double getHeight(){
      return height;
   }

   public String getbrand(){
      return brand;
   }

   public Material getMaterial(){
      return material;
   }
}
