import acm.graphics.GPolygon;

public class GHexagon extends GPolygon {

  public GHexagon(double side) {
    addVertex(-side, 0);
    int angle = 60;
    for (int i = 0; i < 6; i++) {
      addPolarEdge(side, angle);
      angle -= 60;
    }
  }

}
