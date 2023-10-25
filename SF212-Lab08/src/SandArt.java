/*
 * File: SandArt.java
 * -----------------
 * A program that simulates creating sand art, which is made by 
 * dropping layers of sand from the top, one grain at a time.
 * It creates 3 layers of sand, each of different colors:
 * orange, blue, and magenta. Each grain of sand is dropped
 * from a random x location at the top of the screen. 
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

import java.awt.Color;
//import java.awt.*;
import java.awt.event.*;

public class SandArt extends GraphicsProgram {
	
	/* Number of grains of sand to drop in a layer */
	private static final int N_SAND_IN_LAYER = 250;
	
	/* The delay between frames. */
	private static final double PAUSE_TIME = 0.1;
	
	/* How fast the grains of sand fall. */
	private static final double Y_VELOCITY = 5;
	
	/* The diameter of a sand grain. */
	private static final int SAND_DIAMETER = 15;

	public void run() {
		addSandLayer(Color.ORANGE);
		addSandLayer(Color.BLUE);
		addSandLayer(Color.MAGENTA);
	}
	
	/*
	 * Adds all grains of sand for a single layer.
	 */
	private void addSandLayer(Color sandColor) {
		for (int i = 0; i < N_SAND_IN_LAYER; i++) {
			dropOneSand(sandColor);
		}
	}
	
	/*
	 * Simulates dropping one sand grain until it hits another, or hits the
	 * bottom of the screen.
	 */
	private void dropOneSand(Color sandColor) {
		// setup
		GOval sand = makeOneSand(sandColor);
		
		// move the sand until it hits something
		while (!hasHitBottom(sand) && !hasHitSomethingElse(sand)) {
			sand.move(0, Y_VELOCITY);
			pause(PAUSE_TIME);
		}
	}
	
	/*
	 * Creates and returns a new grain of sand of the specified color with a random
	 * on-screen X and a Y of 0
	 */
	private GOval makeOneSand(Color sandColor) {
		int randomX = RandomGenerator.getInstance().nextInt(0, getWidth() - SAND_DIAMETER);
		GOval sand = new GOval(randomX, 0, SAND_DIAMETER, SAND_DIAMETER);
		sand.setFilled(true);
		sand.setColor(sandColor);
		add(sand);
		return sand;
	}
	
	/*
	 * Given a grain of sand, returns whether that sand has hit the
	 * bottom of the screen.
	 */
	private boolean hasHitBottom(GOval sand) {
		double bottomY = sand.getY() + sand.getHeight();
		return bottomY >= getHeight();
	}
	
	/*
	 * Given a grain of sand, returns whether that sand has collided
	 * with any other objects on screen.
	 */
	private boolean hasHitSomethingElse(GOval sand) {
		double checkX = sand.getX() + sand.getWidth() / 2.0;
		double checkY = sand.getY() + sand.getHeight();
		GObject collidingObject = getElementAt(checkX, checkY);
		
		// collidingObject will be null if there's nothing there
		// so, if it's not null, we've hit something else (another sand)
		return collidingObject != null;
	}
}