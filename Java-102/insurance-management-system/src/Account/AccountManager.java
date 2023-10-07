package Account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeSet;

import Input.Input;

public class AccountManager {
    private static final TreeSet<Account> accounts = new TreeSet<>();
    private static Account loggedInAccount = null;

    public static boolean logIn() {
        String email;
        String password;

        do {
            System.out.println("------------Log In------------");
            System.out.print("E-Mail: ");
            email = Input.nextLine();
            if (email.equals("q") || email.equals("Q")) return false;
            System.out.print("Password: ");
            password = Input.nextLine();
            if (password.equals("q") || password.equals("Q")) return false;
        } while (!(isLoggedIn(email, password)));

        return true;
    }

    public static void createAccount() {
        String name;
        String surName;
        String email;
        String password;
        String job;
        int age;

        createAccountLabel:
        while (true) {
            System.out.print("""
                                    
                    -------------Account Type-------------
                    1-Individual
                    2-Enterprise
                    --------------------------------------
                    Enter Number:\s""");

            int accountTypeNum = Input.nextInt(1, 3);

            System.out.print("E-Mail: ");
            email = Input.nextLine();

            for (Account account : accounts) {
                if (account.getUser().getEmail().equals(email)) {
                    System.out.println("This Account Already Exists!!!");
                    continue createAccountLabel;
                }
            }

            System.out.print("Password: ");
            password = Input.nextLine();
            System.out.print("Name: ");
            name = Input.nextLine();
            System.out.print("Surname: ");
            surName = Input.nextLine();
            System.out.print("Job: ");
            job = Input.nextLine();
            System.out.print("Age: ");
            age = Input.nextInt();

            switch (accountTypeNum) {
                case 1 -> accounts.add(new Individual(new User(name, surName, email, password, job, getDate(), age)));
                case 2 -> accounts.add(new Enterprise(new User(name, surName, email, password, job, getDate(), age)));
            }

            System.out.println("New Account Have Created!");
            break;
        }
    }

    public static String getDate() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return date.format(formatter);
    }

    public static boolean isLoggedIn(String email, String password) {
        for (Account account : accounts) {
            if (account.getUser().getEmail().equals(email)) {
                if (account.getUser().getPassword().equals(password)) {
                    account.getUser().setLastLogInDate(getDate());
                    loggedInAccount = account;
                    System.out.println("You Logged In!");
                    return true;
                }
            }
        }
        System.out.println("Email or Password Incorrect!");
        return false;
    }

    public static Account getLoggedInAccount() {
        return loggedInAccount;
    }

    public static void setNullLoggedIntAccount() {
        loggedInAccount = null;
    }
}
