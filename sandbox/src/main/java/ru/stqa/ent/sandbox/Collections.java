package ru.stqa.ent.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
  public static void main(String[] args) {
    // конструкция, которая позволяет описывать коллекции - массив (напр параметр функции main)
    String[] langs = new String[4]; //объявлена переменная типа "массив строк" - [] в декларации и размер
    langs[0] = "Java";
    langs[1] = "C#";
    langs[2] = "Python";
    langs[3] = "PHP";
    // Проще описать так -  String[] langs = {"Java", "C#", "Python", "PHP"} !!

    //В Java есть два основных вида массивов - списки и множества, у них есть уже созданные классы
//    List<String> languages = new ArrayList<String>(); //для интерфейса List реализация ArrayList удобная нам
//    languages.add("Java");
//    languages.add("C#");
//    languages.add("JavaScript");
    List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP"); // Проще описать так - аналог инициализации массива при помощи фиг скобок выше

//    for (int i = 0; i < langs.length; i++) {
//      System.out.println("There is programming language " + langs[i]);

    // Для коллекций существует особая конструкция цикла для перебора элементов
    for (String l : languages) { //l уже не индекс, а ссылка непосредственно на эелемент массива. Искусственная переменная счетчик не нужна
      // букв для каждого элемента l входящего в массив langs выполнить какое-то действие
      System.out.println("There is programming language " + l);
    }

    for (int i = 0; i < languages.size(); i++); {
      System.out.println("There is programming language " + languages.get(i)); // - get средство для работы с массивами, а i обычный объект, но так неудобно
    }
    //Можно еще сделать список объектов произвольного типа, не указывая <тут> и Object : l, но неудобно
  }
}
