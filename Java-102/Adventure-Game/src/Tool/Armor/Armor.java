package Tool.Armor;

import Tool.Tool;

public abstract class Armor extends Tool {
    private final int protection;

    public Armor(String name, int protection, int price) {
        super(name, price);
        this.protection = protection;
    }

    public int getProtection() {
        return protection;
    }
}