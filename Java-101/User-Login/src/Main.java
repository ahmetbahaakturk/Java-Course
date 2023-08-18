import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "user.name", password = "password", inUsername, inPassword;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Username: ");
            inUsername = scanner.nextLine();

            System.out.print("Password: ");
            inPassword = scanner.nextLine();

            if (inUsername.equals(username)) {
                if (inPassword.equals(password)) {
                    System.out.println("Welcome!");
                    break;
                } else {
                    System.out.println("Password is wrong! Would you like to reset password?\n1-Yes\n2-No");
                    boolean situation = Integer.parseInt(scanner.nextLine()) == 1;
                    if (situation) {
                        System.out.print("Please enter your new password:");
                        while (true) {
                            String newPassword = scanner.nextLine();
                            if (newPassword.equals(password)) {
                                System.out.println("Cannot be the same as your old password! Please enter again");


                            } else {
                                password = newPassword;
                                System.out.println("Your password has been changed successfully!");
                                break;
                            }
                        }
                    }
                }
            } else {
                System.out.println("Your Username Is Wrong");
            }
        }
    }
}