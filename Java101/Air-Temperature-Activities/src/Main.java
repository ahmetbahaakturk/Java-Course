import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp;

        System.out.print("Enter The Air Temperature: ");
        temp = scanner.nextInt();

        if (temp < 5)
            System.out.println("You Can Ski!");
        else if (temp <= 15)
            System.out.println("You Can Go to The Cinema!");
        else if (temp <= 25)
            System.out.println("You Can Have A Picnic!");
        else
            System.out.println("You Can Swim!");
    }
}