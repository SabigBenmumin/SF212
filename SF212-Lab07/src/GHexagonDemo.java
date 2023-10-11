import java.awt.Color;

import acm.program.GraphicsProgram;

public class GHexagonDemo extends GraphicsProgram {

  public void run() {
    GHexagon hex1 = new GHexagon(50);
    add(hex1, getWidth() / 4, getHeight() / 2);

    GHexagon hex2 = new GHexagon(100);
    hex2.setFilled(true);
    hex2.setFillColor(Color.RED);
    add(hex2, getWidth() * 3 / 4, getHeight() / 2);
  }
}
