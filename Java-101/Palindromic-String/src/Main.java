import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.println("Enter String Below");
        str = scanner.nextLine();
        System.out.println((isPalindromic(str, invertString(str))) ? "Palindromic" : "Not Palindromic");
        System.out.print("Inverted String: " + invertString(str));
    }

    static String invertString(String str) {
        String invertedStr = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            invertedStr += str.charAt(i);
        }
        return invertedStr;
    }

    static boolean isPalindromic(String str, String invertedStr) {
        return str.equals(invertedStr);
    }
}