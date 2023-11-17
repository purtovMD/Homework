package homework29.task01;

public class Main {

  public static void main(String[] args) {
    TrafficLight trafficLight = new TrafficLight();

    System.out.println(trafficLight.getCurrentColor());
    System.out.println(trafficLight.canCrossTheRoad());
    trafficLight.setCurrentColor(TrafficLightColor.GREEN);
    System.out.println(trafficLight.getCurrentColor());
    System.out.println(trafficLight.canCrossTheRoad());
  }
}
