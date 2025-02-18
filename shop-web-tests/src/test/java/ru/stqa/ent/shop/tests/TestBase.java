package ru.stqa.ent.shop.tests;

import org.junit.After;
import org.junit.Before;
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

}
