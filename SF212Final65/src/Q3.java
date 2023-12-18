// Name (in English):
// ID: 

import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Q3 extends GraphicsProgram {
  /* pause duration */
  private static final double DURATION = 5;

  /* ball size */
  private static final double BALL_RADIUS = 20;

  /* moving ball */
  private GOval redBall, blueBall;

  /* ball speed */
  private double vx = 1;

  /* WRITE YOUR CODE BELOW */
  public void run() {
	  double cy = getHeight() / 2;
	  redBall = creatBall(Color.RED, 0, cy - BALL_RADIUS);
	  blueBall = creatBall(Color.BLUE, getWidth() - 2 * BALL_RADIUS, cy - BALL_RADIUS);
	  while (true) {
		  redBall.move(vx, 0);
		  blueBall.move(-vx, 0);
		  pause(DURATION);
		  checkCollision();
	  }
  }
  
  private void checkCollision() {
	  double x = redBall.getX();
	  if (x <= 0 || x + BALL_RADIUS * 2 >= getWidth())vx = -vx;

  }
  
  public GOval creatBall(Color color, double x, double y) {
	  GOval ball = new GOval(BALL_RADIUS * 2, BALL_RADIUS * 2);
	  ball.setFilled(true);
	  ball.setColor(color);
	  add(ball, x, y);
	  return ball;
  }

}
