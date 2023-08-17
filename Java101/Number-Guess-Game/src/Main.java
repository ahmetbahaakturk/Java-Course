import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int randomNum = random.nextInt(0, 100);
    static int predictedNum;

    public static void main(String[] args) {


        System.out.print("Number of Predictions: ");
        int right = scanner.nextInt();
        compareNumber(right);
    }

    static void compareNumber(int right) {
        if (right == 0) {
            System.out.println("Prediction Right is Finished.");
        } else if (setPredictedNum() == randomNum) {
            System.out.println("You Predicted The Right Number!");
        } else if (predictedNum > randomNum) {
            System.out.println("Higher than the Random Number");
            compareNumber(right - 1);
        } else {
            System.out.println("Less than the Random Number!");
            compareNumber(right - 1);
        }
    }

    static int setPredictedNum() {
        predictedNum = scanner.nextInt();
        return predictedNum;
    }
}