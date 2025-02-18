package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FieldRedactorHelper {
  private WebDriver driver;

  public FieldRedactorHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void chagneQuantity(String quantity) {
    driver.findElement(By.cssSelector(".cart-item-row")).click();
    driver.findElement(By.name("itemquantity5054028")).sendKeys(quantity);
    driver.findElement(By.name("itemquantity5054028")).sendKeys(Keys.ENTER);
  }

  public void changeQuantity(String quantity) {
    driver.findElement(By.id("addtocart_2_EnteredQuantity")).click();
    driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys(quantity);
  }

}

