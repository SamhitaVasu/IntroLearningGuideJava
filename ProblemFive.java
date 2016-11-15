package problemSet;

public class ProblemFive {

  public static void main(String[] args) {
    double sum = limitSum(1, 2, 3, 4); // sum should be 10.0
    System.out.println(sum);
    sum = limitSum(-1, 5, -50, 45); // sum should be 0.0 (actual sum is -1)
    System.out.println(sum);
    sum = limitSum(10, 700, 9, 9000); // sum should be 50.0 (actual sum is 9719)
    System.out.println(sum);
  }

  // Finds the sum of four doubles
  public static double limitSum(double a, double b, double c, double d) {
    double sum = a + b + c + d;
    if (sum > 50) { // if sum is greater than 50, return 50
      return 50;
    } else if (sum < 0) { // if sum is less that 0, return 0
      return 0;
    } else { // otherwise return the actual sum
      return sum;
    }
  }
}
