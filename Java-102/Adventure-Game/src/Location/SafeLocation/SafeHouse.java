package Location.SafeLocation;

import Entity.Player.Player;
import Location.Location;

public class SafeHouse extends Location {
    Player player;
    int playerMaxHealth;

    public SafeHouse(Player player) {
        this.player = player;
        this.playerMaxHealth = player.getCharacter().getHealth();
    }

    @Override
    public void enter() {
        player.getCharacter().setHealth(playerMaxHealth);
        System.out.println("\nYou Rested at Safe House! Your Health Has Been Refreshed.");
    }
}