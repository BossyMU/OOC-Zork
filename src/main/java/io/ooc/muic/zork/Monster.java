package io.ooc.muic.zork;


public class Monster extends Status {
  private int level;

  public Monster(String name, int maxHealth, int armor, int damage, int level) {
    super(name, maxHealth, armor, damage);
    this.level = level;
  }

  public int getLevel() {
    return level;
  }
}
