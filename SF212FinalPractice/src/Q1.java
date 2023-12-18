/* Q1
 * Name: Benjamaporn Tunsuwat
 * ID: 6310742751
 */

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q1 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	/* CONSTANTS */
	private static final int MIN_NUM_BLOCKS = 20; // minimum number of blocks
	private static final int MAX_NUM_BLOCKS = 100; // maximum number of blocks
	
	private static final int MIN_SIZE = 20; // minimum block size
	private static final int MAX_SIZE = 50; // maximum block size
	
	private static double MIN_RADIUS; // minimum bomb radius
	private static double MAX_RADIUS; // maximum bomb radius
	
	public void init() {
		MIN_RADIUS = getWidth() / 10;
		MAX_RADIUS = MIN_RADIUS * 2;
	}
	
	// You fill in this part
	public void run() {

	}
	
}