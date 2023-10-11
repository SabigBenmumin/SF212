/*
 * File: GStar.java
 * ----------------
 * This file illustrates the strategy of subclassing GPolygon by
 * creating a new GObject class depicting a five-pointed star.
 */
import acm.graphics.*;

/**
 * Defines a new GObject class that appears as a five-pointed star.
 */
public class GStar extends GPolygon {
	/**
	 * Creates a new GStar centered at the origin that fits inside a square of
	 * the specified size.
	 */
	public GStar(double size) {
		double sinTheta = GMath.sinDegrees(18);
		double b = 0.5 * sinTheta / (1.0 + sinTheta);
		double edge = (0.5 - b) * size;
		addVertex(-size / 2, -b * size);
		int angle = 0;
		for (int i = 0; i < 5; i++) {
			addPolarEdge(edge, angle);
			addPolarEdge(edge, angle + 72);
			angle -= 72;
		}
	}

	/**
	 * Creates a new GStar centered at the point (x, y) that fits inside a
	 * square of the specified size.
	 */
	public GStar(double x, double y, double size) {
		this(size);
		setLocation(x, y);
	}
}