import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        matrix = transpose(matrix);
        printArray2d(matrix);

    }

    static void printArray2d(int[][] arr) {
        for (int[] i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }

    static int[][] transpose(int[][] arr) {
        int[][] transpose = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }
}