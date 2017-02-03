package io.ooc.muic.zork;

import java.util.ArrayList;
import java.util.Scanner;


public class ZorkGame extends CommandParser {

    private Room currentRoom;
    private Player player;
    private int gameLv = 1;

    public void start() {
        ArrayList<ArrayList<Room>> gameMap = new GameMapGenerator().generateMap(gameLv);
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Zork: Hello, Welcome to my world. If you need any help type 'help'");

        player = new Player("Kogusaki",20, 3);
        player.setCurrentRoom(currentRoom);

        while (!quit) {
            System.out.print("You: ");
            String input = scanner.nextLine();
            String[] seperate = input.split(" ");
            if(player.isDeath()){
                System.out.println("Game Over");
                System.exit(0);
            }else if(passStage){
                gameMap = new GameMapGenerator().generateMap(gameLv + 1);
                gameLv++;
                passStage = false;
                player.setPositionY(0);
                player.setPositionX(0);
                if(gameLv==4){
                    System.out.println("You Win");
                    System.exit(0);
                }
            }else if (input.equals("quit")) {
                System.exit(0);
            }
            takeInput(seperate, player, gameMap);
        }
    }
}
