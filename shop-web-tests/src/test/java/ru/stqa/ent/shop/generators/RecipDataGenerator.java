package ru.stqa.ent.shop.generators;

import ru.stqa.ent.shop.model.CartData;
import ru.stqa.ent.shop.model.RecipData;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RecipDataGenerator {

  public static void main(String[] args) {
    int count = Integer.parseInt(args[0]); //пароль и почта
    File file = new File(args[1]);

    List<RecipData> recipd1 = generateRecipd(count);
    save(recipd1, file);

  }

  private static List<RecipData> generateRecipd(int count) {
    List<RecipData> recipd1 = new ArrayList<RecipData>();
    for (int i = 0; i < count; i++) {
      recipd1.add(new RecipData().withPassword(String.format("test %s", i))
              .withEmail(String.format("email %s" + "@mail.ru", i)));
    }
    return recipd1;
  }

  private static void save(List<RecipData> recipd1, File file) {

  }
// в курсе Алексей делает сразу список - группа с параметрами, для каждого генератор, но можно так
//  private static String generateRecipdpass(Random rng, String password, int length) {
//    char[] recippass = new char[length];
//    for (int i = 0; i < length; i++) {
//      recippass[i] = password.charAt(rng.nextInt(password.length()));
//    }
//    return  new String(recippass);
//  }



}
