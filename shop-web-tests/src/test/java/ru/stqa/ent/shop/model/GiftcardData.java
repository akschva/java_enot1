package ru.stqa.ent.shop.model;

public class GiftcardData {
  String RecipEmail;
  String RecipName;
  String YEmail;
  String YName;
  Integer Qty;

//  public void GiftcardData(String RecipData, String YData, Integer Qty) {
//    this.RecipData = RecipData;
//    this.YData = YData;
//    this.Qty = Qty;
//  }


  public String getRecipEmail () {
    return RecipEmail;
  }
  public String getRecipName () {
    return RecipName;
  }

  public String getYEmail () {
    return YEmail;
  }
  public String getYName () {
    return YName;
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

  public GiftcardData withRecipEmail(String recipemail) {
    this.RecipEmail = recipemail;
    return this; /* метод будет возвращать объект, в котором вызван - это чтобы строить каскады*/
  }

  public GiftcardData withRecipName(String recipname) {
    this.RecipName = recipname;
    return this; /* метод будет возвращать объект, в котором вызван - это чтобы строить каскады*/
  }


  public GiftcardData withQuantity(Integer quantity) {
    this.Qty = quantity;
    return this;
  }

  public GiftcardData withYEmail(String yemail) {
    this.YEmail = yemail;
    return this;
  }
  public GiftcardData withYName(String yname) {
    this.YName = yname;
    return this;
  }



  public void add(GiftcardData giftcardData) {
  }
}
