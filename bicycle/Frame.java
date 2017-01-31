public class Frame{

   private double length;
   private double height;
   private Material material;
   private double weight;
   private String brand;

   public static void main(String... args){

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
   
   public void setLength(double length){
      this.length = length;
   }
   
   public void setWeight(double weight){
      this.weight = weight;
   }
   
   public void setHeight(double height){
      this.height = height;
   }
   
   public void setBrand(String brand){
      this.brand = brand;
   }
   
   public void setMaterial(Material material){
      this.material = material;
   }
}
