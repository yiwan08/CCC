// Return Pressure = 5 * B - 400
// Return if above, at, below sea level.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int B = myObj.nextInt();
    myObj.close();
    
    int Pressure = B * 5 - 400;
    System.out.println(Pressure);
    
    if (Pressure > 100) {
      System.out.println(-1);
    } else if (Pressure == 100) {
      System.out.println(0);
    } else {
      System.out.println(1);
    }
  }
}

>>> 99
  95
  1
