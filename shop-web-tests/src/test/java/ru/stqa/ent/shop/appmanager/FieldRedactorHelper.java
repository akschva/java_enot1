package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FieldRedactorHelper extends HelperBase{

  public FieldRedactorHelper(WebDriver driver) {
    super(driver);
  }

//  public void changeQuantityinCart(String quantity) throws InterruptedException {
//    Thread.sleep(2000);
//    type(By.cssSelector(".cart-item-row"), quantity);
//    driver.findElement(By.className("qty-input.valid")).sendKeys(Keys.ENTER);
//  }

  public void changeQuantity(String quantity) {
    type(By.className("qty-input"), quantity);
 }



}

