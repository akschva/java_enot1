package ru.stqa.ent.shop.tests;// Generated by Selenium IDE

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;


public class RegistrationTestBackup {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @BeforeEach
  public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.setAcceptInsecureCerts(true);

    driver = new ChromeDriver(options);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();

//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void registrationTestBackup() throws InterruptedException {
    driver.get("https://demowebshop.tricentis.com/");
    Thread.sleep(1000);
//    System.out.println("driver.get()");

    driver.manage().window().setSize(new Dimension(1265, 1380));

//    WebDriverWait wait = new WebDriverWait(driver, 30);
//    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Регистрация")));
// click on the compose button as soon as the "compose" button is visible
    {
      WebElement element = driver.findElement(By.cssSelector("li:nth-child(4) > .ico-wishlist"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("gender-female")).click();
    driver.findElement(By.id("FirstName")).click();
    driver.findElement(By.id("FirstName")).sendKeys("nastia121");
    driver.findElement(By.id("LastName")).click();
    driver.findElement(By.id("LastName")).sendKeys("nastia211");
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).sendKeys("exampleemail11@mail.ru");
    driver.findElement(By.id("Password")).click();
    driver.findElement(By.id("Password")).sendKeys("123098");
    driver.findElement(By.id("ConfirmPassword")).click();
    driver.findElement(By.id("ConfirmPassword")).sendKeys("123098");
    driver.findElement(By.id("register-button")).click();
    driver.findElement(By.cssSelector(".register-continue-button")).click();
  }
}
