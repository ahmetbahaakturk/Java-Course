import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int birthYear;

        System.out.print("Enter Birth Year: ");
        birthYear = scanner.nextInt();

        switch (birthYear % 12) {
            case 0 -> System.out.println("Monkey");
            case 1 -> System.out.println("Cockerel");
            case 2 -> System.out.println("Dog");
            case 3 -> System.out.println("Pig");
            case 4 -> System.out.println("Mouse");
            case 5 -> System.out.println("Bull");
            case 6 -> System.out.println("Tiger");
            case 7 -> System.out.println("Rabbit");
            case 8 -> System.out.println("Dragon");
            case 9 -> System.out.println("Snake");
            case 10 -> System.out.println("Horse");
            case 11 -> System.out.println("Sheep");
            default -> {
            }
        }
    }
}