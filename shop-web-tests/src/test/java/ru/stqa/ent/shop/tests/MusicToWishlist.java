package ru.stqa.ent.shop.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import ru.stqa.ent.shop.model.MusicCards;

import java.util.List;

@Disabled("Disabled until CustomerService is up!")
public class MusicToWishlist extends TestBase {
  @Disabled

  @Test
  public void testMusictoWishlist() throws InterruptedException {
    app.getNavigationHelper().gotoCart();
    if (app.getCartHelper().isThereAnItem()) {
      List<MusicCards> before = app.getCartHelper().getMusicList();
      if (!before.isEmpty()) {
        while (true) {
          app.getClickHelper().click(By.name("removefromcart"));
          app.getClickHelper().click(By.name("updatecart"));
        }
      }
      Thread.sleep(1000);
    }
      if (!app.getCartHelper().isThereAnItem()) {
        app.getCartHelper().addCartItem("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input");
      }
      List<MusicCards> before = app.getCartHelper().getMusicList();
      app.getNavigationHelper().gotoMusicPage();
      Thread.sleep(1000);
      app.getClickHelper().click(By.xpath("//img[@alt='Picture of 3rd Album']"));
      Thread.sleep(1000);
      app.getClickHelper().clickAddToWishlist();
    Thread.sleep(1000);
      app.getNavigationHelper().gotoWishlist();
      app.getClickHelper().click(By.name("addtocart"));
      app.getClickHelper().clickAddToCart2();
      app.getNavigationHelper().gotoCart();
      List<MusicCards> after = app.getCartHelper().getMusicList();
      Assert.assertEquals(after.size(), before.size() + 1);
    }
  }


