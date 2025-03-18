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
    app.getCartHelper().addCartItem("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input");
    app.getCartHelper().addCartItem("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input");
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
