package ru.stqa.ent.sandbox;

// Здесь zz и zx атрибуты
public class Rectangle4 {
  public double zz;
  public double zx;

  // Когда у нас есть переменная, которая ссылается на объект (у), то обращаться к атрибуту мы можем через нее (y.z).
  // Но в конструкторе с этой целью выступает ключевое слово this; this - это тот объект, который инициализируется в конструкторе.
  // Используется для того, чтобы присвоить переданное значение именно в атрибут объекта, сослаться на этот объект.
  // Часто встречается, что параметр конструктора (в скобках и после =) называется также, как параметры класса
  // Здесь zz и zx параметры функции (конструктора)
  public Rectangle4(double z, double zx) {
    this.zz = z;
    this.zx = zx;
  }
}
