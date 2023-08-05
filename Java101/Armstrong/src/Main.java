import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give Number: ");
        System.out.println(armstrongControl(scanner.nextInt()));
    }

    /*-------------Digit Counter-------------*/

    public static int topDigit(int num) {
        int topDigit = 0;
        while (num > 0) {
            num /= 10;
            ++topDigit;
        }
        return topDigit;
    }

    /*-------------Armstrong Number Control-------------*/

    static String armstrongControl(int num) {
        int originalNumber, base, finalNum = 0;
        originalNumber = num;
        for (int power = topDigit(num); num > 0; ) {
            base = num % 10;
            num /= 10;
            finalNum += Math.pow(base, power);
        }
        if (originalNumber == finalNum) {
            return "Armstrong";
        } else {
            return "Not Armstrong";
        }
    }
}