package ru.stqa.ent.shop.tests;

import org.junit.Test;

public class SimpleAddtocartTest extends TestBase {

  @Test
  public void testSimpleaddtoCart() throws InterruptedException {
    app.getClickHelper().selectItemBox(".item-box:nth-child(3) .button-2");
    Thread.sleep(1000);
    app.getNavigationHelper().gotoCart();
  }
}
