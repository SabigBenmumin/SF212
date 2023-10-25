/*
 * File: BouncingSquare.java
 * -----------------------------
 * Animates a moving square
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class BouncingSquare extends GraphicsProgram {

	/* ms to pause between heart-beats */
	private static final int DELAY = 6;
	
	/* width and the height of our moving square */
	private static final int SQUARE_SIZE = 100;
	
	/* Initial speed in the x direction */
	private static final double INITIAL_VX = 2;
	
	/* color for background */
	private static final Color GOLDENROD = new Color(255, 220, 115);
	
	
	public void run() {	
		// setup
		setBackground(GOLDENROD);
		GRect square = makeSquare();
		double vx = INITIAL_VX;
		
		while (true) {	
			// update velocity
			if (hitRightWall(square) || hitLeftWall(square)) {
				vx = -vx;
			}
			
			// update visualization
			square.move(vx, 0);
		
			// pause
			pause(DELAY);
		}
	}
	
	/*
	 * Returns whether or not the square should bounce off the
	 * right wall.
	 */
	private boolean hitRightWall(GRect square) {
		// MODIFY THIS CODE
		return false;
	}
	
	/*
	 * Returns whether or not the square should bounce off the
	 * left wall.
	 */
	private boolean hitLeftWall(GRect square) {
		// MODIFY THIS CODE
		return false;
	}
	
	/* 
	 * Make a square and add it to the center of the screen. 
	 * Return the square so that the caller can animate it!
	 */
	private GRect makeSquare() {
		double x, y;
		x = 0;
		y = (getHeight() / 2) - (SQUARE_SIZE / 2);
		GRect r = new GRect(x, y, SQUARE_SIZE, SQUARE_SIZE);
		r.setFilled(true);
		r.setColor(GOLDENROD);
		add(r, 1, 1);
		return r;
		
	}
}
