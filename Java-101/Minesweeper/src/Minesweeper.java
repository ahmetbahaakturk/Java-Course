import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Minesweeper {
    Scanner scanner = new Scanner(System.in);
    int row;
    int column;
    int[][] field;
    char[][] playerField;
    int selectedRow;
    int selectedColumn;
    int mineNum;

    Minesweeper() {
        enterProperties();
        createField(this.row, this.column);
        createPlayerField(this.row, this.column);
        placeMines(this.field, this.row, this.column);
        printMineMap();
        run();
    }

    void enterProperties() {
        System.out.println("Values Between 1 and 9 are Recommended to be Entered.");
        System.out.print("   Row: ");
        this.row = scanner.nextInt();

        System.out.print("Column: ");
        this.column = scanner.nextInt();
    }

    void createField(int row, int column) {
        this.field = new int[row][column];
    }

    void createPlayerField(int row, int column) {
        char[][] playerField = new char[row][column];
        for (char[] i : playerField) {
            Arrays.fill(i, '-');
        }
        this.playerField = playerField;
    }

    void placeMines(int[][] field, int row, int column) {
        Random random = new Random();
        int i = 1;
        int randomRow;
        int randomColumn;

        while (i <= (row * column) / 4) {
            randomRow = random.nextInt(row);
            randomColumn = random.nextInt(column);

            if (field[randomRow][randomColumn] == 0) {
                field[randomRow][randomColumn] = 1;
                i++;
            }
        }
    }

    void printField() {
        System.out.println("\n =======MINESWEEPER=======\n");
        System.out.print("   ");
        for (int i = 1; i <= this.column; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        int c = 1;
        for (char[] i : this.playerField) {
            System.out.print(c++ + "  ");
            for (char r : i) {
                System.out.print(r + "  ");
            }
            System.out.println();
        }
    }

    void printMineMap() {
        System.out.println("\n =======MINE LOCATIONS=======\n");
        System.out.print("   ");
        for (int i = 1; i <= this.column; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        int c = 1;
        for (int[] i : this.field) {
            System.out.print(c++ + "  ");
            for (int r : i) {
                System.out.print((r == 1) ? "*  " : "-  ");
            }
            System.out.println();
        }
    }

    void run() {
        printField();
        controlCoordinate();
    }

    void controlCoordinate() {
        System.out.print("   Row: ");
        this.selectedRow = scanner.nextInt() - 1;
        System.out.print("Column: ");
        this.selectedColumn = scanner.nextInt() - 1;

        if (this.field[this.selectedRow][this.selectedColumn] == 1) {
            System.out.println("You Have Pressed the Mine!");
        } else {
            showMineNum();
        }
    }

    void showMineNum() {
        this.mineNum = 48;
        for (int i = this.selectedRow + 1; i >= this.selectedRow - 1 && i <= this.selectedRow + 1; i--) {
            for (int j = this.selectedColumn + 1; j >= this.selectedColumn - 1 && j <= this.selectedColumn + 1; j--) {
                if ((i >= 0 && i < this.row) && (j >= 0 && j < this.column)) {
                    if (field[i][j] == 1) {
                        mineNum++;
                    }
                }
            }
        }

        this.playerField[this.selectedRow][this.selectedColumn] = (char) this.mineNum;
        run();
    }
}