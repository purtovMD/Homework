package homework27.task02;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bank_Account bankAccount = new Bank_Account("123 456 789");

    System.out.println("Номер счета: " + bankAccount.getAccountNumber());

    System.out.print("Пополните счет: ");
    bankAccount.putMoney(scanner.nextDouble());
    System.out.println("Ваш баланс: " + bankAccount.getAmountOfMoney() + " евро");
    System.out.print("Снять со счета: ");
    bankAccount.withdraw(scanner.nextDouble());
    System.out.println("Ваш баланс: " + bankAccount.getAmountOfMoney() + " евро");
    System.out.print("Снять со счета: ");
    bankAccount.withdraw(scanner.nextDouble());
    System.out.println("Ваш баланс: " + bankAccount.getAmountOfMoney() + " евро");


  }
}
