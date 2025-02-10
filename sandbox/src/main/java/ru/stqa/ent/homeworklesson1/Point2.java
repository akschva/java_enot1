package ru.stqa.ent.homeworklesson1;

public class Point2 {
  public double x, y;

  public Point2(double xx, double yy) {
    this.x = xx;
    this.y = yy;
  }

  public double distance(Point2 p2, Point2 p1) {
    return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
  }

}
