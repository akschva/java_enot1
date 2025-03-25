package ru.stqa.ent.shop.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import ru.stqa.ent.shop.model.CartData;
import ru.stqa.ent.shop.model.Carts;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@Disabled("Disabled until CustomerService is up!")
public class MusictoCartTest extends TestBase {

  @Disabled("Disabled until CustomerService is up!")
  @Test
  public void testMusictoCart() throws InterruptedException {

    app.getNavigationHelper().gotoCart();
    if (!app.getCartHelper().isThereAnItem()) {
      app.getCartHelper().addCartItem("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input");
      app.getCartHelper().addCartItem("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input");
    }
    Thread.sleep(1000);
    Carts before = app.getCartHelper().all();
//    int index = before.size() - 1;
    /* каждый вызываемый метод возвращает тот же объект, fluent интерфейс "шаблон bilder" */
//    CartData cart = new CartData()
//            .withId(before.get(index).getId()).withName("3rd Album").withProductprice(null).withQuantity(1);

    app.getNavigationHelper().gotoMusicPage();
    app.getClickHelper().click(By.xpath("//img[@alt='Picture of 3rd Album']"));
    app.getClickHelper().clickAddToWishlist();
    app.getNavigationHelper().gotoWishlist();
    Thread.sleep(1000);
    app.getClickHelper().click(By.name("addtocart"));
    app.getClickHelper().clickAddToCart2();
    app.getNavigationHelper().gotoCart();
    String name = app.driver.findElement(By.tagName("Picture of 3rd Album")).getText();

    CartData cart = new CartData().withName(name);
    Carts after = app.getCartHelper().all();

    Assert.assertEquals(after.size(), before.size() + 1);


    /* map to int превращает поток из объектов типа CartData в поток целых чисел - id, потому что числа сравнивать проще*/
//    cart.withId(after.stream().mapToInt(c) -> c.getId()).max().getAsInt());
//    before.add(cart);
//    Assert.assertEquals(before, after);

    /* Передаем в качестве параметра функцию, которая умеет сравнивать объекты. Список превращаем в поток. В метод max в качестве параметра переедаем компаратор.
    * Компаратор - это интерфейс, он не имеет реализации, только объявляет какие методы должны быть. Поэтому прям тут создаем анонимный класс с методом compare*/
//    Comparator<? super CartData> byId = new Comparator<CartData>() {
//      @Override
//      public int compare(CartData o1, CartData o2) {
//        return Integer.compare(o1.getId(), o2.getId());
//      }
//    };

    /* Переделываем анонимный класс в анонимную функцию. Итого - список превращаем в поток, по этому потоку пробегается фция сравниватель и находит максимальный эелемент,
    сравниваются объекты типа CartData а основании идентификаторов. На выходе будет объект - группа с макс id и берется ее id */

//    int max = after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId();

//    cart.withId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
//    before.add(cart);
   assertThat(after, equalTo(before.withAdded(cart)));



//    Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

  }

}
