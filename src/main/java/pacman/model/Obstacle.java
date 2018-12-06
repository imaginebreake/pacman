package pacman.model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import pacman.constant.Orientation;

public class Obstacle extends Rectangle {

  /** The thickness of the obstacle. */
  public static double THICKNESS = 25;

  /**
   * Initializes the Obstacle object.
   *
   * @param x the x-coordinate of the start point of the obstacle
   * @param y the y-coordinate of the start point of the obstacle
   * @param orientation the orientation of the obstacle, options: <code>Orientation.HORIZONTAL
   *     </code>, <code>
   *     Orientation.HORIZONTAL</code>
   * @param length the length of the obstacle (1 == 100px)
   */
  public Obstacle(double x, double y, Orientation orientation, double length) {
    // set coordinates
    this.setX(x);
    this.setY(y);

    // set height and width
    double longSide = length * Obstacle.THICKNESS;
    double shortSide = Obstacle.THICKNESS;
    if (orientation == Orientation.HORIZONTAL) {
      this.setHeight(shortSide);
      this.setWidth(longSide);
    } else if (orientation == Orientation.VERTICAL) {
      this.setHeight(longSide);
      this.setWidth(shortSide);
    }

    // set color
    this.setFill(Color.CADETBLUE);

    // set stroke width
    this.setStrokeWidth(3);
  }

  public Obstacle(double x, double y) {
    // set coordinates
    this.setX(x * 50);
    this.setY(y * 50);

    // set height and width
    this.setHeight(50);
    this.setWidth(50);
    // set color
    this.setFill(Color.RED);
  }
}
