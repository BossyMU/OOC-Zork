package io.ooc.muic.zork;

public class Weapon extends Item{
  private int damage;

  public Weapon(String name, int numberOfUse, int damage) {
    super(name, numberOfUse);
    this.damage = damage;
  }

  public int getDamage() {
    return damage;
  }

  public int use() {
    setNumberOfUse(getNumberOfUse() - 1);
    return damage;
  }
}
