package io.ooc.muic.zork;


public class Monster extends Status {
  private int level;

  public Monster(String name, int maxHealth, int damage, int level) {
    super(name, maxHealth, damage);
    this.level = level;
  }

  public int getLevel() {
    return level;
  }
}
