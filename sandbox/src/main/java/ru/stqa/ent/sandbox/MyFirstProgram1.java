package ru.stqa.ent.sandbox;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class MyFirstProgram1 {

  public static void main(String[] args) {
    meow("kitty");
    meow("birdy");

    Square s = new Square(7);
    System.out.println("Square area " + s.l + " = " + area(s));
    /* когда мы передавали не простое число double l = 5, а объект типа Square,
    * мы создавали Square s = new Square(); и установили передаваемое значение атрибута s.l = 5
    * и уже объект типа Square становился параметром функции area(s), а не атрибут длина стороны квадрата area(l)*/


    Rectangle m = new Rectangle(7, 4);
    System.out.println("Rectangle area " + m.a + " and " + m.b + " = " + area(m));
  }

  public static void meow(String something) {
    System.out.println("Meow "+ something + "!");
  }

  public static double area(Square s) {
    return s.l * s.l;
    /* для того, чтобы получить доступ к атрибуту объекта, мы пишем s.l
    * И сейчас в фунцкию area передается объект типа квадрат, а не длина стороны квадрата атрибут (double l)*/
  }

  public static double area(Rectangle m) {
    return m.a * m.b;
  }
}