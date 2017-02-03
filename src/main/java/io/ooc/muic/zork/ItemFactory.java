package io.ooc.muic.zork;

import java.util.Random;

public class ItemFactory {
  static Random random = new Random();
  static int level;

  public Weapon makeItem(String itemType) {
    switch (itemType) {
      case "Sword": return new Weapon("Sword", 1+random.nextInt(3)*level,level);
      case "Spear": return new Weapon("Spear",2 * (1+random.nextInt(2)*level),level);
      case "Axe": return new Weapon("Axe", 3 * (level),level);
      default: return null;
    }
  }
}
