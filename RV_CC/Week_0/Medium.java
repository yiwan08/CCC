import java.util.Scanner;

public class Main
{
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		q2();
	}
	
	public static void q2() {
	    System.out.println("Enter Integer: ");
	    int userInput = scan.nextInt();
        for (int j = 0; j < userInput; j++) {
            for (int k = 0; k < userInput - j - 1; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < j + 1; k++) {
                System.out.print("##");
            }
            System.out.println("");
        }
	}
}

>>> 3
    ##
   ####
  ######
