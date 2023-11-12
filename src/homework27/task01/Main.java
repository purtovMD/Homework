package homework27.task01;

public class Main {

  public static void main(String[] args) {
    Human human = new Human("Maksim", 26);
    System.out.println(
        "Hello, my name is " + human.getName() + ", i'm " + human.getAge() + ", nice to meet you!");

    System.out.println("One year later");
    human.setAge(27);

    System.out.println("At " + human.getAge() + " I became a developer.");
  }
}
