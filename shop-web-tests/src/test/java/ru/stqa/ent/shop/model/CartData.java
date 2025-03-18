package ru.stqa.ent.shop.model;

public class CartData {
  public double productprice;
  public double producttotal;
  public int quantity;


  public CartData(double price, int qty) {
    double total = price * qty;
    this.producttotal = total;
    this.productprice = price;
    this.quantity = qty;

    System.out.println(total);;
  }
}
