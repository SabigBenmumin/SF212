/* 
 * Q3
 * 
 * Name:
 * 
 * Student ID:
 * 
 */

import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q2 extends GraphicsProgram {

	/** Height of wall in term of number of bricks layer */
	private static final Color ODD_COLOR = Color.RED;

	/** Number of bricks in the base of fence */
	private static final Color EVEN_COLOR = Color.GREEN;

	/** Window Width **/
	private static final int WINDOW_WIDTH = RandomGenerator.getInstance().nextInt(100, 300);

	/** Window Height **/
	private static final int WINDOW_HEIGHT = RandomGenerator.getInstance().nextInt(100, 300);

	/** Number of Rows */
	private static final int NUM_ROWS = RandomGenerator.getInstance().nextInt(4, 8);

	/** Number of Columns */
	private static final int STEP_WIDTH = WINDOW_WIDTH / NUM_ROWS;

	public void init() {
		/* the width and height will be randomly set */
		setWidth(WINDOW_WIDTH);
		setHeight(WINDOW_HEIGHT);
	}
	
	public void run() {
		/* You fill this in */

		
	}
}

