import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int math, physics, turkish, chemistry, music;

        System.out.println("Please Enter Your Notes In Order");

        System.out.print("Math: ");
        math = isValid(scanner.nextInt());

        System.out.print("Physics: ");
        physics = isValid(scanner.nextInt());

        System.out.print("Turkish: ");
        turkish = isValid(scanner.nextInt());

        System.out.print("Chemistry: ");
        chemistry = isValid(scanner.nextInt());

        System.out.print("Music: ");
        music = isValid(scanner.nextInt());

        int gradeAverage = (math + physics + turkish + chemistry + music) / 5;
        if (gradeAverage >= 55) {
            System.out.println("Class Passed!");
        } else {
            System.out.println("Class Failed!");
        }
        System.out.println(gradeAverage);
    }

    public static int isValid(int a) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (a >= 0 && a <= 100) {
                break;
            } else {
                System.out.println("Enter a Grade Between 0 And 100");
                a = scanner.nextInt();
            }
        }
        return a;
    }
}