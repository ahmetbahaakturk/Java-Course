import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num, i = 1;
        double num2;

        System.out.print("Give Number: ");
        num = scanner.nextInt();

        /*------------Powers of Four------------*/

        System.out.println("Powers of Four:");
        while (true) {
            num2 = Math.pow(4, i);
            if (num2 <= num) {
                System.out.print((int) num2 + " ");
                i++;
            } else {
                i = 1;
                System.out.println();
                break;
            }
        }

        /*------------Powers of Five------------*/

        System.out.println("Powers of Five:");
        while (true) {
            num2 = Math.pow(5, i);
            if (num2 <= num) {
                System.out.print((int) num2 + " ");
                i++;
            } else {
                break;
            }
        }
    }
}