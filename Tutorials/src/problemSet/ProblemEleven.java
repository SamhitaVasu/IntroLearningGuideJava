package problemSet;

public class ProblemEleven {

  public static void main(String[] args) {
    getLetterGrade(100);
    getLetterGrade(40);
    getLetterGrade(89.999);
  }

  // Gets the letter grade given the percentage
  public static char getLetterGrade(double percentage) {
    if (percentage > 100) {
      System.out.println("Ha! Nice try!");
      return 'n';
    } else if (percentage >= 90) {
      System.out.println("did you expect Anything else?");
      return 'A';
    } else if (percentage >= 80) {
      System.out.println("BBBad");
      return 'B';
    } else if (percentage >= 70) {
      System.out.println("C-riously?");
      return 'C';
    } else if (percentage >= 60) {
      System.out.println("this is just saD");
      return 'D';
    } else {
      System.out.println("awFul");
      return 'F';
    }
  }
}
