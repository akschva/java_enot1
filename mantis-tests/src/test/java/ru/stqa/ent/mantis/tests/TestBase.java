package ru.stqa.ent.mantis.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.ent.mantis.appmanager.ApplicationManager;

import java.io.File;
import java.io.IOException;

public class TestBase {

  protected static final ApplicationManager app
          = new ApplicationManager(System.getProperty("browser", "firefox"));

  @BeforeSuite
  public void setUp() throws Exception {
    app.init();
//    app.ftp().upload(new File("src/test/resources/config_inc.php"), "config_inc.php", "config_inc.php.backup");
  }

  @AfterSuite (alwaysRun = true)
  public void tearDown() throws IOException {
//    app.ftp().restore("config_inc.php.backup", "config_inc.php");
    app.stop();
  }

}

