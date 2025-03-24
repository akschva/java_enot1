package ru.stqa.ent.shop.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.platform.suite.api.AfterSuite;
import org.junit.platform.suite.api.BeforeSuite;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import ru.stqa.ent.shop.appmanager.ApplicationManager;

public class TestBase {
// refactor - replace inheritance with delegation - вместо extends создается ссылка на новый объект типа ApplicationManager();
// те вызовы, которые раньше выполнялись в текущем классе, вызываются из объекта типа ApplicationManager(); - app.
// мы просим объект выполнить за нас функцию - app.init - поэтому делегирование
  protected final ApplicationManager app = new ApplicationManager();

  @Before
  public void setUp() throws InterruptedException {
    app.init();
  }

  @After
  public void tearDown() {
    app.stop();
  }

  @Parameterized.BeforeParam
  public void clearcartPreconditions () {
    if (app.getCartHelper().isThereAnItem()) {
      do {
        app.getClickHelper().click(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[1]/input"));
        app.getClickHelper().click(By.name("updatecart"));
      }
      while (app.getCartHelper().isThereAnItem());
    }
  }

}
