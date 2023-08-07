import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String userName, password;
    static int balance = 0;

    public static void main(String[] args) {
        login();
    }

    static void login() {
        System.out.println("\nLOGIN SCREEN");
        int right = 4;
        do {

            if (right == 0) {
                System.out.println("YOUR ACCOUNT HAS BEEN BLOCKED!");
                break;
            }
            System.out.print("Username: ");
            userName = scanner.nextLine();

            System.out.print("Password: ");
            password = scanner.nextLine();

            if (((userName.equals("name")) && password.equals("password"))) {
                System.out.println("You Logged In!");
                atmTransactions();
                break;
            } else {
                System.out.println("\nInvalid Data Entry Please Enter Again!");
            }

            --right;
        } while (true);
    }

    static void atmTransactions() {
        int op;
        boolean openMenu = true;

        while (openMenu) {
            System.out.print("\nTRANSACTION MENU\n1-Deposit\n2-Withdrawal\n3-Balance\n4-Exit\nOperation Number: ");
            op = scanner.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.print("\nDeposit Amount: ");
                    balance += scanner.nextInt();
                    System.out.println("\nNew Balance: " + balance);
                }
                case 2 -> {
                    System.out.print("\nWithdrawal Amount: ");
                    int withdrawal = scanner.nextInt();
                    if (withdrawal <= balance && withdrawal > 0) {
                        balance -= withdrawal;
                        System.out.println("\nNew Balance: " + balance);
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