
// import java.applet.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import javax.swing.undo.*;

import acm.program.*;
import acm.graphics.GObject;
import acm.graphics.GRect;
// import acm.program.*;
import acm.util.RandomGenerator;

public class Game extends BreakoutLab6 {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;

	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;

	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** paddle */
	private GRect paddle;

	/** ball */
	private GBall ball;

	private double vx, vy;

	private RandomGenerator rgen = RandomGenerator.getInstance();

	private static final int PAUSE_TIME = 30;

	/* Method: run() */
	/** Runs the Breakout program. */
	public void run() {
		addMouseListeners();
		setMaximumSize(new Dimension(WIDTH, HEIGHT));
		drawBricks();
		paddle = drawPaddle();
		ball = drawBall();
		vy = 3.0;
		vx = rgen.nextDouble(1.0, 3.0);
		if (rgen.nextBoolean(0.5))
			vx = -vx;
		while (true) {
			pause(PAUSE_TIME);
			moveBall();
			checkCollision();
		}
	}

	/* move paddle x-centered aligned with mouse location */
	public void mouseMoved(MouseEvent e) {
		double mx = e.getX();
		double window_width = getWidth();
		double x;
		if(mx < 30) {
			x = 0;
		}
		else if(mx > (window_width-30)) {
			x = window_width-60;
		}
		else {
			x = mx-30;
		}
		double y = paddle.getY();
		paddle.setLocation(x, y);
	}

	/* move ball and bounce off when hit object or wall */
	private void moveBall() {
		ball.move(vx,vy);
		
		double lbx = ball.getX();
		double lby = ball.getY();
		if((lbx+10 >= getWidth()) || (lbx-10 <= 0)) {
			vx = -vx;
		}
		if(lby+10 >= getHeight() || lby-10 <= 0) {
			vy = -vy;
		}
	}

	/* get object colliding with ball if any */
	private GObject getCollidingObject() {
		double bx = ball.getX();
		double by = ball.getY();
		double r = BALL_RADIUS;
		GObject collider = getElementAt(bx, by -r);
		if(collider == null) collider = getElementAt(bx , by + r);
		if(collider != null) return collider;
		return null;
	}

	/* check if ball collides with blick, then remove blick */
	private void checkCollision() {
		GObject collider = getCollidingObject();
		if(collider == paddle) {
			vy = -vy;
		}else if(collider != null) {
			vy = -vy;
			remove(collider);
		}
	}
}