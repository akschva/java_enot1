package ru.stqa.ent.shop.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;


public class CartTotalPrice extends TestBase {

@Test
public void testCartTotalPrice() throws InterruptedException {
  // Надо еще тест, чтобы для каждого товара в корзине считалась правильная общая сумма
    app.getNavigationHelper().gotoCart();
  if (! app.getCartHelper().isThereAnItem()) {
    app.getCartHelper().addCartItem(".item-box:nth-child(3) .button-2");
    app.getCartHelper().addCartItem(".item-box:nth-child(4) .button-2");
    }
  Thread.sleep(1000);
  double price = app.getCartHelper().getItemPrice(0);
  double totalbefore = app.getCartHelper().getProductTotal(0);
  int qtybefore = app.getCartHelper().getCartItemQty1("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[5]/input");
  String beforestring = String.valueOf(qtybefore + 1);
  app.getClickHelper().type(By.className("qty-input"), beforestring);
    app.getClickHelper().clickUpdateButton();
  double totalafter = app.getCartHelper().getProductTotal(0);
  if (qtybefore == 5) {
    Assert.assertEquals(totalbefore, totalafter, price); }
  else Assert.assertEquals(totalbefore + price, totalafter, price);
  }
}
