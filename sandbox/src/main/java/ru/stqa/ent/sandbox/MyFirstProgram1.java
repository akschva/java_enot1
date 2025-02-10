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
     * мы создавали Square s = new Square(); и установили передаваемое значение атрибута s.l = 7
     * и уже объект типа Square становился параметром функции area(s), а не атрибут длина стороны квадрата area(l)
     * Было Square s = new Square(); s.l (из класса) = 7 и area(s) */


    Rectangle m = new Rectangle(7, 4);
    System.out.println("Rectangle area " + m.a + " and " + m.b + " = " + area(m));



    /* В Java функция - это именованный фрагмент кода, а метод - функция, ассоциированная с каким-то объектом
     * т.е. любой метод является функцией, но не любая функция - методом */

    /* если функцию public static double area(Square s) {return s.l * s.l;} перенести в ее класс, то она уже будет методом
     * Пример: */
    Square2Method n = new Square2Method(6);
    System.out.println("Square 2 area " + n.d + " = " + n.area());

    /* Java находит функцию, которая находится в классе, соответствующем этому объекту и вызывает эту функцию.
    * А тот объект, в котором этот метод/функция вызывался, становится доступен через идентификатор this.
    * К методу можно обращаться только указав перед ним объект, в котором метод вызывается */


  }

  public static void meow(String something) {
    System.out.println("Meow "+ something + "!");
  }

  public static double area(Square s) {
    return s.l * s.l;
    /* для того чтобы получить доступ к атрибуту объекта, мы пишем s.l
     * И сейчас в функцию area передается объект типа квадрат, а не длина стороны квадрата атрибут (double l)*/
  }

  public static double area(Rectangle m) {
    return m.a * m.b;
  }

}


