package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.ent.shop.model.GiftcardData;

import java.util.*;
import java.util.List;

public class GiftcardHelper extends HelperBase {

  public GiftcardHelper(WebDriver driver) {
    super(driver);
  }

  public GiftcardData all() {
    GiftcardData gcdata = new GiftcardData();
    List<WebElement> gctext = driver.findElements(By.className("attributes"));
    for (WebElement gc : gctext) {
      String RecipData = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/table/tbody/tr[2]/td[4]/div/text()[1]")).getText();
      String YData = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/table/tbody/tr[2]/td[4]/div/text()[2]")).getText();

      WebElement gctextlocator = driver.findElement(By.xpath("//*[text()[contains(.,'Gift Card')]]"));
      WebElement gcblock = gctextlocator.findElement(By.xpath("./../.."));
      Integer Qty = Integer.valueOf(gcblock.findElement(By.className("qty-input")).getAttribute("value"));
      // ИЛИ driver.findElement(By.xpath("//*[text()[contains(.,'Gift Card')]]/../../[@class=’qty-input’]));


      //*[@data-fee=’1010′]/ancestor::div[contains(@class,’js-price’)] — получаем предка(ancestor), с классом содержащим js-price
//*[@data-fee=’1010′]/ancestor::div[contains(@class,’js-price’)]//a — у нашего элемента просто ищем вложенную ссылку (нашу кнопку).

      gcdata.add(new GiftcardData().withRecipData(RecipData).withYData(YData).withQuantity(Qty));
    }
    return gcdata;
  }


}
