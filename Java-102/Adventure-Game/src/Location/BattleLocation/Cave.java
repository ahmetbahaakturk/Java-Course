package Location.BattleLocation;

import Entity.Monster.Zombie;
import Entity.Player.Player;

public class Cave extends BattleLocation {
    public Cave(Player player) {
        super(player, new Zombie());
    }

    @Override
    public boolean itemControl() {
        return getPlayer().hasFood;
    }

    @Override
    public void getReward() {
        if (getPlayer().getCharacter().getHealth() > 0) getPlayer().hasFood = true;
        System.out.println("You Have Collected Food!");
    }
}