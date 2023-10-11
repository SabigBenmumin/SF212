import acm.graphics.GPolygon;
import acm.program.GraphicsProgram;
import java.awt.*;

public class Diamond2 extends GraphicsProgram {
  public void run() {
    GPolygon diamond = createDiamond(100, 75);
    diamond.setFilled(true);
    diamond.setFillColor(Color.MAGENTA);
    add(diamond, getWidth() / 2, getHeight() / 2);
  }

  private GPolygon createDiamond(double width, double height) {
    GPolygon diamond = new GPolygon();
    diamond.addVertex(-width / 2, 0);
    diamond.addEdge(width / 2, -height / 2);
    diamond.addEdge(width / 2, height / 2);
    diamond.addEdge(-width / 2, height / 2);
    diamond.addEdge(-width / 2, -height / 2);
    return diamond;
  }

}
