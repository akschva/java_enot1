package ru.stqa.ent.shop.model;

public class CartData {
  private Integer id = Integer.MAX_VALUE;
  private Double productprice;
  private Integer quantity;
  private String name;


  public String getName () {
    return name;
 }

  public int getId () {
    return id;
  }

  @Override
  public String toString() {
    return "CartData{" +
            "id=" + id +
            '}';
  }

  public CartData withName(String name) {
    this.name = name;
    return this; /* метод будет возвращать объект, в котором вызван - это чтобы строить каскады*/
  }

  public CartData withQuantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  public CartData withProductprice(Double productprice) {
    this.productprice = productprice;
    return this;
  }

  public CartData withId(Integer id) {
    this.id = id;
    return this;
  }



}


