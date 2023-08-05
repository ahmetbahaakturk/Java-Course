import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give Number: ");
        diamondShape(scanner.nextInt());
    }

    /*------------Diamond Shape------------*/

    static void diamondShape(int row) {
        int space = row - 1;
        for (int i = 1; i <= (2 * row) - 1; ++i) {
            for (int j = 1; j <= Math.abs(space); ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (row - Math.abs(space)) - 1; ++j) {
                System.out.print("*");
            }
            System.out.println();
            --space;
        }
    }
}