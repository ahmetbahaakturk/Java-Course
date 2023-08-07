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
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    /*---------------ICM Calculator---------------*/

    static int ICM(int num1, int num2) {
        return (num1 * num2) / GCD(num1, num2);
    }
}