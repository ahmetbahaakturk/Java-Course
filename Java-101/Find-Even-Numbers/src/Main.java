import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give Number: ");
        int num = scanner.nextInt();

        System.out.println("Even Numbers Up To The Specified Number");

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }
    }
}