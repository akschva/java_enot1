package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
  private WebDriver driver;

  public NavigationHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void gotoCart() {
    driver.findElement(By.cssSelector(".ico-cart > .cart-label")).click();
  }

  public void submitRegistration() {
    driver.findElement(By.id("register-button")).click();
    driver.findElement(By.cssSelector(".register-continue-button")).click();
  }

  public void clickRegistration() {
   driver.findElement(By.linkText("Register")).click();
  }

  public void submitLogin() {
    driver.findElement(By.cssSelector("label:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".login-button")).click();
  }

  public void clickLogin() {
    driver.findElement(By.linkText("Log in")).click();
  }
}
