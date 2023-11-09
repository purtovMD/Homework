package homework26.task02;

public class Main {

  public static void printLaptopInfo(Laptop laptop) {
    System.out.println("Model: " + laptop.model);
    System.out.println("Weight: " + laptop.weight + "kg");
    System.out.println("CPU: " + laptop.cpu);
    System.out.println("CPU frequency: " + laptop.cpuFrequency + "GHz");
    System.out.println("RAM: " + laptop.ram + "GB");
    System.out.println("Video card: " + laptop.videoCard);
    System.out.println("Video card memory: " + laptop.videoCardMemory + "GB");
  }

  public static void main(String[] args) {
    Laptop laptop = new Laptop("Asus", 2.2, "Ryzen 7", 3.2, 16, "RTX4060", 8);
    printLaptopInfo(laptop);
    System.out.println();

    Laptop laptop1 = new Laptop();
    printLaptopInfo(laptop1);
  }

}
