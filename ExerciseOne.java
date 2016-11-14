import processing.core.PApplet;

public class ExerciseOne extends PApplet {
  public static Turtle yertle;

  @Override
  public void setup() {
    size(1000, 600); // set the size of the window
    noLoop();
    background(255); // set the background color

    yertle = new Turtle(this);	// create a new turtle

    yertle.setThickness(5);

    for (int counter = 0; counter < 4; counter++) { // Makes Square
      yertle.forward(100);
      yertle.turnRight(90);
    }

  }

  public static void main(String[] args) {
    PApplet.main(new String[] { "ExerciseOne" });
  }
}