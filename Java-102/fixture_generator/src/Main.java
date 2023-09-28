import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> teams = new LinkedList<>();

        System.out.print("Number of Teams: ");
        int n = Integer.parseInt(scanner.nextLine());
        int matchPerRound = n / 2;

        for (int i = 0; i < n; ++i) {
            System.out.print("Team Name: ");
            teams.add(scanner.nextLine());
        }

        if (n % 2 != 0) {
            ++n;
            teams.add(null);
        }

        Collections.shuffle(teams);

        int matchNum = (n * (n - 1));
        int roundNum = matchNum / (n / 2);

        String[] host = new String[matchNum / 2];
        String[] away = new String[matchNum / 2];

        for (int i = 0, a = 0; i < n - 1; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (teams.get(j) != null && teams.get(n - 1 - j) != null) {
                    host[a] = teams.get(j);
                    away[a] = teams.get(n - 1 - j);
                    a++;
                }
            }
            Collections.rotate(teams.subList(1, n), 1);
        }

        for (int i = 0, a = 0, b = 0; i < roundNum; ) {
            System.out.println("\n" + (++i) + ". Round");
            for (int j = 0; j < matchPerRound; j++, a++) System.out.println(host[a] + " vs " + away[a]);
            System.out.println("\n" + (++i) + ". Round");
            for (int j = 0; j < matchPerRound; j++, b++) System.out.println(away[b] + " vs " + host[b]);
        }
    }
}