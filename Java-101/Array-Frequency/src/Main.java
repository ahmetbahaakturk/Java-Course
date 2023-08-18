public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 4, 8, 2, 5, 4, 6, 8, 2, 9, 1, 6};

        int[] frequencies = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
            frequencies[i] = counter;
        }

        for (int i = 0; i < arr.length; i++) {
            boolean isWritten = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isWritten = true;
                    break;
                }
            }
            if (!isWritten) {
                System.out.println("Number " + arr[i] + " Frequency: " + frequencies[i]);
            }
        }
    }
}
