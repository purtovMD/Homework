package homework26.task02;

public class Laptop {
  String model;
  double weight;
  String cpu;
  double cpuFrequency;
  int ram;
  String videoCard;
  int videoCardMemory;


  public Laptop(String model, double weight, String cpu, double cpuFrequency, int ram, String videoCard, int videoCardMemory){
    this.model = model;
    this.weight = weight;
    this.cpu = cpu;
    this.cpuFrequency = cpuFrequency;
    this.ram = ram;
    this.videoCard = videoCard;
    this.videoCardMemory = videoCardMemory;
  }

  public Laptop() {
    this("MSI", 1.86, "Intel Core i5", 1.5, 16, "RTX 2050", 4  );
  }
}
