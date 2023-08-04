import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, sum = 0;
        boolean isNegative = false;

        System.out.println("Give Numbers");
        while (true) {
            num = scanner.nextInt();
            if (num < 0) {
                break;
            } else if (num % 2 == 1) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}