import processing.core.PApplet;

public class ExerciseFour extends PApplet {
  public static Turtle yertle;

  @Override
  public void setup() {
    size(1000, 600); // set the size of the window
    noLoop();
    background(255); // set the background color

    yertle = new Turtle(this); // create a new turtle

    yertle.setThickness(5);
    yertle.setDirection(180); // face left

    for (int c = 0; c < 8; c++) { // Makes dotted line
      yertle.penup();
      yertle.forward(20);
      yertle.pendown();
      yertle.forward(20);
    }
  }

  public static void main(String[] args) {
    PApplet.main(new String[] { "ExerciseFour" });
  }
}
