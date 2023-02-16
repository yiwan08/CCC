// Check spiciness: this is a very stupid way of doing this problem.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int shu = 0;
        int number = scan.nextInt();
        String[] spicy = new String[number];
        spicy[0] = scan.nextLine();
        for (int i = 0; i < spicy.length; i++) {
            spicy[i] = scan.nextLine();
        }
        for (int i = 0; i < spicy.length; i++) {
            if (spicy[i].equals("Poblano")) {
                shu += 1500;
            }
            if (spicy[i].equals("Mirasol")) {
                shu += 6000;
            }
            if (spicy[i].equals("Serrano")) {
                shu += 15500;
            }
            if (spicy[i].equals("Cayenne")) {
                shu += 40000;
            }
            if (spicy[i].equals("Thai")) {
                shu += 75000;
            }
            if (spicy[i].equals("Habanero")) {
                shu += 125000;
            }
        }
        System.out.println(shu);
    }
}
