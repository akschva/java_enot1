package ru.stqa.ent.shop.tests;// Generated by Selenium IDE
import org.junit.Test;
import org.openqa.selenium.By;

public class ZeroQuantityCartTest extends TestBase {

  @Test
  public void testZeroQuantityCart() throws InterruptedException {
    app.getNavigationHelper().gotoCart();
    if (! app.getCartHelper().isThereAnItem()) {
      app.getCartHelper().addCartItem();
    }
    if (! app.getClickHelper().isThereEditButton()) {
      app.getClickHelper().click(By.className("product-name")); }
    else {
      app.getClickHelper().clickEditButton(); }
    app.getFieldRedactorHelper().changeQuantity("3");
    app.getClickHelper().clickUpdateButton();
    app.getNavigationHelper().gotoCart();
    app.getFieldRedactorHelper().changeQuantity("1");
  }

}
