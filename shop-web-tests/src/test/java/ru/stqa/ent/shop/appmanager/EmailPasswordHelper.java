package ru.stqa.ent.shop.appmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.ent.shop.model.RecipientForm;

public class EmailPasswordHelper extends HelperBase {
  // в этом атрибуте помощник хранил бы свою личную ссылку на драйвер

  public EmailPasswordHelper(WebDriver driver) {
    super(driver);
  // Конструктор, в котором значение переданного параметра (driver) присвоено в поле класса EmailPasswordHelper.
  // Он получит доступ к драйверу, который инициализирован в менеджере и передан помощнику
  //super - обращение к конструктору базового класса, ссылка на драйвер наследуется оттуда
  }

  public void login(String email, String password) throws InterruptedException {

    click(By.linkText("Log in"));
    driver.findElement(By.id("Email")).sendKeys(email);
    type(By.id("Password"), password);
    click(By.cssSelector(".login-button"));
    Thread.sleep(1000);
  }

  // метод принимает единственный параметр RecipientForm - это объект с двумя атрибутами; при вызове создается новый объект, атрибуты используются в методе recipientForm
  public void fillRecipientForm(RecipientForm recipientForm) {
    type(By.id("giftcard_2_RecipientEmail"), recipientForm.getName());
    type(By.id("giftcard_2_RecipientName"), recipientForm.getEmail());
  }

  public void fillConfirmPassword(String password) {
    type(By.id("Password"), password);
    type(By.id("ConfirmPassword"), password);
  }

  public void fillEmail(String email) {
    type(By.id("Email"), email);
  }

  public void fillNameLastname(String firstname, String lastname) {
    type(By.id("FirstName"), firstname);
    type(By.id("LastName"), lastname);
  }

  public void fillPasswordlogin() {
    type(By.id("Password"), "123098");
  }

  public void fillEmailogin() {
    type(By.id("Email"), "exampleemail11@mail.ru");
  }
}
