import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r;

        System.out.print("(n): ");
        n = scanner.nextInt();

        System.out.print("(r): ");
        r = scanner.nextInt();

        System.out.println(combination(n, r));
    }

    /*------------Factorial Function------------*/

    static long factorial(int a) {
        long factorial = 1L;
        for (int i = a; i > 0; --i) {
            factorial *= i;
        }
        return factorial;
    }

    /*------------Combination Function------------*/

    static long combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}