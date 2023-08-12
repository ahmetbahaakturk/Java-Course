public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 23, 100, 120, 75);
        Fighter f2 = new Fighter("B", 24, 100, 85, 24);

        Match match = new Match(f1, f2, 80, 120);
        match.run();
    }
}