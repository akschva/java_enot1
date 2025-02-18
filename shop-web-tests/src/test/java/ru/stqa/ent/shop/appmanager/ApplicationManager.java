package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;


// класс для вспомогательных функций
public class ApplicationManager {
  public WebDriver driver;

  private FieldRedactorHelper fieldRedactorHelper;
  private ClickHelper clickHelper;
  private NavigationHelper navigationHelper; // инициализация перенесена в метод init после создания драйвера
  private EmailPasswordHelper emailPasswordHelper; // emailPasswordHelper сгенерированный вспомогательный метод, дающий доступ к этому полю
  public Map<String, Object> vars;
  JavascriptExecutor js;



  public void init() throws InterruptedException {
    ChromeOptions options = new ChromeOptions();
    options.setAcceptInsecureCerts(true);
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();

    driver.get("https://demowebshop.tricentis.com/");
    navigationHelper = new NavigationHelper(driver); //чтобы хелпер получил доступ к ссылке на драйвер, передаем ее в качестве параметра в конструктор
    emailPasswordHelper = new EmailPasswordHelper(driver);
    emailPasswordHelper.login("exampleemail11@mail.ru", "123098");
    clickHelper = new ClickHelper(driver);
    fieldRedactorHelper = new FieldRedactorHelper(driver);
    driver.manage().window().setSize(new Dimension(1265, 1380));
    // login - это именно метод, а не ф-ция, потому что тестовый фреймворк сначала создает метод класса, выполняет метод
    // setUp, внутри инициализируется переменная атрибут driver объекта setUp, и когда в том же объекте вызывается login, то логин может пользоваться атрибутом
  }



  public void stop() {
    driver.quit();
  }




  public EmailPasswordHelper getEmailPasswordHelper() {
    return emailPasswordHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public ClickHelper getClickHelper() {
    return clickHelper;
  }

  public FieldRedactorHelper getFieldRedactorHelper() {
    return fieldRedactorHelper;
  }
}
