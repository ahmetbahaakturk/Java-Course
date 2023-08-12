import java.util.Random;

public class Match {
    Random random = new Random();
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isFit()) {
            boolean punchTurn;
            while (this.f1.health > 0 && this.f2.health > 0) {
                punchTurn = random.nextBoolean();
                System.out.println("=======================");
                if (punchTurn) {
                    f1.hit(f2);
                } else {
                    f2.hit(f1);
                }
                System.out.println(f1.name + " Health: " + f1.health + "\n" + f2.name + " Health: " + f2.health);
            }
        } else {
            System.out.println("The Weight Of The Fighters Is Mismatched");
        }
        if (f1.health > 0) {
            System.out.println(f1.name + " Won!");
        } else {
            System.out.println(f2.name + " Won!");
        }
    }

    boolean isFit() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
}
