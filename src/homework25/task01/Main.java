package homework25.task01;

public class Main {

  public static void main(String[] args) {
    Human Настя = new Human();
    Настя.name = "Настя";
    Настя.age = 36;

    Human Вадим = new Human();
    Вадим.name = "Вадим";
    Вадим.age = 19;

    Настя.introduce();
    Вадим.introduce();
  }

}
