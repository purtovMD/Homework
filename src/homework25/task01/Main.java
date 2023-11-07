package homework25.task01;

public class Main {

  public static void main(String[] args) {
    Human nastja = new Human();
    nastja.name = "Настя";
    nastja.age = 36;

    Human vadim = new Human();
    vadim.name = "Вадим";
    vadim.age = 19;

    vadim.introduce();
    nastja.introduce();
  }

}
