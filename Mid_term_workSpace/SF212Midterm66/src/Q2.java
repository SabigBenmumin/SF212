/* 
 * Q2: Wall
 * 
 * Name (in English):Sabig Benmumin
 * 
 * Student ID:6510742197
 * 
 */

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q2 extends GraphicsProgram {

	/** Wall Size */
	private static final int NUM_ROWS = RandomGenerator.getInstance().nextInt(5, 15);
	private static final int BRICKS_PER_ROW = RandomGenerator.getInstance().nextInt(10, 20);
	
	/** Window Size **/
	private static final int WINDOW_WIDTH = RandomGenerator.getInstance().nextInt(400, 600);
	private static final int WINDOW_HEIGHT = RandomGenerator.getInstance().nextInt(300, 400);
	
	public void init() {
		/* the width and height will be randomly set */
		setWidth(WINDOW_WIDTH);
		setHeight(WINDOW_HEIGHT);
	}
	public void drawBrick(double x_posi, double y_posi, double brickWidth, double brickHeight) {
		GRect brick = new GRect(x_posi, y_posi, brickWidth, brickHeight);
		add(brick);
	}
	
	public void run() {
		double brick_width = getWidth() / BRICKS_PER_ROW;
		double brick_height = getHeight() / NUM_ROWS;
		double x_start;
		for(int i = 0; i < NUM_ROWS; i++) {
			double y = brick_height * i;
			double x;
			if(i % 2 == 0) {
				x_start = 0;
			}else {
				x_start = 0-(brick_width/2);
			}
			for(int j = 0; j < BRICKS_PER_ROW; j++) {
				x = x_start + (brick_width*j);
				drawBrick(x, y, brick_width, brick_height);
				if(i % 2 == 1) {
					drawBrick(x+brick_width, y, brick_width, brick_height);
				}
			}
		}
	}

}

