package bicycle;

public class Gear{

   private final int numberOfTeeth;
   private final double diameter;
   private final double weight;

   public Gear(int numberOfTeeth, double diameter, double weight){
      this.numberOfTeeth = numberOfTeeth;
      this.diameter = diameter;
      this.weight = weight;
   }

   public int getNumberOfTeeth(){
      return numberOfTeeth;
   }

   public double getDiameter(){
      return diameter;
   }

   public double getWeight(){
      return weight;
   }
}
