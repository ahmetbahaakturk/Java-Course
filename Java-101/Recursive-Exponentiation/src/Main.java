import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exp;

        System.out.print("Base Number: ");
        base = scanner.nextInt();
        System.out.print("Exponent Number: ");
        exp = scanner.nextInt();

        System.out.println(power(base, exp));
        System.out.println(Math.pow(0, 0));
    }

    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return base;
        }

        return power(base, exp - 1) * base;
    }
}