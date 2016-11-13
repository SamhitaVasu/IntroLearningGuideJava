import processing.core.PApplet;

public class ExerciseEight extends PApplet {
  public static Turtle yertle;

  @Override
  public void setup() {
    int canvasSize = 600;
    size(canvasSize, canvasSize); // set the size of the window
    noLoop();
    background(255); // set the background color

    yertle = new Turtle(this); // create a new turtle

    // Move yertle to start at upper right corner
    yertle.penup();
    yertle.setDirection(180);
    yertle.forward(canvasSize / 2);
    yertle.turnRight(90);
    yertle.forward(canvasSize / 2);
    yertle.turnRight(90);
    yertle.pendown();

    // Make 10x10 square graph paper grid on screen
    int sideLength = 10;
    // horizontal zig-zag
    for (int count = 0; count < canvasSize / (2 * sideLength); count++) {
      yertle.forward(canvasSize);
      yertle.turnRight(90);
      yertle.forward(sideLength);
      yertle.turnRight(90);
      yertle.forward(canvasSize);
      yertle.turnLeft(90);
      yertle.forward(sideLength);
      yertle.turnLeft(90);
    }

    // Setup for vertical zig-zag
    yertle.forward(canvasSize);
    yertle.turnLeft(90);

    // Vertical zig-zag
    for (int count = 0; count < canvasSize / (2 * sideLength); count++) {
      yertle.forward(canvasSize);
      yertle.turnLeft(90);
      yertle.forward(sideLength);
      yertle.turnLeft(90);
      yertle.forward(canvasSize);
      yertle.turnRight(90);
      yertle.forward(sideLength);
      yertle.turnRight(90);
    }

    // Last Line
    yertle.forward(canvasSize);
  }

  public static void main(String[] args) {
    PApplet.main(new String[] { "ExerciseEight" });
  }
}