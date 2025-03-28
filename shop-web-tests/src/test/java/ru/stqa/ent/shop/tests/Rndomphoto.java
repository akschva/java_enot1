package ru.stqa.ent.shop.tests;

import org.junit.jupiter.api.Disabled;
import ru.stqa.ent.shop.model.CartData;

import java.io.File;

public class Rndomphoto extends TestBase {

  @Disabled
  public void testRndomphoto() {
    File photo = new File("");
    app.getEmailPasswordHelper().fillRecipientForm(new CartData().withPhoto(photo));
  }



//  @Disabled
//  public void testCurrentDir() {
//    File currentdir = new File(".");
//    System.out.println(currentdir.getAbsolutePath());
//    File photo = new File("src/test/resources/cat.jpg");
//    System.out.println(photo.getAbsolutePath());
//    System.out.println(photo.exists());
//  }

}
