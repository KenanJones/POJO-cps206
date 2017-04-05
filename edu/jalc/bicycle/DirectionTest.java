package edu.jalc.bicycle;

public class DirectionTest{
  public static void main(String... args){
    Direction direction = new Direction(0);
    direction.turn(100);
    assert (direction.get() == 100);
    direction.turn(150);
    assert (direction.get() == 250);
    direction.turn(120);
    assert (direction.get() == 10);
    direction.turn(-100);
    assert (direction.get() == 270);
    direction.turn(-500);
    assert (direction.get() == 130);
  }
}
