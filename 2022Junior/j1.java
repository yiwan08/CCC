// Gained value + Lost value + Bonus Value = Score

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int gained = scan.nextInt();
        int lost = scan.nextInt();
        int score = 0;
        score = gained * 50 - lost * 10;
        if (gained > lost) {
            score += 500;
        }
        System.out.println(score);
    }
}
