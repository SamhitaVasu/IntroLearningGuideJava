import processing.core.PApplet;

public class Main extends PApplet {
  public static Turtle yertle;
  public static Turtle myrtle;

  @Override
  public void setup() {
    size(1000, 600); // set the size of the window
    noLoop();
    background(255); // set the background color

    yertle = new Turtle(this);	// create a new turtle
    myrtle = new Turtle(this);

    yertle.setThickness(5);
    yertle.forward(100);
    yertle.turnRight(90);

    myrtle.setColor(color(255, 0, 255));
    myrtle.forward(200);
    myrtle.turnLeft(5);
  }

  public static void main(String[] args) {
    PApplet.main(new String[]{"Main"});
  }
}