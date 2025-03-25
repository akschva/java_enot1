package ru.stqa.ent.shop.model;

public class GiftcardData {
  String RecipData;
  String YData;
  Integer Qty;

//  public void GiftcardData(String RecipData, String YData, Integer Qty) {
//    this.RecipData = RecipData;
//    this.YData = YData;
//    this.Qty = Qty;
//  }


  public String getRecipData () {
    return RecipData;
  }
  public String getYData () {
    return YData;
  }
  public int getQty () {
    return Qty;
  }

  @Override
  public String toString() {
    return "GiftcardData{" +
            "Qty=" + Qty +
            '}';
  }

  public GiftcardData withRecipData(String recipdata) {
    this.RecipData = recipdata;
    return this; /* метод будет возвращать объект, в котором вызван - это чтобы строить каскады*/
  }

  public GiftcardData withQuantity(Integer quantity) {
    this.Qty = quantity;
    return this;
  }

  public GiftcardData withYData(String ydata) {
    this.YData = ydata;
    return this;
  }


  public void add(GiftcardData giftcardData) {
  }
}
