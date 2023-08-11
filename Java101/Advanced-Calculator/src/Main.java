import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double a, b;

    public static void main(String[] args) {
        System.out.print("1 - Summation\b - Deduction\n3 - Multiplication\n4 - Division\n5 - Power\n6 - Factorial\n7 - Mod\n8 - Rectangle Area and Circumference\nSelect: ");
        switch (scanner.nextInt()) {
            case 1 -> {
                enterTwoDouble();
                System.out.print(summation(a, b));
            }
            case 2 -> {
                enterTwoDouble();
                System.out.print(deduction(a, b));
            }
            case 3 -> {
                enterTwoDouble();
                System.out.print(multiplication(a, b));
            }
            case 4 -> {
                enterTwoDouble();
                System.out.print(division(a, b));
            }
            case 5 -> {
                enterTwoDouble();
                System.out.print(power(a, b));
            }
            case 6 -> System.out.print(factorial());
            case 7 -> {
                enterTwoDouble();
                System.out.print(mod(a, b));
            }
            case 8 -> {
                enterTwoDouble();
                System.out.print("Area: " + rectangleArea(a, b) + "\nCircumference: " + rectangleCircumference(a, b));
            }
            default -> System.out.println("Invalid Number!");
        }
    }

    static double summation(double a, double b) {
        return a + b;
    }

    static double deduction(double a, double b) {
        return a - b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    static double division(double a, double b) {
        return a / b;
    }

    static double power(double a, double b) {
        return Math.pow(a, b);
    }

    static int mod(double a, double b) {
        return (int) a / (int) b;
    }

    static double rectangleArea(double a, double b) {
        return a * b;
    }

    static double rectangleCircumference(double a, double b) {
        return (2 * a) + (2 * b);
    }

    static int factorial() {
        int num, factorial = 1;

        System.out.print("Number: ");
        num = scanner.nextInt();

        if (num == 0) {
            return 1;
        } else {
            while (num != 0) {
                factorial *= num--;
            }
            return factorial;
        }
    }

    static void enterTwoDouble() {
        System.out.print("First Number: ");
        a = scanner.nextDouble();
        System.out.print("Second Number: ");
        b = scanner.nextDouble();
    }
}