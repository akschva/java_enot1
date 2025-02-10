package ru.stqa.ent.sandbox;

import org.testng.annotations.Test;

public class SquareTests {

  @Test
  public void testArea() {
    Square2Method s = new Square2Method(5);
    assert s.area() == 25;
  }
}
