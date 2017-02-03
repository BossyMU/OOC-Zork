package io.ooc.muic.zork;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by bossy on 27/1/2560.
 */
public class BattleCommand {
    void enterBattleMode(Monster monster, Player player){
        System.out.println(monster.getName()+" found you !! Now, you enter a battle.\n" +
                "There are 3 command to win this fight which are 'attack', 'use' and 'counter'\n" +
                "Wrong Input will result in pass the turn " +
                "**Warning counter will deal extra damages, but it has 40% success");
        while (!monster.isDeath()&&(!player.isDeath())) {
            String input = new Scanner(System.in).nextLine();
            String[] seperate = input.split(" ");
            switch (seperate[0].toLowerCase()){
                case "attack": monster.setHealth(monster.getHealth()-player.getDamange());
                                System.out.println(monster.getHealth());
                                System.out.println("You deal: " + (player.getDamange()+player.getWeapon().getDamage()) + " damages");
                                break;
                case "counter": if(Math.random() < 0.4){
                    System.out.println("You deal a critical damage !! : " + (player.getDamange()+player.getWeapon().getDamage())*2+ " damages");
                    monster.setHealth(monster.getHealth()- (player.getDamange()+player.getWeapon().getDamage())*2);
                }else{
                    System.out.println("You fail to counter, you take extra damages");
                }
                    break;
                case "use": use(player);
            }
            System.out.println("You take :" + (monster.getDamange()) + " damages");
            player.setHealth(player.getHealth()-monster.getDamange());
        }
        player.getCurrentRoom().setHasMonster(false);
    }
    void use(Player player){
        Random random = new Random();
        if(player.getNumberOfItem()>0){
            player.setNumberOfItem(player.getNumberOfItem()-1);
            player.setHealth(player.getHealth()* random.nextInt(9));
            if(player.getHealth()>20){
                player.setHealth(20);
            }
        }else{
            System.out.println("No more potion");
        }
    }
}
