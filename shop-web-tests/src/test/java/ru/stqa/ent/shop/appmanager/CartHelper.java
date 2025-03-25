package ru.stqa.ent.shop.appmanager;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.ent.shop.model.CartData;
import ru.stqa.ent.shop.model.Carts;
import ru.stqa.ent.shop.model.MusicCards;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CartHelper extends HelperBase {
  public ApplicationManager app;

  public CartHelper(WebDriver driver) {
    super(driver);
  }

  public void addCartItem(String xpathExpression) throws InterruptedException {
    driver.get("https://demowebshop.tricentis.com/");
    click(By.xpath(xpathExpression));
    Thread.sleep(1000);
    if (isElementPresent(By.className("required")));
    {
      List<WebElement> radiobuttons = driver.findElements(By.cssSelector("[id*=product_attribute_]"));
      for (WebElement r : radiobuttons) {
        String selected = r.getAttribute("checked");
        if (!selected.equalsIgnoreCase("true")) {
          r.click();
        }
      }
      driver.findElement(By.id("add-to-cart-button-72")).click();
    }
    driver.findElement(By.cssSelector(".ico-cart > .cart-label")).click();
  }

  public boolean isThereAnItem() {
    return isElementPresent(By.name("removefromcart"));
  }

  //метод findElements возвращает размер списка объектов - объект типа lists
  public int getCartCount() {
    return driver.findElements(By.className("product-name")).size();
  }

  public List<CartData> getCartList() {
    List<WebElement> cartlist = driver.findElements(By.className("product-name"));
    return cartlist;
  }


  // Кеширование списка в корзине типа
  private Carts cartsCache = null;

  public Carts all() {
    if (cartsCache != null) {
      return new Carts(cartsCache);
    }

    cartsCache = new Carts();
    List<WebElement> elements = driver.findElements(By.className("product-name"));
    for (WebElement el : elements) {
      String name = el.getText();
      int quantity = Integer.parseInt(el.findElement(By.className("qty-input")).getAttribute("value"));
      cartsCache.add(new CartData().withQuantity(quantity).withName(name));
    }
    return new Carts(cartsCache);
  }

  // и надо сбрасывать кэш там, где он не нужен и мы точно знаем, что список поменялся - cartCash = null;




  public int getCartItemQty1(String xpathExpression) {
    WebElement l = driver.findElement(By.xpath(xpathExpression));
    String qty = l.getAttribute("value");
    int intqty = Integer.parseInt(qty);
    return intqty;
  }


  public boolean isThereAnElement(String className) {
    return isElementPresent(By.className(className));
  }

  //Возможность выбора не первого элемента, а эламента по индексу. Выбрать первый - индекс 0, выбрать последний - индекс before - 1 (сначала посчитать кол-во товаров)
  public void selectIteminCart(int index) {
    driver.findElements(By.className("product-name")).get(index).click();
  }

  public List<CartData> getQtyPriceList() {
    List<CartData> cartitems = new ArrayList<CartData>();
    List<WebElement> elementsqty = driver.findElements(By.className("qty-input"));
    List<WebElement> elementsprice = driver.findElements(By.className("product-unit-price"));

    for (WebElement item : elementsqty) {
      String qty = item.getAttribute("value");
      int quantity = Integer.parseInt(qty);

      for (WebElement item2 : elementsprice) {
        String price = item2.getAttribute("value");
        double priceprice = Double.valueOf(price);
        CartData cartqty = new CartData().withProductprice(2.00);
        cartitems.add(cartqty);
      }
      return cartitems;
    }
    return cartitems;
  }

  public double getProductTotal (int index) {
    String total = driver.findElements(By.className("product-subtotal")).get(index).getText();
    double totald = Double.valueOf(total);
    return totald;
  }

  public double getItemPrice (int index) {
    String prices = driver.findElements(By.className("product-unit-price")).get(index).getText();
    double priced = Double.valueOf(prices);
    return priced;
  }

  public List<MusicCards> getMusicList() {
    List<MusicCards> mcards = new ArrayList<MusicCards>();
    List<WebElement> names = driver.findElements(By.className("product-name"));
    for (WebElement n : names) {
      String name = n.getText();
      if (name.contains("Music") || name.contains("Album")) {
        MusicCards mcard = new MusicCards(name);
        mcards.add(mcard);
      }
    }
    return mcards;
  }
}

