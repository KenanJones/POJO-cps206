public class Wheel{
   
   private double diameter;
   private Tire tire;
   private double weight;
   private String brand;
   
   public static void main(String... args){
      Wheel wheel = new Wheel();
      wheel.setDiameter(12.1);
      wheel.setWeight(1001);
      wheel.setBrand("Schwinn");
      System.out.printf("%f, %f, %s",wheel.getDiameter(),wheel.getWeight(),wheel.getBrand());
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
   
   public void setDiameter(double diameter){
      this.diameter = diameter;
   }
   
   public void setWeight(double weight){
      this.weight = weight;
   }
   
   public void setBrand(String brand){
      this.brand = brand;
   }
   
   public void setTire(Tire tire){
      this.tire = tire;
   }
}