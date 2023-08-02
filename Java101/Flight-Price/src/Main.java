import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age, km, flightType;
        double price;

        System.out.print("Your Age: ");
        age = isPositive(scanner.nextInt());

        System.out.print("Flight Distance: ");
        km = isPositive(scanner.nextInt());

        System.out.println("Flight Type\n(1 => One Direction , 2 => Double Direction)");
        flightType = isValid(scanner.nextInt());

        price = priceCalculator(age, flightType, km);
        System.out.println(price);
    }

        /**-------------Valid Number Control-------------**/

    public static int isValid(int a) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (a == 1 || a == 2) {
                break;
            } else System.out.println("Invalid Data Entry!");
            a = scanner.nextInt();
        }
        return a;
    }

         /**-------------Positive Number Control-------------**/

    public static int isPositive(int a) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (a > 0) {
                break;
            } else {
                System.out.println("Invalid Data Entry!");
                a = scanner.nextInt();
            }
        }
        return a;
    }

        /**-------------Calculating Flight Price-------------**/

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