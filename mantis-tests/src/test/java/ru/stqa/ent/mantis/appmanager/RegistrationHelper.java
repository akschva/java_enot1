package ru.stqa.ent.mantis.appmanager;

import org.openqa.selenium.WebDriver;

public class RegistrationHelper {
  private final ApplicationManager app;
  private WebDriver driver;

  /* аппменеджер нанимет помощника и передает ему ссылку на себя - конструктор */
  public RegistrationHelper(ApplicationManager applicationManager) {
    this.app = applicationManager;
    /* просим ссылку на драйвер у менеджера, но нам нужна ленивая инициализация */
    driver = applicationManager.getDriver();
  }

  /* этому помощнику браузер нужен*/
  public void start(String username, String email) {
    driver.get(app.getProperty("web.baseurl") + "/signup_page.php");
  }
}
