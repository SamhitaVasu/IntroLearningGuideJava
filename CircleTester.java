
public class CircleTester {

  public static void main(String[] args) {
    // Create circles
    Circle c1 = new Circle(5, 1, 1);
    Circle c2 = new Circle(7, 0, 0);

    System.out.println("C1's radius is:" + c1.getRadius()
    + " and C2's radius is: " + c2.getRadius());
    c1.setRadius(c2.getRadius());
    System.out.println("C1's radius is:" + c1.getRadius()
    + " and C2's radius is: " + c2.getRadius());
    System.out
    .println("C1's center is:" + c1.getXCenter() + ":" + c1.getYCenter() +
        " and C2's center is: " + c2.getXCenter() + ":" + c2.getYCenter());
    c2.setCenter(8, 7);
    System.out
    .println("C1's center is:" + c1.getXCenter() + ":" + c1.getYCenter()
    + " and C2's center is: " + c2.getXCenter() + ":"
    + c2.getYCenter());
    System.out.println("C1's circumference is:" + c1.getCircumference()
    + " and C2's circumference is: " + c2.getCircumference());
    System.out.println(
        "C1's area is: " + c1.getArea() + " and C2's area is: " + c2.getArea());
    System.out
        .println("The distance from C1 to C2 is: " + c1.getDistanceTo(c2));
  }
}
