package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FieldRedactorHelper extends HelperBase{

  public FieldRedactorHelper(WebDriver driver) {
    super(driver);
  }

  public void chagneQuantity(String quantity) {
    type(By.cssSelector(".cart-item-row"), quantity);
    driver.findElement(By.name("itemquantity5054028")).sendKeys(Keys.ENTER);
  }

  public void changeQuantity(String quantity) {
    type(By.id("addtocart_2_EnteredQuantity"), quantity);
  }

}

