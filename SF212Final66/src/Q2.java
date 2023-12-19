// Name (in English):
// ID: 

import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Q2 extends GraphicsProgram {
	/* pause duration */
	private static final double DURATION = 1;

	/* pacman size */
	private static final int PACMAN_RADIUS = 20;

	/* pacman moving velocity */
	private static final double X_VELOCITY = 1;

	/* number of floors */
	private static final int NUM_FLOORS = RandomGenerator.getInstance().nextInt(5, 10);

	/* number of balls per floor */
	private static final int NUM_BALLS_PER_FLOOR = RandomGenerator.getInstance().nextInt(20, 30);

	/* ball size */
	private static final int BALL_RADIUS = 5;

	/* pacman reference */
	private GPacMan pacman;

	/* WRITE YOUR CODE BELOW */
	public void run() {
		double yy = 0;
		double xx = getWidth();
		double oneFloor = getHeight()/NUM_FLOORS;
		double dx = oneFloor / 2;
		dotLine(oneFloor*0.5);
		for(int l = 0; l < NUM_FLOORS-1; l++) {
			yy += oneFloor;
			drawLine(0, xx, yy);
			dotLine(yy+dx);
		}
		double pcx = dx;
		pacman = new GPacMan(PACMAN_RADIUS);
		add(pacman, -PACMAN_RADIUS, pcx);
		while (pacman.getY() < getHeight()) {
			pacman.move(X_VELOCITY,0);
			//eated();
	    	pacman.openMouth();
	    	if(pacman.getX() >= getWidth() + pacman.getWidth()) {
	    		pcx += oneFloor;
	    		pacman.setLocation(-PACMAN_RADIUS, pcx);
    	}

			pause(DURATION);
		}
		GLabel label = new GLabel("CLEAR!");
		label.setFont("SansSerif-36");
		label.setColor(Color.BLUE);
		double x = (getWidth() - label.getWidth()) / 2;
		double y = (getHeight() - label.getAscent()) / 2;
		add(label,x,y);
	}
	public void eated() {
		double x = pacman.getX();
		double y = pacman.getY();
		GBall wiht = new GBall(BALL_RADIUS,x-((pacman.getWidth()/2)+4.9),y);
		wiht.setColor(Color.WHITE);
		add(wiht);
	}
	
	public void dotLine(double yl) {
		double dis = getWidth()/NUM_BALLS_PER_FLOOR;
		double x = dis/2;
		dot(x, yl);
		for(int d = 0; d < NUM_BALLS_PER_FLOOR; d++) {
			x += dis;
			dot(x, yl);
		}
	}
	public void dot(double x, double y) {
		GBall dot = new GBall(BALL_RADIUS, x ,y);
		add(dot);
	}
	public void drawLine(double x0, double x1, double y) {
		GLine line = new GLine(x0, y, x1, y);
		add(line);
	}


}
