package edu.jalc.bicycle.builders;

import edu.jalc.bicycle.Bicycle;
import edu.jalc.bicycle.color.Color;

public interface RoadBikeBuilderInterface{
  public RoadBikeBuilder withCarbonFiberFrame();
  public RoadBikeBuilder withBigFrame();
  public RoadBikeBuilder withBigWheels();
  public RoadBikeBuilder with27Speeds();
  public RoadBikeBuilder paint(Color color);
  public Bicycle build();
}
