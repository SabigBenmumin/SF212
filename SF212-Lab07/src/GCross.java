import acm.graphics.*;

class GCross extends GPolygon {
	public GCross(double size) {
		double step = size / 3;
		addVertex(step/2, -step/2);
		addEdge(0, -step);
		addEdge(-step, 0);
		addEdge(0, step);
		addEdge(-step,0);
		addEdge(0,step);
		addEdge(step,0);
		addEdge(0,step);
		addEdge(step,0);
		addEdge(0,-step);
		addEdge(step,0);
		addEdge(0,-step);
	}
}
