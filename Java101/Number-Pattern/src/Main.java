import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int num = scanner.nextInt();
        numberPattern(num, num, -1);
    }

    static void numberPattern(int constantNum, int variableNum, int sign) {
        if (variableNum > constantNum) {
            return;
        }
        if (variableNum < 1) {
            sign *= -1;
        }
        System.out.println(variableNum + " ");
        numberPattern(constantNum, variableNum + sign * 5, sign);
    }
}