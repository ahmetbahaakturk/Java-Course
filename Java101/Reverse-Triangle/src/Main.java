import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Row Of Triangle: ");
        reverseTriangle(scanner.nextInt());

        scanner.close();
    }

    /*------------Reverse Triangle Function------------*/

    static void reverseTriangle(int row) {
        for (int i = 0; i <= row; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (row - i) - 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}