import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double taxRate = 1.18;

        System.out.print("Product Price: ");

        double productPrice = scanner.nextDouble();
        double taxedPrice = productPrice * taxRate;
        double taxPrice = taxedPrice - productPrice;

        System.out.println("Taxed Price of Product: " + taxedPrice);
        System.out.println("Tax Amount: " + taxPrice);
    }
}