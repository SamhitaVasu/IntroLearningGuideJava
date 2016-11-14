package problemSet;

public class ProblemNine {

  public static void main(String[] args) {
    countdown(10);
    countdown(5);
  }

  // counts down to 0 from a certain starting point
  public static void countdown(int start) {
    if (start < 1) {
      return;
    }
    else {
      while(start > 0) {
        System.out.println(start);
        start--;
      }
      System.out.println("blastoff!");
    }
  }
}
