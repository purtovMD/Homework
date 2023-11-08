package homework25.task02;

public class Pen {
  int amountOfInk = 1000;

  public void write(String text) {
    if (amountOfInk >= text.length()) {
      System.out.println(text);
      amountOfInk -= text.length();
    } else {
      System.out.println("Закончились чернила, поменяйте стержень.");
    }
  }
  public void refill() {
    amountOfInk = 1000;
  }

  public void checkInk() {
    System.out.println("У вас осталось чернил: " + amountOfInk);
  }

}
