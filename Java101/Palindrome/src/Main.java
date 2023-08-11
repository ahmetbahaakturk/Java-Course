import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        System.out.println((isPalindrome(scanner.nextInt())) ? "Palindrome" : "Not Palindrome");
    }

    static boolean isPalindrome(int num) {
        int originalNum = num, reversedNum = 0;
        while (num != 0) {
            reversedNum = reversedNum * 10 + (num % 10);
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversedNum);
        return originalNum == reversedNum;
    }
}