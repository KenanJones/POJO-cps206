package edu.jalc.bicycle.tire;

import edu.jalc.bicycle.brand.Brand;

public class Tire implements Fillable{

   private final double thickness;
   private final double width;
   private final double size;
   private final Brand brand;

   public Tire(double thickness, double width, double size, String brandName){
      this.thickness = thickness;
      this.width = width;
      this.size = size;
      this.brand = new Brand(brandName);
   }
   
   public void fill(){System.out.println("Tires filled.");}

   public double getThickness(){
      return thickness;
   }

   public double getWidth(){
      return width;
   }

   public double getSize(){
      return size;
   }

   public Brand getBrand(){
      return brand;
   }
}
