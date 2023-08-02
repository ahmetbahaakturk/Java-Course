import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int[] loweruppercounter = {0,20,10};
    public static int[] temploweruppercounter = loweruppercounter;
    public static int score = 0;
    public static int highestscore = 0;

    public static void main(String[] args) {
        menu();

    }

    static void menu(){
        int menum;
        while (true) {
            System.out.println("1 - Play\n2 - Settings\n3 - Highest Score");
            menum = getInt();
            switch (menum){
                case 1 : play();
                    break;
                case 2 : settings();
                    break;
                case 3 : highestscore();
                    break;
            }

        }

    }

    static void play(){
        Random random = new Random();
        int answer;
        loweruppercounter = temploweruppercounter;
        System.out.println(loweruppercounter[0] + " between " + loweruppercounter[1]);
        answer = random.nextInt(loweruppercounter[1] - loweruppercounter[0]) + loweruppercounter[0];

        while(loweruppercounter[2] > 0){

                if(answer == getInt()){
                    System.out.println("True");
                    loweruppercounter[2]--;
                    score++;
                    answer = random.nextInt(loweruppercounter[1] - loweruppercounter[0]) + loweruppercounter[0];
                }
                else{
                    loweruppercounter[2]--;
                }
        }
        System.out.println("Your total score is " + score);
        if(score > highestscore){
            highestscore = score;
        }
        score = 0;
        loweruppercounter = temploweruppercounter;
    }

    static void settings(){
        int i = 0;
        String[] settings = {"Lowerbound:","Upperbound:","Count:"};
        int[] settingsnum = {0, 0, 0};

        while(true){

                System.out.print(settings[i]);
            settingsnum[i] = getInt();
            i++;
            if(i == 3){
                break;
            }
        }
        temploweruppercounter = settingsnum;
    }

    static void highestscore(){
        System.out.println("Your highest score is " + highestscore);
    }

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            return Integer.parseInt(scanner.nextLine());
        }
        else{
            System.out.println("Please enter a valid number:");
            return getInt();
        }
    }
}