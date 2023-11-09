package homework26.task02;

public class Main {

  public static void printLaptopInfo(Laptop laptop) {
    System.out.println("Model: " + laptop.model);
    System.out.println("Operating system: " + laptop.operatingSystem);
    System.out.println("Screen resolution: " + laptop.screeResolution);
    System.out.println("Weight: " + laptop.weight + "kg");
    System.out.println("CPU: " + laptop.cpu);
    System.out.println("Hard disk: " + laptop.hardDisk);
    System.out.println("RAM: " + laptop.ram + "GB");
    System.out.println("Video card: " + laptop.videoCard);
    System.out.println();
  }

  public static void main(String[] args) {
    Laptop laptop = new Laptop("Asus", "Windows 11 Home", "2560 x 1440 165Hz", 2.2,
        "Ryzen 7 3.2 GHz", "SSD M.2 1TB", 16, "RTX4060 8GB");
    printLaptopInfo(laptop);
    System.out.println();

    Laptop laptop1 = new Laptop();
    printLaptopInfo(laptop1);
  }

}
