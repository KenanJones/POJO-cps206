package edu.jalc.bicycle.wheel;

import edu.jalc.bicycle.tire.Tire;

public class Wheel{

   private final double diameter;
   private Tire tire;
   private final double weight;
   private final String brand;

   public Wheel(double diameter, double weight, String brand, Tire tire){
      this.diameter = diameter;
      this.weight = weight;
      this.brand = brand;
      this.tire = tire;
   }

   public double getDiameter(){
      return diameter;
   }

   public double getWeight(){
      return weight;
   }

   public String getBrand(){
      return brand;
   }

   public Tire getTire(){
      return tire;
   }

   public void setTire(Tire tire){
      this.tire = tire;
   }
}
