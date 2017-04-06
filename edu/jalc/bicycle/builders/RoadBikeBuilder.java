package edu.jalc.bicycle.builders;

import edu.jalc.bicycle.Bicycle;
import edu.jalc.bicycle.color.Color;

public class RoadBikeBuilder implements RoadBikeBuilderInterface{

  private String brandName;
  private boolean carbonFiberFrame = false;
  private boolean bigFrame = false;
  private boolean bigWheels = false;
  private int speeds = 21;
  private Color color;
  
  private BikeFrame frame;
  private Wheel wheel;

  public RoadBikeBuilder(String brandName){
    this.brandName = brandName;
  }

  public RoadBikeBuilder withCarbonFiberFrame(){
    carbonFiberFrame = true;
    return this;
  }
  public RoadBikeBuilder withBigFrame(){
    bigFrame = true;
    return this;
  }
  public RoadBikeBuilder withBigWheels(){
    bigWheels = true;
    return this;
  }
  public RoadBikeBuilder with27Speeds(){
    speeds = 27;
    return this;
  }
  public RoadBikeBuilder paint(Color color){
    this.color = color;
    return this;
  }

  public void makeComponents(){
    double length = bigFrame? 39: 42;
    double height = bigFrame? 21: 23;
    double weight = carbonFiberFrame? 2.2: 3.5;
    if(this.color != null) Color color = this.color;
    else Color color = new Color(255,255,255);
    if(carbonFiberFrame) Material material = new Material("Carbon Fiber",10,100);
    else Material material = new Material("Aluminum",25,75);
    this.frame = new BikeFrame(length, height, weight, color, this.brandName, material);
    double diameter = bigWheels? 28: 26;
    this.wheel = new Wheel(diameter,0.6,this.brandName,new Tire(1.0,0.8,diameter,this.brandName));
  }

  public Bicycle build(){
    makeComponents();
    return new Bicycle(0,this.brandName,this.wheel,this.frame,null,null);
  }
}
