/*
 * File: Breakout.java
 * -------------------
 * Name:
 * This file will eventually implement the game of Breakout.
 */

import java.awt.Color;
import java.awt.Dimension;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Breakout extends GraphicsProgram {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 70;

	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

	/** Separation between bricks */
	private static final int BRICK_SEP = 4;

	/** Width of a brick */
	private static final int BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1)
			* BRICK_SEP)
			/ NBRICKS_PER_ROW;

	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

	/** paddle */
	protected GRect paddle;

	/** ball */
	protected GOval ball;

	/* Method: run() */
	/** Runs the Breakout program. */
	public void run() {
	  setMaximumSize(new Dimension(APPLICATION_WIDTH, APPLICATION_WIDTH));
		drawBricks();
		drawPaddle();
		drawBall();
	}
	
	/* You fill this in, along with any subsidiary methods */
	protected void drawBricks() {
		for(int i = 0; i < NBRICK_ROWS;i++) {
			double y;
			if(i == 0) {
				y = 70;
			}else {
				y = 70 + (BRICK_SEP * i) + (i * BRICK_HEIGHT);
			}
			for(int j = 0; j < NBRICKS_PER_ROW ; j++) {
				double x;
				if(j == 0) {
					x = 0;
				}else {
					x = (BRICK_SEP * j) + (j * BRICK_WIDTH);
				}
				GRect sq = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				sq.setFilled(true);
				if(i <= 1) {
					sq.setColor(Color.RED);
				}else if(i <= 3) {
					sq.setColor(Color.ORANGE);
				}else if(i <= 5) {
					sq.setColor(Color.YELLOW);
				}else if(i <= 7) {
					sq.setColor(Color.GREEN);
				}else {
					sq.setColor(Color.CYAN);
				}
				add(sq);
			}
		}
	}
	

	protected void drawPaddle() {
		double x_pd = (WIDTH/2) - (PADDLE_WIDTH/2);
		double y_pd = HEIGHT - (PADDLE_HEIGHT + PADDLE_Y_OFFSET);
		GRect pd = new GRect(x_pd, y_pd, PADDLE_WIDTH, PADDLE_HEIGHT);
		pd.setFilled(true);
		add(pd);
	}

	protected void drawBall() {
		double ball_x = (WIDTH/2) - (BALL_RADIUS/2) ;
		double ball_y = (HEIGHT/2) - (BALL_RADIUS);
		GOval bl = new GOval(ball_x, ball_y, BALL_RADIUS,BALL_RADIUS);
		bl.setFilled(true);
		add(bl);
	}
}
