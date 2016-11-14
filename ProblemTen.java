package problemSet;

public class ProblemTen {

  public static void main(String[] args) {
    double dist = distance(5, 6, 7, 8);
    System.out.println(dist);
    dist = distance(0, 0, 0, 1);
    System.out.println(dist);
  }

  // finds the distance between two points (x1, y1) and (x2, y2)
  public static double distance(int x1, int y1, int x2, int y2) {
    return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
  }
}
