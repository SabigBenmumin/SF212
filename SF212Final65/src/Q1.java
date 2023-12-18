// Name (in English):
// ID: 

import java.awt.event.MouseEvent;

import acm.graphics.GMath;
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
  
}

class GTriangle extends GPolygon {
  public GTriangle(double size) {
    // YOUR CODE
    
  }
}