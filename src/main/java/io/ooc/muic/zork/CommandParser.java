package io.ooc.muic.zork;

import java.util.ArrayList;

public class CommandParser extends Command{
    void takeInput(String inputCommand[], Player player,ArrayList<ArrayList<Room>> gameMap){
        try {
            switch (inputCommand[0]){
                case "use":
                        use(player);
                    break;
                case "go" :
                    walking(inputCommand[1],player, gameMap);
                    enter(player);
                    break;
                case "status":
                    System.out.println("HP = " + player.getHealth());
                    System.out.println("Number of potion : " + player.getNumberOfItem());
                    System.out.println("you weapon deal : " + player.getWeapon().getDamage());
                    System.out.println("you player deal : " + player.getDamange());
                    break;
                case "help": System.out.println("There for 3 command in searching mode \n 1. 'use' : using potion." +
                        "\n 2. 'go' 'direction' : direction could be north south east and west " +
                        "\n 3. 'status' : check player status");
                    break;
                default: System.out.println("The command is invalid");
            }


        }catch (Exception e){
            System.out.println("The command is invalid");
        }

    }
}
