package edu.jalc.bicycle.builders;

import edu.jalc.bicycle.Bicycle;
import edu.jalc.bicycle.frame.BikeFrame;
import edu.jalc.bicycle.wheel.Wheel;
import edu.jalc.bicycle.tire.Tire;
import edu.jalc.bicycle.material.Material;
import edu.jalc.bicycle.color.Color;

public class RoadBikeBuilder implements RoadBikeBuilderInterface{

  private String brandName;
  private String frameType = "Steel";
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
    frameType = "Carbon Fiber";
    return this;
  }
  public RoadBikeBuilder withAluminumFrame(){
    frameType = "Aluminum";
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
    Color color;
    Material material = new Material("Steel",35,80);
    double weight = 5.0;
    double length = bigFrame? 39: 42;
    double height = bigFrame? 21: 23;
    switch(frameType){
      case "Aluminum": weight = 3.5; material = new Material("Aluminum",25,75); break;
      case "Carbon Fiber": weight = 2.2; material = new Material("Carbon Fiber",10,100); break;
    }
    if(this.color != null) color = this.color;
    else color = new Color(255,255,255);
    this.frame = new BikeFrame(length, height, weight, color, this.brandName, material);
    double diameter = bigWheels? 28: 26;
    this.wheel = new Wheel(diameter,0.6,this.brandName,new Tire(1.0,0.8,diameter,this.brandName));
  }

  public Bicycle build(){
    makeComponents();
    return new Bicycle(0,this.brandName,this.wheel,this.frame,null,null);
  }
}
