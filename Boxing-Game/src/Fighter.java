public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodgeChance;

    Fighter(String name, int damage, int health, int weight, double dodgeChance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodgeChance = dodgeChance;
    }

    void hit(Fighter opponent) {

        if (opponent.isDodge()) {
            System.out.println(opponent.name + " Dogged The Punch!");
        } else {
            System.out.println(this.name + " => " + opponent.name + " Damaged " + this.damage + " Point");
            if (opponent.health - this.damage < 0) {
                opponent.health = 0;
            } else {
                opponent.health -= this.damage;
            }
        }
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodgeChance;
    }
}
