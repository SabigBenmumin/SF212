// Name (in English): Sabig Benmumin
// ID: 6510742197

import java.awt.event.MouseEvent;

import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q1 extends GraphicsProgram {
  private static final int SIZE = 50;

  public void run() {
    addMouseListeners();
    add(new GTriangle(getWidth() / 4), getWidth() / 2, getHeight() / 2);
  }

  // YOUR CODE
  public void mousePressed(MouseEvent e) {
	  GTriangle tri = new GTriangle(SIZE);
	  tri.setFilled(true);
	  tri.setColor(RandomGenerator.getInstance().nextColor());
	  add(tri, e.getX(), e.getY());
  }
  
}

class GTriangle extends GPolygon {
  public GTriangle(double size) {
    // YOUR CODE
    addVertex(0, -size);
    addVertex(-Math.sqrt(3) / 2 *size , size / 2);
    addVertex(Math.sqrt(3) / 2 *size , size / 2);
  }
}