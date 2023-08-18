import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exp;

        System.out.print("Base: ");
        base = scanner.nextInt();

        System.out.print("Exponent: ");
        exp = scanner.nextInt();

        System.out.println(exponentiation(base, exp));
    }

    static int exponentiation(int base, int exp) {
        int finalNumber = 1;
        for (int i = 0; i < exp; i++) {
            finalNumber *= base;
        }
        return finalNumber;
    }
}