package io.ooc.muic.zork;

import java.util.Random;

public class ItemFactory {
  static Random random = new Random();

  public Item makeItem(String itemType) {
    switch (itemType) {
      case "Potion": return new Potion("Potion", random.nextInt(10), 10 * random.nextInt(10));
      case "Weapon": return new Weapon("Sword", random.nextInt(10), 10 * random.nextInt(10));
      default: return null;
    }
  }
}
