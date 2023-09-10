package Location.SafeLocation;

import Entity.Player.Player;
import Location.Location;
import Tool.Tool;
import Tool.Armor.*;
import Tool.Weapon.*;

import java.util.Scanner;

public class Workshop extends Location {
    private final Scanner scanner = new Scanner(System.in);
    Player player;
    Armor lightArmor, mediumArmor, heavyArmor;
    Weapon pistol, rifle, sword;

    public Workshop(Player player) {
        this.player = player;
        pistol = new Pistol();
        rifle = new Rifle();
        sword = new Sword();
        lightArmor = new LightArmor();
        mediumArmor = new MediumArmor();
        heavyArmor = new HeavyArmor();
    }

    @Override
    public void enter() {
        toolMenu();
    }

    public void toolMenu() {
        String select;
        toolMenu:
        while (true) {
            System.out.print("\n--------------Workshop Menu--------------\n1-Weapons\n2-Armors\nQ-Quit\n-----------------------------------------\nSELECT: ");
            select = (scanner.next()).toLowerCase();
            switch (select) {
                case "1":
                    weaponMenu();
                    break;
                case "2":
                    armorMenu();
                    break;
                case "q":
                    break toolMenu;
                default:
                    System.out.println("Enter Valid Number!");
                    break;
            }
        }
    }

    public void weaponMenu() {
        System.out.println("\nBalance: " + player.getCharacter().getMoney() + "\n---------------Weapon Menu---------------");
        System.out.println("1-Pistol (Damage: 2, Price: 25)\n2-Sword  (Damage: 3, Price: 35)\n3-Rifle  (Damage: 7, Price: 45)\nQ-Back\n-----------------------------------------");
        String select;
        select:
        while (true) {
            System.out.print("SELECT: ");
            select = (scanner.next()).toLowerCase();
            switch (select) {
                case "1":
                    if (buyTool(pistol)) {
                        player.getCharacter().setWeapon(pistol);
                        break select;
                    } else break;
                case "2":
                    if (buyTool(sword)) {
                        player.getCharacter().setWeapon(sword);
                        break select;
                    } else break;
                case "3":
                    if (buyTool(rifle)) {
                        player.getCharacter().setWeapon(rifle);
                        break select;
                    } else break;
                case "q":
                    break select;
                default:
                    System.out.println("INVALID NUMBER!");
                    break;
            }
        }
    }

    public void armorMenu() {
        System.out.println("\nBalance: " + player.getCharacter().getMoney() + "\n---------------Armor Menu----------------");
        System.out.println("1-Light Armor  (Protection: 1, Price: 15)\n2-Medium Armor (Protection: 3, Price: 25)\n3-Heavy Armor  (Protection: 5, Price: 40)\nQ-Back\n-----------------------------------------");
        String select;
        select:
        while (true) {
            System.out.print("SELECT: ");
            select = (scanner.next()).toLowerCase();
            switch (select) {
                case "1":
                    if (buyTool(lightArmor)) {
                        player.getCharacter().setArmor(lightArmor);
                        break select;
                    } else break;
                case "2":
                    if (buyTool(mediumArmor)) {
                        player.getCharacter().setArmor(mediumArmor);
                        break select;
                    } else break;
                case "3":
                    if (buyTool(heavyArmor)) {
                        player.getCharacter().setArmor(heavyArmor);
                        break select;
                    } else break;
                case "q":
                    break select;
                default:
                    System.out.println("Please Enter Valid Number!");
                    break;
            }
        }
    }

    public boolean buyTool(Tool tool) {
        if (player.getCharacter().getMoney() >= tool.getPrice()) {
            player.getCharacter().setMoney(player.getCharacter().getMoney() - tool.getPrice());
            System.out.println("You Bought " + tool.getName() + "!");
            return true;
        } else {
            System.out.println("Your Balance is Not Enough!");
            return false;
        }
    }
}