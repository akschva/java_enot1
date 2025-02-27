package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartHelper extends HelperBase {
  private ApplicationManager app;

  public CartHelper(WebDriver driver) {
    super(driver);
  }

  public void addCartItem() throws InterruptedException {
    driver.get("https://demowebshop.tricentis.com/");
    app.getClickHelper().selectItemBox(".item-box:nth-child(3) .button-2");
    Thread.sleep(1000);
    app.getNavigationHelper().gotoCart();
  }

  public boolean isThereAnItem() {
   return isElementPresent(By.name("removefromcart"));
  }
}
