package pacman.model;

import java.util.Set;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import pacman.constant.Direction;
import pacman.constant.FileName;
import pacman.constant.MapConfig;

public class Pacman extends MovableGrid {

  public Pacman(Map map, double row, double column) {
    super(map, row, column);

    // set image
    Image image = new Image(FileName.IMAGE_PACMAN);
    this.setFill(new ImagePattern(image));
  }

  @Override
  public void handleMove(Direction direction) {
    switch (direction) {
      case UP:
        Pacman.this.setRotate(270);
        break;
      case DOWN:
        Pacman.this.setRotate(90);
        break;
      case LEFT:
        Pacman.this.setRotate(180);
        break;
      case RIGHT:
        Pacman.this.setRotate(0);
        break;
    }
    Pacman.this.checkTouchingCookies();
  }

  private void checkTouchingCookies() {
    Set<Cookie> cookies = getParentMap().getCookies();
    for (Cookie cookie : cookies) {
      if (isTouching(cookie, MapConfig.COOKIE_PADDING)) {
        cookie.hide();
        return;
      }
    }
  }
}