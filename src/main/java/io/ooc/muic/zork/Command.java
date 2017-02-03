package io.ooc.muic.zork;

import java.util.*;

abstract class Command extends BattleCommand{
    Boolean passStage = false;
    void walking(String direction, Player player,ArrayList<ArrayList<Room>> gameMap){
        try {
//            System.out.println(enterRoomAvailable(gameMap,player.getPositionX()+1, player.getPositionY()));
            switch (direction) {
                case "north":
                    if(enterRoomAvailable(gameMap,player.getPositionX(), player.getPositionY()+1)){
                        player.setPositionY(player.getPositionY()+1);
                    }else{
                        System.out.println("you hit the wall.");
                    };
                    break;
                case "south":
                    if(enterRoomAvailable(gameMap,player.getPositionX(), player.getPositionY()-1)){
                        player.setPositionY(player.getPositionY()-1);
                    }else{
                        System.out.println("you hit the wall.");
                    };
                    break;
                case "west":
                    if(enterRoomAvailable(gameMap,player.getPositionX()-1, player.getPositionY())){
                        player.setPositionX(player.getPositionX()-1);
                    }else{
                        System.out.println("you hit the wall.");
                    };
                    break;
                case "east":
                    if(enterRoomAvailable(gameMap,player.getPositionX()+1, player.getPositionY())){
                        player.setPositionX(player.getPositionX()+1);
                    }else{
                        System.out.println("you hit the wall.");
                    };
                    break;
                default: System.out.println("Direction is invalid");
            }
            player.setCurrentRoom(gameMap.get(player.getPositionY()).get(player.getPositionX()));
        }catch (EmptyStackException e){
            System.out.println("Direction is invalid");
        }
    }
    Boolean enterRoomAvailable(ArrayList<ArrayList<Room>> gameMap, int positionX, int positionY){
        if ((positionY >= 0) && (positionY < gameMap.size())){
            if ((positionX >= 0) && (positionX < gameMap.get(positionY).size())){
                return true;
            }
        }
        return false;
    }
    void enter(Player player){
        if (player.getCurrentRoom().getHasMonster()){
            enterBattleMode(player.getCurrentRoom().getMonsterRoom(), player);
        }
        if(player.getCurrentRoom().getHasItem()){
            System.out.println("This room have potion. Do you want to pick it up ? \n **Unless, you type 'yes' the item will not be picked");
            String input = new Scanner(System.in).nextLine().toUpperCase();
            if(input.equals("YES")){
                player.getCurrentRoom().setHasItem(false);
                player.setNumberOfItem(player.getNumberOfItem()+1);
            }
        }
        if(player.getCurrentRoom().getHasWeapon()){
            System.out.println("This room have " + player.getCurrentRoom().getWeaponInRoom().getName()+
                    ". Do you want to pick it up ? \n" + "This weapon has damages of "+ player.getCurrentRoom().getWeaponInRoom().getDamage()+
                    "\n **Unless, you type 'yes' the item will not be picked");
            String input = new Scanner(System.in).nextLine().toUpperCase();
            if(input.equals("YES")){
                player.getCurrentRoom().setHasWeapon(false);
                player.setWeapon(player.getCurrentRoom().getWeaponInRoom());
            }
        }
        if (player.getCurrentRoom().getHasStair()){
            System.out.println("Congratulation this room have stair to go to next level");
            passStage = true;
        }
    }
}

