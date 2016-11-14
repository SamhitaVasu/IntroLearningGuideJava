package problemSet;

public class ProblemEight {

  public static void main(String[] args) {
    double average = findAverage(9, 10, 11);
    System.out.println("The average of 9, 10, and 11 is: " + average);
  }

  public static double findAverage(double a, double b, double c) {
    return (a + b + c) / 3;
  }
}
