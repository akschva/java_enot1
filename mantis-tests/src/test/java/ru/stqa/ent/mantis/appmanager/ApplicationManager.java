package ru.stqa.ent.mantis.appmanager;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


// класс для вспомогательных функций
public class ApplicationManager {
  private final Properties properties;
  private WebDriver driver;

  private String browser;
  private RegistrationHelper registrationHelper;

  public ApplicationManager(String browser) {
    this.browser = browser;
    properties = new Properties();
  }


//  public Map<String, Object> vars;
//  JavascriptExecutor js;


  public void init() throws IOException {
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties",target))));
  }


  public void stop() {
    if (driver != null) {
      driver.quit();
    }
  }

  public  HttpSession newSession() {
    return new HttpSession(this); /* this это ссылка на аппменеджер*/
  }

  public String getProperty(String key) {
    return properties.getProperty(key);
  }

  public RegistrationHelper registration() {
    if (registrationHelper == null) {
      registrationHelper = new RegistrationHelper(this);
    }
    return registrationHelper;
  }

  /* метод инициализирует драйвер при первом обращении*/
  public WebDriver getDriver() {
    if (driver == null) {
      //    String browser = "firefox";
//Checking for 'firefox' parameters
      if(browser.equalsIgnoreCase("firefox")){
//creating firefox instance
        System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
      }
//Checking for 'chrome' parameters
      else if(browser.equalsIgnoreCase("chrome")){
//Creating chrome instance
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
      }
      else{
//If the browser is not passed then throw the below exception
        try {
          throw new Exception("Invalid browser");
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
      }
      driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
      driver.get(properties.getProperty("web.baseUrl"));
    }
    return driver;
  }
}
