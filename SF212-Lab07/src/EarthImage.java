/*
 * File: EarthImage.java
 * ---------------------
 * This program displays an image of the earth from space.
 * The image appears through the courtesy of NASA/JPL-Caltech.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class EarthImage extends GraphicsProgram {

	public void run() {
	  setWidth(APPLICATION_WIDTH);
	  setHeight(APPLICATION_HEIGHT);
		add(new GImage("EarthFromApollo17.jpg"));
		addCitation("Courtesy NASA/JPL-Caltech ");
	}

/* Adds a citation label at the lower right of the canvas */
	private void addCitation(String text) {
		GLabel label = new GLabel(text);
		label.setFont(CITATION_FONT);
		label.setColor(Color.BLACK);
		double x = getWidth() - label.getWidth();
		double y = getHeight() - CITATION_MARGIN + label.getAscent();
		add(label, x, y);
	}

/* Private constants */
	private static final String CITATION_FONT = "SansSerif-10";
	private static final int CITATION_MARGIN = 13;

/* Set the dimensions of the window */
	public static final int APPLICATION_WIDTH = 640;
	public static final int APPLICATION_HEIGHT = 640 + CITATION_MARGIN;

}
