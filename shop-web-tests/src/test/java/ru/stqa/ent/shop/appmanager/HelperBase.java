package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;

import java.util.*;

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
        driver.findElement(locator).clear(); }
        driver.findElement(locator).sendKeys(text);
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

  public boolean isElementPresent(By locator) {
    try {
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException exception) {
      return false;
    }
  }

  public void clickAllbyXpath (String xpath1, String xpath2) {
    click(By.xpath(xpath1));
    click(By.xpath(xpath2));
//    WebElement element1 = driver.findElement(By.xpath(xpath1));
//    WebElement element2 = driver.findElement(By.xpath(xpath2));
//    List<WebElement> elementsList = Arrays.asList(element1, element2);
//    for (WebElement l : elementsList) {
//      click(By.name(name));
    }
  }

