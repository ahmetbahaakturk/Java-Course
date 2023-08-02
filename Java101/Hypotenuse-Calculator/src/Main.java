import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Side of Triangle: ");
        double firstSide = scanner.nextDouble();

        System.out.print("Second Side of Triangle: ");
        double secondSide = scanner.nextDouble();

        double hypotenuse = Math.sqrt(firstSide*firstSide + secondSide*secondSide);
        double area = (firstSide*secondSide)/2;

        System.out.println("Hypotenuse of Triangle: " + hypotenuse);
        System.out.println("Area of Triangle: " + area);
    }
}