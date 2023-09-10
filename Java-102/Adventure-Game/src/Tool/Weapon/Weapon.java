package Tool.Weapon;

import Tool.Tool;

public abstract class Weapon extends Tool {
    private final int damage;

    public Weapon(String name, int damage, int price) {
        super(name, price);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}