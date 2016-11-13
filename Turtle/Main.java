
// Ignore this file, it is the default one given and is used to test out
// commands from turtle.java
// Will delete later

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
    yertle.drawNGon(9, 60);

    myrtle.drawEquiTriangle(80);

    myrtle.setColor(color(255, 0, 255));
    myrtle.drawSquare(50);
    myrtle.drawHexagon(70);
  }

  public static void main(String[] args) {
    PApplet.main(new String[]{"Main"});
  }
}