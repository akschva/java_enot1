package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickHelper {
  private WebDriver driver;

  public ClickHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void clickAddToCard() {
    driver.findElement(By.id("add-to-cart-button-2")).click();
  }

  public void selectItemBox() {
    driver.findElement(By.cssSelector(".item-box:nth-child(2) .button-2")).click();
  }

  public void clickUpdateButton() {
    driver.findElement(By.id("add-to-cart-button-2")).click();
  }

  public void chooseGender() {
    driver.findElement(By.id("gender-female")).click();
  }

  public void clickEditButton() {
    driver.findElement(By.linkText("Edit")).click();
  }
}
