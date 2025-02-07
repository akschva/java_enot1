package ru.stqa.ent.homeworklesson1;

public class Homework1 {

  public static void main(String[] args) {


  // Вариант 1
    Point p1 = new Point(40, 20);
    Point p2 = new Point(30, 20);

    System.out.println("Distance between points " + p1.x +";" + p1.y + " and " + p2.x + ";" + p2.y + " = " + distance(p1, p2));


  // Вариант 2 (метод в классе Point2)

  }

  // Вариант 1
    public static double distance(Point p2, Point p1) {
      return Math.sqrt( (p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
    }

  // Вариант 2 (метод в классе Point2 - ф-ция distance там же)


}

