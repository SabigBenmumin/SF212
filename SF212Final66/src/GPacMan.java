import java.awt.Color;

import acm.graphics.GArc;
import acm.graphics.GCompound;

public class GPacMan extends GCompound {
	private GArc arc;

	private int degrees;

	private int dA;

	public GPacMan(double r) {
		arc = new GArc(-r, -r, 2 * r, 2 * r, 0, 360);
		degrees = 0;
		dA = 5;
		arc.setFilled(true);
		arc.setFillColor(Color.YELLOW);
		add(arc);
	}

	public void openMouth(int degrees) {
		arc.setStartAngle(degrees / 2);
		arc.setSweepAngle(360 - degrees);
	}

	public void openMouth() {
		degrees += dA;
		if (degrees >= 90)
			dA = -dA;
		else if (degrees <= 0)
			dA = -dA;
		openMouth(degrees);
	}
}
