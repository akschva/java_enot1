package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;
// класс для вспомогательных функций

public class ApplicationManager {
  public WebDriver driver;

  public EmailPasswordHelper emailPasswordHelper;
  public Map<String, Object> vars;
  JavascriptExecutor js;

  public void init() throws InterruptedException {
    ChromeOptions options = new ChromeOptions();
    options.setAcceptInsecureCerts(true);
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();

    driver.get("https://demowebshop.tricentis.com/");
    emailPasswordHelper = new EmailPasswordHelper(driver);
    emailPasswordHelper.login("exampleemail11@mail.ru", "123098");
    driver.manage().window().setSize(new Dimension(1265, 1380));
    // login - это именно метод, а не ф-ция, потому что тестовый фреймворк сначала создает метод класса, выполняет метод
    // setUp, внутри инициализируется переменная атрибут driver объекта setUp, и когда в том же объекте вызывается login, то логин может пользоваться атрибутом
  }

  public void stop() {
    driver.quit();
  }

  public void chagneQuantity(String quantity) {
    driver.findElement(By.cssSelector(".cart-item-row")).click();
    driver.findElement(By.name("itemquantity5054028")).sendKeys(quantity);
    driver.findElement(By.name("itemquantity5054028")).sendKeys(Keys.ENTER);
  }

  public void gotoCart() {
    driver.findElement(By.cssSelector(".ico-cart > .cart-label")).click();
  }

  public void clickAddToCard() {
    driver.findElement(By.id("add-to-cart-button-2")).click();
  }

  public void selectItemBox() {
    driver.findElement(By.cssSelector(".item-box:nth-child(2) .button-2")).click();
  }

  public void clickRegisterButton() {
    driver.findElement(By.id("register-button")).click();
    driver.findElement(By.cssSelector(".register-continue-button")).click();
  }

  public void chooseGender() {
    driver.findElement(By.id("gender-female")).click();
  }

  public void clickRegistration() {
   driver.findElement(By.linkText("Register")).click();
  }

  public void clickUpdateButton() {
    driver.findElement(By.id("add-to-cart-button-2")).click();
  }

  public void changeQuantity(String quantity) {
    driver.findElement(By.id("addtocart_2_EnteredQuantity")).click();
    driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys(quantity);
  }

  public void clickEditButton() {
    driver.findElement(By.linkText("Edit")).click();
  }

  public void submitLogin() {
    driver.findElement(By.cssSelector("label:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".login-button")).click();
  }

  public void clickLogIn() {
    driver.findElement(By.linkText("Log in")).click();
  }

  public EmailPasswordHelper getEmailPasswordHelper() {
    return emailPasswordHelper;
  }
}
