package edu.jalc.bicycle;

public class Direction{
   private double direction;
   
   public Direction(double dir){
      this.direction = 0;
      this.change(dir);
   }
      
   public double direction(){
     return this.direction;
   }
   
   public void change(double amount){
     this.direction = Math.abs((this.direction + amount)%360);
   }
   
   public String toString(){
     return this.direction + " degrees";
   }
}