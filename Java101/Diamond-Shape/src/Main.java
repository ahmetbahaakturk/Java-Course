import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give Number: ");
        diamondShape(scanner.nextInt());
    }

    static void diamondShape(int row) {
        int space = row;

        for (int i = 1; i <= row; ++i) {
            --space;
            for (int j = 1; j <= space; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = row - 1; i > 0; --i) {
            ++space;
            for (int j = 1; j <= space; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}