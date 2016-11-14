package problemSet;
// Problem One was not a problem, so solutions start at problem two

public class ProblemTwo {

  public static void main(String[] args) {
    int product = product(1, 2, 3, 4);
    System.out.println(product);
  }

  // This finds the product of four given integers
  public static int product(int a, int b, int c, int d) {
    return a * b * c * d;
  }
}
