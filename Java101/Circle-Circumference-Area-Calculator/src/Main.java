import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double pi =3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Radius of The Circle: ");
        double r = scanner.nextDouble();
        double circumference = 2*pi*r;
        double area = 2*pi*(r*r);

        System.out.println("Circumference of The Circle: " + circumference);
        System.out.println("Area of The Circle: " + area);
    }
}