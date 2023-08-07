import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, tempNum;
        System.out.print("First Number: ");
        num1 = scanner.nextInt();
        System.out.print("Second Number: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            tempNum = num1;
            num1 = num2;
            num2 = tempNum;
        }

        System.out.print("\nGCD: " + GCD(num1, num2) + "\nICM: " + ICM(num1, num2));
    }

    /*---------------GCD Calculator---------------*/

    static int GCD(int num1, int num2) {
        int i = 1, gcd = 1;

        while (i <= num1) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            ++i;
        }
        return gcd;
    }

    /*---------------ICM Calculator---------------*/

    static int ICM(int num1, int num2) {
        int i = 1;
        while (true) {
            if ((num2 * i) % num1 == 0) {
                return num2 * i;
            }
            ++i;
        }
    }
}