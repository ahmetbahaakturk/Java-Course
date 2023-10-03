import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int input() {
        while (true) {
            if(scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.print("Enter Integer!: ");
                scanner.nextLine();
            }
        }
    }
}