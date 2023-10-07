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
		double x, y, height, width;
		double mid = WINDOW_WIDTH / 2;
		y = 0;
		int c;
		if(NUM_ROWS % 2 == 0) {
			c = 1;
		}else {
			c = 0;
		}
		width = WINDOW_WIDTH - (STEP_WIDTH * (NUM_ROWS-1));
		for(int i = 0; i < NUM_ROWS; i++) {
			height = getHeight() / NUM_ROWS;
			x = mid - (width / 2);
			GRect rect = new GRect(x, y, width, height);
			rect.setFilled(true);
			if(c % 2 != 0) {
				rect.setColor(ODD_COLOR);
			}else {
				rect.setColor(EVEN_COLOR);
			}
			add(rect);
			c++;
			
			y += height;
			width += STEP_WIDTH;
		}
	}
}

