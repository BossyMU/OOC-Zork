package io.ooc.muic.zork;

public class  Weapon extends Item{
  private int damage;

  private int level;

  public Weapon(String name, int damage, int level) {
    super(name, level);
    this.damage = damage;
  }

  public int getDamage() {
    return damage;
  }

}
