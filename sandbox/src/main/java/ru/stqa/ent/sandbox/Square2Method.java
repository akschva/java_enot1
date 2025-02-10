package ru.stqa.ent.sandbox;

public class Square2Method {

  public double d;

  public Square2Method(double ddd) {
    this.d = ddd;
  }
  public double area() {
    return this.d * this.d;

 /* Было public static double area(Square2Method n) {return n.d * n.d;}
 * убираем static (оно для функций неассоциированных ни с каким объектом, к ним можно обращаться напрямую) и параметр т.к. метод ассоциирован с объектом, его не нужно передавать
 * обращаться к ассоциированному объекту можно тоже через this */

  }


}
