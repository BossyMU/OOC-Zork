package io.ooc.muic.zork;

import java.util.Scanner;


public class ZorkGame {

    private Room currentRoom;
    private Player player;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Zork: Hello, Welcome to my world.");

        player = new Player("Kogusaki",100, 10, 3);
        currentRoom = new Room();
        currentRoom.setExit("north", new Room());

        while (!quit) {
            System.out.print("You: ");
            String input = scanner.nextLine();




            quit = input.equals("quit");
            if (!quit) {
                System.out.println("Zork: " + input);
            }
        }
    }

    public void walk() {

    }




}
