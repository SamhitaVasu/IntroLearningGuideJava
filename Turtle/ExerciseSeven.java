import processing.core.PApplet;

public class ExerciseSeven extends PApplet {
  public static Turtle yertle;

  @Override
  public void setup() {
    size(600, 600); // set the size of the window
    noLoop();
    background(255); // set the background color

    yertle = new Turtle(this); // create a new turtle


    // Move yertle to start at upper right corner
    yertle.penup();
    yertle.setDirection(180);
    yertle.forward(300);
    yertle.turnRight(90);
    yertle.forward(300);
    yertle.turnRight(90);
    yertle.pendown();

    for (int counter = 0; counter < 8; counter++) { // Makes Octagon, not whole
                                                    // thing will show because
                                                    // yertle starts at top
                                                    // right corner
      yertle.forward(10);
      yertle.penup(); // .penup() and .pendown() make octagon dashed
      yertle.forward(10);
      yertle.pendown();
      yertle.forward(10);
      yertle.penup();
      yertle.forward(10);
      yertle.pendown();
      yertle.forward(10);
      yertle.turnRight(45);
    }
  }

  public static void main(String[] args) {
    PApplet.main(new String[] { "Main" });
  }
}