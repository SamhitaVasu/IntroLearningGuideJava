public class Circle {
  int radius, centerXCoord, centerYCoord;

  // Set radius and center when creating object
  Circle(int r, int xCoord, int yCoord) {
    radius = r;
    centerXCoord = xCoord;
    centerYCoord = yCoord;
  }

  // Set radius after object is created
  public void setRadius(int newRad) {
    radius = newRad;
  }

  // Get radius
  public int getRadius() {
    return radius;
  }

  // Set center coord after object is created
  public void setCenter(int xCoord, int yCoord) {
    centerXCoord = xCoord;
    centerYCoord = yCoord;
  }

  // Get center coord
  public int getXCenter() {
    return centerXCoord;
  }

  public int getYCenter() {
    return centerYCoord;
  }

  // Get the area of the circle
  public double getArea() {
    return 3.14 * radius * radius;
  }

  // Get the circumference of the circle
  public double getCircumference() {
    return 3.14 * radius * 2;
  }

  public double getDistanceTo(Circle otherCircle) {
    int otherX = otherCircle.getXCenter();
    int otherY = otherCircle.getYCenter();
    int distBtwnXs = centerXCoord - otherX;
    int distBtwnYs = centerYCoord - otherY;
    double distance = Math
        .sqrt(distBtwnXs * distBtwnXs + distBtwnYs * distBtwnYs);
    return distance;
  }
}