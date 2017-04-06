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
    BikeFrame frame = new BikeFrame(length, height, weight, color, brandName, material);
  }

  public Bicycle build(){
    makeComponents();
    return new Bicycle(0,null,null,null,null,null);
  }
}
