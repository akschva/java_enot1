package ru.stqa.ent.shop;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class TestBase {
  JavascriptExecutor js;
  public WebDriver driver;
  public Map<String, Object> vars;

  @Before
  public void setUp() throws InterruptedException {
    ChromeOptions options = new ChromeOptions();
    options.setAcceptInsecureCerts(true);

    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();

    driver.get("https://demowebshop.tricentis.com/");
    login("exampleemail11@mail.ru", "123098");
    driver.manage().window().setSize(new Dimension(1265, 1380));
    // login - это именно метод, а не ф-ция, потому что тестовый фреймворк сначала создает метод класса, выполняет метод
    // setUp, внутри инициализируется переменная атрибут driver объекта setUp, и когда в том же объекте вызывается login, то логин может пользоваться атрибутом
  }

  private void login(String email, String password) throws InterruptedException {

    driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.id("Email")).sendKeys(email);
    driver.findElement(By.id("Password")).click();
    driver.findElement(By.id("Password")).sendKeys(password);
    driver.findElement(By.cssSelector(".login-button")).click();
    Thread.sleep(1000);
  }

  @After
  public void tearDown() {
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

  // метод принимает единственный параметр RecipientForm - это объект с двумя атрибутами; при вызове создается новый объект, атрибуты используются в методе recipientForm
  public void fillRecipientForm(RecipientForm recipientForm) {
    driver.findElement(By.id("giftcard_2_RecipientEmail")).click();
    driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys(recipientForm.getName());
    driver.findElement(By.id("giftcard_2_RecipientName")).click();
    driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys(recipientForm.getEmail());
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

  public void fillConfirmPassword(String password) {
    driver.findElement(By.id("Password")).click();
    driver.findElement(By.id("Password")).sendKeys(password);
    driver.findElement(By.id("ConfirmPassword")).click();
    driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
  }

  public void fillEmail(String email) {
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).sendKeys(email);
  }

  public void fillNameLastname(String firstname, String lastname) {
    driver.findElement(By.id("FirstName")).click();
    driver.findElement(By.id("FirstName")).sendKeys(firstname);
    driver.findElement(By.id("LastName")).click();
    driver.findElement(By.id("LastName")).sendKeys(lastname);
  }

  public void chooseGender() {
    driver.findElement(By.id("gender-female")).click();
  }

  public void clickRegistration() {
    driver.findElement(By.linkText("Register")).click();
  }

  protected void clickUpdateButton() {
    driver.findElement(By.id("add-to-cart-button-2")).click();
  }

  protected void changeQuantity(String quantity) {
    driver.findElement(By.id("addtocart_2_EnteredQuantity")).click();
    driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys(quantity);
  }

  protected void clickEditButton() {
    driver.findElement(By.linkText("Edit")).click();
  }

  protected void submitLogin() {
    driver.findElement(By.cssSelector("label:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".login-button")).click();
  }

  protected void fillPasswordlogin() {
    driver.findElement(By.id("Password")).click();
    driver.findElement(By.id("Password")).sendKeys("123098");
  }

  protected void fillEmailogin() {
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).sendKeys("exampleemail11@mail.ru");
  }

  protected void clickLogIn() {
    driver.findElement(By.linkText("Log in")).click();
  }
}
