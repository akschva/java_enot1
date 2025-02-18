package ru.stqa.ent.shop.appmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.ent.shop.model.RecipientForm;

public class EmailPasswordHelper {
  public WebDriver driver;

  public EmailPasswordHelper(WebDriver driver) {
    this.driver = driver;
  // Конструктор, в котором значение переданного параметра (driver) присвоено в поле класса EmailPasswordHelper.
  // Он получит доступ к драйверу, который инициализирован в менеджере и передан помощнику
  }

  public void login(String email, String password) throws InterruptedException {

    driver.findElement(By.linkText("Log in")).click();
    driver.findElement(By.id("Email")).sendKeys(email);
    driver.findElement(By.id("Password")).click();
    driver.findElement(By.id("Password")).sendKeys(password);
    driver.findElement(By.cssSelector(".login-button")).click();
    Thread.sleep(1000);
  }

  // метод принимает единственный параметр RecipientForm - это объект с двумя атрибутами; при вызове создается новый объект, атрибуты используются в методе recipientForm
  public void fillRecipientForm(RecipientForm recipientForm) {
    driver.findElement(By.id("giftcard_2_RecipientEmail")).click();
    driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys(recipientForm.getName());
    driver.findElement(By.id("giftcard_2_RecipientName")).click();
    driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys(recipientForm.getEmail());
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

  public void fillPasswordlogin() {
    driver.findElement(By.id("Password")).click();
    driver.findElement(By.id("Password")).sendKeys("123098");
  }

  public void fillEmailogin() {
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).sendKeys("exampleemail11@mail.ru");
  }
}
