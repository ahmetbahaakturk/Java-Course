package Game;

import Entity.Player.Player;
import Location.BattleLocation.*;
import Location.SafeLocation.*;

import java.util.Scanner;

public class Game {
    public Scanner scanner = new Scanner(System.in);
    public Player player;
    public Forest forest;
    public Cave cave;
    public River river;
    public Mine mine;
    public SafeHouse safeHouse;
    public Workshop workshop;

    public void start() {
        buildPlayer();
        this.forest = new Forest(this.player);
        this.cave = new Cave(this.player);
        this.river = new River(this.player);
        this.mine = new Mine(this.player);
        this.safeHouse = new SafeHouse(this.player);
        this.workshop = new Workshop(this.player);
        mainMenu();
    }

    public void buildPlayer() {
        System.out.print("Name: ");
        String nickName = scanner.nextLine();
        player = new Player(nickName);
    }

    public void mainMenu() {
        while (true) {
            if (player.getCharacter().getHealth() == 0) {
                System.out.println("\nYOU DIED! GAME OVER");
                break;
            } else if (player.hasFireWood && player.hasFood && player.hasWater) {
                System.out.println("\nYOU HAVE COLLECTED ALL ITEMS! THE GAME IS FINISHED");
                break;
            }
            System.out.print("\n---------------------------Main Menu-----------------------------\n1-Cave          Zombies Inside. Kill Them to Get the Food!\n2-Forest        Vampires Inside. Kill Them to Get the Firewood!\n3-River         Bears Inside. Kill Them to Get the Water!\n4-Mine          Snakes Inside. Kill Them to Get the Loot!\n5-Workshop      Buy Weapon and Armor\n6-Safe House    Rest to Restore Your Health\n7-Inventory     Look Inventory\n-----------------------------------------------------------------\nSELECT: ");
            String selectNum = (scanner.next()).toLowerCase();
            switch (selectNum) {
                case "1" -> cave.enter();
                case "2" -> forest.enter();
                case "3" -> river.enter();
                case "4" -> mine.enter();
                case "5" -> workshop.enter();
                case "6" -> safeHouse.enter();
                case "7" -> inventory();
                default -> System.out.println("INVALID ENTRY!");
            }
        }
    }

    public void inventory() {
        scanner.nextLine();
        System.out.print("\n----------------Inventory----------------\nFood: ");
        System.out.println(player.hasFood ? "1" : "0");
        System.out.print("FireWood: ");
        System.out.println(player.hasFireWood ? "1" : "0");
        System.out.print("Water: ");
        System.out.println(player.hasWater ? "1" : "0");
        System.out.print("Weapon: ");
        System.out.println((player.getCharacter().getWeapon() == null) ? "Empty" : player.getCharacter().getWeapon().getName());
        System.out.print("Armor: ");
        System.out.println((player.getCharacter().getArmor() == null) ? "Empty" : player.getCharacter().getArmor().getName());
        System.out.println("Balance: " + player.getCharacter().getMoney() + "\n-----------------------------------------");
        System.out.print("Press Enter to Quit");
        scanner.nextLine();
    }
}