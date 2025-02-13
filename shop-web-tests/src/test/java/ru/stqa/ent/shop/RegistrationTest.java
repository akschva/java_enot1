package ru.stqa.ent.shop;// Generated by Selenium IDE

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class RegistrationTest {
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

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void registrationTest() throws InterruptedException {
    driver.get("http://shop.bugred.ru/");
    Thread.sleep(1000);
   System.out.println("driver.get()");

    driver.manage().window().setSize(new Dimension(1265, 1380));

    WebDriverWait wait = new WebDriverWait(driver, 30);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Регистрация")));
// click on the compose button as soon as the "compose" button is visible
    driver.findElement(By.linkText("Регистрация")).click();

    driver.findElement(By.linkText("Регистрация")).click();
    driver.findElement(By.id("exampleInputName")).click();
    driver.findElement(By.id("exampleInputName")).sendKeys("name1");
    driver.findElement(By.id("exampleInputEmail1")).click();
    driver.findElement(By.id("exampleInputEmail1")).sendKeys("email1@mail.ru");
    driver.findElement(By.id("exampleInputPassword1")).click();
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("123098");
    driver.findElement(By.id("exampleInputPassword2")).click();
    driver.findElement(By.id("exampleInputPassword2")).sendKeys("123098");
    driver.findElement(By.name("_csrf")).click();
    driver.findElement(By.id("alertify-ok")).click();
  }
}

//*[@id="exampleInputName"]

//*[@id="proceed-button"]