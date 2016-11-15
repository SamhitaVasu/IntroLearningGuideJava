package problemSet;

public class ProblemFour {

  public static void main(String[] args) {
    double maximum = max(1, 100);
    System.out.println(maximum + " is the greater number");
    maximum = max(990, 5);
    System.out.println(maximum + " is the greater number");
    maximum = max(50, 50);
    System.out.println(maximum + " is the greater number");
  }

  // return the greater of two doubles
  public static double max(double a, double b) {
    if (a < b) { // if the second number is greater, then return it
      return b;
    } else { // if not, the first number is greater than the second, or they're
      // equal
      // Either way, return the first number
      return a;
    }
  }
}
