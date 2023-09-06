/*
 * File: RobotFace.java
 * --------------------
 * This program draws a robot face using GRects and GOvals, centered
 * in the graphics window.  We make sure to define constants at the
 * top of our program instead of using magic numbers. We also write
 * the program in terms of reusable and general methods
 * drawRectangle and drawCircle.
 */

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {

	/* Constants for the drawing */
	private static final int HEAD_WIDTH = 150;
	private static final int HEAD_HEIGHT = 250;
	private static final int EYE_RADIUS = 40;
	private static final int MOUTH_WIDTH = 100;
	private static final int MOUTH_HEIGHT = 30;

	public void run() {
		int cx = getWidth() / 2;
		int cy = getHeight() / 2;
		
		double starthead_x, starthead_y;
		starthead_x = cx - HEAD_WIDTH / 2;
		starthead_y = cy - HEAD_HEIGHT / 2;
		addHead(starthead_x, starthead_y);

		double qx, qy;
		int r = EYE_RADIUS;
		qx = HEAD_WIDTH / 4;
		qy = HEAD_HEIGHT / 4;
		
		
		addEye(starthead_x +  qx - r/2, starthead_y + qy - r/2, r);
		addEye(starthead_x +  qx*3 - r/2, starthead_y + qy - r/2, r);

		addMouth(cx - MOUTH_WIDTH / 2, starthead_y + qy*3);
	}

	private void addHead(double x, double y) {
		GRect rect = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		rect.setFilled(true);
		rect.setColor(Color.GRAY);
		add(rect);
		
	}
	
	private void addEye(double cx, double cy, double r) {
		GOval eye = new GOval(cx, cy, r, r);
		eye.setFilled(true);
		eye.setColor(Color.YELLOW);
		add(eye);
	}
	
	private void addMouth(double x, double y) {
		GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(Color.WHITE);
		add(mouth);
	}
	private void drawRectangle(double x, double y, double width, 
	                           double height, Color c) {

	}
	private void drawCircle(double cx, double cy, double r, Color c) {

	}
}