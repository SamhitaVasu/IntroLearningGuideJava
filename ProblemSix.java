package problemSet;

public class ProblemSix {

  public static void main(String[] args) {
    boolean answer = isInRange(5, 1, 10);
    System.out.println(answer);
  }

  // Checks whether double a is in a given range
  public static boolean isInRange(double num, double limitSmall,
      double limitBig) {
    if (num > limitSmall && num < limitBig) {
      return true;
    } else {
      return false;
    }
  }
}
