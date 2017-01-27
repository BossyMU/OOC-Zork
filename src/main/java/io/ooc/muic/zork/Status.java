package io.ooc.muic.zork;

public abstract class Status {
  private String name;

  private int maxHealth;
  private int health;
  private int armor;
  private int damange;

  public Status(String name, int maxHealth, int armor, int damange) {
    this.name = name;
    this.maxHealth = maxHealth;
    this.health = maxHealth;
    this.armor = armor;
    this.damange = damange;

  }

  public String getName() {
    return name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = (health < 0) ? 0 : (health > maxHealth) ? maxHealth : health;
  }

  public boolean isDeath() {
    return 0 == this.health;
  }

  public int getArmor() {
    return armor;
  }

  public void setArmor(int armor) {
    this.armor = armor;
  }

  public int getDamange() {
    return damange;
  }

  public void setDamange(int damange) {
    this.damange = damange;
  }
}
