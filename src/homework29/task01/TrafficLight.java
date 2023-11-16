package homework29.task01;

public class TrafficLight {

  private TrafficLightColor currentColor;

  public TrafficLightColor getCurrentColor() {
    return currentColor;
  }

  public void setCurrentColor(TrafficLightColor currentColor) {
    this.currentColor = currentColor;
  }

  public TrafficLight() {
    this.currentColor = TrafficLightColor.RED;
  }

  public boolean canCrossTheRoad() {
    return currentColor == TrafficLightColor.GREEN;
  }

}
