import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pear(kg): ");
        double pear = scanner.nextDouble() * 2.14;
        System.out.print("Apple(kg): ");
        double apple = scanner.nextDouble() * 3.67;
        System.out.print("Tomato(kg): ");
        double tomato = scanner.nextDouble() * 1.11;
        System.out.print("Banana(kg): ");
        double banana = scanner.nextDouble() * 0.95;
        System.out.print("Eggplant(kg): ");
        double eggplant = scanner.nextDouble() * 5;

        double price = pear + apple + tomato + banana + eggplant;

        System.out.println("Total Price: " + price);
    }
}