import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        //Generates a random array of length 10

        int[] array = new int[10];
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(0, 20);
        }
        System.out.println(Arrays.toString(array));
        minMaxFinder(array);
    }

    //Finds greatest and least number array

    static void minMaxFinder(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
        }
        System.out.print("Min: " + min + "\nMax: " + max);
    }
}