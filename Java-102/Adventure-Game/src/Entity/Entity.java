package Entity;

import Tool.Armor.Armor;
import Tool.Weapon.Weapon;

public abstract class Entity {
    private Armor armor = null;
    private Weapon weapon = null;
    private final String name;
    private final int damage;
    private int health;
    private int money;

    public Entity(String name, int damage, int health, int money) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void hit(Entity oppositeEntity) {
        int weaponDamage;
        int oppositeProtection;
        int totalDamage;


        if (this.weapon == null) weaponDamage = 0;
        else weaponDamage = this.weapon.getDamage();

        if (oppositeEntity.armor == null) oppositeProtection = 0;
        else oppositeProtection = oppositeEntity.armor.getProtection();

        totalDamage = weaponDamage + this.damage;
        if (totalDamage <= oppositeProtection) {
            totalDamage = 0;
        } else {
            totalDamage -= oppositeProtection;
        }

        oppositeEntity.setHealth(oppositeEntity.getHealth() - totalDamage);
        if (oppositeEntity.getHealth() <= 0) oppositeEntity.setHealth(0);
    }
}