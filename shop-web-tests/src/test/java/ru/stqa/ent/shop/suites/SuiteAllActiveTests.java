package ru.stqa.ent.shop.suites;


import org.junit.platform.suite.api.*;
import ru.stqa.ent.shop.tests.GiftcartTests;

@Suite
@SelectPackages("ru.stqa.ent.shop.tests")
@ExcludeClassNamePatterns({"Music*", "GiftcartTests"})

public class SuiteAllActiveTests {
  @BeforeSuite
  static void beforeSuite() {
    // executes before the test suite
    System.out.println("start");
  }

  @AfterSuite
  static void afterSuite() {
    // executes after the test suite
    System.out.println("end");
  }

}
