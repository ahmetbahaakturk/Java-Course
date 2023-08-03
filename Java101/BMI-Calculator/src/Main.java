import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Height(m): ");
        double height = scanner.nextDouble();

        System.out.print("Weight(km): ");
        double weight = scanner.nextDouble();
        double bmi = weight/(height*height);

        System.out.print("BMI: " + bmi);
    }
}