package ru.stqa.ent.shop.tests;// Generated by Selenium IDE
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {

  @Test
  public void testLogin() {
    app.getNavigationHelper().clickLogin();
    app.getEmailPasswordHelper().fillEmailogin();
    app.getEmailPasswordHelper().fillPasswordlogin();
    app.getNavigationHelper().submitLogin();
  }

}
