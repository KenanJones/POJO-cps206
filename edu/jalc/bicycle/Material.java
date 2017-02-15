package bicycle;

public class Material{

   private final double density;
   private final double strength;
   private final String name;

   public Material(String name, double density, double strength){
      this.name = name;
      this.density = density;
      this.strength = strength;
   }

   public double getDensity(){
      return density;
   }

   public double getStrength(){
      return strength;
   }

   public String getName(){
      return name;
   }
}
