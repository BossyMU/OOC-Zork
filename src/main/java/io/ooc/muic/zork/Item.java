package io.ooc.muic.zork;


public abstract class Item extends ItemFactory {
  private String name;

  public Item(String name, int level) {
    this.name = name;
    this.level = level;
  }

  public String getName() {
    return name;
  }
  public void setLevel(int level) {
    this.level = level;
  }

}

