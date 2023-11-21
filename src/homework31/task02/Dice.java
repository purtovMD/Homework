package homework31.task02;

import java.util.Random;
import java.util.Scanner;

public class Dice {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Это программа выкидывает игральные кубики.");
    System.out.print("Сколько кубиков выкидывать: ");
    int cube = scanner.nextInt();

    if (cube == 1) {
      int randomResult = 1 + random.nextInt(6 - 1);
      System.out.println("Кубик: " + randomResult);
    } else if (cube == 2) {
      int randomResult1 = 1 + random.nextInt(6 - 1);
      int randomResult2 = 1 + random.nextInt(6 - 1);
      System.out.println("Кубик 1: " + randomResult1);
      System.out.println("кубик 2: " + randomResult2);
    } else {
      System.out.println("Нет столько кубиков.");
    }
  }
}
