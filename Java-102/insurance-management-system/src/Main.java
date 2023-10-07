import Account.*;
import Input.Input;
import Insurance.InsuranceManager;
import Address.*;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.print("""
                1-LogIn
                2-Create Account
                Enter:\s""");

        int preference = Input.nextInt(1, 3);

        switch (preference) {
            case 1 -> logInMenu();
            case 2 -> createAccount();
        }
    }

    public static void logInMenu() {
        while(true) {
            AccountManager.logIn();
            accountMenu(AccountManager.getLoggedInAccount());
        }

    }

    public static void createAccount() {
        AccountManager.createAccount();
        run();
    }

    public static void accountMenu(Account account) {
        accountMenuLabel:
        while (true) {
            System.out.print("""
                    1-Show Info
                    2-Insurance
                    3-Address
                    Q-Exit
                    Enter:\s""");

            String preference = Input.nextLine().toLowerCase();

            switch (preference) {
                case "1" -> account.showInfo();
                case "2" -> insuranceMenu(account);
                case "3" -> addressMenu(account);
                case "q" -> {
                    break accountMenuLabel;
                }
                default -> System.out.println("Enter Valid Value!");
            }
        }
    }

    public static void insuranceMenu(Account account) {

        insuranceMenuLabel:
        while (true) {
            System.out.print("""
                    1-Show Insurances
                    2-Add Insurance
                    Q-Back to Menu
                    Enter:\s""");

            String preference = Input.nextLine().toLowerCase();

            switch (preference) {
                case "1" -> InsuranceManager.printInsurances(account);
                case "2" -> InsuranceManager.addInsurance(account);
                case "q" -> {
                    break insuranceMenuLabel;
                }
                default -> System.out.println("Enter Valid Value!");

            }
        }
    }

    public static void addressMenu(Account account) {
        addressMenuLabel:
        while (true) {
            System.out.print("""
                    1-Show Addresses
                    2-Add Address
                    3-Remove Address
                    Q-Back to Menu
                    """);

            String preference = Input.nextLine().toLowerCase();

            switch (preference) {
                case "1" -> AddressManager.printAddresses(account.getUser().getAddresses());
                case "2" -> AddressManager.addAddress(account.getUser().getAddresses());
                case "3" -> AddressManager.removeAddress(account.getUser().getAddresses());
                case "q" -> {

                    break addressMenuLabel;
                }
                default -> System.out.println("Enter Valid Value!");
            }
        }
    }
}