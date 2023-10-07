package Input;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static int nextInt() {
        int num;
        while (true) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                scanner.nextLine();
                return num;
            } else {
                System.out.print("Enter Integer Number!: ");
                scanner.nextLine();
            }
        }
    }

    public static int nextInt(int origin, int bound) {
        int num;
        while (true) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num >= origin && num < bound) {
                    scanner.nextLine();
                    return num;
                } else {
                    System.out.println("Enter Number Between " + origin + " and " + bound + "!!!");
                    scanner.nextLine();
                }
            } else {
                System.out.print("Enter Integer Number!: ");
                scanner.nextLine();
            }
        }
    }

    public static double nextDouble() {
        double num;
        while (true) {
            if (scanner.hasNextDouble()) {
                num = scanner.nextDouble();
                scanner.nextLine();
                return num;
            } else {
                System.out.print("Enter Double Number!: ");
                scanner.nextLine();
            }
        }
    }

    public static String nextLine() {
        return scanner.nextLine();
    }

    public static String next() {
        String next = scanner.next();
        scanner.nextLine();
        return next;
    }
}
