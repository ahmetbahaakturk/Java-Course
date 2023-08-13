import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[array.length];
        int startIndex = 0;

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                if (i != j && array[i] == array[j]) {
                    if (!isFind(duplicate, array[i])) {
                        duplicate[startIndex++] = array[i];
                    }
                    break;
                }
            }
        }
        for (int i : duplicate) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}