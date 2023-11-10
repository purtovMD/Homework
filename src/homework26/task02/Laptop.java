package homework26.task02;

public class Laptop {

  String model;
  String operatingSystem;
  String screeResolution;
  double weight;
  String hardDisk;
  String cpu;
  int ram;
  String videoCard;


  public Laptop(String model, String operatingSystem, String screeResolution, double weight,
      String cpu, String hardDisk, int ram, String videoCard) {
    this.model = model;
    this.operatingSystem = operatingSystem;
    this.screeResolution = screeResolution;
    this.weight = weight;
    this.cpu = cpu;
    this.hardDisk = hardDisk;
    this.ram = ram;
    this.videoCard = videoCard;
  }

  public Laptop() {
    this("MSI", "No OS", "1920x1080 144Hz", 1.86, "Intel Core i5 1.5 GHz", "SSD 512GB", 16,
        "RTX 2050 4GB");
  }
}
