package io.ooc.muic.zork;

import java.util.ArrayList;
import java.util.List;


public class Player extends Status {
  private int positionX = 0;

  private int positionY = 0;

  private Room currentRoom;

  private int numberOfItem = 0;

  private Weapon weapon = new Weapon("bareHand",0,1);

  public Player(String name, int maxHealth,int damage) {
    super(name, maxHealth, damage);
  }

  public Room getCurrentRoom() {
    return currentRoom;
  }

  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public int getPositionX() {
    return positionX;
  }

  public void setPositionX(int positionX) {
    this.positionX = positionX;
  }

  public int getPositionY() {
    return positionY;
  }

  public void setPositionY(int positionY) {
    this.positionY = positionY;
  }

  public int getNumberOfItem() {
    return numberOfItem;
  }

  public void setNumberOfItem(int numberOfItem) {
    this.numberOfItem = numberOfItem;
  }

  public Weapon getWeapon() { return weapon; }

  public void setWeapon(Weapon weapon) { this.weapon = weapon; }
}
