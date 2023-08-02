import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();

        String horoscope = horoscopeFind(month, day);
        System.out.println("Your zodiac sign is: " + horoscope);
    }

    public static String horoscopeFind(int month, int day) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 20))
            return "Aries";
        else if ((month == 4 && day >= 21) || (month == 5 && day <= 21))
            return "Taurus";
        else if ((month == 5 && day >= 22) || (month == 6 && day <= 22))
            return "Gemini";
        else if ((month == 6 && day >= 23) || (month == 7 && day <= 22))
            return "Cancer";
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
            return "Leo";
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22))
            return "Virgo";
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22))
            return "Libra";
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 21))
            return "Scorpio";
        else if ((month == 11 && day >= 22) || (month == 12 && day <= 21))
            return "Sagittarius";
        else if ((month == 12 && day >= 22) || (month == 1 && day <= 21))
            return "Capricorn";
        else if ((month == 1 && day >= 22) || (month == 2 && day <= 19))
            return "Aquarius";
        else if ((month == 2 && day >= 20) || (month == 3 && day <= 20))
            return "Pisces";
        else
            return "Invalid date or month!";
    }
}
