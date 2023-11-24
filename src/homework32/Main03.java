package homework32;

import java.util.Scanner;

public class Main03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Введите число от 1 до 10");
      int number = scanner.nextInt();
      if (1 <= number && number <= 10) {
        System.out.println("Вы ввели " + number + " Спасибо !");
        break;
      }
    }
  }
}


