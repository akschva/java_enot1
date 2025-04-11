package ru.stqa.ent.mantis.appmanager;

import org.openqa.selenium.By;


public class RegistrationHelper extends HelperBase {
//  private final ApplicationManager app;
//  private WebDriver driver;

  /* аппменеджер нанимет помощника и передает ему ссылку на себя - конструктор */
  public RegistrationHelper(ApplicationManager app) {
    super(app);
    /* просим ссылку на драйвер у менеджера, но нам нужна ленивая инициализация */
  }

  /* этому помощнику браузер нужен*/
  public void start(String username, String email) {
    driver.get(app.getProperty("web.baseurl") + "/signup_page.php");
    type(By.name("username"), username);
    type(By.name("email"), email);
    click(By.cssSelector("input[value='Зарегистрироваться']"));
  }
}
