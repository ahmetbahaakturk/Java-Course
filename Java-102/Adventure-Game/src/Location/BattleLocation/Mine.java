package Location.BattleLocation;

import Entity.Player.Player;
import Entity.Monster.Snake;

import java.util.Random;

import Tool.Armor.*;
import Tool.Weapon.*;

public class Mine extends BattleLocation {
    private final LightArmor lightarmor;
    private final MediumArmor mediumArmor;
    private final HeavyArmor heavyArmor;

    private final Pistol pistol;
    private final Sword sword;
    private final Rifle rifle;


    private final Random random = new Random();

    public Mine(Player player) {
        super(player, new Snake());

        this.lightarmor = new LightArmor();
        this.mediumArmor = new MediumArmor();
        this.heavyArmor = new HeavyArmor();

        this.pistol = new Pistol();
        this.sword = new Sword();
        this.rifle = new Rifle();
    }

    @Override
    boolean itemControl() {
        return false;
    }

    @Override
    void getReward() {
        double randomNumber = random.nextDouble(1, 101);
        if (randomNumber <= 15) {
            if (randomNumber <= 3) {
                getPlayer().getCharacter().setWeapon(rifle);
                printTrophy(rifle.getName());
            } else if (randomNumber <= 7.5) {
                getPlayer().getCharacter().setWeapon(sword);
                printTrophy(sword.getName());
            } else {
                getPlayer().getCharacter().setWeapon(pistol);
                printTrophy(pistol.getName());
            }
        } else if (randomNumber <= 30) {
            if (randomNumber <= 18) {
                getPlayer().getCharacter().setArmor(heavyArmor);
                printTrophy(heavyArmor.getName());
            } else if (randomNumber <= 22.5) {
                getPlayer().getCharacter().setArmor(mediumArmor);
                printTrophy(mediumArmor.getName());
            } else {
                getPlayer().getCharacter().setArmor(lightarmor);
                printTrophy(lightarmor.getName());
            }
        } else if (randomNumber <= 55) {
            if (randomNumber <= 35) {
                getPlayer().getCharacter().setMoney(getPlayer().getCharacter().getMoney() + 10);
                printTrophy("10 Money");
            } else if (randomNumber <= 42.5) {
                getPlayer().getCharacter().setMoney(getPlayer().getCharacter().getMoney() + 5);
                printTrophy("5 Money");
            } else {
                getPlayer().getCharacter().setMoney(getPlayer().getCharacter().getMoney() + 1);
                printTrophy("1 Money");
            }
        } else {
            System.out.println("No Loot!");
        }
    }

    private void printTrophy(String trophy) {
        System.out.println(trophy + " Found in Cave");
    }
}