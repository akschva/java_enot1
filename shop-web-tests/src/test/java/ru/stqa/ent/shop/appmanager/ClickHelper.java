package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickHelper extends HelperBase {

  public ClickHelper(WebDriver driver) {
    super(driver);
  }

  public void clickAddToCart() {
    click(By.cssSelector("[id*='add-to-cart-button-']"));
  }

  public void selectItemBox(String xpath) {
    click(By.xpath(xpath));
  }

  public void clickUpdateButton() {
    click(By.name("updatecart"));
  }

  public void chooseGender() {
    click(By.id("gender-female"));
  }

  public void clickEditButton() {
    click(By.linkText("Edit")); }

  public boolean isThereEditButton() {
    return isElementPresent(By.linkText("Edit"));
  }


  public void clickDropdown(String expression) {
    click(By.xpath(expression));
  }

  // выбор из выпадающего списка - создаем объект типа Select (исходный класс в селениуме)
  public void selectList(String text) {
    if (isElementPresent(By.id("products-orderby"))) {
      new Select(driver.findElement(By.id("products-orderby"))).selectByVisibleText(text);
    }
  }

  public void clickAddToWishlist() {
    click(By.cssSelector("[id*='add-to-wishlist-button']"));
  }

  public void clickAddToCart2() {
    click(By.name("addtocartbutton"));
  }

  public void clickRemove() {
    click(By.name("removefromcart"));
  }

}


