import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;

        System.out.print("Row: ");
        row = scanner.nextInt();
        System.out.print("Column: ");
        column = scanner.nextInt();

        int[][] letterB = new int[row][column];

        for (int i = 0; i < letterB.length; ++i) {
            if (i == 0 || i == (letterB.length - 1) / 2 || i == letterB.length - 1) {
                for (int j = 0; j < letterB[i].length - 1; ++j) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j < letterB[i].length - 1; ++j) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
