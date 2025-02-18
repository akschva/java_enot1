package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickHelper extends HelperBase {

  public ClickHelper(WebDriver driver) {
    super(driver);
  }

  public void clickAddToCard() {
    click(By.id("add-to-cart-button-2"));
  }

  public void selectItemBox() {
    click(By.cssSelector(".item-box:nth-child(2) .button-2"));
  }

  public void clickUpdateButton() {
    click(By.id("add-to-cart-button-2"));
  }

  public void chooseGender() {
    click(By.id("gender-female"));
  }

  public void clickEditButton() {
    click(By.linkText("Edit"));
  }
}
