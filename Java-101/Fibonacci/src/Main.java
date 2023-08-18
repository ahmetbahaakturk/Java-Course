import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        fibonacciFinder(scanner.nextInt());
    }

    /*------------Fibonacci Finder------------*/

    static void fibonacciFinder(int num) {
        for (int i = 1, temp, a1 = 0, a2 = 1; i <= num; ++i) {
            System.out.println(a1 + " + " + a2 + " = " + (a1 + a2));
            temp = a2;
            a2 += a1;
            a1 = temp;
        }
    }
}