package Entity.Player;

import Entity.Character.*;
import Entity.Entity;

import java.util.Scanner;

public class Player {
    private final Scanner scanner = new Scanner(System.in);
    private final String nickName;
    private Entity character;
    public boolean hasFood, hasWater, hasFireWood;


    public Player(String nickname) {
        selectCharacter();
        this.nickName = nickname;
        this.hasFireWood = false;
        this.hasWater = false;
        this.hasFood = false;
    }

    public Entity getCharacter() {
        return character;
    }

    public String getNickName() {
        return nickName;
    }

    public void selectCharacter() {
        selectCharacter:
        while (true) {
            System.out.print("\n---------------Character Menu---------------\n1-Samurai (Damage: 5, Health: 21, Money: 15)\n2-Archer  (Damage: 7, Health: 18, Money: 20)\n3-Knight  (Damage: 8, Health: 24, Money: 5 )\n--------------------------------------------\nSELECT: ");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    this.character = new Samurai();
                    break selectCharacter;
                case 2:
                    this.character = new Archer();
                    break selectCharacter;
                case 3:
                    this.character = new Knight();
                    break selectCharacter;
                default:
                    System.out.println("INVALID NUMBER");
                    break;
            }
        }
    }
}