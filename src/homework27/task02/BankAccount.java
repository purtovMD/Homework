package homework27.task02;

public class Bank_Account {

  private final String accountNumber;
  private double amountOfMoney;

  public Bank_Account(String accountNumber) {
    this.accountNumber = accountNumber;
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
