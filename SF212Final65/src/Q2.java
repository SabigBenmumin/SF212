// Name (in English):
// ID: 

import java.awt.event.MouseEvent;

import acm.program.GraphicsProgram;

public class Q2 extends GraphicsProgram {
  /* pause duration */
  private static final double DURATION = 5;

  /* ball size */
  private static final double BALL_RADIUS = 10;

  /* ball */
  private GBall ball;

  /* ball speed */
  private double vx = 0;
  private double vy = 0;
  
  /* WRITE YOUR CODE BELOW */
  public void run() {
	  addMouseListeners();
	  createBall();
	  while (true) {
		  ball.move(vx, vy);
		  pause(DURATION);
	  }
  }
  
  public void mouseMoved(MouseEvent e) {
	  double x1 = e.getX();
	  double y1 = e.getY();
	  double x2 = ball.getX();
	  double y2 = ball.getY();
	  double dx = x1 - x2;
	  double dy = y1 - y2;
	  vx = dx / Math.sqrt(dx*dx + dy*dy);
	  vy = dy / Math.sqrt(dx*dx + dy*dy);
	  
  }

  private void createBall() {
	  ball = new GBall(BALL_RADIUS);
	  add(ball, getWidth()/ 2, getHeight() /2);
  }
  
}
