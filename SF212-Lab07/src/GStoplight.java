/**
 * Defines a GObject subclass that displays a stoplight.  The
 * state of the stoplight must be one of the Color values RED,
 * YELLOW, or GREEN.
 */

import acm.graphics.*;
import java.awt.*;

public class GStoplight extends GCompound {

	/** Creates a new Stoplight object, which is initially GREEN */
	public GStoplight() {
		GRect frame = new GRect(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setFilled(true);
		frame.setFillColor(Color.GRAY);
		add(frame, -FRAME_WIDTH / 2, -FRAME_HEIGHT / 2);
		double dy = FRAME_HEIGHT / 4 + LAMP_RADIUS / 2;
		redLamp = createFilledCircle(0, -dy, LAMP_RADIUS);
		add(redLamp);
		yellowLamp = createFilledCircle(0, 0, LAMP_RADIUS);
		add(yellowLamp);
		greenLamp = createFilledCircle(0, dy, LAMP_RADIUS);
		add(greenLamp);
		setColor(Color.GREEN);
	}

	/** Sets the state of the stoplight */
	public void setColor(String color) {
		if (color.equals("RED")) {
			redLamp.setFillColor(Color.RED);
			yellowLamp.setFillColor(Color.GRAY);
			greenLamp.setFillColor(Color.GRAY);
		} else if (color.equals("YELLOW")) {
			redLamp.setFillColor(Color.GRAY);
			yellowLamp.setFillColor(Color.YELLOW);
			greenLamp.setFillColor(Color.GRAY);
		} else if (color.equals("GREEN")) {
			redLamp.setFillColor(Color.GRAY);
			yellowLamp.setFillColor(Color.GRAY);
			greenLamp.setFillColor(Color.GREEN);
		}
	}

	/* Creates a filled circle centered at (x, y) with radius r */
	private GOval createFilledCircle(double x, double y, double r) {
		GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
		circle.setFilled(true);
		return circle;
	}

	/* Private constants */
	private static final double FRAME_WIDTH = 50;

	private static final double FRAME_HEIGHT = 100;

	private static final double LAMP_RADIUS = 10;

	/* Private instance variables */
	private GOval redLamp;

	private GOval yellowLamp;

	private GOval greenLamp;
}
