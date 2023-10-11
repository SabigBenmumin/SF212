import acm.graphics.*;

public class GArchedDoor extends GPolygon {
	public GArchedDoor(double width, double height) {
		double lengthOfVerticalEdge = height - width / 2;
		addVertex(-width / 2, 0);
		addEdge(width, 0);
		addEdge(0, -lengthOfVerticalEdge);
		addArc(width, width, 0, 180);
		addEdge(0, lengthOfVerticalEdge);
	}
}
