// This program creates an object of the class Sensor and runs various methods
// of Sensor
public class NewSensorObject {

  public static void main(String args[]) {
    Sensor mySensor = new Sensor();
    mySensor.start();
    int value = mySensor.readValue();
    System.out.println(value);
    long time = mySensor.currentTime();
    System.out.println(time);
  }
}
