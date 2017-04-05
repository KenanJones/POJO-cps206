package edu.jalc.bicycle.wheel;

import edu.jalc.bicycle.tire.Tire;
import edu.jalc.bicycle.brand.Brand;

public class Wheel{

   private final double diameter;
   private Tire tire;
   private final double weight;
   private final Brand brand;

   public Wheel(double diameter, double weight, String brandName, Tire tire){
      this.diameter = diameter;
      this.weight = weight;
      this.brand = new Brand(brandName);
      this.tire = tire;
   }

   public double getDiameter(){
      return diameter;
   }

   public double getWeight(){
      return weight;
   }

   public Brand getBrand(){
      return brand;
   }

   public Tire getTire(){
      return tire;
   }

   public void setTire(Tire tire){
      this.tire = tire;
   }
}
