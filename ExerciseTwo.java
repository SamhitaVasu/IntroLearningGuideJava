import processing.core.PApplet;

public class ExerciseTwo extends PApplet {
  public static Turtle myrtle;

  @Override
  public void setup() {
    size(1000, 600); // set the size of the window
    noLoop();
    background(255); // set the background color

    myrtle = new Turtle(this);

    myrtle.setColor(color(255, 0, 255));

    for (int count = 0; count < 3; count++) { // Makes Equilateral Triangle
      myrtle.forward(100);
      myrtle.turnRight(120);
    }
  }

  public static void main(String[] args) {
    PApplet.main(new String[] { "ExerciseTwo" });
  }
}