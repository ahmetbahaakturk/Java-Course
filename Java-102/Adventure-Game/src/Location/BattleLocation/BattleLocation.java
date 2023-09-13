package Location.BattleLocation;


import Entity.Entity;
import Entity.Player.Player;
import Location.Location;

import java.util.Random;

public abstract class BattleLocation extends Location {
    private final int monsterMaxHealth;
    private final Random random = new Random();
    private final Player player;
    private final Entity monster;
    private int totalMoney;

    BattleLocation(Player player, Entity monster) {
        this.player = player;
        this.monster = monster;
        this.monsterMaxHealth = monster.getHealth();
        this.totalMoney = 0;
    }

    @Override
    public void enter() {
        if (!itemControl()) {
            fight(player, monster);
            if (player.getCharacter().getHealth() > 0) {
                if (!(monster.getName().equals("Snake"))) {
                    System.out.println("\nYou Got " + totalMoney + " Money From Monsters!");
                }
                getReward();
            }
            monster.setHealth(monsterMaxHealth);
        } else {
            System.out.println("\nYOU HAD ENTER HERE BEFORE!");
        }
    }

    public void fight(Player player, Entity monster) {
        int monsterNum = this.random.nextInt(2, 4);
        boolean playerHitFirst;
        System.out.println("\nThere are " + monsterNum + " " + monster.getName() + "s Inside!!");
        for (int i = 1; i <= monsterNum; i++) {
            monster.setHealth(monsterMaxHealth);
            System.out.println("\n---------------" + i + ". " + monster.getName() + "----------------");
            System.out.println(player.getNickName() + ": " + player.getCharacter().getHealth() + " <> " + monster.getName() + ": " + monster.getHealth());
            playerHitFirst = this.random.nextBoolean();

            if (playerHitFirst) {
                player.getCharacter().hit(monster);
                printHealth(player, monster, true);
                if (monster.getHealth() == 0) {
                    System.out.println("----------------------------------------");
                    totalMoney += monster.getMoney();
                    continue;
                }
            }

            while (true) {
                monster.hit(player.getCharacter());
                printHealth(player, monster, false);
                if (player.getCharacter().getHealth() == 0) break;

                player.getCharacter().hit(monster);
                printHealth(player, monster, true);
                if (monster.getHealth() == 0) break;
            }
            System.out.println("----------------------------------------");
            if (player.getCharacter().getHealth() == 0) break;
            totalMoney += monster.getMoney();
        }
        player.getCharacter().setMoney(player.getCharacter().getMoney() + totalMoney);

    }

    public Player getPlayer() {
        return player;
    }

    abstract boolean itemControl();

    abstract void getReward();

    public void printHealth(Player player, Entity monster, boolean isPlayer) {
        System.out.print(player.getNickName() + ": " + player.getCharacter().getHealth());
        if (player.getCharacter().getHealth() < 10) System.out.print(" ");
        System.out.print(isPlayer ? " -> " : " <- ");
        System.out.println(monster.getName() + ": " + monster.getHealth());
    }
}