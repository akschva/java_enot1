package ru.stqa.ent.sandbox;

public class Rectangle {

  public double a;
  public double b;

  public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
    /* значение атрибута создаваемого объекта = значению параметра переданного в конструктор
    * то есть значение m.a = значению параметра a (переданного)new Rectangle */
  }
}


