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

  public void addCartItem(String selector) throws InterruptedException {
    driver.get("https://demowebshop.tricentis.com/");
    app.getClickHelper().selectItemBox(selector);
    Thread.sleep(1000);
    if (isElementPresent(By.className("option-list"))) ;
    {
      List<WebElement> radiobuttons = driver.findElements(By.className("option-list"));
      for (WebElement r : radiobuttons) {
        String selected = r.getAttribute("checked");
        if (!selected.equalsIgnoreCase("true")) {
          r.click();
        }
      }
    }
    app.getClickHelper().clickAddToCard();
    app.getNavigationHelper().gotoCart();
  }

  public boolean isThereAnItem() {
    return isElementPresent(By.name("removefromcart"));
  }

  //метод findElements возвращает размер списка объектов - объект типа lists
  public int getCartCount() {
    return driver.findElements(By.className("product-name")).size();
  }

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
        CartData cartqty = new CartData(priceprice, quantity);
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
}

