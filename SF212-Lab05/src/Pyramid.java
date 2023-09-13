/*
 * File: Pyramid.java
 * Name: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Pyramid extends GraphicsProgram {

	/** Width of each brick in pixels */
	//private static final int BRICK_WIDTH = 30;
	private static final int BRICK_WIDTH = 10;

	/** Height of each brick in pixels */
	//private static final int BRICK_HEIGHT = 12;
	private static final int BRICK_HEIGHT = 10;

	/** Number of bricks in the base of the pyramid */
	//private static final int BRICKS_IN_BASE = 14;
	private static final int BRICKS_IN_BASE = 10;
	
	public void run() {
		double y_start = (double) getHeight() - (BRICKS_IN_BASE * BRICK_HEIGHT);
		for(int i = 0; i < BRICKS_IN_BASE; i++) {
			double x_start = (double) (getWidth()/2) - ((BRICK_WIDTH * i+1)) / 2;
			for(int j = 0; j < i; j++) {
				double y = y_start + (i * BRICK_HEIGHT);
				double x = x_start + (j * BRICK_WIDTH);
				GRect sq = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(sq);
			}
		}
	}
}