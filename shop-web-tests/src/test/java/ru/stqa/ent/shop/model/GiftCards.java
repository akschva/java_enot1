package ru.stqa.ent.shop.model;

import com.google.common.collect.ForwardingSet;

import java.util.HashSet;
import java.util.Set;

public class GiftCards extends ForwardingSet<GiftcardData>{

  private Set<GiftcardData> delegate;


  public GiftCards(GiftCards giftCards) {
    // берем множество из существующего объекта, который передан параметром, строим новое множество из тех же самых элементов, присваиваем множество в качве атрибута в новый создаваемый конструктором объект
    this.delegate = new HashSet<GiftcardData>(giftCards.delegate);
  }

  public GiftCards() {
    this.delegate = new HashSet<GiftcardData>();

  }

  @Override
  protected Set<GiftcardData> delegate() {
    return Set.of();
  }

  // сделаем копию - метод withAdded возвращает объект типа carts, но новый с добавленной новой группой
  public GiftCards withAdded(GiftcardData giftcardData) {
    GiftCards giftCards = new GiftCards(this);
    giftCards.add(giftcardData);
    return giftCards;
  }

  public GiftCards withoutAdded(GiftcardData giftcardData) {
    GiftCards giftCards = new GiftCards(this);
    giftCards.remove(giftcardData);
    return giftCards;
  }

}

