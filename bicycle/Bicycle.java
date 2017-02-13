package bicycle;

public class Bicycle{
   
   private double cost;
   private Color color;
   private Wheel wheel;
   private Frame frame;
   private String brand;
   private GearSet frontGears;
   private GearSet backGears;
   
   public Bicycle(){}//a default constructor
   
   public Bicycle(double cost, String brand, Color color, Wheel wheel, Frame frame, GearSet frontGears, GearSet backGears){
      this.color = color;
      this.cost = cost;
      this.wheel = wheel;
      this.frame = frame;
      this.brand = brand;
      this.frontGears = frontGears;
      this.backGears = backGears;
   }
   
   public static void main (String... args){
      new Bicycle();
   }
   
    public Color getColor(){
      return color;
   }
   
    public Wheel getWheel(){
      return wheel;
   }
   
    public Frame getFrame(){
      return frame;
   }
   
    public String getBrand(){
      return brand;
   }
   
    public double getCost(){
      return cost;
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
   
   public void setColor(Color color){
      this.color = color;
   }
   
   public void setWheel(Wheel wheel){
      this.wheel = wheel;
   }
   
   public void setFrame(Frame frame){
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