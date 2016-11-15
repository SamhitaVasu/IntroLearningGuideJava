package problemSet;

public class ProblemSeven {

  public static void main(String[] args) {
    boolean increase = isInOrder(1, 2, 3);
    System.out.println(increase);
    increase = isInOrder(3, 2, 1);
    System.out.println(increase);
  }

  // Checks whether three given integers are in increasing order
  public static boolean isInOrder(int a, int b, int c) {
    if (a < b && b < c) {
      return true;
    } else {
      return false;
    }
  }
}
