package bicycle;

public class Bicycle{

   private double cost;
   private Wheel wheel;
   private BikeFrame frame;
   private String brand;
   private GearSet frontGears;
   private GearSet backGears;

   public Bicycle(){}

   public Bicycle(double cost, String brand, Wheel wheel,
         BikeFrame frame, GearSet frontGears, GearSet backGears){
      this.cost = cost;
      this.wheel = wheel;
      this.frame = frame;
      this.brand = brand;
      this.frontGears = frontGears;
      this.backGears = backGears;
   }

   public double getCost(){
     return cost;
  }

    public Wheel getWheel(){
      return wheel;
   }

    public BikeFrame getFrame(){
      return frame;
   }

    public String getBrand(){
      return brand;
   }

    public GearSet getFrontGears(){
      return frontGears;
   }

    public GearSet getBackGears(){
      return backGears;
   }

   public void setCost(double cost){
      this.cost = cost;
   }

   public void setWheel(Wheel wheel){
      this.wheel = wheel;
   }

   public void setFrame(BikeFrame frame){
      this.frame = frame;
   }

   public void setBrand(String brand){
      this.brand = brand;
   }

   public void setFrontGears(GearSet gears){
      frontGears = gears;
   }

   public void setBackGears(GearSet gears){
      backGears = gears;
   }
}
