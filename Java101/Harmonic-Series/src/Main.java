import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give Number: ");
        System.out.println(calculateHarSer(scanner.nextInt()));
    }

    static double calculateHarSer(int num) {
        double sum = 0.0;
        for (int i = 1; i <= num; ++i) {
            sum += (1.0 / i);
        }
        return sum;
    }
}