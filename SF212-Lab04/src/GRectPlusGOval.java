/*
 * File: GRectPlusGOval.java
 * -------------------------
 * This program creates a red GRect and a green GOval using
 * the same parameters.  The example illustrates that the
 * GOval fills the boundary set by the enclosing rectangle.
 */
import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GRectPlusGOval extends GraphicsProgram {

	public void run() {
		setWidth(400);
		setHeight(150);
		GRect rect = new GRect(100, 50, 125, 60);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
		GOval oval = new GOval(100, 50, 125, 60);
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		add(oval);
	}

}
