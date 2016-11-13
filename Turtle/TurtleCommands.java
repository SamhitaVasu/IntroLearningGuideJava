
// This program uses 4 newly created Turtle commands
import processing.core.PApplet;

public class TurtleCommands extends PApplet {
  public static Turtle yertle;

  @Override
  public void setup() {
    int canvasSize = 600;
    size(canvasSize, canvasSize); // set the size of the window
    noLoop();
    background(255); // set the background color

    yertle = new Turtle(this); // create a new turtle

    yertle.drawEquiTriangle(20); // Draw an equilateral triangle w/ sidelengths
    // of 20
    yertle.drawSquare(30); // Draw a square w/ sidelengths of 30
    yertle.drawHexagon(30); // Draw a hexagone w/ sidelengths of 30
    yertle.drawNGon(9, 40); // Draw a shape w/ 9 sides andsidelengths of 40
  }

  public static void main(String[] args) {
    PApplet.main(new String[] { "TurtleCommands" });
  }
}