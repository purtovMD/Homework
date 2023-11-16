package homework27.task02;

public class BankAccount {

  private final String accountNumber;
  private double amountOfMoney;

  public BankAccount(String accountNumber) {
    this.accountNumber = accountNumber;
    this.amountOfMoney = 0;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public double getAmountOfMoney() {
    return amountOfMoney;
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= amountOfMoney) {
      amountOfMoney -= amount;
      System.out.println("Снято " + amount + " евро");
    } else {
      System.out.println("Недостаточно средств.");
    }
  }

  public void putMoney(double amount) {
    if (amount > 0) {
      amountOfMoney += amount;
      System.out.println("Вы пополнили счет: " + amount + " евро");
    } else {
      System.out.println("Пополнение невозможно");
    }
  }
}
