/*
 * File: Breakout.java
 * -------------------
 * Name:
 * This file will eventually implement the game of Breakout.
 */

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import acm.graphics.GLabel;
import acm.util.RandomGenerator;

public class Breakout extends BreakoutLab10 {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;

	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;

	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

	/** Dimensions of the paddle */
	private static final int PADDLE_HEIGHT = 10;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Number of turns */
	private static final int NTURNS = 3;

	private RandomGenerator rgen = RandomGenerator.getInstance();

	private AudioClip bounceClip = getAudioClip(getCodeBase(), "bounce.au");

	private static final int PAUSE_TIME = 15;

	private int nbricks = NBRICKS_PER_ROW * NBRICK_ROWS;

	private boolean stop = true;

	public void init() {
		add(new JButton("Start"), SOUTH);
		add(new JButton("Pause"), SOUTH);
		addActionListeners();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Start")) {
			stop = false;
		}
		if (e.getActionCommand().equals("Pause")) {
			stop = true;
        }
	}

	/* Method: run() */
	/** Runs the Breakout program. */
	public void run() {
		addMouseListeners();
		setMaximumSize(new Dimension(WIDTH, HEIGHT));
		drawBricks();
		paddle = drawPaddle();
		round();
		/* You fill this in, along with any subsidiary methods */
	}

	private boolean round() {
		ball = drawBall();
		vy = 3.0;
		vx = rgen.nextDouble(1.0, 3.0);
		if (rgen.nextBoolean(0.5))
			vx = -vx;
			
		while (true) {
			pause(PAUSE_TIME);
			if(!stop) {
				moveBall();
			}
			if(checkCollision()) {
				bounceClip.play();
				nbricks -= 1;
			}
			if (gameEnd())
				break;
		}
		remove(ball);
		return (nbricks > 0);
	}

	private boolean gameEnd() {
		if (ball.getY() > getHeight() - ball.getHeight()) {
			GLabel labelLost = new GLabel("LOST");
			labelLost.setFont("SansSerif-36");
			labelLost.setColor(Color.red);
			double x = (getWidth() - labelLost.getWidth()) / 2;
			double y = (getHeight() - labelLost.getAscent()) / 2;
			add(labelLost,x,y);
			return true;
		}
		if (nbricks == 0) {
			GLabel labelWin = new GLabel("WIN");
			labelWin.setFont("SansSerif-36");
			labelWin.setColor(Color.GREEN);
			double x = (getWidth() - labelWin.getWidth()) / 2;
			double y = (getHeight() - labelWin.getAscent()) / 2;
			add(labelWin,x,y);
			return true;
		}
		return false;
	}
}
