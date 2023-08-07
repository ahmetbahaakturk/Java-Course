import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String userName, password;
    static int balance = 0;

    /*
    UserName = "name"
    Password = "password"
     */

    public static void main(String[] args) {
        login();
    }

    static void login() {
        System.out.println("\nLOGIN SCREEN");
        int right = 4;
        do {
            System.out.print("Username: ");
            userName = scanner.nextLine();

            System.out.print("Password: ");
            password = scanner.nextLine();

            if (((userName.equals("name")) && password.equals("password"))) {
                atmTransactions();
                break;
            }
            if (right == 1) {
                System.out.println("\nYOUR ACCOUNT HAS BEEN BLOCKED!");
                break;
            } else {
                System.out.println("Invalid Data Entry, Try Again!");
                --right;
            }
        } while (true);
    }

    static void atmTransactions() {
        boolean openMenu = true;

        while (openMenu) {
            System.out.print("\nTRANSACTION MENU\n1-Deposit\n2-Withdrawal\n3-Balance\n4-Exit\nSelect: ");

            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.print("\nDeposit Amount: ");
                    balance += scanner.nextInt();
                    System.out.println("\nNEW BALANCE: " + balance);
                }
                case 2 -> {
                    System.out.print("\nWithdrawal Amount: ");
                    int withdrawal = scanner.nextInt();
                    if (withdrawal <= balance && withdrawal > 0) {
                        balance -= withdrawal;
                        System.out.println("\nNEW BALANCE: " + balance);
                    } else {
                        System.out.println("\nInsufficient Balance Or Not Positive Number");
                    }
                }
                case 3 -> System.out.println("\nBalance: " + balance);
                case 4 -> {
                    scanner.nextLine();
                    login();
                    openMenu = false;
                }
                default -> System.out.println("\nInvalid Number!");
            }
        }
    }
}