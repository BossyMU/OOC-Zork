package io.ooc.muic.zork;


public abstract class Item extends ItemFactory {
  private int numberOfUse;
  private String name;

  public Item(String name, int numberOfUse) {
    this.name = name;
    this.numberOfUse = numberOfUse;
  }

  public String getName() {
    return name;
  }

  public int getNumberOfUse() {
    return numberOfUse;
  }

  public void setNumberOfUse(int numberOfUse) {
    this.numberOfUse = numberOfUse;
  }
}
