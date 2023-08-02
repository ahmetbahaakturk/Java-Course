import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Distance In Kilometer: ");
        double kilometer = scanner.nextDouble();
        double price = 10;

        price += kilometer * (2.2);

        if(price < 20){
            System.out.println("Price: " + 20);
        }
        else {
            System.out.println("Price: " + price);
        }
    }
}