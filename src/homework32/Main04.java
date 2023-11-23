package homework32;

import java.util.Scanner;

public class Main04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[scanner.nextInt()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
