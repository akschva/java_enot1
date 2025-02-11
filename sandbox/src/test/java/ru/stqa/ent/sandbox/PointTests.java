package ru.stqa.ent.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.ent.homeworklesson1.Point2;

public class PointTests {

  @Test
  public void testDistanceNotZero() {
    Point2 p2 = new Point2(20, 30);
    Point2 p1 = new Point2(40, 60);
    if (p1.distance(p2, p1) == 0) throw new AssertionError();
  }

  @Test
  public void testDistance() {
    Point2 p1 = new Point2(10, 30);
    Point2 p2 = new Point2(20, 20);
    if (p1.distance(p2, p1) > 25) throw new AssertionError();
    else if (p1.distance(p2, p1) < 25) {
      System.out.println("Distance betweeen p1 and p2" + " = " + p1.distance(p2, p1) +
              " which is lesser than 25"); }
  }
  @Test
  public void testDistanceLesserZero() {
    Point2 p1 = new Point2(10, 30);
    Point2 p2 = new Point2(40, 60);
    assert p1.distance(p2, p1) < 0;
    }

  @Test
  public void testObject(){
    Point2 p1 = new Point2(20, 20);
    Point2 p2 = new Point2(40, 40);
    Assert.assertSame(p1, p1);
    Assert.assertNotSame(p2, p1);
  }

  @Test
  public void testNotNull() {
    Point2 p1 = new Point2(10, 30);
    Point2 p2 = new Point2(40, 60);
    Assert.assertNotNull(p1);
    Assert.assertNotNull(p2);
    }


  }
