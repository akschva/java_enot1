package ru.stqa.ent.mantis.appmanager;

import org.openqa.selenium.*;

public class HelperBase {
  protected ApplicationManager app;
  protected WebDriver driver;

//  public HelperBase(WebDriver driver) {
//    this.driver = driver;
//  }

  public HelperBase(ApplicationManager app) {
    this.app = app;
    this.driver = app.getDriver();
  }

  public void type(By locator, String text) {
    click(locator);
    if (text != null) {
      String existingText = driver.findElement(locator).getAttribute("value");
      if (! text.equals(existingText)){
        driver.findElement(locator).clear(); }
        driver.findElement(locator).sendKeys(text);
      }
    }


  public void click(By locator) {
    driver.findElement(locator).click();
  }

  public void clear(By locator) {
    driver.findElement(locator).clear();
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

  public boolean isElementPresent(By locator) {
    try {
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException exception) {
      return false;
    }
  }

}

//    WebElement element1 = driver.findElement(By.xpath(xpath1));
//    WebElement element2 = driver.findElement(By.xpath(xpath2));
//    List<WebElement> elementsList = Arrays.asList(element1, element2);
//    for (WebElement l : elementsList) {

    }


