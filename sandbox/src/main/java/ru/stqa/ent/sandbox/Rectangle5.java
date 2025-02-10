package ru.stqa.ent.sandbox;

public class Rectangle5 {
  public double r;
  public double r2;

  public Rectangle5(double sr, double sr2) {
    this.r = sr;
    this.r2 = sr2;
  }

  // ф-ция area перенесена сюда; из public static double area(Rectangle4 i) убираем static (используется, чтобы помечать ф-ции не связанные с объектом, к которым можно обращаться напрямую),
  // параметр (потому что метод ассоциирован с объектом, и передавать объект в качестве параметра не нужно); обращаемся к ассоциированному объекту через this.
  public double area() {
    return this.r * this.r2;
  }

}
