package bicycle;

public class BikeFrame{

   private final double length;
   private final double height;
   private Color color;
   private final double weight;
   private final String brand;
   private final Material material;
   
   public BikeFrame(double length, double height, double weight, Color color, String brand, Material material){
      this.length = length;
      this.height = height;
      this.weight = weight;
      this.color = color;
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

   public Color getColor(){
      return color;
   }
   
   public String getbrand(){
      return brand;
   }

   public Material getMaterial(){
      return material;
   }
   
   public void setColor(Color color){
      this.color = color;
   }
}
