public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double sum = 0.0;
        double average;

        for (int i : array) {
            sum += 1.0 / i;
        }

        average = array.length / sum;
        System.out.println("Harmonic Mean: " + average);
    }
}