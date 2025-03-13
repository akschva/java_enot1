package ru.stqa.ent.shop.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.ent.shop.model.CartData;

import java.util.ArrayList;
import java.util.List;


public class CartHelper extends HelperBase {
  private ApplicationManager app;

  public CartHelper(WebDriver driver) {
    super(driver);
  }

  public void addCartItem() throws InterruptedException {
    driver.get("https://demowebshop.tricentis.com/");
    app.getClickHelper().selectItemBox(".item-box:nth-child(3) .button-2");
    Thread.sleep(1000);
    app.getNavigationHelper().gotoCart();
  }

  public boolean isThereAnItem() {
   return isElementPresent(By.name("removefromcart"));
  }

  //метод findElements возвращает размер списка объектов - объект типа lists
  public int getCartCount() {
    return driver.findElements(By.className("product-name")).size();
  }
  
  public boolean isThereAnElement(String className) {
    return isElementPresent(By.className(className));
  }

  //Возможность выбора не первого элемента, а эламента по индексу. Выбрать первый - индекс 0, выбрать последний - индекс before - 1 (сначала посчитать кол-во товаров)
  public void selectIteminCart(int index) {
    driver.findElements(By.className("product-name")).get(index).click();
  }

  public List<CartData> getCartList() {
    List<CartData> cartitems = new ArrayList<CartData>();
    List<WebElement> cartelements = driver.findElements(By.className("qty-input"));
    for (WebElement cartelement : cartelements) {
      int qty = cartelement.getCssValue();
      CartData cartqty = new CartData(qty);
      cartitems.add(cartqty);
    }
    return cartitems;
  }
}
