package edu.jalc.bicycle;

public class Direction{
   private double direction;

   public Direction(double degrees){
      this.direction = 0;
      this.rotate(degrees);
   }

   public double get(){
     return this.direction;
   }

   public void rotate(double degrees){
     double x = (this.direction + degrees)%360;
     this.direction = (x > 0)? x: 360+x;
   }

   public String toString(){
     return this.direction + " degrees";
   }
}
