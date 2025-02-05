package ru.stqa.ent.sandbox;

public class Square2Method {

  public double d;

  public Square2Method(double ddd) {
    this.d = ddd;
  }
  public double area() {
    return this.d * this.d;

 /* было public static double area(Square2Method n) {return n.d * n.d;}
 * убираем static и параметр т.к. метод ассоциирован с объектом, его не нужно передавать
 * обращаться к ассоциированному объекту можно тоже через this*/

  }


}
