package ru.stqa.ent.sandbox;

import javax.xml.transform.Source;

public class MyFirstProgram2 {

  public static void main(String[] args) {

 // Уровень 1 - просто задаем переменные сразу; класса нет, все выполняется отсюда; ф-ция area возвращает результат умножения заданных ей переменных //
    double va = 6;
    double vb = 7;
    System.out.println("Rectangle area with sides " + va + " and " + vb + " = " + area(va, vb));


 // Уровень 2 - сначала создаем объект y класса Rectangle2; в классе описываем его структуру как 2 стороны; потом устанавливаем у нового объекта значение атрибута y.
 // В ф-ции вывода вместо переменной используем объект y. у которого берем атрибуты p, e; в выводе в area передается объект типа Rectangle2//
    Rectangle2 y = new Rectangle2();
    y.p = 5;
    y.e = 7;
    System.out.println("Rectangle area with sides " + y.p + " and " + y.e + " = " + area(y));


// Уровень 3 - внутри класса объявляем специальную псевдо-функцию (конструктор), для того, чтобы заполнить атрибуты нового создаваемого объекта значениями, которые
// передаются в качестве параметра в этот конструктор. Больше нельзя создать объект типа Rectangle3, потому что конструктор параметров этого типа требует передачи значения параметров;
// заполнять атрибуты теперь здесь не нужно
    Rectangle3 f = new Rectangle3(2, 4);
    System.out.println("Rectangle area with sides " + f.p + " and " + f.e + " = " + area(f));


// Уровень 4 - длины сторон также передаются в качестве параметров в конструктор
    Rectangle4 f1 = new Rectangle4(4, 4);
    System.out.println("Rectangle area with sides " + f1.zz + " and " + f1.zx + " = " + area(f1));

  }

  // -------------------------------------------------------------------------------------------------------------------------------------------------------


 // Уровень 1 //
  public static double area(double m, double n) {
    return m * n;
  }


 // Уровень 2 - area в качестве параметра теперь принимает объект типа Rectangle2, а чтобы получить доступ к атрибуту этого объекта пишем g.
 // В ф-ции вывода ей передается объект класса Rectangle3
 public static double area(Rectangle2 g) {
    return g.e * g.p;
  }


  // Уровень 3 - area не меняется, просто новый класс передается ей и новые названия длинны сторон
  public static double area(Rectangle3 i) {
    return i.e * i.p;
  }


  // Уровень 4 - area не меняется, просто новый класс и новые названия длинны сторон
  public static double area(Rectangle4 i) {
    return i.zz * i.zx;
  }


}