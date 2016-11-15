
// This program contains a class called sensor and its many methods (object in
// in NewSensorObject.java)
import java.util.Scanner;

public class Sensor {
  static long startTime;

  public static void start() {
    startTime = System.currentTimeMillis();
  }

  public static int readValue() {
    System.out.println("Enter value: ");
    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();
    return value;
  }

  public static long currentTime() {
    long timeSinceStart = System.currentTimeMillis() - startTime;
    return timeSinceStart;
  }
}