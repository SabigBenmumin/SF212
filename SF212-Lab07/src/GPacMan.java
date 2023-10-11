import acm.graphics.*;
import java.awt.*;

class GPacMan extends GCompound {
	private GArc arc;
	
	public GPacMan(double r) {
    arc = new GArc(-r, -r, 2 * r, 2 * r, 0, 360);
    arc.setFilled(true);
    arc.setFillColor(Color.YELLOW);
    add(arc);
	}
	
	public void openMouth(int degrees) {
		arc.setStartAngle(45/2);
		arc.setSweepAngle(315);
	}
}
