public class Tire{

   private double thickness;
   private double width;
   private double diameter;
   private String brand;

   public static void main(String... args){

   }

   public double getThickness(){
      return thickness;
   }

   public double getwidth(){
      return width;
   }

   public double getDiameter(){
      return diameter;
   }

   public String getBrand(){
      return brand;
   }
   
   public void setBrand(String brand){
      this.brand = brand;
   }
   
   public void setDiameter(double diameter){
      this.diameter = diameter;
   }
   
   public void setWidth(double width){
      this.width = width;
   }
   
   public void setThickness(double thickness){
      this.thickness = thickness;
   }
}
