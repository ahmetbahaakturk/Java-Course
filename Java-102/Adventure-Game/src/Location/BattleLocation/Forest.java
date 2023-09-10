package Location.BattleLocation;

import Entity.Monster.Vampire;
import Entity.Player.Player;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, new Vampire());
    }

    @Override
    public boolean itemControl() {
        return getPlayer().hasFireWood;
    }

    @Override
    public void getReward() {
        if (getPlayer().getCharacter().getHealth() > 0) getPlayer().hasFireWood = true;
        System.out.println("You Have Collected Firewood!");
    }
}