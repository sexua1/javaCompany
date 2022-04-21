package com.mycompany.myapp;

public class DbVo {
  private int id;
  private String title;
  private String good;
  private String num;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String name) {
    this.title = name;
  }

  public String getGood() {
    return good;
  }

  public void setGood(String good) {
    this.good = good;
  }

  public String getNum() {
    return num;
  }

  public void setNum(String num) {
    this.num = num;
  }

  @Override
  public String toString() {
    return "DbVo [id=" + id + ", name=" + title + ", good=" + good + ", num=" + num + "]";
  }
}
