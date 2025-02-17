package ru.stqa.ent.shop;

// у объекта три атрибута
public class RecipientForm {
        public final String name;
        public final String email;

    // конструктор позволяет проиницализировать объект значениями
     public RecipientForm(String name, String email) {
        this.name = name;
        this.email = email;
       }
// два метода, которые возвращают эти атрибуты
public String getName() {return name; }
public String getEmail() {return email; }
}