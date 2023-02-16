// I can't even read this myself, sorry.

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int number = scan.nextInt();
        String[] days = new String[number];
        StringBuilder daysCount = new StringBuilder();
        days[0] = scan.nextLine();
        for (int i = 0; i < days.length; i++) {
            days[i] = scan.nextLine();
        }
        for (String day : days) {
            for (int j = 0; j < day.length(); j++) {
                if ((day.charAt(j)) == ('Y')) {
                    daysCount.append(j + 1);
                }
            }
        }
        int[] resultList = {1, 0, 2, 0, 3, 0, 4, 0, 5, 0};
        for (int i = 0; i < daysCount.length(); i++) {
            for (int pos = 0; pos < resultList.length; pos += 2) {
                if (resultList[pos] == Character.getNumericValue(daysCount.charAt(i))) {
                    resultList[pos+1] += 1;
                }
            }
        }
        int maxNum = 0;
        StringBuilder maxIndex = new StringBuilder();
        for (int i = 1; i < resultList.length; i+=2) {
            if (resultList[i] > maxNum) {
                maxNum = resultList[i];
                maxIndex = new StringBuilder(Integer.toString(resultList[i-1]));
            } else if (resultList[i] == maxNum) {
                maxIndex.append(",").append(resultList[i - 1]);
            }
        }
        System.out.println(maxIndex);
    }
}
