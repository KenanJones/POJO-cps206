package edu.jalc.bicycle;

public class DirectionTest{
  public static void main(String... args){
    System.out.println("Testing Direction . . .");
    Direction direction = new Direction(0);
    direction.rotate(100);
    assert (direction.get() == 100);
    direction.rotate(150);
    assert (direction.get() == 250);
    direction.rotate(120);
    assert (direction.get() == 10);
    direction.rotate(-100);
    assert (direction.get() == 270);
    direction.rotate(-500);
    assert (direction.get() == 130);
    System.out.println("Direction tests passed.");
  }
}
