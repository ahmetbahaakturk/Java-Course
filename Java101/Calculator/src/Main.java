import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers in order");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("1-Summation\n2-Deducation\n3-Multiplication\n4-Division");
        int opNum = scanner.nextInt();

        switch (opNum){
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println((double)num1 / num2);
                break;
        }
    }
}