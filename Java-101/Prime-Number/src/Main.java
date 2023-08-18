public class Main {
    public static void main(String[] args) {
        boolean isPrime;
        for (int i = 2; i <= 100; ++i) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); ++j) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.print((isPrime) ? i + " " : "");
        }
    }
}