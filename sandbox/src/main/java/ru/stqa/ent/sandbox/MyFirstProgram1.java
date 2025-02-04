package ru.stqa.ent.sandbox;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class MyFirstProgram1 {

  public static void main(String[] args) {
    meow("kitty");
    meow("birdy");

    double l = 5;
    System.out.println("Square area " + l + " = " + area(l));
  }

  public static void meow(String something) {
    System.out.println("Meow "+ something + "!");
  }

  public static double area(double len) {
    return len * len;
  }
}