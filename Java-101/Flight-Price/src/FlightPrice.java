import java.util.Scanner;

public class FlightPrice {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int age, km, flightType;
        double price;

        System.out.print("Your Age: ");
        age = isPositive();

        System.out.print("Flight Distance: ");
        km = isPositive();

        System.out.println("Flight Type\n(1 => One Direction , 2 => Double Direction)");
        flightType = isValid();

        scanner.close();

        price = priceCalculator(age, flightType, km);
        System.out.println(price);
    }

    /*-------------Valid Number Control-------------*/

    public static int isValid() {
        int a;
        boolean isValid = false;

        do {
            a = scanner.nextInt();
            if (a == 1 || a == 2) {
                isValid = true;
            } else {
                System.out.println("Given Number Must Be 1 Or 2!");
            }
        } while (!isValid);

        return a;
    }

    /*-------------Positive Number Control-------------*/

    public static int isPositive() {
        int a;
        boolean isPositive = false;

        do {
            a = scanner.nextInt();
            if (a > 0) {
                isPositive = true;
            } else {
                System.out.println("Given Number Must Be Positive!");
            }
        } while (!isPositive);

        return a;
    }

    /*-------------Calculating Flight Price-------------*/

    public static double priceCalculator(int age, int flightType, int km) {
        double price;

        if (flightType == 2) {
            price = km * 0.16;
        } else {
            price = km * 0.1;
        }

        if (age < 12) {
            price *= 0.5;
        } else if (age < 24) {
            price *= 0.9;
        } else if (age > 65) {
            price *= 0.7;
        }
        return price;
    }
}