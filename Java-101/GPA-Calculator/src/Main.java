import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your lecture notes in order");

            System.out.print("Math: ");
            float math = scanner.nextFloat();

            System.out.print("Physics : ");
            float physics = scanner.nextFloat();

            System.out.print("Chemistry: ");
            float chemistry = scanner.nextFloat();

            System.out.print("Turkish: ");
            float turkish = scanner.nextFloat();

            System.out.print("History: ");
            float history = scanner.nextFloat();

            System.out.print("Music: ");
            float music = scanner.nextFloat();

        float gradeAverage = (math + physics + chemistry + turkish + history + music) / 6;

        scanner.close();
        System.out.print("Your GAP is " + gradeAverage);
    }
}