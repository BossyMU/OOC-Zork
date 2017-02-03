package io.ooc.muic.zork;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by bossy on 4/2/2560.
 */
public class GameTest extends CommandParser
{
    @Test
    public void testMe(){
        Weapon testWeapon = new Weapon("WeaponX",10000,10000);
        Player bossy = new Player("Bossy",20,3);
        ArrayList<ArrayList<Room>> gameMap = new GameMapGenerator().generateMap(1);

        Assert.assertTrue(testWeapon.getName()=="WeaponX");
        Assert.assertTrue(bossy.getName()=="Bossy");
        Assert.assertTrue(bossy.getNumberOfItem()==0);

        String input = "use";
        String[] seperate = input.split(" ");
        bossy.setHealth(19);
        takeInput(seperate, bossy, gameMap);
        Assert.assertTrue(bossy.getHealth()==19);

        bossy.setNumberOfItem(1);
        takeInput(seperate, bossy, gameMap);
        Assert.assertTrue(bossy.getHealth()==20);
        Assert.assertTrue(testWeapon.getDamage()==10000);

        Assert.assertTrue(gameMap.size()==3);
        Assert.assertTrue(gameMap.get(0).get(0).getHasStair() == false);
        Assert.assertTrue(bossy.getDamange()==3);
        bossy.setWeapon(testWeapon);
        Assert.assertTrue(bossy.getWeapon()==testWeapon);
    }
}
