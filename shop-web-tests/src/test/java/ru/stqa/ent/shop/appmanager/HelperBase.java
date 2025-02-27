package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.*;

public class HelperBase {
  protected WebDriver driver;

  public HelperBase(WebDriver driver) {
    this.driver = driver;
  }

  public void type(By locator, String text) {
    click(locator);
    if (text != null) {
      String existingText = driver.findElement(locator).getAttribute("value");
      if (! text.equals(existingText)){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
      }
    }
  }

  public void click(By locator) {
    driver.findElement(locator).click();
  }

  // проверка на отсутствие диалогового окна
  public boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  protected boolean isElementPresent(By locator) {
    try {
    driver.findElement(locator);
    return true; }
    catch (NoSuchElementException exception) {
      return false;
    }
  }
}
