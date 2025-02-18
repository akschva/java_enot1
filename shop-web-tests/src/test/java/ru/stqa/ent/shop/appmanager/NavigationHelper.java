package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void gotoCart() {
    click(By.cssSelector(".ico-cart > .cart-label"));
  }

  public void submitRegistration() {
    click(By.id("register-button"));
    click(By.cssSelector(".register-continue-button"));
  }

  public void clickRegistration() {
    click(By.linkText("Register"));
  }

  public void submitLogin() {
    click(By.cssSelector("label:nth-child(3)"));
    click(By.cssSelector(".login-button"));
  }

  public void clickLogin() {
    click(By.linkText("Log in"));
  }
}
