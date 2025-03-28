package ru.stqa.ent.shop.model;

import java.io.File;

public class RecipData {

  private Integer id = Integer.MAX_VALUE;
  String password;
  String email;
  private File photo;

  public File getRecipPhoto() {
    return photo;
  }

  public String getEmail() {
    return email;
  }

  public Integer getId() {
    return id;
  }

  public String getPassword() {
    return password;
  }

  public RecipData withPassword(String password) {
    this.password = password;
    return this;
  }

  public RecipData withEmail(String email) {
    this.email = email;
    return this;
  }


  public RecipData withId(Integer id) {
    this.id = id;
    return this;
  }

  public RecipData withRecipPhoto(File photo) {
    this.photo = photo;
    return this;

  }
}
