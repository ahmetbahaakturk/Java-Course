import java.util.Scanner;

public class Main {
    static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number Amount: ");
        for (int i = 1, counter = scanner.nextInt(); i <= counter; ++i) {
            System.out.print(i + ". Number: ");
            compareFun(scanner.nextInt());
        }
        System.out.print("Min: " + min + "\nMax: " + max);
    }

    /*--------------Compare Function--------------*/

    static void compareFun(int num) {
        if (num > max) {
            max = num;
        } else if (num < min) {
            min = num;
        }
    }
}