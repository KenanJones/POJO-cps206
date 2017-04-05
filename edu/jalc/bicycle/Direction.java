package edu.jalc.bicycle;

public class Direction{
   private double direction;

   public Direction(double dir){
      this.direction = 0;
      this.turn(dir);
   }

   public double get(){
     return this.direction;
   }

   public void turn(double amount){
     double x = (this.direction + amount)%360;
     this.direction = (x > 0)? x: 360+x;
   }

   public String toString(){
     return this.direction + " degrees";
   }
}
