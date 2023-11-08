package homework25.task02;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pen pen = new Pen();

    pen.write(scanner.nextLine());
    pen.checkInk();
    System.out.println("Вы поменяли стержень.");
    pen.refill();
    pen.checkInk();

  }

}
