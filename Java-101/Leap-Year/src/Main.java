import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;

        System.out.print("Enter Year: ");
        year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (!(year % 100 == 0) && year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}