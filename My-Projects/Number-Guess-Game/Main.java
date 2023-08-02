import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int[] lowerUpperCounter = {0, 20, 10};
    public static int[] tempLowerUpperCounter = lowerUpperCounter;
    public static int score = 0;
    public static int highestScore = 0;

    public static void main(String[] args) {
        menu();

    }

    static void menu() {
        int menuNum;
        while (true) {
            System.out.println("1 - Play\n2 - Settings\n3 - Highest Score");
            menuNum = getInt();
            switch (menuNum) {
                case 1:
                    play();
                    break;
                case 2:
                    settings();
                    break;
                case 3:
                    highestScore();
                    break;
            }

        }

    }

    static void play() {
        Random random = new Random();
        int answer;
        lowerUpperCounter = tempLowerUpperCounter;
        System.out.println(lowerUpperCounter[0] + " between " + lowerUpperCounter[1]);
        answer = random.nextInt(lowerUpperCounter[1] - lowerUpperCounter[0]) + lowerUpperCounter[0];

        while (lowerUpperCounter[2] > 0) {

            if (answer == getInt()) {
                System.out.println("True");
                lowerUpperCounter[2]--;
                score++;
                answer = random.nextInt(lowerUpperCounter[1] - lowerUpperCounter[0]) + lowerUpperCounter[0];
            } else {
                lowerUpperCounter[2]--;
            }
        }
        System.out.println("Your total score is " + score);
        if (score > highestScore) {
            highestScore = score;
        }
        score = 0;
        lowerUpperCounter = tempLowerUpperCounter;
    }

    static void settings() {
        int i = 0;
        String[] settings = {"Lower bound:", "Upper bound:", "Count:"};
        int[] settingsNum = {0, 0, 0};

        while (true) {

            System.out.print(settings[i]);
            settingsNum[i] = getInt();
            i++;
            if (i == 3) {
                break;
            }
        }
        tempLowerUpperCounter = settingsNum;
    }

    static void highestScore() {
        System.out.println("Your highest score is " + highestScore);
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return Integer.parseInt(scanner.nextLine());
        } else {
            System.out.println("Please enter a valid number:");
            return getInt();
        }
    }
}