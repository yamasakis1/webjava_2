package com.example.demo.data;

public abstract class Feed {
  protected String favor;
  protected String feed;

  public void getFavor(String favor) {
//好みの餌
  }

  public void createFeed(String feed) {
//餌を作る
  }

  public abstract String getFavor();
  public abstract String createFeed();
}
