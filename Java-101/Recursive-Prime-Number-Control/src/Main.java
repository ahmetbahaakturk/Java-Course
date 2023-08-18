import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        System.out.println((isPrime(scanner.nextInt(), 2)) ? "Prime" : "Not Prime");
    }

    /*-----------Prime Number Control-----------*/

    private static boolean isPrime(int num, int divisor) {
        if (num <= 2) {
            return (num == 2);
        }
        if (num % divisor == 0) {
            return false;
        }
        if (divisor * divisor > num) {
            return true;
        }
        return isPrime(num, divisor + 1);
    }
}