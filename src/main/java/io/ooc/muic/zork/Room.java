package io.ooc.muic.zork;

import java.lang.reflect.Array;
import java.util.*;


public class Room {
    private static ArrayList<String> WEAPONS_LIST = new ArrayList<>(Arrays.asList("Spear","Sword","Axe"));

    private Boolean hasItem =  Math.random() < 0.5;

    private Boolean hasWeapon =  Math.random() < 0.5;

    private Boolean hasMonster = Math.random() < 0.4;

    private Monster monsterRoom = null;

    private Boolean hasStair = false;

    private Weapon weaponInRoom = null;

    public Room(int level, Boolean hasStair){
        this.hasStair = hasStair;
        if(hasMonster) {
            MonsterFactory mon = new MonsterFactory();
            switch (level){
                case 1: monsterRoom = mon.makeMonster("Thief");
                break;
                case 2: monsterRoom = mon.makeMonster("Bandit");
                break;
                case 3: monsterRoom = mon.makeMonster("Criminal");
                break;
            }
        }
        if(hasWeapon){
            ItemFactory weapons = new ItemFactory();
            int ran = new Random().nextInt(3);
            switch (level) {
                case 1:
                    weaponInRoom = weapons.makeItem(WEAPONS_LIST.get(ran));
                    weaponInRoom.setLevel(level);
                    break;
                case 2:
                    weaponInRoom =  weapons.makeItem(WEAPONS_LIST.get(ran));
                    weaponInRoom.setLevel(level);
                    break;
                case 3:
                    weaponInRoom =  weapons.makeItem(WEAPONS_LIST.get(ran));
                    weaponInRoom.setLevel(level);
                    break;
            }
        }
    }

    public Boolean getHasItem() {
        return hasItem;
    }

    public void setHasItem(Boolean hasItem) {
        this.hasItem = hasItem;
    }

    public Monster getMonsterRoom() {
        return monsterRoom;
    }

    public void setMonsterRoom(Monster monsterRoom) {
        this.monsterRoom = monsterRoom;
    }
    public Boolean getHasMonster() {
        return hasMonster;
    }

    public void setHasMonster(Boolean hasMonster) {
        this.hasMonster = hasMonster;
    }
    public Boolean getHasWeapon() {
        return hasWeapon;
    }

    public void setHasWeapon(Boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }
    public Boolean getHasStair() {
        return hasStair;
    }
    public Weapon getWeaponInRoom() {
        return weaponInRoom;
    }

}
