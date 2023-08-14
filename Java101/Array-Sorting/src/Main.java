import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = arrayCreator();
        sortArray(array);
        System.out.println("Sort: " + Arrays.toString(array));
    }
    
    static void sortArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static int[] arrayCreator() {
        int length;

        System.out.print("Array Length: ");
        length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; ++i) {
            System.out.print((i + 1) + ". Element: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}