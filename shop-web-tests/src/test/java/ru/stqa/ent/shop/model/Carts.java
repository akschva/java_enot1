package ru.stqa.ent.shop.model;

import com.google.common.collect.ForwardingSet;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;


// из библиотеки guava, шаблон проектирования decorator
public class Carts extends ForwardingSet<CartData> {

  private Set<CartData> delegate;

  public Carts(Carts carts) {
  // берем множество из существующего объекта, который передан параметром, строим новое множество из тех же самых элементов, присваиваем множество в качве атрибута в новый создаваемый конструктором объект
    this.delegate = new HashSet<CartData>(carts.delegate);
  }

  public Carts() {
    this.delegate = new HashSet<CartData>();

  }

  @Override
  protected Set<CartData> delegate() {
    return Set.of();
  }

  // сделаем копию - метод withAdded возвращает объект типа carts, но новый с добавленной новой группой
  public Carts withAdded(CartData cart) {
    Carts carts = new Carts(this);
    carts.add(cart);
    return carts;
  }

  public Carts withoutAdded(CartData cart) {
    Carts carts = new Carts(this);
    carts.remove(cart);
    return carts;
  }

}
