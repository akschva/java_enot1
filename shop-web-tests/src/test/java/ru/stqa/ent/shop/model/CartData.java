package ru.stqa.ent.shop.model;

public class CartData {
  public double productprice;
  public int quantity;
  public String name;



  public CartData(Double price, Integer qty, String name) {
//    double total = price * qty;
//    this.producttotal = total;
    this.productprice = price;
    this.quantity = qty;
    this.name = name;

//    System.out.println(total);;
  }

  @Override
  public String toString() {
    return "CartData{" +
            "name='" + name + '\'' +
            '}';
  }

  public String getName () {
    return name;
 }
}
