/* Q2
 * Name: Lalita Sornsakrin
 * ID: 6310742389
 */

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q2 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	/* CONSTANTS */
	private static final int RADIUS = 20; // BALL RADIUS
	private static final int SPEED = 2; // BALL SPEED
	private static final int DURATION = 5; // PAUSE_DURATION
	private static final int PADDLE_WIDTH = RADIUS * 5; // PADDLE WIDTH
	private static final int PADDLE_HEIGHT = 10; // PADDLE HEIGHT
	private static final int PADDLE_OFFSET = 50; // PADDLE OFFSET FROM BOTTOM EDGE
	private static final String SCOREBOARD_FONT = "BOLD-20"; // TEXT FONT
	private static final int SCOREBOARD_OFFSET = 5; // SCOREBOARD OFFSET FROM LEFT AND BOTTOM EDGE
	
	/* Object references */
	private GOval ball; // ball reference
	private GRect paddle; // paddle reference
	private GLabel scoreboard; // scoreboard reference
	
	private int scores = 0; // game scores
	
	private RandomGenerator rg = RandomGenerator.getInstance();

	// You fill in this part
	public void run() {

	}
	
}
