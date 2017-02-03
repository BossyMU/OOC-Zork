package io.ooc.muic.zork;

import java.util.Random;

public class MonsterFactory {
  static Random random = new Random();

  public Monster makeMonster(String itemType) {
    switch (itemType) {
      case "Thief": return new Monster("Thief", random.nextInt(8) , (random.nextInt(3)+1)*2,1);
      case "Bandit" : return new Monster("Bandit", random.nextInt(8) * 2, (random.nextInt(3)+1) * 3,2);
      case "Criminal" : return new Monster("Criminal", random.nextInt(8) * 3, (random.nextInt(3)+1) * 3,3);
      default: return null;
    }
  }
}
