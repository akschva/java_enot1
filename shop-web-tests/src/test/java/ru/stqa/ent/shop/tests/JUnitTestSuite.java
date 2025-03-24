package ru.stqa.ent.shop.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ru.stqa.ent.shop.appmanager.ApplicationManager;

@RunWith(Suite.class)
@SuiteDisplayName("My Test Suite")
@Suite.SuiteClasses({RegistrationTest.class, SimpleAddtocartTest.class, AddToCartTest.class, ZeroQuantityCartTest.class, PageViewTest.class, CartChangeQty.class})
//@SelectPackages("ru.stqa.ent.shop.tests")
//@ExcludeClassNamePatterns("ru.stqa.ent.shop.tests.Music*")
public class JUnitTestSuite {

//  protected static final ApplicationManager app = new ApplicationManager();
//
//  @BeforeAll
//  public static void setUp() throws InterruptedException {
//    app.init();
//  }
//
//  @AfterAll
//  public static void tearDown() {
//    app.stop();
//
//  }
}


