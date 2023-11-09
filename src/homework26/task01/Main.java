package homework26.task01;

public class Main {

  public static void printHumanInfo(Human human) {
    System.out.println("Привет, меня зовут " + human.name + ", мне " + human.age + " лет.");
  }

  public static void main(String[] args) {
    Human human = new Human("Настя", 19);
    printHumanInfo(human);
  }
}
